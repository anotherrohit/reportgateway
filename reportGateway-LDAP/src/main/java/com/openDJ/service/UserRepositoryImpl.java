package com.openDJ.service;

import java.util.HashMap;
import java.util.Iterator;
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
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.stereotype.Service;

import com.openDJ.dao.UserRepositoryIntf;
import com.openDJ.pojo.DBLDAPConstant;
import com.openDJ.pojo.LDAPUser;
import com.openDJ.pojo.User;

@Service
public class UserRepositoryImpl implements UserRepositoryIntf {

	private static Logger log = Logger.getLogger(UserRepositoryImpl.class);

	public static String ou;
	public static String className;

	public UserRepositoryImpl() {

	}

	public UserRepositoryImpl(String ou, String className) {
		log.info("ou " + ou);
		log.info("className " + className);
		this.ou = ou != null ? ou : "";
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
		//controls.setCountLimit(75000);
		return ldapTemplate.search("", "(objectclass=" + className + ")",controls, new AllUserAttributesMapper());
	}
	
	/*
	 * Added by vikash for data hub impl
	 */
	public List<Object> getAllUsersFor(String speSystemID,Map<String,String> mapUserRecords,String[] arrayAttributes) throws Exception {
		AndFilter filter = new AndFilter();
        filter.and(new EqualsFilter("objectclass", className));
        filter.and(new EqualsFilter("speSystemID", speSystemID));
        @SuppressWarnings("unchecked")
		List<Object> list = ldapTemplate.search("",filter.encode(),new AttributesMapper() {
                public Object mapFromAttributes(Attributes attrs) throws NamingException {
                	NamingEnumeration<? extends Attribute> all = attrs.getAll();
                	Map<Object,Object> aliasToValueMapList = createTemplate();        			
        			while (all.hasMore()) {
        				Attribute id = all.next();
        				for (String attr : arrayAttributes) {
        					if(DBLDAPConstant.getLDAPAttrName(attr).equals(id.getID())){
								log.info("ORGINAL VALUE attr "+attr+" :"+id.get());
								log.info("----> attr "+attr+" :"+mapUserRecords.get(attr));
								aliasToValueMapList.put(id.getID(),mapUserRecords.get(attr));
							}else{
								aliasToValueMapList.put(id.getID(),id.get());
							}
						}  
        				
        				if(!aliasToValueMapList.containsKey("uid")){
        					if(attrs.get("uid") !=null && attrs.get("uid").get() !=null){
        						aliasToValueMapList.put("uid",attrs.get("uid").get());
        					}else{
        						aliasToValueMapList.put("uid","");
        					}
        				}
						if(!aliasToValueMapList.containsKey("givenname")){
							if(attrs.get("givenname") !=null && attrs.get("givenname").get() !=null){
        						aliasToValueMapList.put("givenname",attrs.get("givenname").get());
        					}else{
        						aliasToValueMapList.put("givenname","");
        					}
						}
						if(!aliasToValueMapList.containsKey("sn")){
							if(attrs.get("sn") !=null && attrs.get("sn").get() !=null){
        						aliasToValueMapList.put("sn",attrs.get("sn").get());
        					}else{
        						aliasToValueMapList.put("sn","");
        					}
						}
						if(!aliasToValueMapList.containsKey("cn")){
							if(attrs.get("cn") !=null && attrs.get("cn").get() !=null){
        						aliasToValueMapList.put("cn",attrs.get("cn").get());
        					}else{
        						aliasToValueMapList.put("cn","");
        					}
						}
						if(!aliasToValueMapList.containsKey("speassistantemail")){
							if(attrs.get("speassistantemail") !=null && attrs.get("speassistantemail").get() !=null){
        						aliasToValueMapList.put("speassistantemail",attrs.get("speassistantemail").get());
        					}else{
        						aliasToValueMapList.put("speassistantemail","");
        					}
						}
        				
        			}
        			return aliasToValueMapList;	
                }
            });
        return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ldap.advance.example.UserRepositoryIntf#authenticate(java.lang.String,
	 * java.lang.String)
	 */
	public boolean authenticate(String base, String userName, String password)
			throws Exception {
		log.info("executing {authenticate}");
		base = "ou=internal,ou=spe,o=sca";
		boolean isAdmin = isAdmin(userName);
		boolean isAutheticate = ldapTemplate.authenticate(base, "(uid=" + userName + ")",password);
		log.info("isAutheticate: "+isAutheticate);
		boolean isValid = isAdmin && isAutheticate;
		log.info("isValid: "+isValid);
		//return ldapTemplate.authenticate(base, "(uid=" + userName + ")",password);
		return isValid;
	}
	
	public boolean isAdmin(String userName){
		boolean isAdmin = false;
		AndFilter andFilter = new AndFilter();
        andFilter.and(new EqualsFilter("uid",userName));
        String base = "ou=internal,ou=spe,o=sca";
        List ldapUserAttributeList = ldapTemplate.search(base, andFilter.encode(), new UserAttributesMapper());
        if(ldapUserAttributeList != null){
        	isAdmin = (boolean) ldapUserAttributeList.get(0);
        	log.info(userName+ " isAdmin "+isAdmin);        
        }
		return isAdmin;
	}

	/**
	 * This class is responsible to prepare User object after ldap search.
	 *
	 * @author KMaji
	 * @Modified Vikash
	 */
	private class UserAttributesMapper implements AttributesMapper<Object> {

		public Object mapFromAttributes(Attributes attributes)
				throws NamingException {
			boolean isAdmin = false;
			if(attributes.get("isAdmin") !=null && attributes.get("isAdmin").get() !=null){
				String isAdminAttr = (String) attributes.get("isAdmin").get();
				log.info("isAdmin attribute: "+isAdminAttr);
				if(isAdminAttr.equalsIgnoreCase("true")){
					isAdmin = true;
				}else{
					isAdmin = false;
				}
			}else{
				log.info("isAdmin attribute: not found ");
				isAdmin = false;
			}
			return isAdmin;
		}
	}

	/**
	 * This class is responsible to prepare User object after ldap search.
	 *
	 * @author KMaji
	 *
	 */
	private class all_AllUserAttributesMapper implements AttributesMapper<Object> {
		
		public Map<Object,Object> mapFromAttributes(Attributes attrs) throws NamingException {
			
			NamingEnumeration<? extends Attribute> all = attrs.getAll();
			
			Map<Object,Object> aliasToValueMapList = null; 
			aliasToValueMapList = new HashMap<Object,Object>();
			aliasToValueMapList.put("uid", "N/A");
			aliasToValueMapList.put("firstName", "N/A");
			aliasToValueMapList.put("lastName", "N/A");
			aliasToValueMapList.put("cn", "N/A");
			aliasToValueMapList.put("sn", "N/A");
			aliasToValueMapList.put("userPassword", "N/A");
			aliasToValueMapList.put("postalAddress", "N/A");
			aliasToValueMapList.put("telephoneNumber", "N/A");
			aliasToValueMapList.put("speassistantemail", "N/A");
			aliasToValueMapList.put("spemobile2", "N/A");
			aliasToValueMapList.put("speOfficeFax", "N/A");
			aliasToValueMapList.put("speHomeFax", "N/A");
			aliasToValueMapList.put("speHomePhone", "N/A");
			aliasToValueMapList.put("speonenetflag", "N/A");
			aliasToValueMapList.put("speb2brestrictaccess", "N/A");
			aliasToValueMapList.put("speuserPrincipalName", "N/A");
			aliasToValueMapList.put("spepwpolicyflag", "N/A");
			aliasToValueMapList.put("spedicersonyaccess", "N/A");
			aliasToValueMapList.put("speprimarybusinesspartner", "N/A");
			aliasToValueMapList.put("spepawsaccess", "N/A");
			aliasToValueMapList.put("spebebanjoid", "N/A");
			aliasToValueMapList.put("spebirthome", "N/A");
			aliasToValueMapList.put("spebirtaccess", "N/A");
			aliasToValueMapList.put("spelastdayofwork", "N/A");
			aliasToValueMapList.put("spemedgateaccess", "N/A");
			aliasToValueMapList.put("selfservicepwdchgdate", "N/A");
			aliasToValueMapList.put("speappdynamicaccess", "N/A");
			aliasToValueMapList.put("speOnLeaveFlag", "N/A");
			aliasToValueMapList.put("speiiqadminaccess", "N/A");
			aliasToValueMapList.put("spewpfaccess", "N/A");
			aliasToValueMapList.put("spespheconnectaccess", "N/A");
			aliasToValueMapList.put("spespecialeventsaccess", "N/A");
			aliasToValueMapList.put("spec2access", "N/A");
			aliasToValueMapList.put("spediceraccess", "N/A");
			aliasToValueMapList.put("spewebmethodsaccess", "N/A");
			aliasToValueMapList.put("spewptsaccess", "N/A");
			aliasToValueMapList.put("spebebanjoaccess", "N/A");
			aliasToValueMapList.put("spefclaccess", "N/A");
			aliasToValueMapList.put("speappdynamicsaccess", "N/A");
			aliasToValueMapList.put("spezlarchive2faaccess", "N/A");
			aliasToValueMapList.put("speviasataccess", "N/A");
			aliasToValueMapList.put("spepercussionaccess", "N/A");
			aliasToValueMapList.put("spesouacceptance", "N/A");
			aliasToValueMapList.put("SPE2FATokenClass", "N/A");
			aliasToValueMapList.put("spe2faoathotp", "N/A");
			aliasToValueMapList.put("spe2faoathseed", "N/A");
			aliasToValueMapList.put("spehightailaccess", "N/A");
			aliasToValueMapList.put("spedrmaccess", "N/A");
			aliasToValueMapList.put("spegnetaccess", "N/A");
			aliasToValueMapList.put("speorganizationlevel", "N/A");
			aliasToValueMapList.put("speMgrDn", "N/A");
			aliasToValueMapList.put("speMgmtLevel", "N/A");
			aliasToValueMapList.put("speEndDate", "N/A");
			aliasToValueMapList.put("speTerminationDate", "N/A");
			aliasToValueMapList.put("speairlinesaccess", "N/A");
			aliasToValueMapList.put("spedesignstudioaccess", "N/A");
			aliasToValueMapList.put("sperepetoryaccess", "N/A");
			aliasToValueMapList.put("spedmcmaccess", "N/A");
			aliasToValueMapList.put("speinflightaccess", "N/A");
			aliasToValueMapList.put("Istempassword", "N/A");
			aliasToValueMapList.put("spemediacenteraccess", "N/A");
			aliasToValueMapList.put("speodinaccess", "N/A");
			aliasToValueMapList.put("spealfrescocontenttype", "N/A");
			aliasToValueMapList.put("specimsaccess", "N/A");
			aliasToValueMapList.put("speparisaccess", "N/A");
			aliasToValueMapList.put("spetableausite", "N/A");
			aliasToValueMapList.put("spepinnacleaccess", "N/A");
			aliasToValueMapList.put("spetableauaccess", "N/A");
			aliasToValueMapList.put("spenetworkfileconverteraccess", "N/A");
			aliasToValueMapList.put("spehorizonwebappaccess", "N/A");
			aliasToValueMapList.put("speInterplanaccess", "N/A");
			aliasToValueMapList.put("speprivacyacknowledge", "N/A");
			aliasToValueMapList.put("speoversightapaccess", "N/A");
			aliasToValueMapList.put("speSystemID", "N/A");
			aliasToValueMapList.put("speInternationalPhone", "N/A");
			aliasToValueMapList.put("spepotrackeraccess", "N/A");
			aliasToValueMapList.put("spesspaccessed", "N/A");
			aliasToValueMapList.put("spesspeverbridge", "N/A");
			aliasToValueMapList.put("privacypolicyacceptedon", "N/A");
			aliasToValueMapList.put("speediscoverycustodianaccess", "N/A");
			aliasToValueMapList.put("speworkdaysitecode", "N/A");
			aliasToValueMapList.put("generationQualifier", "N/A");
			aliasToValueMapList.put("lobindicator", "N/A");
			aliasToValueMapList.put("spesubdivisionid", "N/A");
			aliasToValueMapList.put("spebusinessunitid", "N/A");
			aliasToValueMapList.put("spebusinessunitname", "N/A");
			aliasToValueMapList.put("spePGPPolicy", "N/A");
			aliasToValueMapList.put("spepwdplcexmtsts", "N/A");
			aliasToValueMapList.put("speasvaccess", "N/A");
			aliasToValueMapList.put("speintegrifyaccess", "N/A");
			aliasToValueMapList.put("SPTResearchAdminAccess", "N/A");
			aliasToValueMapList.put("spe2faPhone1Type", "N/A");
			aliasToValueMapList.put("spe2faPhone2Type", "N/A");
			aliasToValueMapList.put("spe2faPhone1", "N/A");
			aliasToValueMapList.put("spe2faPhone1SMS", "N/A");
			aliasToValueMapList.put("spe2faPhone1Email", "N/A");
			aliasToValueMapList.put("spe2faPhone2", "N/A");
			aliasToValueMapList.put("spe2faPhone2SMS", "N/A");
			aliasToValueMapList.put("spe2faPhone2Email", "N/A");
			aliasToValueMapList.put("spe2faPhone3", "N/A");
			aliasToValueMapList.put("spe2faPhone3SMS", "N/A");
			aliasToValueMapList.put("spe2faPhone3Email", "N/A");
			aliasToValueMapList.put("spespticomaccess", "N/A");
			aliasToValueMapList.put("spenetgainaccess", "N/A");
			aliasToValueMapList.put("speevmiaccess", "N/A");
			aliasToValueMapList.put("spedealpointaccess", "N/A");
			aliasToValueMapList.put("specreativenetworksaccess", "N/A");
			aliasToValueMapList.put("spe2faeagl", "N/A");
			aliasToValueMapList.put("speScryAccess", "N/A");
			aliasToValueMapList.put("speBusinessObjectsGroup", "N/A");
			aliasToValueMapList.put("speBusinessObjectsAccess", "N/A");
			aliasToValueMapList.put("spePRISMAccess", "N/A");
			aliasToValueMapList.put("speexecutivedirectoryadmin", "N/A");
			aliasToValueMapList.put("speexecutivedirectoryuser", "N/A");
			aliasToValueMapList.put("speebrelaccess", "N/A");
			aliasToValueMapList.put("spedartsroles", "N/A");
			aliasToValueMapList.put("myspeaccess", "N/A");
			aliasToValueMapList.put("myspedepts", "N/A");
			aliasToValueMapList.put("myspeemail", "N/A");
			aliasToValueMapList.put("mysperole", "N/A");
			aliasToValueMapList.put("isMemberOf", "N/A");
			aliasToValueMapList.put("myspeworkspace", "N/A");
			aliasToValueMapList.put("myspeworkspacedepts", "N/A");
			aliasToValueMapList.put("mysphedepts", "N/A");
			aliasToValueMapList.put("myspherole", "N/A");
			aliasToValueMapList.put("mysptiregions", "N/A");
			aliasToValueMapList.put("sonyGHD", "N/A");
			aliasToValueMapList.put("SonyRemoteUserBusinessUnitType", "N/A");
			aliasToValueMapList.put("speaccutracaccess", "N/A");
			aliasToValueMapList.put("speacshome", "N/A");
			aliasToValueMapList.put("speacsproductiona", "N/A");
			aliasToValueMapList.put("speacsproductionavpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionawired", "N/A");
			aliasToValueMapList.put("speacsproductionawireless", "N/A");
			aliasToValueMapList.put("speacsproductionb", "N/A");
			aliasToValueMapList.put("speacsproductionbvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionbwired", "N/A");
			aliasToValueMapList.put("speacsproductionbwireless", "N/A");
			aliasToValueMapList.put("speacsproductionc", "N/A");
			aliasToValueMapList.put("speacsproductioncvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductioncwired", "N/A");
			aliasToValueMapList.put("speacsproductioncwireless", "N/A");
			aliasToValueMapList.put("speacsproductiond", "N/A");
			aliasToValueMapList.put("speacsproductiondvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductiondwired", "N/A");
			aliasToValueMapList.put("speacsproductiondwireless", "N/A");
			aliasToValueMapList.put("speacsproductione", "N/A");
			aliasToValueMapList.put("speacsproductionevpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionewired", "N/A");
			aliasToValueMapList.put("speacsproductionewireless", "N/A");
			aliasToValueMapList.put("speacsproductionf", "N/A");
			aliasToValueMapList.put("speacsproductionfvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionfwired", "N/A");
			aliasToValueMapList.put("speacsproductionfwireless", "N/A");
			aliasToValueMapList.put("speacsproductiong", "N/A");
			aliasToValueMapList.put("speacsproductiongvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductiongwired", "N/A");
			aliasToValueMapList.put("speacsproductiongwireless", "N/A");
			aliasToValueMapList.put("speacsproductionh", "N/A");
			aliasToValueMapList.put("speacsproductionhvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionhwired", "N/A");
			aliasToValueMapList.put("speacsproductionhwireless", "N/A");
			aliasToValueMapList.put("speacsproductioni", "N/A");
			aliasToValueMapList.put("speacsproductionivpnremote", "N/A");
			aliasToValueMapList.put("speacsproductioniwired", "N/A");
			aliasToValueMapList.put("speacsproductioniwireless", "N/A");
			aliasToValueMapList.put("speacsproductionj", "N/A");
			aliasToValueMapList.put("speacsproductionjvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionjwired", "N/A");
			aliasToValueMapList.put("speacsproductionjwireless", "N/A");
			aliasToValueMapList.put("speacsproductionk", "N/A");
			aliasToValueMapList.put("speacsproductionkvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionkwired", "N/A");
			aliasToValueMapList.put("speacsproductionkwireless", "N/A");
			aliasToValueMapList.put("speacsproductionl", "N/A");
			aliasToValueMapList.put("speacsproductionlvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionlwired", "N/A");
			aliasToValueMapList.put("speacsproductionlwireless", "N/A");
			aliasToValueMapList.put("speacsproductionm", "N/A");
			aliasToValueMapList.put("speacsproductionmvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionmwired", "N/A");
			aliasToValueMapList.put("speacsproductionmwireless", "N/A");
			aliasToValueMapList.put("speacsproductionn", "N/A");
			aliasToValueMapList.put("speacsproductionnvpnremote", "N/A");
			aliasToValueMapList.put("speacsproductionnwired", "N/A");
			aliasToValueMapList.put("speacsproductionnwireless", "N/A");
			aliasToValueMapList.put("spealfrescoaccess", "N/A");
			aliasToValueMapList.put("spealfrescobcaccess", "N/A");
			aliasToValueMapList.put("speAppsPermitted", "N/A");
			aliasToValueMapList.put("speb2baccess", "N/A");
			aliasToValueMapList.put("spebuildingid", "N/A");
			aliasToValueMapList.put("spebusinessunit", "N/A");
			aliasToValueMapList.put("specardinusaccess", "N/A");
			aliasToValueMapList.put("specitrixaccess", "N/A");
			aliasToValueMapList.put("specompanyid", "N/A");
			aliasToValueMapList.put("specostcenter", "N/A");
			aliasToValueMapList.put("specountry", "N/A");
			aliasToValueMapList.put("spedealtrackeraccess", "N/A");
			aliasToValueMapList.put("spedepartmentid", "N/A");
			aliasToValueMapList.put("spedepartmentname", "N/A");
			aliasToValueMapList.put("speDisplayFaxNumber", "N/A");
			aliasToValueMapList.put("speDisplaygivenName", "N/A");
			aliasToValueMapList.put("speDisplaySurname", "N/A");
			aliasToValueMapList.put("speDisplayTelephoneNumber", "N/A");
			aliasToValueMapList.put("spedivision", "N/A");
			aliasToValueMapList.put("spedivisionid", "N/A");
			aliasToValueMapList.put("spedivisionname", "N/A");
			aliasToValueMapList.put("spedominodn", "N/A");
			aliasToValueMapList.put("spedominomaildb", "N/A");
			aliasToValueMapList.put("spedroolsaccess", "N/A");
			aliasToValueMapList.put("spedrozaccess", "N/A");
			aliasToValueMapList.put("speEmpBadgeID", "N/A");
			aliasToValueMapList.put("speEmpBirthDate", "N/A");
			aliasToValueMapList.put("speEmpDataSource", "N/A");
			aliasToValueMapList.put("speEmpFloor", "N/A");
			aliasToValueMapList.put("speEmpFrmCtr", "N/A");
			aliasToValueMapList.put("speEmpHireDate", "N/A");
			aliasToValueMapList.put("speEmpID", "N/A");
			aliasToValueMapList.put("speEmpPwdChg", "N/A");
			aliasToValueMapList.put("speEmpSrvyComp", "N/A");
			aliasToValueMapList.put("speEmpTermDate", "N/A");
			aliasToValueMapList.put("speEmpWorkState", "N/A");
			aliasToValueMapList.put("speGlobalID", "N/A");
			aliasToValueMapList.put("speIDMAccountLocked", "N/A");
			aliasToValueMapList.put("speIDMRegion", "N/A");
			aliasToValueMapList.put("speIDMTerritory", "N/A");
			aliasToValueMapList.put("speidmusertype", "N/A");
			aliasToValueMapList.put("speiptvpackages", "N/A");
			aliasToValueMapList.put("speJoggerA1", "N/A");
			aliasToValueMapList.put("speJoggerA2", "N/A");
			aliasToValueMapList.put("speJoggerQ1", "N/A");
			aliasToValueMapList.put("speJoggerQ2", "N/A");
			aliasToValueMapList.put("speMgrID", "N/A");
			aliasToValueMapList.put("speMobile", "N/A");
			aliasToValueMapList.put("speNativeEmail", "N/A");
			aliasToValueMapList.put("speNativeEmailServer", "N/A");
			aliasToValueMapList.put("speNativeNotesShortName", "N/A");
			aliasToValueMapList.put("spenikuid", "N/A");
			aliasToValueMapList.put("spenotesshortname", "N/A");
			aliasToValueMapList.put("spenovatusaccess", "N/A");
			aliasToValueMapList.put("speOfficeLocation2", "N/A");
			aliasToValueMapList.put("speOfficeLocation3", "N/A");
			aliasToValueMapList.put("speoversightaccess", "N/A");
			aliasToValueMapList.put("spePasswordFlag", "N/A");
			aliasToValueMapList.put("spepeoplefluentaccess", "N/A");
			aliasToValueMapList.put("spePGPRegion", "N/A");
			aliasToValueMapList.put("spePhone", "N/A");
			aliasToValueMapList.put("spepinnumber", "N/A");
			aliasToValueMapList.put("speprodsafetyaccess", "N/A");
			aliasToValueMapList.put("speproductionbackboneaccess", "N/A");
			aliasToValueMapList.put("spepsid", "N/A");
			aliasToValueMapList.put("spepssaccess", "N/A");
			aliasToValueMapList.put("spepwdexprydt", "N/A");
			aliasToValueMapList.put("spepwdplcexmtstatus", "N/A");
			aliasToValueMapList.put("speqcaccess", "N/A");
			aliasToValueMapList.put("speRoomNumber3", "N/A");
			aliasToValueMapList.put("SPERPMAccess", "N/A");
			aliasToValueMapList.put("spesabaaccess", "N/A");
			aliasToValueMapList.put("spesalesbankaccess", "N/A");
			aliasToValueMapList.put("speSecondaryPhone", "N/A");
			aliasToValueMapList.put("spespeedid", "N/A");
			aliasToValueMapList.put("spestoreroomaccess", "N/A");
			aliasToValueMapList.put("spesubdivisionname", "N/A");
			aliasToValueMapList.put("speswiftaccess", "N/A");
			aliasToValueMapList.put("spetestapplicationaccess", "N/A");
			aliasToValueMapList.put("speTrial", "N/A");
			aliasToValueMapList.put("spetrintechaccess", "N/A");
			aliasToValueMapList.put("speVipFlag", "N/A");
			aliasToValueMapList.put("speVPNGroup", "N/A");
			aliasToValueMapList.put("spewdempid", "N/A");
			aliasToValueMapList.put("speworktype", "N/A");
			aliasToValueMapList.put("VPNEnabled", "N/A");
			
			while (all.hasMore()) {
				Attribute id = all.next();
				aliasToValueMapList.put(id.getID(),id.get());
				
			}
			return aliasToValueMapList;		
		}
		
	}

	private class AllUserAttributesMapper implements AttributesMapper<Object> {
		public Object mapFromAttributes(final Attributes attrs)throws NamingException {
			
			LDAPUser user = new LDAPUser();
			if(attrs.get("uid") !=null && attrs.get("uid").get() !=null){
				user.setUid((String) attrs.get("uid").get());				
			}else{
				user.setUid("");
			}
						
			if(attrs.get("givenname") !=null && attrs.get("givenname").get() !=null){
				user.setGivenName((String) attrs.get("givenname").get());
			}else{
				user.setGivenName("");
			}
			
			if(attrs.get("sn") !=null && attrs.get("sn").get() !=null){
				user.setSn((String) attrs.get("sn").get());
			}else{
				user.setSn("");
			}
			
			/*if(attrs.get("cn") !=null && attrs.get("cn").get() !=null){
				user.setCn((String) attrs.get("cn").get());
			}else{
				user.setCn("");
			}*/
			
			if(attrs.get("speassistantemail") !=null && attrs.get("speassistantemail").get() !=null){
				user.setSpeassistantemail((String) attrs.get("speassistantemail").get());
			}else{
				user.setSpeassistantemail("");
			}	
			
			if(attrs.get("mail") !=null && attrs.get("mail").get() !=null){
				user.setMail((String) attrs.get("mail").get());
			}else{
				user.setMail("");
			}
			
			if(attrs.get("spemobile") !=null && attrs.get("spemobile").get() !=null){
				user.setSpemobile((String) attrs.get("spemobile").get());
			}else{
				user.setSpemobile("");
			}
			
			if(attrs.get("speHomePhone") !=null && attrs.get("speHomePhone").get() !=null){
				user.setSpeHomePhone((String) attrs.get("speHomePhone").get());
			}else{
				user.setSpeHomePhone("");
			}
			
			if(attrs.get("speonenetflag") !=null && attrs.get("speonenetflag").get() !=null){
				user.setSpeonenetflag((String) attrs.get("speonenetflag").get());
			}else{
				user.setSpeonenetflag("");
			}
			
			if(attrs.get("speb2brestrictaccess") !=null && attrs.get("speb2brestrictaccess").get() !=null){
				user.setSpeb2brestrictaccess((String) attrs.get("speb2brestrictaccess").get());
			}else{
				user.setSpeb2brestrictaccess("");
			}
			
			if(attrs.get("speuserPrincipalName") !=null && attrs.get("speuserPrincipalName").get() !=null){
				user.setSpeuserPrincipalName((String) attrs.get("speuserPrincipalName").get());
			}else{
				user.setSpeuserPrincipalName("");
			}
			
			if(attrs.get("spepwpolicyflag") !=null && attrs.get("spepwpolicyflag").get() !=null){
				user.setSpepwpolicyflag((String) attrs.get("spepwpolicyflag").get());
			}else{
				user.setSpepwpolicyflag("");
			}

			if(attrs.get("spedicersonyaccess") !=null && attrs.get("spedicersonyaccess").get() !=null){
				user.setSpedicersonyaccess((String) attrs.get("spedicersonyaccess").get());
			}else{
				user.setSpedicersonyaccess("");
			}
			
			if(attrs.get("spelastdayofwork") !=null && attrs.get("spelastdayofwork").get() !=null){
				user.setSpelastdayofwork((String) attrs.get("spelastdayofwork").get());
			}else{
				user.setSpelastdayofwork("");
			}
			
			if(attrs.get("selfservicepwdchgdate") !=null && attrs.get("selfservicepwdchgdate").get() !=null){
				user.setSelfservicepwdchgdate((String) attrs.get("selfservicepwdchgdate").get());
			}else{
				user.setSelfservicepwdchgdate("");
			}
			
			if(attrs.get("sedepartmantname") !=null && attrs.get("sedepartmantname").get() !=null){
				user.setSedepartmantname((String) attrs.get("sedepartmantname").get());
			}else{
				user.setSedepartmantname("");
			}
			
			if(attrs.get("spebusinessunitname") !=null && attrs.get("spebusinessunitname").get() !=null){
				user.setSpebusinessunitname((String) attrs.get("spebusinessunitname").get());
			}else{
				user.setSpebusinessunitname("");
			}
			
			if(attrs.get("title") !=null && attrs.get("title").get() !=null){
				user.setTitle((String) attrs.get("title").get());
			}else{
				user.setTitle("");
			}
			
			if(attrs.get("spedepartmentname") !=null && attrs.get("spedepartmentname").get() !=null){
				user.setSpedepartmentname((String) attrs.get("spedepartmentname").get());
			}else{
				user.setSpedepartmentname("");
			}
			
			if(attrs.get("spe2fatokenclass") !=null && attrs.get("spe2fatokenclass").get() !=null){
				user.setSpe2fatokenclass((String) attrs.get("spe2fatokenclass").get());
			}else{
				user.setSpe2fatokenclass("");
			}
			
			if(attrs.get("speEndDate") !=null && attrs.get("speEndDate").get() !=null){
				user.setSpeEndDate((String) attrs.get("speEndDate").get());
			}else{
				user.setSpeEndDate("");
			}
			
			if(attrs.get("speTerminationDate") !=null && attrs.get("speTerminationDate").get() !=null){
				user.setSpeTerminationDate((String) attrs.get("speTerminationDate").get());
			}else{
				user.setSpeTerminationDate("");
			}
			
			if(attrs.get("speSystemID") !=null && attrs.get("speSystemID").get() !=null){
				user.setSpeSystemID((String) attrs.get("speSystemID").get());
			}else{
				user.setSpeSystemID("");
			}
			
			if(attrs.get("speb2baccess") !=null && attrs.get("speb2baccess").get() !=null){
				user.setSpeb2baccess((String) attrs.get("speb2baccess").get());
			}else{
				user.setSpeb2baccess("");
			}
			
			if(attrs.get("spebuildingid") !=null && attrs.get("spebuildingid").get() !=null){
				user.setSpebuildingid((String) attrs.get("spebuildingid").get());
			}else{
				user.setSpebuildingid("");
			}
			
			if(attrs.get("specostcenter") !=null && attrs.get("specostcenter").get() !=null){
				user.setSpecostcenter((String) attrs.get("specostcenter").get());
			}else{
				user.setSpecostcenter("");
			}
			
			if(attrs.get("specountry") !=null && attrs.get("specountry").get() !=null){
				user.setSpecountry((String) attrs.get("specountry").get());
			}else{
				user.setSpecountry("");
			}
			
			if(attrs.get("spedepartmentid") !=null && attrs.get("spedepartmentid").get() !=null){
				user.setSpedepartmentid((String) attrs.get("spedepartmentid").get());
			}else{
				user.setSpedepartmentid("");
			}
			
			if(attrs.get("spedivision") !=null && attrs.get("spedivision").get() !=null){
				user.setSpedivision((String) attrs.get("spedivision").get());
			}else{
				user.setSpedivision("");
			}
			
			if(attrs.get("spedivisionid") !=null && attrs.get("spedivisionid").get() !=null){
				user.setSpedivisionid((String) attrs.get("spedivisionid").get());
			}else{
				user.setSpedivisionid("");
			}
			
			if(attrs.get("speEmpBadgeID") !=null && attrs.get("speEmpBadgeID").get() !=null){
				user.setSpeEmpBadgeID((String) attrs.get("speEmpBadgeID").get());
			}else{
				user.setSpeEmpBadgeID("");
			}
			
			if(attrs.get("speEmpFloor") !=null && attrs.get("speEmpFloor").get() !=null){
				user.setSpeEmpFloor((String) attrs.get("speEmpFloor").get());
			}else{
				user.setSpeEmpFloor("");
			}
			
			if(attrs.get("speMgrID") !=null && attrs.get("speMgrID").get() !=null){
				user.setSpeMgrID((String) attrs.get("speMgrID").get());
			}else{
				user.setSpeMgrID("");
			}
			
			if(attrs.get("speIDMRegion") !=null && attrs.get("speIDMRegion").get() !=null){
				user.setSpeIDMRegion((String) attrs.get("speIDMRegion").get());
			}else{
				user.setSpeIDMRegion("");
			}
			
			if(attrs.get("speIDMTerritory") !=null && attrs.get("speIDMTerritory").get() !=null){
				user.setSpeIDMTerritory((String) attrs.get("speIDMTerritory").get());
			}else{
				user.setSpeIDMTerritory("");
			}
			
			if(attrs.get("speMobile") !=null && attrs.get("speMobile").get() !=null){
				user.setSpeMobile((String) attrs.get("speMobile").get());
			}else{
				user.setSpeMobile("");
			}
			
			if(attrs.get("spePhone") !=null && attrs.get("spePhone").get() !=null){
				user.setSpePhone((String) attrs.get("spePhone").get());
			}else{
				user.setSpePhone("");
			}
			
			if(attrs.get("speVipFlag") !=null && attrs.get("speVipFlag").get() !=null){
				user.setSpeVipFlag((String) attrs.get("speVipFlag").get());
			}else{
				user.setSpeVipFlag("");
			}
			
			if(attrs.get("speMgrDn") !=null && attrs.get("speMgrDn").get() !=null){
				user.setSpeMgrDn((String) attrs.get("speMgrDn").get());
			}else{
				user.setSpeMgrDn("");
			}
			
			if(attrs.get("speMgmtLevel") !=null && attrs.get("speMgmtLevel").get() !=null){
				user.setSpeMgmtLevel((String) attrs.get("speMgmtLevel").get());
			}else{
				user.setSpeMgmtLevel("");
			}
								
			if(attrs.get("spewebmethodsaccess") !=null && attrs.get("spewebmethodsaccess").get() !=null){
				user.setSpewebmethodsaccess((String) attrs.get("spewebmethodsaccess").get());
			}else{
				user.setSpewebmethodsaccess("");
			}
			
			if(attrs.get("spebebanjoaccess") !=null && attrs.get("spebebanjoaccess").get() !=null){
				user.setSpebebanjoaccess((String) attrs.get("spebebanjoaccess").get());
			}else{
				user.setSpebebanjoaccess("");
			}
			
			if(attrs.get("spesouacceptance") !=null && attrs.get("spesouacceptance").get() !=null){
				user.setSpesouacceptance((String) attrs.get("spesouacceptance").get());
			}else{
				user.setSpesouacceptance("");
			}
			
			if(attrs.get("SonyRemoteUserBusinessUnitType") !=null && attrs.get("SonyRemoteUserBusinessUnitType").get() !=null){
				user.setSonyRemoteUserBusinessUnitType((String) attrs.get("SonyRemoteUserBusinessUnitType").get());
			}else{
				user.setSonyRemoteUserBusinessUnitType("");
			}
			
			if(attrs.get("sonyGHD") !=null && attrs.get("sonyGHD").get() !=null){
				user.setSonyGHD((String) attrs.get("sonyGHD").get());
			}else{
				user.setSonyGHD("");
			}
			
			if(attrs.get("speifdsaccess") !=null && attrs.get("speifdsaccess").get() !=null){
				user.setSpeifdsaccess((String) attrs.get("speifdsaccess").get());
			}else{
				user.setSpeifdsaccess("");
			}
			
			if(attrs.get("speIFDSReportLanguage") !=null && attrs.get("speIFDSReportLanguage").get() !=null){
				user.setSpeIFDSReportLanguage((String) attrs.get("speIFDSReportLanguage").get());
			}else{
				user.setSpeIFDSReportLanguage("");
			}
			
			if(attrs.get("speifdstemporaryuser") !=null && attrs.get("speifdstemporaryuser").get() !=null){
				user.setSpeifdstemporaryuser((String) attrs.get("speifdstemporaryuser").get());
			}else{
				user.setSpeifdstemporaryuser("");
			}
						
			if(attrs.get("speifdsuseraccessenddate") !=null && attrs.get("speifdsuseraccessenddate").get() !=null){
				user.setSpeifdsuseraccessenddate((String) attrs.get("speifdsuseraccessenddate").get());
			}else{
				user.setSpeifdsuseraccessenddate("");
			}
			
			if(attrs.get("speifdsusertitle") !=null && attrs.get("speifdsusertitle").get() !=null){
				user.setSpeifdsusertitle((String) attrs.get("speifdsusertitle").get());
			}else{
				user.setSpeifdsusertitle("");
			}
			
			if(attrs.get("speOperatingCompany") !=null && attrs.get("speOperatingCompany").get() !=null){
				user.setSpeOperatingCompany((String) attrs.get("speOperatingCompany").get());
			}else{
				user.setSpeOperatingCompany("");
			}			

			if(attrs.get("spePhysicalLocale") !=null && attrs.get("spePhysicalLocale").get() !=null){
				user.setSpePhysicalLocale((String) attrs.get("spePhysicalLocale").get());
			}else{
				user.setSpePhysicalLocale("");
			}
			
			if(attrs.get("speTerritory") !=null && attrs.get("speTerritory").get() !=null){
				user.setSpeTerritory((String) attrs.get("speTerritory").get());
			}else{
				user.setSpeTerritory("");
			}
			
			if(attrs.get("st") !=null && attrs.get("st").get() !=null){
				user.setSt((String) attrs.get("st").get());
			}else{
				user.setSt("");
			}
			
			if(attrs.get("street") !=null && attrs.get("street").get() !=null){
				user.setStreet((String) attrs.get("street").get());
			}else{
				user.setStreet("");
			} 
			
			if(attrs.get("spepinnumber") !=null && attrs.get("spepinnumber").get() !=null){
				user.setSpepinnumber((String) attrs.get("spepinnumber").get());
			}else{
				user.setSpepinnumber("");
			}
			
			if(attrs.get("speprodsafetyaccess") !=null && attrs.get("speprodsafetyaccess").get() !=null){
				user.setSpeprodsafetyaccess((String) attrs.get("speprodsafetyaccess").get());
			}else{
				user.setSpeprodsafetyaccess("");
			}
			
			if(attrs.get("speprodsafetyaccess") !=null && attrs.get("speprodsafetyaccess").get() !=null){
				user.setSpeprodsafetyaccess((String) attrs.get("speprodsafetyaccess").get());
			}else{
				user.setSpeprodsafetyaccess("");
			}
			
			if(attrs.get("speproductionbackboneaccess") !=null && attrs.get("speproductionbackboneaccess").get() !=null){
				user.setSpeproductionbackboneaccess((String) attrs.get("speproductionbackboneaccess").get());
			}else{
				user.setSpeproductionbackboneaccess("");
			}
			
			if(attrs.get("spepsid") !=null && attrs.get("spepsid").get() !=null){
				user.setSpepsid((String) attrs.get("spepsid").get());
			}else{
				user.setSpepsid("");
			}
			
			if(attrs.get("spepssaccess") !=null && attrs.get("spepssaccess").get() !=null){
				user.setSpepssaccess((String) attrs.get("spepssaccess").get());
			}else{
				user.setSpepssaccess("");
			}
			
			if(attrs.get("spepwdexprydt") !=null && attrs.get("spepwdexprydt").get() !=null){
				user.setSpepwdexprydt((String) attrs.get("spepwdexprydt").get());
			}else{
				user.setSpepwdexprydt("");
			}
			
			if(attrs.get("spepwdplcexmtstatus") !=null && attrs.get("spepwdplcexmtstatus").get() !=null){
				user.setSpepwdplcexmtstatus((String) attrs.get("spepwdplcexmtstatus").get());
			}else{
				user.setSpepwdplcexmtstatus("");
			}					
			return user;
		}

	}

	/**
	 * This class is responsible to print only cn .
	 *
	 * @author KMaji
	 *
	 */
	private class SingleAttributesMapper implements AttributesMapper<String> {

		public String mapFromAttributes(Attributes attrs)
				throws NamingException {
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

		public String mapFromAttributes(Attributes attrs)
				throws NamingException {
			NamingEnumeration<? extends Attribute> all = attrs.getAll();
			StringBuffer result = new StringBuffer();
			result.append("\n Result { \n");
			while (all.hasMore()) {
				Attribute id = all.next();
				result.append(" \t |_  #" + id.getID() + "= [ " + id.get()
						+ " ]  \n");
				log.info(id.getID() + "\t | " + id.get());
			}
			result.append("\n } ");
			return result.toString();
		}
	}

	private class CreateTemplateAttributesMapper implements AttributesMapper<Object> {
		
		public Object mapFromAttributes(final Attributes attrs) throws NamingException {
			
			User user = new User();
			if(attrs.get("uid") !=null && attrs.get("uid").get() !=null){
				user.setUid((String) attrs.get("uid").get());
			}else{
				user.setUid("");
			}
			
			if(attrs.get("givenname") !=null && attrs.get("givenname").get() !=null){
				user.setGivenName((String) attrs.get("givenname").get());
			}else{
				user.setGivenName("");
			}
			
			if(attrs.get("sn") !=null && attrs.get("sn").get() !=null){
				user.setSn((String) attrs.get("sn").get());
			}else{
				user.setSn("");
			}
			
			if(attrs.get("cn") !=null && attrs.get("cn").get() !=null){
				user.setCn((String) attrs.get("cn").get());
			}else{
				user.setCn("");
			}
			
			if(attrs.get("speassistantemail") !=null && attrs.get("speassistantemail").get() !=null){
				user.setSpeassistantemail((String) attrs.get("speassistantemail").get());
			}else{
				user.setSpeassistantemail("NA");
			}			
			
			return user;			
		}
	}

	
	public static Map<Object,Object> createTemplate(){
		Map<Object,Object> aliasToValueMapList = null; 
		aliasToValueMapList = new HashMap<Object,Object>();
		aliasToValueMapList.put("uid", "");
		aliasToValueMapList.put("firstName", "");
		aliasToValueMapList.put("lastName", "");
		aliasToValueMapList.put("cn", "");
		aliasToValueMapList.put("sn", "");
		aliasToValueMapList.put("userPassword", "");
		aliasToValueMapList.put("postalAddress", "");
		aliasToValueMapList.put("telephoneNumber", "");
		aliasToValueMapList.put("speassistantemail", "");
		aliasToValueMapList.put("spemobile2", "");
		aliasToValueMapList.put("speOfficeFax", "");
		aliasToValueMapList.put("speHomeFax", "");
		aliasToValueMapList.put("speHomePhone", "");
		aliasToValueMapList.put("speonenetflag", "");
		aliasToValueMapList.put("speb2brestrictaccess", "");
		aliasToValueMapList.put("speuserPrincipalName", "");
		aliasToValueMapList.put("spepwpolicyflag", "");
		aliasToValueMapList.put("spedicersonyaccess", "");
		aliasToValueMapList.put("speprimarybusinesspartner", "");
		aliasToValueMapList.put("spepawsaccess", "");
		aliasToValueMapList.put("spebebanjoid", "");
		aliasToValueMapList.put("spebirthome", "");
		aliasToValueMapList.put("spebirtaccess", "");
		aliasToValueMapList.put("spelastdayofwork", "");
		aliasToValueMapList.put("spemedgateaccess", "");
		aliasToValueMapList.put("selfservicepwdchgdate", "");
		aliasToValueMapList.put("speappdynamicaccess", "");
		aliasToValueMapList.put("speOnLeaveFlag", "");
		aliasToValueMapList.put("speiiqadminaccess", "");
		aliasToValueMapList.put("spewpfaccess", "");
		aliasToValueMapList.put("spespheconnectaccess", "");
		aliasToValueMapList.put("spespecialeventsaccess", "");
		aliasToValueMapList.put("spec2access", "");
		aliasToValueMapList.put("spediceraccess", "");
		aliasToValueMapList.put("spewebmethodsaccess", "");
		aliasToValueMapList.put("spewptsaccess", "");
		aliasToValueMapList.put("spebebanjoaccess", "");
		aliasToValueMapList.put("spefclaccess", "");
		aliasToValueMapList.put("speappdynamicsaccess", "");
		aliasToValueMapList.put("spezlarchive2faaccess", "");
		aliasToValueMapList.put("speviasataccess", "");
		aliasToValueMapList.put("spepercussionaccess", "");
		aliasToValueMapList.put("spesouacceptance", "");
		aliasToValueMapList.put("SPE2FATokenClass", "");
		aliasToValueMapList.put("spe2faoathotp", "");
		aliasToValueMapList.put("spe2faoathseed", "");
		aliasToValueMapList.put("spehightailaccess", "");
		aliasToValueMapList.put("spedrmaccess", "");
		aliasToValueMapList.put("spegnetaccess", "");
		aliasToValueMapList.put("speorganizationlevel", "");
		aliasToValueMapList.put("speMgrDn", "");
		aliasToValueMapList.put("speMgmtLevel", "");
		aliasToValueMapList.put("speEndDate", "");
		aliasToValueMapList.put("speTerminationDate", "");
		aliasToValueMapList.put("speairlinesaccess", "");
		aliasToValueMapList.put("spedesignstudioaccess", "");
		aliasToValueMapList.put("sperepetoryaccess", "");
		aliasToValueMapList.put("spedmcmaccess", "");
		aliasToValueMapList.put("speinflightaccess", "");
		aliasToValueMapList.put("Istempassword", "");
		aliasToValueMapList.put("spemediacenteraccess", "");
		aliasToValueMapList.put("speodinaccess", "");
		aliasToValueMapList.put("spealfrescocontenttype", "");
		aliasToValueMapList.put("specimsaccess", "");
		aliasToValueMapList.put("speparisaccess", "");
		aliasToValueMapList.put("spetableausite", "");
		aliasToValueMapList.put("spepinnacleaccess", "");
		aliasToValueMapList.put("spetableauaccess", "");
		aliasToValueMapList.put("spenetworkfileconverteraccess", "");
		aliasToValueMapList.put("spehorizonwebappaccess", "");
		aliasToValueMapList.put("speInterplanaccess", "");
		aliasToValueMapList.put("speprivacyacknowledge", "");
		aliasToValueMapList.put("speoversightapaccess", "");
		aliasToValueMapList.put("speSystemID", "");
		aliasToValueMapList.put("speInternationalPhone", "");
		aliasToValueMapList.put("spepotrackeraccess", "");
		aliasToValueMapList.put("spesspaccessed", "");
		aliasToValueMapList.put("spesspeverbridge", "");
		aliasToValueMapList.put("privacypolicyacceptedon", "");
		aliasToValueMapList.put("speediscoverycustodianaccess", "");
		aliasToValueMapList.put("speworkdaysitecode", "");
		aliasToValueMapList.put("generationQualifier", "");
		aliasToValueMapList.put("lobindicator", "");
		aliasToValueMapList.put("spesubdivisionid", "");
		aliasToValueMapList.put("spebusinessunitid", "");
		aliasToValueMapList.put("spebusinessunitname", "");
		aliasToValueMapList.put("spePGPPolicy", "");
		aliasToValueMapList.put("spepwdplcexmtsts", "");
		aliasToValueMapList.put("speasvaccess", "");
		aliasToValueMapList.put("speintegrifyaccess", "");
		aliasToValueMapList.put("SPTResearchAdminAccess", "");
		aliasToValueMapList.put("spe2faPhone1Type", "");
		aliasToValueMapList.put("spe2faPhone2Type", "");
		aliasToValueMapList.put("spe2faPhone1", "");
		aliasToValueMapList.put("spe2faPhone1SMS", "");
		aliasToValueMapList.put("spe2faPhone1Email", "");
		aliasToValueMapList.put("spe2faPhone2", "");
		aliasToValueMapList.put("spe2faPhone2SMS", "");
		aliasToValueMapList.put("spe2faPhone2Email", "");
		aliasToValueMapList.put("spe2faPhone3", "");
		aliasToValueMapList.put("spe2faPhone3SMS", "");
		aliasToValueMapList.put("spe2faPhone3Email", "");
		aliasToValueMapList.put("spespticomaccess", "");
		aliasToValueMapList.put("spenetgainaccess", "");
		aliasToValueMapList.put("speevmiaccess", "");
		aliasToValueMapList.put("spedealpointaccess", "");
		aliasToValueMapList.put("specreativenetworksaccess", "");
		aliasToValueMapList.put("spe2faeagl", "");
		aliasToValueMapList.put("speScryAccess", "");
		aliasToValueMapList.put("speBusinessObjectsGroup", "");
		aliasToValueMapList.put("speBusinessObjectsAccess", "");
		aliasToValueMapList.put("spePRISMAccess", "");
		aliasToValueMapList.put("speexecutivedirectoryadmin", "");
		aliasToValueMapList.put("speexecutivedirectoryuser", "");
		aliasToValueMapList.put("speebrelaccess", "");
		aliasToValueMapList.put("spedartsroles", "");
		aliasToValueMapList.put("myspeaccess", "");
		aliasToValueMapList.put("myspedepts", "");
		aliasToValueMapList.put("myspeemail", "");
		aliasToValueMapList.put("mysperole", "");
		aliasToValueMapList.put("isMemberOf", "");
		aliasToValueMapList.put("myspeworkspace", "");
		aliasToValueMapList.put("myspeworkspacedepts", "");
		aliasToValueMapList.put("mysphedepts", "");
		aliasToValueMapList.put("myspherole", "");
		aliasToValueMapList.put("mysptiregions", "");
		aliasToValueMapList.put("sonyGHD", "");
		aliasToValueMapList.put("SonyRemoteUserBusinessUnitType", "");
		aliasToValueMapList.put("speaccutracaccess", "");
		aliasToValueMapList.put("speacshome", "");
		aliasToValueMapList.put("speacsproductiona", "");
		aliasToValueMapList.put("speacsproductionavpnremote", "");
		aliasToValueMapList.put("speacsproductionawired", "");
		aliasToValueMapList.put("speacsproductionawireless", "");
		aliasToValueMapList.put("speacsproductionb", "");
		aliasToValueMapList.put("speacsproductionbvpnremote", "");
		aliasToValueMapList.put("speacsproductionbwired", "");
		aliasToValueMapList.put("speacsproductionbwireless", "");
		aliasToValueMapList.put("speacsproductionc", "");
		aliasToValueMapList.put("speacsproductioncvpnremote", "");
		aliasToValueMapList.put("speacsproductioncwired", "");
		aliasToValueMapList.put("speacsproductioncwireless", "");
		aliasToValueMapList.put("speacsproductiond", "");
		aliasToValueMapList.put("speacsproductiondvpnremote", "");
		aliasToValueMapList.put("speacsproductiondwired", "");
		aliasToValueMapList.put("speacsproductiondwireless", "");
		aliasToValueMapList.put("speacsproductione", "");
		aliasToValueMapList.put("speacsproductionevpnremote", "");
		aliasToValueMapList.put("speacsproductionewired", "");
		aliasToValueMapList.put("speacsproductionewireless", "");
		aliasToValueMapList.put("speacsproductionf", "");
		aliasToValueMapList.put("speacsproductionfvpnremote", "");
		aliasToValueMapList.put("speacsproductionfwired", "");
		aliasToValueMapList.put("speacsproductionfwireless", "");
		aliasToValueMapList.put("speacsproductiong", "");
		aliasToValueMapList.put("speacsproductiongvpnremote", "");
		aliasToValueMapList.put("speacsproductiongwired", "");
		aliasToValueMapList.put("speacsproductiongwireless", "");
		aliasToValueMapList.put("speacsproductionh", "");
		aliasToValueMapList.put("speacsproductionhvpnremote", "");
		aliasToValueMapList.put("speacsproductionhwired", "");
		aliasToValueMapList.put("speacsproductionhwireless", "");
		aliasToValueMapList.put("speacsproductioni", "");
		aliasToValueMapList.put("speacsproductionivpnremote", "");
		aliasToValueMapList.put("speacsproductioniwired", "");
		aliasToValueMapList.put("speacsproductioniwireless", "");
		aliasToValueMapList.put("speacsproductionj", "");
		aliasToValueMapList.put("speacsproductionjvpnremote", "");
		aliasToValueMapList.put("speacsproductionjwired", "");
		aliasToValueMapList.put("speacsproductionjwireless", "");
		aliasToValueMapList.put("speacsproductionk", "");
		aliasToValueMapList.put("speacsproductionkvpnremote", "");
		aliasToValueMapList.put("speacsproductionkwired", "");
		aliasToValueMapList.put("speacsproductionkwireless", "");
		aliasToValueMapList.put("speacsproductionl", "");
		aliasToValueMapList.put("speacsproductionlvpnremote", "");
		aliasToValueMapList.put("speacsproductionlwired", "");
		aliasToValueMapList.put("speacsproductionlwireless", "");
		aliasToValueMapList.put("speacsproductionm", "");
		aliasToValueMapList.put("speacsproductionmvpnremote", "");
		aliasToValueMapList.put("speacsproductionmwired", "");
		aliasToValueMapList.put("speacsproductionmwireless", "");
		aliasToValueMapList.put("speacsproductionn", "");
		aliasToValueMapList.put("speacsproductionnvpnremote", "");
		aliasToValueMapList.put("speacsproductionnwired", "");
		aliasToValueMapList.put("speacsproductionnwireless", "");
		aliasToValueMapList.put("spealfrescoaccess", "");
		aliasToValueMapList.put("spealfrescobcaccess", "");
		aliasToValueMapList.put("speAppsPermitted", "");
		aliasToValueMapList.put("speb2baccess", "");
		aliasToValueMapList.put("spebuildingid", "");
		aliasToValueMapList.put("spebusinessunit", "");
		aliasToValueMapList.put("specardinusaccess", "");
		aliasToValueMapList.put("specitrixaccess", "");
		aliasToValueMapList.put("specompanyid", "");
		aliasToValueMapList.put("specostcenter", "");
		aliasToValueMapList.put("specountry", "");
		aliasToValueMapList.put("spedealtrackeraccess", "");
		aliasToValueMapList.put("spedepartmentid", "");
		aliasToValueMapList.put("spedepartmentname", "");
		aliasToValueMapList.put("speDisplayFaxNumber", "");
		aliasToValueMapList.put("speDisplaygivenName", "");
		aliasToValueMapList.put("speDisplaySurname", "");
		aliasToValueMapList.put("speDisplayTelephoneNumber", "");
		aliasToValueMapList.put("spedivision", "");
		aliasToValueMapList.put("spedivisionid", "");
		aliasToValueMapList.put("spedivisionname", "");
		aliasToValueMapList.put("spedominodn", "");
		aliasToValueMapList.put("spedominomaildb", "");
		aliasToValueMapList.put("spedroolsaccess", "");
		aliasToValueMapList.put("spedrozaccess", "");
		aliasToValueMapList.put("speEmpBadgeID", "");
		aliasToValueMapList.put("speEmpBirthDate", "");
		aliasToValueMapList.put("speEmpDataSource", "");
		aliasToValueMapList.put("speEmpFloor", "");
		aliasToValueMapList.put("speEmpFrmCtr", "");
		aliasToValueMapList.put("speEmpHireDate", "");
		aliasToValueMapList.put("speEmpID", "");
		aliasToValueMapList.put("speEmpPwdChg", "");
		aliasToValueMapList.put("speEmpSrvyComp", "");
		aliasToValueMapList.put("speEmpTermDate", "");
		aliasToValueMapList.put("speEmpWorkState", "");
		aliasToValueMapList.put("speGlobalID", "");
		aliasToValueMapList.put("speIDMAccountLocked", "");
		aliasToValueMapList.put("speIDMRegion", "");
		aliasToValueMapList.put("speIDMTerritory", "");
		aliasToValueMapList.put("speidmusertype", "");
		aliasToValueMapList.put("speiptvpackages", "");
		aliasToValueMapList.put("speJoggerA1", "");
		aliasToValueMapList.put("speJoggerA2", "");
		aliasToValueMapList.put("speJoggerQ1", "");
		aliasToValueMapList.put("speJoggerQ2", "");
		aliasToValueMapList.put("speMgrID", "");
		aliasToValueMapList.put("speMobile", "");
		aliasToValueMapList.put("speNativeEmail", "");
		aliasToValueMapList.put("speNativeEmailServer", "");
		aliasToValueMapList.put("speNativeNotesShortName", "");
		aliasToValueMapList.put("spenikuid", "");
		aliasToValueMapList.put("spenotesshortname", "");
		aliasToValueMapList.put("spenovatusaccess", "");
		aliasToValueMapList.put("speOfficeLocation2", "");
		aliasToValueMapList.put("speOfficeLocation3", "");
		aliasToValueMapList.put("speoversightaccess", "");
		aliasToValueMapList.put("spePasswordFlag", "");
		aliasToValueMapList.put("spepeoplefluentaccess", "");
		aliasToValueMapList.put("spePGPRegion", "");
		aliasToValueMapList.put("spePhone", "");
		aliasToValueMapList.put("spepinnumber", "");
		aliasToValueMapList.put("speprodsafetyaccess", "");
		aliasToValueMapList.put("speproductionbackboneaccess", "");
		aliasToValueMapList.put("spepsid", "");
		aliasToValueMapList.put("spepssaccess", "");
		aliasToValueMapList.put("spepwdexprydt", "");
		aliasToValueMapList.put("spepwdplcexmtstatus", "");
		aliasToValueMapList.put("speqcaccess", "");
		aliasToValueMapList.put("speRoomNumber3", "");
		aliasToValueMapList.put("SPERPMAccess", "");
		aliasToValueMapList.put("spesabaaccess", "");
		aliasToValueMapList.put("spesalesbankaccess", "");
		aliasToValueMapList.put("speSecondaryPhone", "");
		aliasToValueMapList.put("spespeedid", "");
		aliasToValueMapList.put("spestoreroomaccess", "");
		aliasToValueMapList.put("spesubdivisionname", "");
		aliasToValueMapList.put("speswiftaccess", "");
		aliasToValueMapList.put("spetestapplicationaccess", "");
		aliasToValueMapList.put("speTrial", "");
		aliasToValueMapList.put("spetrintechaccess", "");
		aliasToValueMapList.put("speVipFlag", "");
		aliasToValueMapList.put("speVPNGroup", "");
		aliasToValueMapList.put("spewdempid", "");
		aliasToValueMapList.put("speworktype", "");
		aliasToValueMapList.put("VPNEnabled", "");
		return aliasToValueMapList;
	}
}
