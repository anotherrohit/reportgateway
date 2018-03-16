package com.openDJ.dao;

import static com.openDJ.pojo.FilterInfo.Type.BOOLEAN;
import static com.openDJ.pojo.FilterInfo.Type.DATE;
import static com.openDJ.pojo.FilterInfo.Type.DOUBLE;
import static com.openDJ.pojo.FilterInfo.Type.LIST;
import static com.openDJ.pojo.FilterInfo.Type.LONG;
import static com.openDJ.pojo.FilterInfo.Type.NUMERIC;
import static com.openDJ.pojo.FilterInfo.Type.OBJECT;
import static com.openDJ.pojo.FilterInfo.Type.PROPERTY;
import static com.openDJ.pojo.FilterInfo.Type.STRING;
import static org.apache.commons.collections.CollectionUtils.isNotEmpty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.openDJ.pojo.FilterInfo;
import com.openDJ.pojo.FindInfo;
import com.openDJ.pojo.FindInfo.SortOrder;
import com.openDJ.util.DateUtil;

public class BaseHibernateDAO extends HibernateDaoSupport {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	public void setFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	
	public Criteria assignCriteria(Criteria criteria, FindInfo findInfo) {

		// To avoid duplicates in aliases
		Set<String> aliases = new HashSet<String>();

		criteria.setFirstResult(findInfo.getStart());
		criteria.setMaxResults(findInfo.getLimit());

		if (isNotEmpty(findInfo.getFilterInfoList())) {
			addRestrictions(criteria, findInfo.getFilterInfoList(), aliases);
		}

		String orderBy = findInfo.getOrderBy();
		orderBy = getLastAlias(criteria, orderBy, aliases);

		if (SortOrder.ASC.equals(findInfo.getSortOrder())) {
			criteria.addOrder(Order.asc(orderBy));
		} else {
			criteria.addOrder(Order.desc(orderBy));
		}

		return criteria;
	}

	private void addRestrictions(Criteria criteria, List<FilterInfo> filterInfoList, Set<String> aliases) {
		for (FilterInfo filterInfo : filterInfoList) {

			if (STRING.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				if (FilterInfo.Comparision.EQ.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.eq(prop, "" + filterInfo.getValue()));
				} else if (FilterInfo.Comparision.LKS.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.like(prop, filterInfo.getValue() + "%"));
				} else if (FilterInfo.Comparision.iLKS.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.ilike(prop, filterInfo.getValue() + "%"));
				} else if (FilterInfo.Comparision.NE.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.ne(prop, "" + filterInfo.getValue()));
				} else {
					criteria.add(Restrictions.like(prop, "%" + filterInfo.getValue() + "%"));
				}
			}
			if (LIST.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				@SuppressWarnings("unchecked")
				List<Object> arr = (List<Object>) filterInfo.getValue();
				if (FilterInfo.Comparision.EQ.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.in(prop, arr.toArray()));
				} else if (FilterInfo.Comparision.NE.equals(filterInfo.getComparison())) {
					criteria.add(Restrictions.not(Restrictions.in(prop, arr.toArray())));
				} else {
					logger.warn(filterInfo.getComparison().toString() + " criteria is not defined for list");
				}
			}
			if (NUMERIC.equals(filterInfo.getType()) || LONG.equals(filterInfo.getType()) || DOUBLE.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				switch (filterInfo.getComparison()) {
				case EQ:
					criteria.add(Restrictions.eq(prop, filterInfo.getValue()));
					break;
				case NE:
					criteria.add(Restrictions.ne(prop, filterInfo.getValue()));
					break;
				case GT:
					criteria.add(Restrictions.gt(prop, filterInfo.getValue()));
					break;
				case GE:
					criteria.add(Restrictions.ge(prop, filterInfo.getValue()));
					break;
				case LT:
					criteria.add(Restrictions.lt(prop, filterInfo.getValue()));
					break;
				case LE:
					criteria.add(Restrictions.le(prop, filterInfo.getValue()));
					break;
				}
			}
			if (PROPERTY.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				switch (filterInfo.getComparison()) {
				case EQ:
					criteria.add(Restrictions.eqProperty(prop, filterInfo.getValue().toString()));
					break;
				case GT:
					criteria.add(Restrictions.gtProperty(prop, filterInfo.getValue().toString()));
					break;
				case GE:
					criteria.add(Restrictions.geProperty(prop, filterInfo.getValue().toString()));
					break;
				case LT:
					criteria.add(Restrictions.ltProperty(prop, filterInfo.getValue().toString()));
					break;
				case LE:
					criteria.add(Restrictions.leProperty(prop, filterInfo.getValue().toString()));
					break;
				case NE:
					criteria.add(Restrictions.neProperty(prop, filterInfo.getValue().toString()));
					break;
				}
			}
			if (BOOLEAN.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				switch (filterInfo.getComparison()) {
				case EQ:
					criteria.add(Restrictions.eq(prop, filterInfo.getValue()));
					break;
				case NE:
					criteria.add(Restrictions.ne(prop, filterInfo.getValue()));
					break;
				}
			}
			if (DATE.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				try {
					Date dt;
					Object val = filterInfo.getValue();
					if (val instanceof Date) {
						dt = (Date) val;
					} else {
						dt = new SimpleDateFormat("MM/dd/yyyy").parse("" + val);
					}

					switch (filterInfo.getComparison()) {
					case EQ:
						criteria.add(Restrictions.le(prop, DateUtil.getDateEOD(dt)));
						criteria.add(Restrictions.ge(prop, DateUtil.getDateSOD(dt)));
						break;
					case GT:
						criteria.add(Restrictions.gt(prop, dt));
						break;
					case GE:
						criteria.add(Restrictions.ge(prop, dt));
						break;
					case LT:
						criteria.add(Restrictions.lt(prop, dt));
						break;
					case LE:
						criteria.add(Restrictions.le(prop, dt));
						break;
					}
				} catch (ParseException e) {
					logger.info("Cannot parse date[" + filterInfo.getValue() + "] on Filter:" + filterInfo);
				}
			}
			if (OBJECT.equals(filterInfo.getType())) {
				String prop = getLastAlias(criteria, filterInfo.getField().replaceAll("Data", ""), aliases);
				switch (filterInfo.getComparison()) {
				case EQ:
					criteria.add(Restrictions.eqOrIsNull(prop, filterInfo.getValue()));
					break;
				case NE:
					criteria.add(Restrictions.neOrIsNotNull(prop, filterInfo.getValue()));
					break;
				}
			}
			if (FilterInfo.Type.OR.equals(filterInfo.getType())) {
				List<Criterion> conditions = new ArrayList<>();
				for (FilterInfo info : filterInfo.getFilterInfoList()) {
					String prop = getLastAlias(criteria, info.getField().replaceAll("Data", ""), aliases);
					switch (info.getComparison()) {
					case EQ:
						if (info.getValue() instanceof Collection<?>) {
							Object[] array = ((Collection<?>) info.getValue()).toArray();
							conditions.add(Restrictions.in(prop, array));
						} else {
							conditions.add(Restrictions.eq(prop, info.getValue()));
						}
						break;
					case GT:
						conditions.add(Restrictions.gt(prop, info.getValue()));
						break;
					case GE:
						conditions.add(Restrictions.ge(prop, info.getValue()));
						break;
					case LT:
						conditions.add(Restrictions.lt(prop, info.getValue()));
						break;
					case LE:
						conditions.add(Restrictions.le(prop, info.getValue()));
						break;
					case NE:
						if (info.getValue() instanceof Collection<?>) {
							conditions.add(Restrictions.not(Restrictions.in(prop, ((Collection<?>) info.getValue()).toArray())));
						} else {
							conditions.add(Restrictions.ne(prop, info.getValue()));
						}
						break;
					case LKS:
						conditions.add(Restrictions.like(prop, info.getValue() + "%"));
						break;
					case iLKS:
						conditions.add(Restrictions.ilike(prop, info.getValue() + "%"));
						break;
					}
				}
				criteria.add(Restrictions.or(conditions.toArray(new Criterion[conditions.size()])));

			}
			// TODO: Add more as they come
		}
	}

	private String getLastAlias(Criteria criteria, String fullAlias, Set<String> aliases) {

		if (!fullAlias.contains(".")) {
			return fullAlias;
		}

		StringTokenizer stringTokenizer = new StringTokenizer(fullAlias, ".");

		int tokenCount = stringTokenizer.countTokens();

		String token = "";
		String property = "";
		String alias = "";
		String tokenAlias = "";

		for (int i = 1; i < tokenCount; i++) {
			token = stringTokenizer.nextToken();
			property = token;
			if (i != 1) {
				property = alias + "." + token;
			}

			tokenAlias = token + "1";
			if ("userDetail".equals(token)) {
				alias = alias + "." + token;
			} else {
				// dont re apply the alias
				// (e.g scenario: sort and filter on same field )
				if (!aliases.contains(tokenAlias)) {
					assignAlias(criteria, property, tokenAlias);
					aliases.add(tokenAlias);
				}
				alias = tokenAlias;
			}
		}

		alias = alias + "." + stringTokenizer.nextToken();
		return alias.startsWith(".") ? alias.substring(1) : alias;
	}

	private void assignAlias(Criteria criteria, String property, String alias) {
		criteria.createAlias(property, alias);
	}
	

}
