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
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.stereotype.Service;

import com.openDJ.dao.UserRepositoryIntf;
import com.openDJ.pojo.DBLDAPConstant;
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
		controls.setCountLimit(50);
		return ldapTemplate.search("", "(objectclass=" + className + ")",controls, new AllUserAttributesMapper());
	}

	/*
	* Added by vikash
	*/
	/*public List<Object> getAllUsersFor(String speSystemID, Map<String, String> mapUserRecords, String[] arrayAttributes) throws Exception {
		AndFilter filter = new AndFilter();
		filter.and(new EqualsFilter("objectclass", className));
		filter.and(new EqualsFilter("speSystemID", speSystemID));
		return ldapTemplate.search("", filter.encode(),new CreateTemplateAttributesMapper());		
	}*/
	
	/*
	 * Added by vikash
	 */
	public List<Object> getAllUsersFor(String speSystemID,final Map<String,String> mapUserRecords,final String[] arrayAttributes) throws Exception {
		AndFilter filter = new AndFilter();
        filter.and(new EqualsFilter("objectclass", className));
        filter.and(new EqualsFilter("speSystemID", speSystemID));
        //@SuppressWarnings("unchecked")
		//List<Object> list = ldapTemplate.search("",filter.encode(),new AttributesMapper() {
        return  ldapTemplate.search("",filter.encode(),new AllUserAttributesMapper());
         	//   public Object mapFromAttributes(Attributes attrs) throws NamingException {
                //	NamingEnumeration<? extends Attribute> all = attrs.getAll();//DOUBTFULL
                	
                //	Map<Object,Object> aliasToValueMapList = createTemplate();        			
        		//	while (all.hasMore()) {
        			//	Attribute id = all.next();
        				//for (String attr : arrayAttributes) {
        				//	if(DBLDAPConstant.getLDAPAttrName(attr).equals(id.getID())){
						//		log.info("ORGINAL VALUE attr "+attr+" :"+id.get());
						//		log.info("----> attr "+attr+" :"+mapUserRecords.get(attr));
						//		aliasToValueMapList.put(id.getID(),mapUserRecords.get(attr));
					//		}else{
					//			aliasToValueMapList.put(id.getID(),id.get());
					//		}
					//	}  
        				
        			//	if(!aliasToValueMapList.containsKey("uid")){
        			//		if(attrs.get("uid") !=null && attrs.get("uid").get() !=null){
        			//			aliasToValueMapList.put("uid",attrs.get("uid").get());
        		//			}else{
        			//			aliasToValueMapList.put("uid","");
        		//			}
        			//	}
					//	if(!aliasToValueMapList.containsKey("givenname")){
					//		if(attrs.get("givenname") !=null && attrs.get("givenname").get() !=null){
        			//			aliasToValueMapList.put("givenname",attrs.get("givenname").get());
        			//		}else{
        			//			aliasToValueMapList.put("givenname","");
        		//			}
					//	}
					//	if(!aliasToValueMapList.containsKey("sn")){
					//		if(attrs.get("sn") !=null && attrs.get("sn").get() !=null){
        			//			aliasToValueMapList.put("sn",attrs.get("sn").get());
        			//		}else{
        		//				aliasToValueMapList.put("sn","");
        		//			}
				//		}
				//		if(!aliasToValueMapList.containsKey("cn")){
				//			if(attrs.get("cn") !=null && attrs.get("cn").get() !=null){
        		//				aliasToValueMapList.put("cn",attrs.get("cn").get());
        		//			}else{
        		//				aliasToValueMapList.put("cn","");
        		//			}
				//		}
					//	if(!aliasToValueMapList.containsKey("speassistantemail")){
				//			if(attrs.get("speassistantemail") !=null && attrs.get("speassistantemail").get() !=null){
        			//			aliasToValueMapList.put("speassistantemail",attrs.get("speassistantemail").get());
        		//			}else{
        		//				aliasToValueMapList.put("speassistantemail","");
        		//			}
				//		}
        				
        		//	}
        		//	return aliasToValueMapList;	
           //     }
         //   });
      //  return list;
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
		return ldapTemplate.authenticate(base, "(uid=" + userName + ")",
				password);
	}

	/**
	 * This class is responsible to prepare User object after ldap search.
	 *
	 * @author KMaji
	 *
	 */
	private class UserAttributesMapper implements AttributesMapper<Object> {

		public Object mapFromAttributes(Attributes attributes)
				throws NamingException {
			return attributes.getAll().toString();
		}
	}

	/**
	 * This class is responsible to prepare User object after ldap search.
	 *
	 * @author KMaji
	 *
	 */
	private class AllUserAttributesMapper implements AttributesMapper<Object> {
		public Object mapFromAttributes(final Attributes attrs)throws NamingException {
			
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

	private Map<Object,Object> createTemplate(){
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
