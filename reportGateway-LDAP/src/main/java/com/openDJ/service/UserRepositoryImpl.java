package com.openDJ.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Service;

import com.openDJ.dao.UserRepositoryIntf;

@Service
public class UserRepositoryImpl implements UserRepositoryIntf {

	private static Logger log = Logger.getLogger(UserRepositoryImpl.class);

	public static String ou;
	public static String className;
	
	public UserRepositoryImpl() {

	}
	
	public UserRepositoryImpl(String ou,String className) {
		this.ou = ou!=null?ou:"";
		this.className = className;
	}

	@Autowired
	private LdapTemplate ldapTemplate;

	/*
	 * (non-Javadoc)
	 *
	 * @see ldap.advance.example.UserRepositoryIntf#getAllUsers()
	 */
	public List<Object> getAllUsers() throws Exception {
		SearchControls controls = new SearchControls();
		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		return ldapTemplate.search("ou=Internal,ou=spe,o=sca", "(objectclass="+className+")", controls, new AllUserAttributesMapper());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see ldap.advance.example.UserRepositoryIntf#authenticate(java.lang.String,
	 * java.lang.String)
	 */
	
	public boolean authenticate(String base, String userName, String password) throws Exception{
		log.info("executing {authenticate}");
		base="ou=internal,ou=spe,o=sca";
		return ldapTemplate.authenticate(base, "(uid=" + userName + ")", password);
	}

	/**
	 * This class is responsible to prepare User object after ldap search.
	 *
	 * @author KMaji
	 *
	 */
	private class UserAttributesMapper implements AttributesMapper<Object> {

		
		public Object mapFromAttributes(Attributes attributes) throws NamingException {
			return attributes.getAll().toString();
		}
	}

private class AllUserAttributesMapper implements AttributesMapper<Object> {
		
		public Map<Object,Object> mapFromAttributes(Attributes attrs) throws NamingException {
			NamingEnumeration<? extends Attribute> all = attrs.getAll();
			Map<Object,Object> aliasToValueMapList=new HashMap<Object,Object>();
			
			while (all.hasMore()) {
				Attribute id = all.next();
				aliasToValueMapList.put(id.getID(),id.get());
				
			}
			return aliasToValueMapList;		
			}
		
	}
	
	/**
	 * This class is responsible to print only cn .
	 *
	 * @author KMaji
	 *
	 */
	private class SingleAttributesMapper implements AttributesMapper<String> {

		
		public String mapFromAttributes(Attributes attrs) throws NamingException {
			Attribute cn = attrs.get("cn");
			return cn.toString();
		}
	}

	/**
	 * This class is responsible to print all the content in string format.
	 *
	 * @author KMaji
	 *
	 */
	private class MultipleAttributesMapper implements AttributesMapper<String> {

		
		public String mapFromAttributes(Attributes attrs) throws NamingException {
			NamingEnumeration<? extends Attribute> all = attrs.getAll();
			StringBuffer result = new StringBuffer();
			result.append("\n Result { \n");
			while (all.hasMore()) {
				Attribute id = all.next();
				result.append(" \t |_  #" + id.getID() + "= [ " + id.get() + " ]  \n");
				log.info(id.getID() + "\t | " + id.get());
			}
			result.append("\n } ");
			return result.toString();
		}
	}
	
}
