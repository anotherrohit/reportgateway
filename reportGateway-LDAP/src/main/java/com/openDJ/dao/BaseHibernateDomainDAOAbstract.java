package com.openDJ.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Service;

@Service
public class BaseHibernateDomainDAOAbstract extends BaseHibernateDAO {

	public  List<Object> getName() {
		return getHibernateTemplate().execute(new HibernateCallback<List>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException {
				Query query = session.createSQLQuery("Show tables");
		        return query.list();
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public  List<Object> getData(final String name) {
		return getHibernateTemplate().execute(new HibernateCallback<List>() {
			@Override
			public List doInHibernate(Session session) throws HibernateException {
				Query query = session.createSQLQuery("select * from "+name);
				query.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
//				List<Map<String,String>> aliasToValueMapList=query.list();
//				for (int i = 0 ; i < aliasToValueMapList.size() ; i++) {
//		            Map<String, String> myMap = aliasToValueMapList.get(i);
//		            
//		        }
					
				
				
		        return query.list();
			}
		});
	}

}
