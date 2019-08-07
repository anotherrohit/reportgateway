package com.openDJ.pojo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DBLDAPConstant {
	private static String USERNAME = "uid";
	private static String MIIS_ID = "speSystemID";
	private static String MANAGER_NAME = "manager";
	private static String MANAGER_MIIS_ID = "SpeMgrID";
	private static String TIME_TYPE = "speWorkType";
	private static String SAP_COMPANY_NAME = "spedivisionname";
	private static String SAP_COST_CENTER_NAME = "spedepartmentname";
	private static String PREFERRED_LAST_NAME = "sn";
	private static String MAIDEN_FIRST_NAME = "givenName";
	private static String EMPLOYEE_ID = "spewdempid";
	private static String DIVISION_NAME = "spedivision";
	private static String SAP_COMPANY_ID = "specompanyid";
	private static String SAP_COST_CENTER_ID = "spedepartmentid";
	private static String BUSNIESS_UNIT_NAME = "spebusinessunitname";
	private static String SUB_DIVISION_NAME = "spesubdivsionname";
	private static String SUB_DIVISION_ID = "spesubdivisionid";
	private static String BUSINESS_UNIT_ID = "spebusinessunitid";
	private static String BUSINESS_SITE_CODE = "speworkdaysitecode";
	private static String LOB_INDICATOR = "lobindicator";
	private static String LAST_DAY_OF_WORK = "spelastdayofwork";
	private static String SPE_HIRE_DATE = "speEmphireDate";
	private static String PRIMARY_BUSINESS_PARTNER = "speprimarybuisnesspartner";
	private static String MANAGEMENT_LEVEL = "speMgmtLevel";
	private static String ORGANIZATION_LEVEL = "speorganizationlevel";
	private static String BUSINESS_TITLE = "title";
	
	public static String getLDAPAttrName(String dbAttr){
		String ldapAttrName = "";
		if(dbAttr.equals("USERNAME")){
			ldapAttrName = DBLDAPConstant.USERNAME;
		}else if(dbAttr.equals("MIIS_ID")){
			ldapAttrName = DBLDAPConstant.MIIS_ID;
		}else if(dbAttr.equals("MANAGER_NAME")){
			ldapAttrName = DBLDAPConstant.MANAGER_NAME;
		}else if(dbAttr.equals("MANAGER_MIIS_ID")){
			ldapAttrName = DBLDAPConstant.MANAGER_MIIS_ID;
		}else if(dbAttr.equals("TIME_TYPE")){
			ldapAttrName = DBLDAPConstant.TIME_TYPE;
		}else if(dbAttr.equals("SAP_COMPANY_NAME")){
			ldapAttrName = DBLDAPConstant.SAP_COMPANY_NAME;
		}else if(dbAttr.equals("SAP_COST_CENTER_NAME")){
			ldapAttrName = DBLDAPConstant.SAP_COST_CENTER_NAME;
		}else if(dbAttr.equals("PREFERRED_LAST_NAME")){
			ldapAttrName = DBLDAPConstant.PREFERRED_LAST_NAME;
		}else if(dbAttr.equals("MAIDEN_FIRST_NAME")){
			ldapAttrName = DBLDAPConstant.MAIDEN_FIRST_NAME;
		}else if(dbAttr.equals("EMPLOYEE_ID")){
			ldapAttrName = DBLDAPConstant.EMPLOYEE_ID;
		}else if(dbAttr.equals("DIVISION_NAME")){
			ldapAttrName = DBLDAPConstant.DIVISION_NAME;
		}else if(dbAttr.equals("SAP_COMPANY_ID")){
			ldapAttrName = DBLDAPConstant.SAP_COMPANY_ID;
		}else if(dbAttr.equals("SAP_COST_CENTER_ID")){
			ldapAttrName = DBLDAPConstant.SAP_COST_CENTER_ID;
		}else if(dbAttr.equals("BUSNIESS_UNIT_NAME")){
			ldapAttrName = DBLDAPConstant.BUSNIESS_UNIT_NAME;
		}else if(dbAttr.equals("SUB_DIVISION_NAME")){
			ldapAttrName = DBLDAPConstant.SUB_DIVISION_NAME;
		}else if(dbAttr.equals("SUB_DIVISION_ID")){
			ldapAttrName = DBLDAPConstant.SUB_DIVISION_ID;
		}else if(dbAttr.equals("BUSINESS_UNIT_ID")){
			ldapAttrName = DBLDAPConstant.BUSINESS_UNIT_ID;
		}else if(dbAttr.equals("BUSINESS_SITE_CODE")){
			ldapAttrName = DBLDAPConstant.BUSINESS_SITE_CODE;
		}else if(dbAttr.equals("LOB_INDICATOR")){
			ldapAttrName = DBLDAPConstant.LOB_INDICATOR;
		}else if(dbAttr.equals("LAST_DAY_OF_WORK")){
			ldapAttrName = DBLDAPConstant.LAST_DAY_OF_WORK;
		}else if(dbAttr.equals("SPE_HIRE_DATE")){
			ldapAttrName = DBLDAPConstant.SPE_HIRE_DATE;
		}else if(dbAttr.equals("PRIMARY_BUSINESS_PARTNER")){
			ldapAttrName = DBLDAPConstant.PRIMARY_BUSINESS_PARTNER;
		}else if(dbAttr.equals("MANAGEMENT_LEVEL")){
			ldapAttrName = DBLDAPConstant.MANAGEMENT_LEVEL;
		}else if(dbAttr.equals("ORGANIZATION_LEVEL")){
			ldapAttrName = DBLDAPConstant.ORGANIZATION_LEVEL;
		}else if(dbAttr.equals("BUSINESS_TITLE")){
			ldapAttrName = DBLDAPConstant.BUSINESS_TITLE;
		}
		return ldapAttrName;
	}
}
