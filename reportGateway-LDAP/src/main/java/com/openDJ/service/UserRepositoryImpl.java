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
import com.openDJ.pojo.User;

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
		controls.setCountLimit(1000);
		//controls.setCountLimit(50000);
		return ldapTemplate.search("", "(objectclass="+className+")", controls, new AllUserAttributesMapper());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see ldap.advance.example.UserRepositoryIntf#authenticate(java.lang.String,
	 * java.lang.String)
	 */
	
	public boolean authenticate(String base, String userName, String password) throws Exception{
		log.info("executing {authenticate}");
		base="";
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
		
		//public Map<Object,Object> mapFromAttributes(Attributes attrs) throws NamingException {
			
		//New COde to limit reutn .getAll()
		public Object mapFromAttributes(final Attributes attrs) throws NamingException {
				/*User user = new User();	
				//Vikash
		        if(attrs.get("uid") != null && attrs.get("uid").get() != null)

                    user.setUid((String) attrs.get("uid").get());

    else

                    user.setUid("");

   

    if(attrs.get("givenname") != null && attrs.get("givenname").get() != null)

                    user.setGivenname((String) attrs.get("givenname").get());

    else

                    user.setGivenname("");                               

                   

    if(attrs.get("sn") != null && attrs.get("sn").get() != null)

                    user.setSn((String) attrs.get("sn").get());

    else

                    user.setSn(""); 

                   

    if(attrs.get("cn") != null && attrs.get("cn").get() != null)

                    user.setCn((String) attrs.get("cn").get());

    else

                    user.setCn("");                 

                   

    if(attrs.get("cn") != null && attrs.get("cn").get() != null)

                    user.setCn((String) attrs.get("cn").get());

    else

                    user.setCn(""); 



   log.info("speassistantemail "+attrs.get("speassistantemail")); //I believe here you are geting null        

   log.info("speassistantemail "+attrs.get("speassistantemail").get());          

   

    if(attrs.get("speassistantemail") != null && attrs.get("speassistantemail").get() != null)

                    user.setSpeassistantemail((String) attrs.get("speassistantemail").get());

    else

                    user.setSpeassistantemail("");  
				//Vikash
				log.info("The Attributes="+attrs);
				log.info("The UID->"+attrs.get("uid").get());
				user.setUid((String) attrs.get("uid").get());
				log.info("The givenname->"+attrs.get("givenname").get());
				user.setGivenname((String) attrs.get("givenname").get());
				log.info("The sn->"+attrs.get("sn").get());
				user.setSn((String) attrs.get("sn").get());
				log.info("The cn->"+attrs.get("cn").get());
				user.setCn((String) attrs.get("cn").get());
				final Attribute speasstemail = attrs.get("speassistantemail");
				if(speasstemail==null)
				{log.info("Skipping speassistenemail");} 
				else
			  user.setSpeassistantemail((String) speasstemail.get() );
				return user;*/
			NamingEnumeration<? extends Attribute> all = attrs.getAll();
			Map<Object,Object> aliasToValueMapList = new HashMap<Object,Object>();
			aliasToValueMapList.put("uid", "N/A");
			aliasToValueMapList.put("givenname", "N/A");
			aliasToValueMapList.put("sn", "N/A");
			aliasToValueMapList.put("cn", "N/A");
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
			aliasToValueMapList.put("SPE-BIRT-HOME", "N/A");
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
			aliasToValueMapList.put("speifdsaccess","N/A");
			aliasToValueMapList.put("speIFDSReportLanguage", "N/A");
			aliasToValueMapList.put("speifdstemporaryuser","N/A");
			aliasToValueMapList.put("speifdsusseraccessenddate","N/A");
			aliasToValueMapList.put("speifdsusertitle", "N/A");
			aliasToValueMapList.put("speOperatingCompany", "N/A");
			aliasToValueMapList.put("spePhysicalLocale", "N/A");
			aliasToValueMapList.put("speTerritory", "N/A");
			aliasToValueMapList.put("st", "N/A");
			aliasToValueMapList.put("street", "N/A");
			aliasToValueMapList.put("title", "N/A");
			aliasToValueMapList.put("spefcmaccess", "N/A");
			
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
