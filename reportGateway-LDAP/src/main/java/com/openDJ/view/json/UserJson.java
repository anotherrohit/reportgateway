package com.openDJ.view.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author KMaji
 *
 */
@JsonInclude(Include.NON_NULL)
public class UserJson
{

	/**
	 *
	 */
	@JsonProperty("uid")
	private String uid;
	@JsonProperty("givenname")
	private String givenname;
	@JsonProperty("sn")
	private String sn;
	@JsonProperty("cn")
	private String cn;
	@JsonProperty("userPassword")
	private String userPassword;
	@JsonProperty("postalAddress")
	private String postalAddress;
	@JsonProperty("telephoneNumber")
	private String telephoneNumber;
	
	@JsonProperty("speassistantemail")
	 private String speassistantemail ; 
	@JsonProperty("spemobile2")
	 private String spemobile2 ; 
	@JsonProperty("speofficefax")
	 private String speOfficeFax ; 
	@JsonProperty("speHomeFax")
	 private String speHomeFax ; 
	@JsonProperty("speHomePhone")
	 private String speHomePhone ; 
	@JsonProperty("speonenetflag")
	 private String speonenetflag ; 
	@JsonProperty("speb2brestrictaccess")
	 private String speb2brestrictaccess ; 
	@JsonProperty("speuserPrincipalName")
	 private String speuserPrincipalName ; 
	@JsonProperty("spepwpolicyflag")
	 private String spepwpolicyflag ; 
	@JsonProperty("spedicersonyaccess")
	 private String spedicersonyaccess ;
	@JsonProperty("speprimarybusinesspartner")
	 private String speprimarybusinesspartner ;
	@JsonProperty("spepawsaccess")
	private String spepawsaccess ; 
	@JsonProperty("spebebanjoid")
	 private String spebebanjoid ; 
	@JsonProperty("spebirthome")
	 private String spebirthome; 
	@JsonProperty("spebirtaccess")
	 private String spebirtaccess ;
	@JsonProperty("spelastdayofwork")
	 private String spelastdayofwork ;
	@JsonProperty("spemedgateaccess")
	 private String spemedgateaccess ;
	@JsonProperty("selfservicepwdchgdate")
	 private String selfservicepwdchgdate ;
	@JsonProperty("speappdynamicaccess")
	 private String speappdynamicaccess ;
	@JsonProperty("speOnLeaveFlag")
	 private String speOnLeaveFlag ;
	@JsonProperty("speiiqadminaccess")
	 private String speiiqadminaccess ;
	@JsonProperty("spewpfaccess")
	 private String spewpfaccess ; 
	@JsonProperty("spewpfaccess")
	 private String spespheconnectaccess ;
	@JsonProperty("spespecialeventsaccess")
	 private String spespecialeventsaccess ; 
	@JsonProperty("spec2access")
	 private String spec2access ;
	@JsonProperty("spediceraccess")
	 private String spediceraccess ;
	@JsonProperty("spewebmethodsaccess")
	 private String spewebmethodsaccess ;
	@JsonProperty("spewptsaccess")
	 private String spewptsaccess ;
	@JsonProperty("spebebanjoaccess")
	 private String spebebanjoaccess ; 
	@JsonProperty("spefclaccess")
	 private String spefclaccess ; 
	@JsonProperty("spezlarchive2faaccess")
	private String spezlarchive2faaccess ;
	@JsonProperty("speviasataccess")
	 private String speviasataccess ;
	@JsonProperty("spepercussionaccess")
	 private String spepercussionaccess ;
	@JsonProperty("spesouacceptance")
	 private String spesouacceptance ;
	@JsonProperty("SPE2FATokenClass")
	 private String SPE2FATokenClass ; 
	@JsonProperty("spe2faoathotp")
	 private String spe2faoathotp ; 
	@JsonProperty("spe2faoathseed")
	 private String spe2faoathseed ; 
	@JsonProperty("spehightailaccess")
	 private String spehightailaccess ; 
	@JsonProperty("spedrmaccess")
	 private String spedrmaccess ;
	@JsonProperty("spegnetaccess")
	 private String spegnetaccess ; 
	@JsonProperty("speorganizationlevel")
	 private String speorganizationlevel ;
	@JsonProperty("speMgrDn")
	 private String speMgrDn ;
	@JsonProperty("speMgmtLevel")
	 private String speMgmtLevel ;
	@JsonProperty("speEndDate")
	 private String speEndDate ;
	@JsonProperty("speTerminationDate")
	 private String speTerminationDate ;
	@JsonProperty("speairlinesaccess")
	 private String speairlinesaccess ; 
	@JsonProperty("spedesignstudioaccess")
	 private String spedesignstudioaccess ; 
	@JsonProperty("sperepetoryaccess")
	 private String sperepetoryaccess ; 
	@JsonProperty("spedmcmaccess")
	 private String spedmcmaccess ; 
	@JsonProperty("speinflightaccess")
	 private String speinflightaccess ;
	@JsonProperty("Istempassword")
	 private String Istempassword ; 
	@JsonProperty("spemediacenteraccess")
	 private String spemediacenteraccess ; 
	@JsonProperty("speodinaccess")
	 private String speodinaccess ; 
	@JsonProperty("spealfrescocontenttype")
	 private String spealfrescocontenttype ;
	@JsonProperty("specimsaccess")
	 private String specimsaccess ;
	@JsonProperty("specimsaccess")
	 private String speparisaccess ;
	@JsonProperty("spetableausite")
	 private String spetableausite ; 
	@JsonProperty("spepinnacleaccess")
	 private String spepinnacleaccess ; 
	@JsonProperty("spetableauaccess")
	 private String spetableauaccess ; 
	@JsonProperty("spenetworkfileconverteraccess")
	 private String spenetworkfileconverteraccess ; 
	 @JsonProperty("spehorizonwebappaccess")
	private String spehorizonwebappaccess ; 
	 @JsonProperty("speInterplanaccess")
	 private String speInterplanaccess ; 
	 @JsonProperty("speprivacyacknowledge")
	 private String speprivacyacknowledge ;
	 @JsonProperty("speoversightapaccess")
	 private String speoversightapaccess ; 
	 @JsonProperty("speSystemID")
	 private String speSystemID ;
	 @JsonProperty("speInternationalPhone")
	 private String speInternationalPhone ;
	 @JsonProperty("spepotrackeraccess")
	 private String spepotrackeraccess ; 
	 @JsonProperty("spesspaccessed")
	 private String spesspaccessed ; 
	 @JsonProperty("spesspeverbridge")
	 private String spesspeverbridge ;
	 @JsonProperty("privacypolicyacceptedon")
	 private String privacypolicyacceptedon ;
	 @JsonProperty("speediscoverycustodianaccess")
	 private String speediscoverycustodianaccess ;
	@JsonProperty("speworkdaysitecode")
	 private String speworkdaysitecode ; 
	@JsonProperty("generationQualifier")
	 private String generationQualifier ; 
	@JsonProperty("lobindicator")
	 private String lobindicator ; 
	@JsonProperty("spesubdivisionid")
	 private String spesubdivisionid ;
	@JsonProperty("spebusinessunitid")
	 private String spebusinessunitid ;
	@JsonProperty("spebusinessunitname")
	 private String spebusinessunitname ; 
	@JsonProperty("spePGPPolicy")
	 private String spePGPPolicy ;
	@JsonProperty("spepwdplcexmtsts")
	 private String spepwdplcexmtsts ; 
	@JsonProperty("speasvaccess")
	 private String speasvaccess ;
	@JsonProperty("speintegrifyaccess")
	 private String speintegrifyaccess ; 
	@JsonProperty("SPTResearchAdminAccess")
	 private String SPTResearchAdminAccess ; 
	@JsonProperty("spe2faPhone1Type")
	 private String spe2faPhone1Type ; 
	@JsonProperty("spe2faPhone2Type")
	 private String spe2faPhone2Type ;
	@JsonProperty("spe2faPhone1")
	 private String spe2faPhone1 ; 
	@JsonProperty("spe2faPhone1SMS")
	 private String  spe2faPhone1SMS ;
	@JsonProperty("spe2faPhone1Email")
	 private String spe2faPhone1Email ; 
	@JsonProperty("spe2faPhone2")
	 private String spe2faPhone2 ;
	@JsonProperty("spe2faPhone2SMS")
	 private String  spe2faPhone2SMS ; 
	@JsonProperty("spe2faPhone2Email")
	 private String spe2faPhone2Email ; 
	@JsonProperty("spe2faPhone3")
	 private String  spe2faPhone3 ; 
	@JsonProperty("spe2faPhone3SMS")
	 private String spe2faPhone3SMS ; 
	@JsonProperty("spe2faPhone3Email")
	 private String spe2faPhone3Email ;
	@JsonProperty("spespticomaccess")
	 private String spespticomaccess ; 
	@JsonProperty("spenetgainaccess")
	 private String spenetgainaccess ; 
	@JsonProperty("speevmiaccess")
	 private String speevmiaccess ;
	@JsonProperty("spedealpointaccess")
	 private String spedealpointaccess ;
	@JsonProperty("specreativenetworksaccess")
	 private String  specreativenetworksaccess ; 
	@JsonProperty("spe2faeagl")
	private String spe2faeagl ; 
	@JsonProperty("speScryAccess")
	 private String speScryAccess ; 
	@JsonProperty("speBusinessObjectsGroup")
	 private String speBusinessObjectsGroup ;
	@JsonProperty("speBusinessObjectsAccess")
	 private String speBusinessObjectsAccess ;
	@JsonProperty("spePRISMAccess")
	private String  spePRISMAccess ;
	@JsonProperty("speexecutivedirectoryadmin")
	 private String speexecutivedirectoryadmin ; 
	@JsonProperty("speexecutivedirectoryuser") 
	private String speexecutivedirectoryuser ; 
	@JsonProperty("speebrelaccess")
	private String speebrelaccess ; 
	@JsonProperty("spedartsroles")
	 private String spedartsroles ;
	@JsonProperty("myspeaccess")
	 private String myspeaccess ; 
	@JsonProperty("myspedepts")
	 private String  myspedepts ; 
	@JsonProperty("myspeemail")
	 private String myspeemail ; 
	@JsonProperty("mysperole")
	 private String  mysperole ;
	@JsonProperty("isMemberOf")
	 private String isMemberOf ;
	@JsonProperty("myspeworkspace")
	 private String myspeworkspace ;
	@JsonProperty("myspeworkspacedepts")
	 private String myspeworkspacedepts ; 
	@JsonProperty("mysphedepts")
	 private String mysphedepts ; 
	@JsonProperty("myspherole")
	 private String myspherole ; 
	@JsonProperty("mysptiregions")
	 private String mysptiregions ;
	@JsonProperty("sonyGHD")
	 private String  sonyGHD ; 
	@JsonProperty("SonyRemoteUserBusinessUnitType")
	 private String SonyRemoteUserBusinessUnitType ;
	 @JsonProperty("speaccutracaccess")
	private String speaccutracaccess ; 
	 @JsonProperty("speacshome")
	 private String speacshome ; 
	 @JsonProperty("speacsproductiona")
	 private String speacsproductiona ; 
	 @JsonProperty("speacsproductionavpnremote")
	 private String speacsproductionavpnremote ;
	 @JsonProperty("speacsproductionawired")
	 private String speacsproductionawired ; 
	 @JsonProperty("speacsproductionawireless")
	 private String  speacsproductionawireless ;
	 @JsonProperty("speacsproductionb")
	 private String speacsproductionb ; 
	 @JsonProperty("speacsproductionbvpnremote")
	 private String speacsproductionbvpnremote ;
	@JsonProperty("speacsproductionbwired")
	 private String speacsproductionbwired ; 
	@JsonProperty("speacsproductionbwireless")
	 private String  speacsproductionbwireless ;
	@JsonProperty("speacsproductionc")
	private String speacsproductionc ; 
	@JsonProperty("speacsproductioncvpnremote")
	 private String speacsproductioncvpnremote ; 
	 @JsonProperty("speacsproductioncwired")
	private String speacsproductioncwired ;
	 @JsonProperty("speacsproductioncwireless")
	 private String speacsproductioncwireless ; 
	 @JsonProperty("speacsproductiond")
	 private String speacsproductiond ; 
	 @JsonProperty("speacsproductiondvpnremote")
	 private String speacsproductiondvpnremote ; 
	 @JsonProperty("speacsproductiondwired")
	 private String  speacsproductiondwired ;
	 @JsonProperty("speacsproductiondwireless")
	 private String speacsproductiondwireless ; 
	 @JsonProperty("speacsproductione")
	 private String speacsproductione ; 
	 @JsonProperty("speacsproductionevpnremote")
	 private String speacsproductionevpnremote ;
	 @JsonProperty("speacsproductionewired")
	 private String speacsproductionewired ; 
	 @JsonProperty("speacsproductionewireless")
	 private String speacsproductionewireless ;
	 @JsonProperty("speacsproductionf")
	 private String  speacsproductionf ;
	 @JsonProperty("speacsproductionfvpnremote")
	 private String speacsproductionfvpnremote ; 
	 @JsonProperty("speacsproductionfwired")
	 private String speacsproductionfwired ; 
	 @JsonProperty("speacsproductionfwireless")
	 private String  speacsproductionfwireless ;
	 @JsonProperty("speacsproductiong")
	 private String speacsproductiong ; 
	 @JsonProperty("speacsproductiongvpnremote")
	 private String speacsproductiongvpnremote ; 
	 @JsonProperty("speacsproductiongwired")
	 private String speacsproductiongwired ;
	 @JsonProperty("speacsproductiongwireless")
	 private String speacsproductiongwireless ; 
	 @JsonProperty("speacsproductionh")
	 private String speacsproductionh ;
	 @JsonProperty("speacsproductionhvpnremote")
	 private String speacsproductionhvpnremote ; 
	 @JsonProperty("speacsproductionhwired")
	 private String speacsproductionhwired ;
	 @JsonProperty("speacsproductionhwireless")
	 private String speacsproductionhwireless ; 
	 @JsonProperty("speacsproductioni")
	 private String speacsproductioni ; 
	 @JsonProperty("speacsproductionivpnremote")
	 private String speacsproductionivpnremote ;
	 @JsonProperty("speacsproductioniwired")
	 private String speacsproductioniwired ;
	 @JsonProperty("speacsproductioniwireless")
	 private String speacsproductioniwireless ; 
	@JsonProperty("speacsproductionj")
	 private String speacsproductionj ; 
	@JsonProperty("speacsproductionjvpnremote")
	 private String speacsproductionjvpnremote ;
	@JsonProperty("speacsproductionjwired")
	private String speacsproductionjwired ;
	@JsonProperty("speacsproductionjwireless")
	 private String speacsproductionjwireless ; 
	@JsonProperty("speacsproductionk")
	private String speacsproductionk ;
	@JsonProperty("speacsproductionkvpnremote")
	 private String speacsproductionkvpnremote ;
	@JsonProperty("speacsproductionkwired")
	private String speacsproductionkwired ;
	@JsonProperty("speacsproductionkwireless")
	 private String  speacsproductionkwireless ; 
	 @JsonProperty("speacsproductionl")
	private String speacsproductionl ;
	 @JsonProperty("speacsproductionlvpnremote")
	 private String speacsproductionlvpnremote ; 
	 @JsonProperty("speacsproductionlvpnremote")
	 private String speacsproductionlwired ;
	 @JsonProperty("speacsproductionlwireless")
	 private String speacsproductionlwireless ; 
	@JsonProperty("speacsproductionm")
	 private String speacsproductionm ; 
	@JsonProperty("speacsproductionmvpnremote")
	 private String speacsproductionmvpnremote ; 
	@JsonProperty("speacsproductionmwired")
	private String speacsproductionmwired ; 
	@JsonProperty("speacsproductionmwireless")
	 private String  speacsproductionmwireless ; 
	@JsonProperty("speacsproductionn")
	private String  speacsproductionn ; 
	@JsonProperty("speacsproductionnvpnremote")
	 private String speacsproductionnvpnremote ; 
	@JsonProperty("speacsproductionnwired")
	private String  speacsproductionnwired ; 
	@JsonProperty("speacsproductionnwireless")
	 private String speacsproductionnwireless ; 
	@JsonProperty("spealfrescoaccess")
	private String  spealfrescoaccess ; 
	@JsonProperty("spealfrescobcaccess")
	 private String spealfrescobcaccess ; 
	@JsonProperty("speAppsPermitted")
	 private String speAppsPermitted ; 
	@JsonProperty("speb2baccess")
	 private String speb2baccess ;
	@JsonProperty("spebuildingid")
	 private String spebuildingid ; 
	@JsonProperty("spebusinessunit")
	 private String spebusinessunit ; 
	@JsonProperty("specardinusaccess")
	 private String specardinusaccess ; 
	@JsonProperty("specitrixaccess")
	 private String specitrixaccess ; 
	@JsonProperty("specompanyid")
	 private String specompanyid ;
	@JsonProperty("specostcenter")
	 private String specostcenter ;
	@JsonProperty("specountry")
	 private String specountry ; 
	@JsonProperty("spedealtrackeraccess")
	 private String spedealtrackeraccess ;
	@JsonProperty("spedepartmentid")
	 private String spedepartmentid ;
	@JsonProperty("spedepartmentname")
	 private String spedepartmentname ; 
	@JsonProperty("speDisplayFaxNumber")
	 private String speDisplayFaxNumber ;
	@JsonProperty("speDisplaygivenName")
	 private String speDisplaygivenName ;
	@JsonProperty("speDisplaySurname")
	 private String speDisplaySurname ;
	@JsonProperty("speDisplayTelephoneNumber")
	 private String speDisplayTelephoneNumber ; 
	@JsonProperty("spedivision")
	 private String spedivision ; 
	@JsonProperty("spedivisionid")
	 private String spedivisionid ; 
	@JsonProperty("spedivisionname")
	 private String spedivisionname ;
	@JsonProperty("spedominodn")
	 private String spedominodn ; 
	@JsonProperty("spedominomaildb")
	 private String spedominomaildb ; 
	@JsonProperty("spedroolsaccess")
	 private String spedroolsaccess ; 
	@JsonProperty("spedrozaccess")
	 private String spedrozaccess ; 
	@JsonProperty("speEmpBadgeID")
	 private String speEmpBadgeID ; 
	@JsonProperty("speEmpBirthDate")
	 private String speEmpBirthDate ; 
	@JsonProperty("speEmpDataSource")
	 private String speEmpDataSource ; 
	@JsonProperty("speEmpFloor")
	 private String speEmpFloor ; 
	@JsonProperty("speEmpFrmCtr")
	 private String speEmpFrmCtr ; 
	@JsonProperty("speEmpHireDate")
	 private String speEmpHireDate ;
	@JsonProperty("speEmpID")
	 private String speEmpID ; 
	@JsonProperty("speEmpPwdChg")
	 private String speEmpPwdChg ;
	@JsonProperty("speEmpSrvyComp")
	 private String speEmpSrvyComp ; 
	@JsonProperty("speEmpTermDate")
	 private String speEmpTermDate ;
	@JsonProperty("speEmpWorkState")
	 private String speEmpWorkState ;
	@JsonProperty("speGlobalID")
	 private String speGlobalID ;
	@JsonProperty("speIDMAccountLocked")
	 private String speIDMAccountLocked ;
	@JsonProperty("speIDMRegion")
	 private String speIDMRegion ; 
	@JsonProperty("speIDMTerritory")
	 private String speIDMTerritory ; 
	@JsonProperty("speidmusertype")
	 private String speidmusertype ; 
	@JsonProperty("speiptvpackages")
	 private String speiptvpackages ;
	@JsonProperty("speJoggerA1")
	 private String speJoggerA1 ; 
	@JsonProperty("speJoggerA2")
	private String speJoggerA2;
	@JsonProperty("speJoggerQ1")
	private String speJoggerQ1 ;
	@JsonProperty("speJoggerQ2")
	private String speJoggerQ2 ; 
	@JsonProperty("speMgrID")
	 private String speMgrID ;
	@JsonProperty("speMobile")
	 private String speMobile ;
	@JsonProperty("speNativeEmail")
	 private String speNativeEmail ;
	@JsonProperty("speNativeEmailServer")
	 private String speNativeEmailServer ;
	@JsonProperty("speNativeNotesShortName")
	 private String speNativeNotesShortName ;
	@JsonProperty("spenikuid")
	 private String spenikuid ;
	@JsonProperty("spenotesshortname")
	 private String spenotesshortname ;
	@JsonProperty("spenovatusaccess")
	 private String spenovatusaccess ;
	@JsonProperty("speOfficeLocation2")
	 private String speOfficeLocation2 ;
	@JsonProperty("speOfficeLocation3")
	 private String speOfficeLocation3 ; 
	@JsonProperty("speoversightaccess")
	 private String speoversightaccess ;
	@JsonProperty("spePasswordFlag")
	 private String spePasswordFlag ; 
	@JsonProperty("spepeoplefluentaccess")
	 private String spepeoplefluentaccess ;
	@JsonProperty("spePGPRegion")
	 private String spePGPRegion ; 
	@JsonProperty("spePhone")
	private String spePhone ;
	@JsonProperty("spepinnumber")
	private String spepinnumber ;
	@JsonProperty("speprodsafetyaccess")
	private String speprodsafetyaccess ;
	@JsonProperty("speproductionbackboneaccess")
	 private String speproductionbackboneaccess ;
	@JsonProperty("spepsid")
	 private String spepsid ;
	@JsonProperty("spepssaccess")
	 private String spepssaccess ;
	@JsonProperty("spepwdexprydt")
	 private String spepwdexprydt ;
	@JsonProperty("spepwdplcexmtstatus")
	 private String spepwdplcexmtstatus ;
	@JsonProperty("speqcaccess")
	 private String speqcaccess ;
	@JsonProperty("speRoomNumber3")
	 private String speRoomNumber3 ;
	@JsonProperty("SPERPMAccess")
	 private String SPERPMAccess ;
	 @JsonProperty("spesabaaccess")
	 private String spesabaaccess ; 
	 @JsonProperty("spesalesbankaccess")
	 private String spesalesbankaccess ;
	 @JsonProperty("speSecondaryPhone")
	 private String speSecondaryPhone ;
	 @JsonProperty("spespeedid")
	 private String spespeedid ; 
	 @JsonProperty("spestoreroomaccess")
	 private String spestoreroomaccess ;
	 @JsonProperty("spesubdivisionname")
	 private String spesubdivisionname ; 
	 @JsonProperty("speswiftaccess")
	 private String speswiftaccess ; 
	 @JsonProperty("spetestapplicationaccess")
	 private String spetestapplicationaccess ;
	 @JsonProperty("speTrial")
	 private String speTrial ; 
	 @JsonProperty("spetrintechaccess")
	 private String spetrintechaccess ;
	 @JsonProperty("speVipFlag")
	 private String speVipFlag ;
	 @JsonProperty("speVPNGroup")
	 private String speVPNGroup ; 
	 @JsonProperty("spewdempid")
	private String spewdempid ;
	@JsonProperty("speworktype")
	private String speworktype ;
	@JsonProperty("VPNEnabled")
	private String VPNEnabled ;
	@JsonProperty("speifdsaccess")
    private String speifdsaccess;
	@JsonProperty("speIFDSReportLanguage")
	private String speIFDSReportLanguage;
	@JsonProperty("speifdstemporaryuser")
	private String speifdstemporaryuser;
	@JsonProperty("speifdsuseraccessenddate")
	private String speifdsuseraccessenddate;
	@JsonProperty("speifdsusertitle")
	private String speifdsusertitle;
	@JsonProperty("speOperatingCompany")
	private String speOperatingCompany;
	@JsonProperty("spePhysicalLocale")
	private String spePhysicalLocale;
	@JsonProperty("speTerritory")
	private String speTerritory;
	@JsonProperty("st")
	private String st;
	@JsonProperty("street")
	private String street;
	@JsonProperty("title")
	private String title;
	@JsonProperty("spefcmaccess")
	private String spefcmaccess;
	
	/**
	 * @return the uid
	 */
	public synchronized final String getUid()
	{
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public synchronized final void setUid(String uid)
	{
		this.uid = uid;
	}

	public synchronized final String getFirstName()
	{
		return givenname;
	}

	public synchronized final void setFirstName(String givenname)
	{
		this.givenname = givenname;
	}

	public synchronized final String getLastName()
	{
		return sn;
	}

	public synchronized final void setLastName(String sn)
	{
		this.sn = sn;
	}

	/**
	 * @return the cn
	 */
	public synchronized final String getCn()
	{
		return cn;
	}

	/**
	 * @param cn
	 *            the cn to set
	 */
	public synchronized final void setCn(String cn)
	{
		this.cn = cn;
	}

	/**
	 * @return the sn
	 */
	public synchronized final String getSn()
	{
		return sn;
	}

	/**
	 * @param sn
	 *            the sn to set
	 */
	public synchronized final void setSn(String sn)
	{
		this.sn = sn;
	}

	/**
	 * @return the userPassword
	 */
	public synchronized final String getUserPassword()
	{
		return userPassword;
	}

	/**
	 * @param userPassword
	 *            the userPassword to set
	 */
	public synchronized final void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}

	/**
	 * @return the postalAddress
	 */
	public synchronized final String getPostalAddress()
	{
		return postalAddress;
	}

	/**
	 * @param postalAddress
	 *            the postalAddress to set
	 */
	public synchronized final void setPostalAddress(String postalAddress)
	{
		this.postalAddress = postalAddress;
	}

	/**
	 * @return the telephoneNumber
	 */
	public synchronized final String getTelephoneNumber()
	{
		return telephoneNumber;
	}

	/**
	 * @param telephoneNumber
	 *            the telephoneNumber to set
	 */
	public synchronized final void setTelephoneNumber(String telephoneNumber)
	{
		this.telephoneNumber = telephoneNumber;
	}

	public synchronized final String getSpeassistantemail() {
		return speassistantemail;
	}

	public synchronized final void setSpeassistantemail(String speassistantemail) {
		this.speassistantemail = speassistantemail;
	}

	public synchronized final String getSpemobile2() {
		return spemobile2;
	}

	public synchronized final void setSpemobile2(String spemobile2) {
		this.spemobile2 = spemobile2;
	}

	public synchronized final String getSpeOfficeFax() {
		return speOfficeFax;
	}

	public synchronized final void setSpeOfficeFax(String speOfficeFax) {
		this.speOfficeFax = speOfficeFax;
	}

	public synchronized final String getSpeHomeFax() {
		return speHomeFax;
	}

	public synchronized final void setSpeHomeFax(String speHomeFax) {
		this.speHomeFax = speHomeFax;
	}

	public synchronized final String getSpeHomePhone() {
		return speHomePhone;
	}

	public synchronized final void setSpeHomePhone(String speHomePhone) {
		this.speHomePhone = speHomePhone;
	}

	public synchronized final String getSpeonenetflag() {
		return speonenetflag;
	}

	public synchronized final void setSpeonenetflag(String speonenetflag) {
		this.speonenetflag = speonenetflag;
	}

	public synchronized final String getSpeb2brestrictaccess() {
		return speb2brestrictaccess;
	}

	public synchronized final void setSpeb2brestrictaccess(String speb2brestrictaccess) {
		this.speb2brestrictaccess = speb2brestrictaccess;
	}

	public synchronized final String getSpeuserPrincipalName() {
		return speuserPrincipalName;
	}

	public synchronized final void setSpeuserPrincipalName(String speuserPrincipalName) {
		this.speuserPrincipalName = speuserPrincipalName;
	}

	public synchronized final String getSpepwpolicyflag() {
		return spepwpolicyflag;
	}

	public synchronized final void setSpepwpolicyflag(String spepwpolicyflag) {
		this.spepwpolicyflag = spepwpolicyflag;
	}

	public synchronized final String getSpedicersonyaccess() {
		return spedicersonyaccess;
	}

	public synchronized final void setSpedicersonyaccess(String spedicersonyaccess) {
		this.spedicersonyaccess = spedicersonyaccess;
	}

	public synchronized final String getSpeprimarybusinesspartner() {
		return speprimarybusinesspartner;
	}

	public synchronized final void setSpeprimarybusinesspartner(String speprimarybusinesspartner) {
		this.speprimarybusinesspartner = speprimarybusinesspartner;
	}

	public synchronized final String getSpepawsaccess() {
		return spepawsaccess;
	}

	public synchronized final void setSpepawsaccess(String spepawsaccess) {
		this.spepawsaccess = spepawsaccess;
	}

	public synchronized final String getSpebebanjoid() {
		return spebebanjoid;
	}

	public synchronized final void setSpebebanjoid(String spebebanjoid) {
		this.spebebanjoid = spebebanjoid;
	}

	public synchronized final String getSpebirthome() {
		return spebirthome;
	}

	public synchronized final void setSpebirthome(String spebirthome) {
		this.spebirthome = spebirthome;
	}

	public synchronized final String getSpebirtaccess() {
		return spebirtaccess;
	}

	public synchronized final void setSpebirtaccess(String spebirtaccess) {
		this.spebirtaccess = spebirtaccess;
	}

	public synchronized final String getSpelastdayofwork() {
		return spelastdayofwork;
	}

	public synchronized final void setSpelastdayofwork(String spelastdayofwork) {
		this.spelastdayofwork = spelastdayofwork;
	}

	public synchronized final String getSpemedgateaccess() {
		return spemedgateaccess;
	}

	public synchronized final void setSpemedgateaccess(String spemedgateaccess) {
		this.spemedgateaccess = spemedgateaccess;
	}

	public synchronized final String getSelfservicepwdchgdate() {
		return selfservicepwdchgdate;
	}

	public synchronized final void setSelfservicepwdchgdate(String selfservicepwdchgdate) {
		this.selfservicepwdchgdate = selfservicepwdchgdate;
	}

	public synchronized final String getSpeappdynamicaccess() {
		return speappdynamicaccess;
	}

	public synchronized final void setSpeappdynamicaccess(String speappdynamicaccess) {
		this.speappdynamicaccess = speappdynamicaccess;
	}

	public synchronized final String getSpeOnLeaveFlag() {
		return speOnLeaveFlag;
	}

	public synchronized final void setSpeOnLeaveFlag(String speOnLeaveFlag) {
		this.speOnLeaveFlag = speOnLeaveFlag;
	}

	public synchronized final String getSpeiiqadminaccess() {
		return speiiqadminaccess;
	}

	public synchronized final void setSpeiiqadminaccess(String speiiqadminaccess) {
		this.speiiqadminaccess = speiiqadminaccess;
	}

	public synchronized final String getSpewpfaccess() {
		return spewpfaccess;
	}

	public synchronized final void setSpewpfaccess(String spewpfaccess) {
		this.spewpfaccess = spewpfaccess;
	}

	public synchronized final String getSpespheconnectaccess() {
		return spespheconnectaccess;
	}

	public synchronized final void setSpespheconnectaccess(String spespheconnectaccess) {
		this.spespheconnectaccess = spespheconnectaccess;
	}

	public synchronized final String getSpespecialeventsaccess() {
		return spespecialeventsaccess;
	}

	public synchronized final void setSpespecialeventsaccess(String spespecialeventsaccess) {
		this.spespecialeventsaccess = spespecialeventsaccess;
	}

	public synchronized final String getSpec2access() {
		return spec2access;
	}

	public synchronized final void setSpec2access(String spec2access) {
		this.spec2access = spec2access;
	}

	public synchronized final String getSpediceraccess() {
		return spediceraccess;
	}

	public synchronized final void setSpediceraccess(String spediceraccess) {
		this.spediceraccess = spediceraccess;
	}

	public synchronized final String getSpewebmethodsaccess() {
		return spewebmethodsaccess;
	}

	public synchronized final void setSpewebmethodsaccess(String spewebmethodsaccess) {
		this.spewebmethodsaccess = spewebmethodsaccess;
	}

	public synchronized final String getSpewptsaccess() {
		return spewptsaccess;
	}

	public synchronized final void setSpewptsaccess(String spewptsaccess) {
		this.spewptsaccess = spewptsaccess;
	}

	public synchronized final String getSpebebanjoaccess() {
		return spebebanjoaccess;
	}

	public synchronized final void setSpebebanjoaccess(String spebebanjoaccess) {
		this.spebebanjoaccess = spebebanjoaccess;
	}

	public synchronized final String getSpefclaccess() {
		return spefclaccess;
	}

	public synchronized final void setSpefclaccess(String spefclaccess) {
		this.spefclaccess = spefclaccess;
	}

	public synchronized final String getSpezlarchive2faaccess() {
		return spezlarchive2faaccess;
	}

	public synchronized final void setSpezlarchive2faaccess(String spezlarchive2faaccess) {
		this.spezlarchive2faaccess = spezlarchive2faaccess;
	}

	public synchronized final String getSpeviasataccess() {
		return speviasataccess;
	}

	public synchronized final void setSpeviasataccess(String speviasataccess) {
		this.speviasataccess = speviasataccess;
	}

	public synchronized final String getSpepercussionaccess() {
		return spepercussionaccess;
	}

	public synchronized final void setSpepercussionaccess(String spepercussionaccess) {
		this.spepercussionaccess = spepercussionaccess;
	}

	public synchronized final String getSpesouacceptance() {
		return spesouacceptance;
	}

	public synchronized final void setSpesouacceptance(String spesouacceptance) {
		this.spesouacceptance = spesouacceptance;
	}

	public synchronized final String getSPE2FATokenClass() {
		return SPE2FATokenClass;
	}

	public synchronized final void setSPE2FATokenClass(String sPE2FATokenClass) {
		SPE2FATokenClass = sPE2FATokenClass;
	}

	public synchronized final String getSpe2faoathotp() {
		return spe2faoathotp;
	}

	public synchronized final void setSpe2faoathotp(String spe2faoathotp) {
		this.spe2faoathotp = spe2faoathotp;
	}

	public synchronized final String getSpe2faoathseed() {
		return spe2faoathseed;
	}

	public synchronized final void setSpe2faoathseed(String spe2faoathseed) {
		this.spe2faoathseed = spe2faoathseed;
	}

	public synchronized final String getSpehightailaccess() {
		return spehightailaccess;
	}

	public synchronized final void setSpehightailaccess(String spehightailaccess) {
		this.spehightailaccess = spehightailaccess;
	}

	public synchronized final String getSpedrmaccess() {
		return spedrmaccess;
	}

	public synchronized final void setSpedrmaccess(String spedrmaccess) {
		this.spedrmaccess = spedrmaccess;
	}

	public synchronized final String getSpegnetaccess() {
		return spegnetaccess;
	}

	public synchronized final void setSpegnetaccess(String spegnetaccess) {
		this.spegnetaccess = spegnetaccess;
	}

	public synchronized final String getSpeorganizationlevel() {
		return speorganizationlevel;
	}

	public synchronized final void setSpeorganizationlevel(String speorganizationlevel) {
		this.speorganizationlevel = speorganizationlevel;
	}

	public synchronized final String getSpeMgrDn() {
		return speMgrDn;
	}

	public synchronized final void setSpeMgrDn(String speMgrDn) {
		this.speMgrDn = speMgrDn;
	}

	public synchronized final String getSpeMgmtLevel() {
		return speMgmtLevel;
	}

	public synchronized final void setSpeMgmtLevel(String speMgmtLevel) {
		this.speMgmtLevel = speMgmtLevel;
	}

	public synchronized final String getSpeEndDate() {
		return speEndDate;
	}

	public synchronized final void setSpeEndDate(String speEndDate) {
		this.speEndDate = speEndDate;
	}

	public synchronized final String getSpeTerminationDate() {
		return speTerminationDate;
	}

	public synchronized final void setSpeTerminationDate(String speTerminationDate) {
		this.speTerminationDate = speTerminationDate;
	}

	public synchronized final String getSpeairlinesaccess() {
		return speairlinesaccess;
	}

	public synchronized final void setSpeairlinesaccess(String speairlinesaccess) {
		this.speairlinesaccess = speairlinesaccess;
	}

	public synchronized final String getSpedesignstudioaccess() {
		return spedesignstudioaccess;
	}

	public synchronized final void setSpedesignstudioaccess(String spedesignstudioaccess) {
		this.spedesignstudioaccess = spedesignstudioaccess;
	}

	public synchronized final String getSperepetoryaccess() {
		return sperepetoryaccess;
	}

	public synchronized final void setSperepetoryaccess(String sperepetoryaccess) {
		this.sperepetoryaccess = sperepetoryaccess;
	}

	public synchronized final String getSpedmcmaccess() {
		return spedmcmaccess;
	}

	public synchronized final void setSpedmcmaccess(String spedmcmaccess) {
		this.spedmcmaccess = spedmcmaccess;
	}

	public synchronized final String getSpeinflightaccess() {
		return speinflightaccess;
	}

	public synchronized final void setSpeinflightaccess(String speinflightaccess) {
		this.speinflightaccess = speinflightaccess;
	}

	public synchronized final String getIstempassword() {
		return Istempassword;
	}

	public synchronized final void setIstempassword(String istempassword) {
		Istempassword = istempassword;
	}

	public synchronized final String getSpemediacenteraccess() {
		return spemediacenteraccess;
	}

	public synchronized final void setSpemediacenteraccess(String spemediacenteraccess) {
		this.spemediacenteraccess = spemediacenteraccess;
	}

	public synchronized final String getSpeodinaccess() {
		return speodinaccess;
	}

	public synchronized final void setSpeodinaccess(String speodinaccess) {
		this.speodinaccess = speodinaccess;
	}

	public synchronized final String getSpealfrescocontenttype() {
		return spealfrescocontenttype;
	}

	public synchronized final void setSpealfrescocontenttype(String spealfrescocontenttype) {
		this.spealfrescocontenttype = spealfrescocontenttype;
	}

	public synchronized final String getSpecimsaccess() {
		return specimsaccess;
	}

	public synchronized final void setSpecimsaccess(String specimsaccess) {
		this.specimsaccess = specimsaccess;
	}

	public synchronized final String getSpeparisaccess() {
		return speparisaccess;
	}

	public synchronized final void setSpeparisaccess(String speparisaccess) {
		this.speparisaccess = speparisaccess;
	}

	public synchronized final String getSpetableausite() {
		return spetableausite;
	}

	public synchronized final void setSpetableausite(String spetableausite) {
		this.spetableausite = spetableausite;
	}

	public synchronized final String getSpepinnacleaccess() {
		return spepinnacleaccess;
	}

	public synchronized final void setSpepinnacleaccess(String spepinnacleaccess) {
		this.spepinnacleaccess = spepinnacleaccess;
	}

	public synchronized final String getSpetableauaccess() {
		return spetableauaccess;
	}

	public synchronized final void setSpetableauaccess(String spetableauaccess) {
		this.spetableauaccess = spetableauaccess;
	}

	public synchronized final String getSpenetworkfileconverteraccess() {
		return spenetworkfileconverteraccess;
	}

	public synchronized final void setSpenetworkfileconverteraccess(
			String spenetworkfileconverteraccess) {
		this.spenetworkfileconverteraccess = spenetworkfileconverteraccess;
	}

	public synchronized final String getSpehorizonwebappaccess() {
		return spehorizonwebappaccess;
	}

	public synchronized final void setSpehorizonwebappaccess(String spehorizonwebappaccess) {
		this.spehorizonwebappaccess = spehorizonwebappaccess;
	}

	public synchronized final String getSpeInterplanaccess() {
		return speInterplanaccess;
	}

	public synchronized final void setSpeInterplanaccess(String speInterplanaccess) {
		this.speInterplanaccess = speInterplanaccess;
	}

	public synchronized final String getSpeprivacyacknowledge() {
		return speprivacyacknowledge;
	}

	public synchronized final void setSpeprivacyacknowledge(String speprivacyacknowledge) {
		this.speprivacyacknowledge = speprivacyacknowledge;
	}

	public synchronized final String getSpeoversightapaccess() {
		return speoversightapaccess;
	}

	public synchronized final void setSpeoversightapaccess(String speoversightapaccess) {
		this.speoversightapaccess = speoversightapaccess;
	}

	public synchronized final String getSpeSystemID() {
		return speSystemID;
	}

	public synchronized final void setSpeSystemID(String speSystemID) {
		this.speSystemID = speSystemID;
	}

	public synchronized final String getSpeInternationalPhone() {
		return speInternationalPhone;
	}

	public synchronized final void setSpeInternationalPhone(String speInternationalPhone) {
		this.speInternationalPhone = speInternationalPhone;
	}

	public synchronized final String getSpepotrackeraccess() {
		return spepotrackeraccess;
	}

	public synchronized final void setSpepotrackeraccess(String spepotrackeraccess) {
		this.spepotrackeraccess = spepotrackeraccess;
	}

	public synchronized final String getSpesspaccessed() {
		return spesspaccessed;
	}

	public synchronized final void setSpesspaccessed(String spesspaccessed) {
		this.spesspaccessed = spesspaccessed;
	}

	public synchronized final String getSpesspeverbridge() {
		return spesspeverbridge;
	}

	public synchronized final void setSpesspeverbridge(String spesspeverbridge) {
		this.spesspeverbridge = spesspeverbridge;
	}

	public synchronized final String getPrivacypolicyacceptedon() {
		return privacypolicyacceptedon;
	}

	public synchronized final void setPrivacypolicyacceptedon(String privacypolicyacceptedon) {
		this.privacypolicyacceptedon = privacypolicyacceptedon;
	}

	public synchronized final String getSpeediscoverycustodianaccess() {
		return speediscoverycustodianaccess;
	}

	public synchronized final void setSpeediscoverycustodianaccess(String speediscoverycustodianaccess) {
		this.speediscoverycustodianaccess = speediscoverycustodianaccess;
	}

	public synchronized final String getSpeworkdaysitecode() {
		return speworkdaysitecode;
	}

	public synchronized final void setSpeworkdaysitecode(String speworkdaysitecode) {
		this.speworkdaysitecode = speworkdaysitecode;
	}

	public synchronized final String getGenerationQualifier() {
		return generationQualifier;
	}

	public synchronized final void setGenerationQualifier(String generationQualifier) {
		this.generationQualifier = generationQualifier;
	}

	public synchronized final String getLobindicator() {
		return lobindicator;
	}

	public synchronized final void setLobindicator(String lobindicator) {
		this.lobindicator = lobindicator;
	}

	public synchronized final String getSpesubdivisionid() {
		return spesubdivisionid;
	}

	public synchronized final void setSpesubdivisionid(String spesubdivisionid) {
		this.spesubdivisionid = spesubdivisionid;
	}

	public synchronized final String getSpebusinessunitid() {
		return spebusinessunitid;
	}

	public synchronized final void setSpebusinessunitid(String spebusinessunitid) {
		this.spebusinessunitid = spebusinessunitid;
	}

	public synchronized final String getSpebusinessunitname() {
		return spebusinessunitname;
	}

	public synchronized final void setSpebusinessunitname(String spebusinessunitname) {
		this.spebusinessunitname = spebusinessunitname;
	}

	public synchronized final String getSpePGPPolicy() {
		return spePGPPolicy;
	}

	public synchronized final void setSpePGPPolicy(String spePGPPolicy) {
		this.spePGPPolicy = spePGPPolicy;
	}

	public synchronized final String getSpepwdplcexmtsts() {
		return spepwdplcexmtsts;
	}

	public synchronized final void setSpepwdplcexmtsts(String spepwdplcexmtsts) {
		this.spepwdplcexmtsts = spepwdplcexmtsts;
	}

	public synchronized final String getSpeasvaccess() {
		return speasvaccess;
	}

	public synchronized final void setSpeasvaccess(String speasvaccess) {
		this.speasvaccess = speasvaccess;
	}

	public synchronized final String getSpeintegrifyaccess() {
		return speintegrifyaccess;
	}

	public synchronized final void setSpeintegrifyaccess(String speintegrifyaccess) {
		this.speintegrifyaccess = speintegrifyaccess;
	}

	public synchronized final String getSPTResearchAdminAccess() {
		return SPTResearchAdminAccess;
	}

	public synchronized final void setSPTResearchAdminAccess(String sPTResearchAdminAccess) {
		SPTResearchAdminAccess = sPTResearchAdminAccess;
	}

	public synchronized final String getSpe2faPhone1Type() {
		return spe2faPhone1Type;
	}

	public synchronized final void setSpe2faPhone1Type(String spe2faPhone1Type) {
		this.spe2faPhone1Type = spe2faPhone1Type;
	}

	public synchronized final String getSpe2faPhone2Type() {
		return spe2faPhone2Type;
	}

	public synchronized final void setSpe2faPhone2Type(String spe2faPhone2Type) {
		this.spe2faPhone2Type = spe2faPhone2Type;
	}

	public synchronized final String getSpe2faPhone1() {
		return spe2faPhone1;
	}

	public synchronized final void setSpe2faPhone1(String spe2faPhone1) {
		this.spe2faPhone1 = spe2faPhone1;
	}

	public synchronized final String getSpe2faPhone1SMS() {
		return spe2faPhone1SMS;
	}

	public synchronized final void setSpe2faPhone1SMS(String spe2faPhone1SMS) {
		this.spe2faPhone1SMS = spe2faPhone1SMS;
	}

	public synchronized final String getSpe2faPhone1Email() {
		return spe2faPhone1Email;
	}

	public synchronized final void setSpe2faPhone1Email(String spe2faPhone1Email) {
		this.spe2faPhone1Email = spe2faPhone1Email;
	}

	public synchronized final String getSpe2faPhone2() {
		return spe2faPhone2;
	}

	public synchronized final void setSpe2faPhone2(String spe2faPhone2) {
		this.spe2faPhone2 = spe2faPhone2;
	}

	public synchronized final String getSpe2faPhone2SMS() {
		return spe2faPhone2SMS;
	}

	public synchronized final void setSpe2faPhone2SMS(String spe2faPhone2SMS) {
		this.spe2faPhone2SMS = spe2faPhone2SMS;
	}

	public synchronized final String getSpe2faPhone2Email() {
		return spe2faPhone2Email;
	}

	public synchronized final void setSpe2faPhone2Email(String spe2faPhone2Email) {
		this.spe2faPhone2Email = spe2faPhone2Email;
	}

	public synchronized final String getSpe2faPhone3() {
		return spe2faPhone3;
	}

	public synchronized final void setSpe2faPhone3(String spe2faPhone3) {
		this.spe2faPhone3 = spe2faPhone3;
	}

	public synchronized final String getSpe2faPhone3SMS() {
		return spe2faPhone3SMS;
	}

	public synchronized final void setSpe2faPhone3SMS(String spe2faPhone3SMS) {
		this.spe2faPhone3SMS = spe2faPhone3SMS;
	}

	public synchronized final String getSpe2faPhone3Email() {
		return spe2faPhone3Email;
	}

	public synchronized final void setSpe2faPhone3Email(String spe2faPhone3Email) {
		this.spe2faPhone3Email = spe2faPhone3Email;
	}

	public synchronized final String getSpespticomaccess() {
		return spespticomaccess;
	}

	public synchronized final void setSpespticomaccess(String spespticomaccess) {
		this.spespticomaccess = spespticomaccess;
	}

	public synchronized final String getSpenetgainaccess() {
		return spenetgainaccess;
	}

	public synchronized final void setSpenetgainaccess(String spenetgainaccess) {
		this.spenetgainaccess = spenetgainaccess;
	}

	public synchronized final String getSpeevmiaccess() {
		return speevmiaccess;
	}

	public synchronized final void setSpeevmiaccess(String speevmiaccess) {
		this.speevmiaccess = speevmiaccess;
	}

	public synchronized final String getSpedealpointaccess() {
		return spedealpointaccess;
	}

	public synchronized final void setSpedealpointaccess(String spedealpointaccess) {
		this.spedealpointaccess = spedealpointaccess;
	}

	public synchronized final String getSpecreativenetworksaccess() {
		return specreativenetworksaccess;
	}

	public synchronized final void setSpecreativenetworksaccess(String specreativenetworksaccess) {
		this.specreativenetworksaccess = specreativenetworksaccess;
	}

	public synchronized final String getSpe2faeagl() {
		return spe2faeagl;
	}

	public synchronized final void setSpe2faeagl(String spe2faeagl) {
		this.spe2faeagl = spe2faeagl;
	}

	public synchronized final String getSpeScryAccess() {
		return speScryAccess;
	}

	public synchronized final void setSpeScryAccess(String speScryAccess) {
		this.speScryAccess = speScryAccess;
	}

	public synchronized final String getSpeBusinessObjectsGroup() {
		return speBusinessObjectsGroup;
	}

	public synchronized final void setSpeBusinessObjectsGroup(String speBusinessObjectsGroup) {
		this.speBusinessObjectsGroup = speBusinessObjectsGroup;
	}

	public synchronized final String getSpeBusinessObjectsAccess() {
		return speBusinessObjectsAccess;
	}

	public synchronized final void setSpeBusinessObjectsAccess(String speBusinessObjectsAccess) {
		this.speBusinessObjectsAccess = speBusinessObjectsAccess;
	}

	public synchronized final String getSpePRISMAccess() {
		return spePRISMAccess;
	}

	public synchronized final void setSpePRISMAccess(String spePRISMAccess) {
		this.spePRISMAccess = spePRISMAccess;
	}

	public synchronized final String getSpeexecutivedirectoryadmin() {
		return speexecutivedirectoryadmin;
	}

	public synchronized final void setSpeexecutivedirectoryadmin(String speexecutivedirectoryadmin) {
		this.speexecutivedirectoryadmin = speexecutivedirectoryadmin;
	}

	public synchronized final String getSpeexecutivedirectoryuser() {
		return speexecutivedirectoryuser;
	}

	public synchronized final void setSpeexecutivedirectoryuser(String speexecutivedirectoryuser) {
		this.speexecutivedirectoryuser = speexecutivedirectoryuser;
	}

	public synchronized final String getSpeebrelaccess() {
		return speebrelaccess;
	}

	public synchronized final void setSpeebrelaccess(String speebrelaccess) {
		this.speebrelaccess = speebrelaccess;
	}

	public synchronized final String getSpedartsroles() {
		return spedartsroles;
	}

	public synchronized final void setSpedartsroles(String spedartsroles) {
		this.spedartsroles = spedartsroles;
	}

	public synchronized final String getMyspeaccess() {
		return myspeaccess;
	}

	public synchronized final void setMyspeaccess(String myspeaccess) {
		this.myspeaccess = myspeaccess;
	}

	public synchronized final String getMyspedepts() {
		return myspedepts;
	}

	public synchronized final void setMyspedepts(String myspedepts) {
		this.myspedepts = myspedepts;
	}

	public synchronized final String getMyspeemail() {
		return myspeemail;
	}

	public synchronized final void setMyspeemail(String myspeemail) {
		this.myspeemail = myspeemail;
	}

	public synchronized final String getMysperole() {
		return mysperole;
	}

	public synchronized final void setMysperole(String mysperole) {
		this.mysperole = mysperole;
	}

	public synchronized final String getIsMemberOf() {
		return isMemberOf;
	}

	public synchronized final void setIsMemberOf(String isMemberOf) {
		this.isMemberOf = isMemberOf;
	}

	public synchronized final String getMyspeworkspace() {
		return myspeworkspace;
	}

	public synchronized final void setMyspeworkspace(String myspeworkspace) {
		this.myspeworkspace = myspeworkspace;
	}

	public synchronized final String getMyspeworkspacedepts() {
		return myspeworkspacedepts;
	}

	public synchronized final void setMyspeworkspacedepts(String myspeworkspacedepts) {
		this.myspeworkspacedepts = myspeworkspacedepts;
	}

	public synchronized final String getMysphedepts() {
		return mysphedepts;
	}

	public synchronized final void setMysphedepts(String mysphedepts) {
		this.mysphedepts = mysphedepts;
	}

	public synchronized final String getMyspherole() {
		return myspherole;
	}

	public synchronized final void setMyspherole(String myspherole) {
		this.myspherole = myspherole;
	}

	public synchronized final String getMysptiregions() {
		return mysptiregions;
	}

	public synchronized final void setMysptiregions(String mysptiregions) {
		this.mysptiregions = mysptiregions;
	}

	public synchronized final String getSonyGHD() {
		return sonyGHD;
	}

	public synchronized final void setSonyGHD(String sonyGHD) {
		this.sonyGHD = sonyGHD;
	}

	public synchronized final String getSonyRemoteUserBusinessUnitType() {
		return SonyRemoteUserBusinessUnitType;
	}

	public synchronized final void setSonyRemoteUserBusinessUnitType(
			String sonyRemoteUserBusinessUnitType) {
		SonyRemoteUserBusinessUnitType = sonyRemoteUserBusinessUnitType;
	}

	public synchronized final String getSpeaccutracaccess() {
		return speaccutracaccess;
	}

	public synchronized final void setSpeaccutracaccess(String speaccutracaccess) {
		this.speaccutracaccess = speaccutracaccess;
	}

	public synchronized final String getSpeacshome() {
		return speacshome;
	}

	public synchronized final void setSpeacshome(String speacshome) {
		this.speacshome = speacshome;
	}

	public synchronized final String getSpeacsproductiona() {
		return speacsproductiona;
	}

	public synchronized final void setSpeacsproductiona(String speacsproductiona) {
		this.speacsproductiona = speacsproductiona;
	}

	public synchronized final String getSpeacsproductionavpnremote() {
		return speacsproductionavpnremote;
	}

	public synchronized final void setSpeacsproductionavpnremote(String speacsproductionavpnremote) {
		this.speacsproductionavpnremote = speacsproductionavpnremote;
	}

	public synchronized final String getSpeacsproductionawired() {
		return speacsproductionawired;
	}

	public synchronized final void setSpeacsproductionawired(String speacsproductionawired) {
		this.speacsproductionawired = speacsproductionawired;
	}

	public synchronized final String getSpeacsproductionawireless() {
		return speacsproductionawireless;
	}

	public synchronized final void setSpeacsproductionawireless(String speacsproductionawireless) {
		this.speacsproductionawireless = speacsproductionawireless;
	}

	public synchronized final String getSpeacsproductionb() {
		return speacsproductionb;
	}

	public synchronized final void setSpeacsproductionb(String speacsproductionb) {
		this.speacsproductionb = speacsproductionb;
	}

	public synchronized final String getSpeacsproductionbvpnremote() {
		return speacsproductionbvpnremote;
	}

	public synchronized final void setSpeacsproductionbvpnremote(String speacsproductionbvpnremote) {
		this.speacsproductionbvpnremote = speacsproductionbvpnremote;
	}

	public synchronized final String getSpeacsproductionbwired() {
		return speacsproductionbwired;
	}

	public synchronized final void setSpeacsproductionbwired(String speacsproductionbwired) {
		this.speacsproductionbwired = speacsproductionbwired;
	}

	public synchronized final String getSpeacsproductionbwireless() {
		return speacsproductionbwireless;
	}

	public synchronized final void setSpeacsproductionbwireless(String speacsproductionbwireless) {
		this.speacsproductionbwireless = speacsproductionbwireless;
	}

	public synchronized final String getSpeacsproductionc() {
		return speacsproductionc;
	}

	public synchronized final void setSpeacsproductionc(String speacsproductionc) {
		this.speacsproductionc = speacsproductionc;
	}

	public synchronized final String getSpeacsproductioncvpnremote() {
		return speacsproductioncvpnremote;
	}

	public synchronized final void setSpeacsproductioncvpnremote(String speacsproductioncvpnremote) {
		this.speacsproductioncvpnremote = speacsproductioncvpnremote;
	}

	public synchronized final String getSpeacsproductioncwired() {
		return speacsproductioncwired;
	}

	public synchronized final void setSpeacsproductioncwired(String speacsproductioncwired) {
		this.speacsproductioncwired = speacsproductioncwired;
	}

	public synchronized final String getSpeacsproductioncwireless() {
		return speacsproductioncwireless;
	}

	public synchronized final void setSpeacsproductioncwireless(String speacsproductioncwireless) {
		this.speacsproductioncwireless = speacsproductioncwireless;
	}

	public synchronized final String getSpeacsproductiond() {
		return speacsproductiond;
	}

	public synchronized final void setSpeacsproductiond(String speacsproductiond) {
		this.speacsproductiond = speacsproductiond;
	}

	public synchronized final String getSpeacsproductiondvpnremote() {
		return speacsproductiondvpnremote;
	}

	public synchronized final void setSpeacsproductiondvpnremote(String speacsproductiondvpnremote) {
		this.speacsproductiondvpnremote = speacsproductiondvpnremote;
	}

	public synchronized final String getSpeacsproductiondwired() {
		return speacsproductiondwired;
	}

	public synchronized final void setSpeacsproductiondwired(String speacsproductiondwired) {
		this.speacsproductiondwired = speacsproductiondwired;
	}

	public synchronized final String getSpeacsproductiondwireless() {
		return speacsproductiondwireless;
	}

	public synchronized final void setSpeacsproductiondwireless(String speacsproductiondwireless) {
		this.speacsproductiondwireless = speacsproductiondwireless;
	}

	public synchronized final String getSpeacsproductione() {
		return speacsproductione;
	}

	public synchronized final void setSpeacsproductione(String speacsproductione) {
		this.speacsproductione = speacsproductione;
	}

	public synchronized final String getSpeacsproductionevpnremote() {
		return speacsproductionevpnremote;
	}

	public synchronized final void setSpeacsproductionevpnremote(String speacsproductionevpnremote) {
		this.speacsproductionevpnremote = speacsproductionevpnremote;
	}

	public synchronized final String getSpeacsproductionewired() {
		return speacsproductionewired;
	}

	public synchronized final void setSpeacsproductionewired(String speacsproductionewired) {
		this.speacsproductionewired = speacsproductionewired;
	}

	public synchronized final String getSpeacsproductionewireless() {
		return speacsproductionewireless;
	}

	public synchronized final void setSpeacsproductionewireless(String speacsproductionewireless) {
		this.speacsproductionewireless = speacsproductionewireless;
	}

	public synchronized final String getSpeacsproductionf() {
		return speacsproductionf;
	}

	public synchronized final void setSpeacsproductionf(String speacsproductionf) {
		this.speacsproductionf = speacsproductionf;
	}

	public synchronized final String getSpeacsproductionfvpnremote() {
		return speacsproductionfvpnremote;
	}

	public synchronized final void setSpeacsproductionfvpnremote(String speacsproductionfvpnremote) {
		this.speacsproductionfvpnremote = speacsproductionfvpnremote;
	}

	public synchronized final String getSpeacsproductionfwired() {
		return speacsproductionfwired;
	}

	public synchronized final void setSpeacsproductionfwired(String speacsproductionfwired) {
		this.speacsproductionfwired = speacsproductionfwired;
	}

	public synchronized final String getSpeacsproductionfwireless() {
		return speacsproductionfwireless;
	}

	public synchronized final void setSpeacsproductionfwireless(String speacsproductionfwireless) {
		this.speacsproductionfwireless = speacsproductionfwireless;
	}

	public synchronized final String getSpeacsproductiong() {
		return speacsproductiong;
	}

	public synchronized final void setSpeacsproductiong(String speacsproductiong) {
		this.speacsproductiong = speacsproductiong;
	}

	public synchronized final String getSpeacsproductiongvpnremote() {
		return speacsproductiongvpnremote;
	}

	public synchronized final void setSpeacsproductiongvpnremote(String speacsproductiongvpnremote) {
		this.speacsproductiongvpnremote = speacsproductiongvpnremote;
	}

	public synchronized final String getSpeacsproductiongwired() {
		return speacsproductiongwired;
	}

	public synchronized final void setSpeacsproductiongwired(String speacsproductiongwired) {
		this.speacsproductiongwired = speacsproductiongwired;
	}

	public synchronized final String getSpeacsproductiongwireless() {
		return speacsproductiongwireless;
	}

	public synchronized final void setSpeacsproductiongwireless(String speacsproductiongwireless) {
		this.speacsproductiongwireless = speacsproductiongwireless;
	}

	public synchronized final String getSpeacsproductionh() {
		return speacsproductionh;
	}

	public synchronized final void setSpeacsproductionh(String speacsproductionh) {
		this.speacsproductionh = speacsproductionh;
	}

	public synchronized final String getSpeacsproductionhvpnremote() {
		return speacsproductionhvpnremote;
	}

	public synchronized final void setSpeacsproductionhvpnremote(String speacsproductionhvpnremote) {
		this.speacsproductionhvpnremote = speacsproductionhvpnremote;
	}

	public synchronized final String getSpeacsproductionhwired() {
		return speacsproductionhwired;
	}

	public synchronized final void setSpeacsproductionhwired(String speacsproductionhwired) {
		this.speacsproductionhwired = speacsproductionhwired;
	}

	public synchronized final String getSpeacsproductionhwireless() {
		return speacsproductionhwireless;
	}

	public synchronized final void setSpeacsproductionhwireless(String speacsproductionhwireless) {
		this.speacsproductionhwireless = speacsproductionhwireless;
	}

	public synchronized final String getSpeacsproductioni() {
		return speacsproductioni;
	}

	public synchronized final void setSpeacsproductioni(String speacsproductioni) {
		this.speacsproductioni = speacsproductioni;
	}

	public synchronized final String getSpeacsproductionivpnremote() {
		return speacsproductionivpnremote;
	}

	public synchronized final void setSpeacsproductionivpnremote(String speacsproductionivpnremote) {
		this.speacsproductionivpnremote = speacsproductionivpnremote;
	}

	public synchronized final String getSpeacsproductioniwired() {
		return speacsproductioniwired;
	}

	public synchronized final void setSpeacsproductioniwired(String speacsproductioniwired) {
		this.speacsproductioniwired = speacsproductioniwired;
	}

	public synchronized final String getSpeacsproductioniwireless() {
		return speacsproductioniwireless;
	}

	public synchronized final void setSpeacsproductioniwireless(String speacsproductioniwireless) {
		this.speacsproductioniwireless = speacsproductioniwireless;
	}

	public synchronized final String getSpeacsproductionj() {
		return speacsproductionj;
	}

	public synchronized final void setSpeacsproductionj(String speacsproductionj) {
		this.speacsproductionj = speacsproductionj;
	}

	public synchronized final String getSpeacsproductionjvpnremote() {
		return speacsproductionjvpnremote;
	}

	public synchronized final void setSpeacsproductionjvpnremote(String speacsproductionjvpnremote) {
		this.speacsproductionjvpnremote = speacsproductionjvpnremote;
	}

	public synchronized final String getSpeacsproductionjwired() {
		return speacsproductionjwired;
	}

	public synchronized final void setSpeacsproductionjwired(String speacsproductionjwired) {
		this.speacsproductionjwired = speacsproductionjwired;
	}

	public synchronized final String getSpeacsproductionjwireless() {
		return speacsproductionjwireless;
	}

	public synchronized final void setSpeacsproductionjwireless(String speacsproductionjwireless) {
		this.speacsproductionjwireless = speacsproductionjwireless;
	}

	public synchronized final String getSpeacsproductionk() {
		return speacsproductionk;
	}

	public synchronized final void setSpeacsproductionk(String speacsproductionk) {
		this.speacsproductionk = speacsproductionk;
	}

	public synchronized final String getSpeacsproductionkvpnremote() {
		return speacsproductionkvpnremote;
	}

	public synchronized final void setSpeacsproductionkvpnremote(String speacsproductionkvpnremote) {
		this.speacsproductionkvpnremote = speacsproductionkvpnremote;
	}

	public synchronized final String getSpeacsproductionkwired() {
		return speacsproductionkwired;
	}

	public synchronized final void setSpeacsproductionkwired(String speacsproductionkwired) {
		this.speacsproductionkwired = speacsproductionkwired;
	}

	public synchronized final String getSpeacsproductionkwireless() {
		return speacsproductionkwireless;
	}

	public synchronized final void setSpeacsproductionkwireless(String speacsproductionkwireless) {
		this.speacsproductionkwireless = speacsproductionkwireless;
	}

	public synchronized final String getSpeacsproductionl() {
		return speacsproductionl;
	}

	public synchronized final void setSpeacsproductionl(String speacsproductionl) {
		this.speacsproductionl = speacsproductionl;
	}

	public synchronized final String getSpeacsproductionlvpnremote() {
		return speacsproductionlvpnremote;
	}

	public synchronized final void setSpeacsproductionlvpnremote(String speacsproductionlvpnremote) {
		this.speacsproductionlvpnremote = speacsproductionlvpnremote;
	}

	public synchronized final String getSpeacsproductionlwired() {
		return speacsproductionlwired;
	}

	public synchronized final void setSpeacsproductionlwired(String speacsproductionlwired) {
		this.speacsproductionlwired = speacsproductionlwired;
	}

	public synchronized final String getSpeacsproductionlwireless() {
		return speacsproductionlwireless;
	}

	public synchronized final void setSpeacsproductionlwireless(String speacsproductionlwireless) {
		this.speacsproductionlwireless = speacsproductionlwireless;
	}

	public synchronized final String getSpeacsproductionm() {
		return speacsproductionm;
	}

	public synchronized final void setSpeacsproductionm(String speacsproductionm) {
		this.speacsproductionm = speacsproductionm;
	}

	public synchronized final String getSpeacsproductionmvpnremote() {
		return speacsproductionmvpnremote;
	}

	public synchronized final void setSpeacsproductionmvpnremote(String speacsproductionmvpnremote) {
		this.speacsproductionmvpnremote = speacsproductionmvpnremote;
	}

	public synchronized final String getSpeacsproductionmwired() {
		return speacsproductionmwired;
	}

	public synchronized final void setSpeacsproductionmwired(String speacsproductionmwired) {
		this.speacsproductionmwired = speacsproductionmwired;
	}

	public synchronized final String getSpeacsproductionmwireless() {
		return speacsproductionmwireless;
	}

	public synchronized final void setSpeacsproductionmwireless(String speacsproductionmwireless) {
		this.speacsproductionmwireless = speacsproductionmwireless;
	}

	public synchronized final String getSpeacsproductionn() {
		return speacsproductionn;
	}

	public synchronized final void setSpeacsproductionn(String speacsproductionn) {
		this.speacsproductionn = speacsproductionn;
	}

	public synchronized final String getSpeacsproductionnvpnremote() {
		return speacsproductionnvpnremote;
	}

	public synchronized final void setSpeacsproductionnvpnremote(String speacsproductionnvpnremote) {
		this.speacsproductionnvpnremote = speacsproductionnvpnremote;
	}

	public synchronized final String getSpeacsproductionnwired() {
		return speacsproductionnwired;
	}

	public synchronized final void setSpeacsproductionnwired(String speacsproductionnwired) {
		this.speacsproductionnwired = speacsproductionnwired;
	}

	public synchronized final String getSpeacsproductionnwireless() {
		return speacsproductionnwireless;
	}

	public synchronized final void setSpeacsproductionnwireless(String speacsproductionnwireless) {
		this.speacsproductionnwireless = speacsproductionnwireless;
	}

	public synchronized final String getSpealfrescoaccess() {
		return spealfrescoaccess;
	}

	public synchronized final void setSpealfrescoaccess(String spealfrescoaccess) {
		this.spealfrescoaccess = spealfrescoaccess;
	}

	public synchronized final String getSpealfrescobcaccess() {
		return spealfrescobcaccess;
	}

	public synchronized final void setSpealfrescobcaccess(String spealfrescobcaccess) {
		this.spealfrescobcaccess = spealfrescobcaccess;
	}

	public synchronized final String getSpeAppsPermitted() {
		return speAppsPermitted;
	}

	public synchronized final void setSpeAppsPermitted(String speAppsPermitted) {
		this.speAppsPermitted = speAppsPermitted;
	}

	public synchronized final String getSpeb2baccess() {
		return speb2baccess;
	}

	public synchronized final void setSpeb2baccess(String speb2baccess) {
		this.speb2baccess = speb2baccess;
	}

	public synchronized final String getSpebuildingid() {
		return spebuildingid;
	}

	public synchronized final void setSpebuildingid(String spebuildingid) {
		this.spebuildingid = spebuildingid;
	}

	public synchronized final String getSpebusinessunit() {
		return spebusinessunit;
	}

	public synchronized final void setSpebusinessunit(String spebusinessunit) {
		this.spebusinessunit = spebusinessunit;
	}

	public synchronized final String getSpecardinusaccess() {
		return specardinusaccess;
	}

	public synchronized final void setSpecardinusaccess(String specardinusaccess) {
		this.specardinusaccess = specardinusaccess;
	}

	public synchronized final String getSpecitrixaccess() {
		return specitrixaccess;
	}

	public synchronized final void setSpecitrixaccess(String specitrixaccess) {
		this.specitrixaccess = specitrixaccess;
	}

	public synchronized final String getSpecompanyid() {
		return specompanyid;
	}

	public synchronized final void setSpecompanyid(String specompanyid) {
		this.specompanyid = specompanyid;
	}

	public synchronized final String getSpecostcenter() {
		return specostcenter;
	}

	public synchronized final void setSpecostcenter(String specostcenter) {
		this.specostcenter = specostcenter;
	}

	public synchronized final String getSpecountry() {
		return specountry;
	}

	public synchronized final void setSpecountry(String specountry) {
		this.specountry = specountry;
	}

	public synchronized final String getSpedealtrackeraccess() {
		return spedealtrackeraccess;
	}

	public synchronized final void setSpedealtrackeraccess(String spedealtrackeraccess) {
		this.spedealtrackeraccess = spedealtrackeraccess;
	}

	public synchronized final String getSpedepartmentid() {
		return spedepartmentid;
	}

	public synchronized final void setSpedepartmentid(String spedepartmentid) {
		this.spedepartmentid = spedepartmentid;
	}

	public synchronized final String getSpedepartmentname() {
		return spedepartmentname;
	}

	public synchronized final void setSpedepartmentname(String spedepartmentname) {
		this.spedepartmentname = spedepartmentname;
	}

	public synchronized final String getSpeDisplayFaxNumber() {
		return speDisplayFaxNumber;
	}

	public synchronized final void setSpeDisplayFaxNumber(String speDisplayFaxNumber) {
		this.speDisplayFaxNumber = speDisplayFaxNumber;
	}

	public synchronized final String getSpeDisplaygivenName() {
		return speDisplaygivenName;
	}

	public synchronized final void setSpeDisplaygivenName(String speDisplaygivenName) {
		this.speDisplaygivenName = speDisplaygivenName;
	}

	public synchronized final String getSpeDisplaySurname() {
		return speDisplaySurname;
	}

	public synchronized final void setSpeDisplaySurname(String speDisplaySurname) {
		this.speDisplaySurname = speDisplaySurname;
	}

	public synchronized final String getSpeDisplayTelephoneNumber() {
		return speDisplayTelephoneNumber;
	}

	public synchronized final void setSpeDisplayTelephoneNumber(String speDisplayTelephoneNumber) {
		this.speDisplayTelephoneNumber = speDisplayTelephoneNumber;
	}

	public synchronized final String getSpedivision() {
		return spedivision;
	}

	public synchronized final void setSpedivision(String spedivision) {
		this.spedivision = spedivision;
	}

	public synchronized final String getSpedivisionid() {
		return spedivisionid;
	}

	public synchronized final void setSpedivisionid(String spedivisionid) {
		this.spedivisionid = spedivisionid;
	}

	public synchronized final String getSpedivisionname() {
		return spedivisionname;
	}

	public synchronized final void setSpedivisionname(String spedivisionname) {
		this.spedivisionname = spedivisionname;
	}

	public synchronized final String getSpedominodn() {
		return spedominodn;
	}

	public synchronized final void setSpedominodn(String spedominodn) {
		this.spedominodn = spedominodn;
	}

	public synchronized final String getSpedominomaildb() {
		return spedominomaildb;
	}

	public synchronized final void setSpedominomaildb(String spedominomaildb) {
		this.spedominomaildb = spedominomaildb;
	}

	public synchronized final String getSpedroolsaccess() {
		return spedroolsaccess;
	}

	public synchronized final void setSpedroolsaccess(String spedroolsaccess) {
		this.spedroolsaccess = spedroolsaccess;
	}

	public synchronized final String getSpedrozaccess() {
		return spedrozaccess;
	}

	public synchronized final void setSpedrozaccess(String spedrozaccess) {
		this.spedrozaccess = spedrozaccess;
	}

	public synchronized final String getSpeEmpBadgeID() {
		return speEmpBadgeID;
	}

	public synchronized final void setSpeEmpBadgeID(String speEmpBadgeID) {
		this.speEmpBadgeID = speEmpBadgeID;
	}

	public synchronized final String getSpeEmpBirthDate() {
		return speEmpBirthDate;
	}

	public synchronized final void setSpeEmpBirthDate(String speEmpBirthDate) {
		this.speEmpBirthDate = speEmpBirthDate;
	}

	public synchronized final String getSpeEmpDataSource() {
		return speEmpDataSource;
	}

	public synchronized final void setSpeEmpDataSource(String speEmpDataSource) {
		this.speEmpDataSource = speEmpDataSource;
	}

	public synchronized final String getSpeEmpFloor() {
		return speEmpFloor;
	}

	public synchronized final void setSpeEmpFloor(String speEmpFloor) {
		this.speEmpFloor = speEmpFloor;
	}

	public synchronized final String getSpeEmpFrmCtr() {
		return speEmpFrmCtr;
	}

	public synchronized final void setSpeEmpFrmCtr(String speEmpFrmCtr) {
		this.speEmpFrmCtr = speEmpFrmCtr;
	}

	public synchronized final String getSpeEmpHireDate() {
		return speEmpHireDate;
	}

	public synchronized final void setSpeEmpHireDate(String speEmpHireDate) {
		this.speEmpHireDate = speEmpHireDate;
	}

	public synchronized final String getSpeEmpID() {
		return speEmpID;
	}

	public synchronized final void setSpeEmpID(String speEmpID) {
		this.speEmpID = speEmpID;
	}

	public synchronized final String getSpeEmpPwdChg() {
		return speEmpPwdChg;
	}

	public synchronized final void setSpeEmpPwdChg(String speEmpPwdChg) {
		this.speEmpPwdChg = speEmpPwdChg;
	}

	public synchronized final String getSpeEmpSrvyComp() {
		return speEmpSrvyComp;
	}

	public synchronized final void setSpeEmpSrvyComp(String speEmpSrvyComp) {
		this.speEmpSrvyComp = speEmpSrvyComp;
	}

	public synchronized final String getSpeEmpTermDate() {
		return speEmpTermDate;
	}

	public synchronized final void setSpeEmpTermDate(String speEmpTermDate) {
		this.speEmpTermDate = speEmpTermDate;
	}

	public synchronized final String getSpeEmpWorkState() {
		return speEmpWorkState;
	}

	public synchronized final void setSpeEmpWorkState(String speEmpWorkState) {
		this.speEmpWorkState = speEmpWorkState;
	}

	public synchronized final String getSpeGlobalID() {
		return speGlobalID;
	}

	public synchronized final void setSpeGlobalID(String speGlobalID) {
		this.speGlobalID = speGlobalID;
	}

	public synchronized final String getSpeIDMAccountLocked() {
		return speIDMAccountLocked;
	}

	public synchronized final void setSpeIDMAccountLocked(String speIDMAccountLocked) {
		this.speIDMAccountLocked = speIDMAccountLocked;
	}

	public synchronized final String getSpeIDMRegion() {
		return speIDMRegion;
	}

	public synchronized final void setSpeIDMRegion(String speIDMRegion) {
		this.speIDMRegion = speIDMRegion;
	}

	public synchronized final String getSpeIDMTerritory() {
		return speIDMTerritory;
	}

	public synchronized final void setSpeIDMTerritory(String speIDMTerritory) {
		this.speIDMTerritory = speIDMTerritory;
	}

	public synchronized final String getSpeidmusertype() {
		return speidmusertype;
	}

	public synchronized final void setSpeidmusertype(String speidmusertype) {
		this.speidmusertype = speidmusertype;
	}

	public synchronized final String getSpeiptvpackages() {
		return speiptvpackages;
	}

	public synchronized final void setSpeiptvpackages(String speiptvpackages) {
		this.speiptvpackages = speiptvpackages;
	}

	public synchronized final String getSpeJoggerA1() {
		return speJoggerA1;
	}

	public synchronized final void setSpeJoggerA1(String speJoggerA1) {
		this.speJoggerA1 = speJoggerA1;
	}

	public synchronized final String getSpeJoggerA2() {
		return speJoggerA2;
	}

	public synchronized final void setSpeJoggerA2(String speJoggerA2) {
		this.speJoggerA2 = speJoggerA2;
	}

	public synchronized final String getSpeJoggerQ1() {
		return speJoggerQ1;
	}

	public synchronized final void setSpeJoggerQ1(String speJoggerQ1) {
		this.speJoggerQ1 = speJoggerQ1;
	}

	public synchronized final String getSpeJoggerQ2() {
		return speJoggerQ2;
	}

	public synchronized final void setSpeJoggerQ2(String speJoggerQ2) {
		this.speJoggerQ2 = speJoggerQ2;
	}

	public synchronized final String getSpeMgrID() {
		return speMgrID;
	}

	public synchronized final void setSpeMgrID(String speMgrID) {
		this.speMgrID = speMgrID;
	}

	public synchronized final String getSpeMobile() {
		return speMobile;
	}

	public synchronized final void setSpeMobile(String speMobile) {
		this.speMobile = speMobile;
	}

	public synchronized final String getSpeNativeEmail() {
		return speNativeEmail;
	}

	public synchronized final void setSpeNativeEmail(String speNativeEmail) {
		this.speNativeEmail = speNativeEmail;
	}

	public synchronized final String getSpeNativeEmailServer() {
		return speNativeEmailServer;
	}

	public synchronized final void setSpeNativeEmailServer(String speNativeEmailServer) {
		this.speNativeEmailServer = speNativeEmailServer;
	}

	public synchronized final String getSpeNativeNotesShortName() {
		return speNativeNotesShortName;
	}

	public synchronized final void setSpeNativeNotesShortName(String speNativeNotesShortName) {
		this.speNativeNotesShortName = speNativeNotesShortName;
	}

	public synchronized final String getSpenikuid() {
		return spenikuid;
	}

	public synchronized final void setSpenikuid(String spenikuid) {
		this.spenikuid = spenikuid;
	}

	public synchronized final String getSpenotesshortname() {
		return spenotesshortname;
	}

	public synchronized final void setSpenotesshortname(String spenotesshortname) {
		this.spenotesshortname = spenotesshortname;
	}

	public synchronized final String getSpenovatusaccess() {
		return spenovatusaccess;
	}

	public synchronized final void setSpenovatusaccess(String spenovatusaccess) {
		this.spenovatusaccess = spenovatusaccess;
	}

	public synchronized final String getSpeOfficeLocation2() {
		return speOfficeLocation2;
	}

	public synchronized final void setSpeOfficeLocation2(String speOfficeLocation2) {
		this.speOfficeLocation2 = speOfficeLocation2;
	}

	public synchronized final String getSpeOfficeLocation3() {
		return speOfficeLocation3;
	}

	public synchronized final void setSpeOfficeLocation3(String speOfficeLocation3) {
		this.speOfficeLocation3 = speOfficeLocation3;
	}

	public synchronized final String getSpeoversightaccess() {
		return speoversightaccess;
	}

	public synchronized final void setSpeoversightaccess(String speoversightaccess) {
		this.speoversightaccess = speoversightaccess;
	}

	public synchronized final String getSpePasswordFlag() {
		return spePasswordFlag;
	}

	public synchronized final void setSpePasswordFlag(String spePasswordFlag) {
		this.spePasswordFlag = spePasswordFlag;
	}

	public synchronized final String getSpepeoplefluentaccess() {
		return spepeoplefluentaccess;
	}

	public synchronized final void setSpepeoplefluentaccess(String spepeoplefluentaccess) {
		this.spepeoplefluentaccess = spepeoplefluentaccess;
	}

	public synchronized final String getSpePGPRegion() {
		return spePGPRegion;
	}

	public synchronized final void setSpePGPRegion(String spePGPRegion) {
		this.spePGPRegion = spePGPRegion;
	}

	public synchronized final String getSpePhone() {
		return spePhone;
	}

	public synchronized final void setSpePhone(String spePhone) {
		this.spePhone = spePhone;
	}

	public synchronized final String getSpepinnumber() {
		return spepinnumber;
	}

	public synchronized final void setSpepinnumber(String spepinnumber) {
		this.spepinnumber = spepinnumber;
	}

	public synchronized final String getSpeprodsafetyaccess() {
		return speprodsafetyaccess;
	}

	public synchronized final void setSpeprodsafetyaccess(String speprodsafetyaccess) {
		this.speprodsafetyaccess = speprodsafetyaccess;
	}

	public synchronized final String getSpeproductionbackboneaccess() {
		return speproductionbackboneaccess;
	}

	public synchronized final void setSpeproductionbackboneaccess(String speproductionbackboneaccess) {
		this.speproductionbackboneaccess = speproductionbackboneaccess;
	}

	public synchronized final String getSpepsid() {
		return spepsid;
	}

	public synchronized final void setSpepsid(String spepsid) {
		this.spepsid = spepsid;
	}

	public synchronized final String getSpepssaccess() {
		return spepssaccess;
	}

	public synchronized final void setSpepssaccess(String spepssaccess) {
		this.spepssaccess = spepssaccess;
	}

	public synchronized final String getSpepwdexprydt() {
		return spepwdexprydt;
	}

	public synchronized final void setSpepwdexprydt(String spepwdexprydt) {
		this.spepwdexprydt = spepwdexprydt;
	}

	public synchronized final String getSpepwdplcexmtstatus() {
		return spepwdplcexmtstatus;
	}

	public synchronized final void setSpepwdplcexmtstatus(String spepwdplcexmtstatus) {
		this.spepwdplcexmtstatus = spepwdplcexmtstatus;
	}

	public synchronized final String getSpeqcaccess() {
		return speqcaccess;
	}

	public synchronized final void setSpeqcaccess(String speqcaccess) {
		this.speqcaccess = speqcaccess;
	}

	public synchronized final String getSpeRoomNumber3() {
		return speRoomNumber3;
	}

	public synchronized final void setSpeRoomNumber3(String speRoomNumber3) {
		this.speRoomNumber3 = speRoomNumber3;
	}

	public synchronized final String getSPERPMAccess() {
		return SPERPMAccess;
	}

	public synchronized final void setSPERPMAccess(String sPERPMAccess) {
		SPERPMAccess = sPERPMAccess;
	}

	public synchronized final String getSpesabaaccess() {
		return spesabaaccess;
	}

	public synchronized final void setSpesabaaccess(String spesabaaccess) {
		this.spesabaaccess = spesabaaccess;
	}

	public synchronized final String getSpesalesbankaccess() {
		return spesalesbankaccess;
	}

	public synchronized final void setSpesalesbankaccess(String spesalesbankaccess) {
		this.spesalesbankaccess = spesalesbankaccess;
	}

	public synchronized final String getSpeSecondaryPhone() {
		return speSecondaryPhone;
	}

	public synchronized final void setSpeSecondaryPhone(String speSecondaryPhone) {
		this.speSecondaryPhone = speSecondaryPhone;
	}

	public synchronized final String getSpespeedid() {
		return spespeedid;
	}

	public synchronized final void setSpespeedid(String spespeedid) {
		this.spespeedid = spespeedid;
	}

	public synchronized final String getSpestoreroomaccess() {
		return spestoreroomaccess;
	}

	public synchronized final void setSpestoreroomaccess(String spestoreroomaccess) {
		this.spestoreroomaccess = spestoreroomaccess;
	}

	public synchronized final String getSpesubdivisionname() {
		return spesubdivisionname;
	}

	public synchronized final void setSpesubdivisionname(String spesubdivisionname) {
		this.spesubdivisionname = spesubdivisionname;
	}

	public synchronized final String getSpeswiftaccess() {
		return speswiftaccess;
	}

	public synchronized final void setSpeswiftaccess(String speswiftaccess) {
		this.speswiftaccess = speswiftaccess;
	}

	public synchronized final String getSpetestapplicationaccess() {
		return spetestapplicationaccess;
	}

	public synchronized final void setSpetestapplicationaccess(String spetestapplicationaccess) {
		this.spetestapplicationaccess = spetestapplicationaccess;
	}

	public synchronized final String getSpeTrial() {
		return speTrial;
	}

	public synchronized final void setSpeTrial(String speTrial) {
		this.speTrial = speTrial;
	}

	public synchronized final String getSpetrintechaccess() {
		return spetrintechaccess;
	}

	public synchronized final void setSpetrintechaccess(String spetrintechaccess) {
		this.spetrintechaccess = spetrintechaccess;
	}

	public synchronized final String getSpeVipFlag() {
		return speVipFlag;
	}

	public synchronized final void setSpeVipFlag(String speVipFlag) {
		this.speVipFlag = speVipFlag;
	}

	public synchronized final String getSpeVPNGroup() {
		return speVPNGroup;
	}

	public synchronized final void setSpeVPNGroup(String speVPNGroup) {
		this.speVPNGroup = speVPNGroup;
	}

	public synchronized final String getSpewdempid() {
		return spewdempid;
	}

	public synchronized final void setSpewdempid(String spewdempid) {
		this.spewdempid = spewdempid;
	}

	public synchronized final String getSpeworktype() {
		return speworktype;
	}

	public synchronized final void setSpeworktype(String speworktype) {
		this.speworktype = speworktype;
	}

	public synchronized final String getVPNEnabled() {
		return VPNEnabled;
	}

	public synchronized final void setVPNEnabled(String vPNEnabled) {
		VPNEnabled = vPNEnabled;
	}
	
	public synchronized final String getSpeifdsaccess(){
		return speifdsaccess;
	}
	public synchronized final void setSpeifdsaccess(String speifdsaccess) {
		this.speifdsaccess = speifdsaccess;
		
	}
	
	public synchronized final String getSpeIFDSReportLanguage(){
		return speIFDSReportLanguage;
	}
	public synchronized final void setSpeIFDSReportLanguage(String speIFDSReportLanguage) {
		this.speIFDSReportLanguage = speIFDSReportLanguage;
		
	}
	public synchronized final String getSpeifdstemporaryuser(){
		return speifdstemporaryuser;
	}
	public synchronized final void setSpeifdstemporaryuser(String speifdstemporaryuser) {
		this.speifdstemporaryuser = speifdstemporaryuser;
		
	}
	public synchronized final String getSpeifdsuseraccessenddate(){
		return speifdsuseraccessenddate;
	}
	public synchronized final void setSpeifdsuseraccessenddate(String speifdsuseraccessenddate) {
		this.speifdsuseraccessenddate = speifdsuseraccessenddate;
		
	}
	
	public synchronized final String getSpeifdsusertitle(){
		return speifdsusertitle;
	}
	public synchronized final void setSpeifdsusertitle(String speifdsusertitle) {
		this.speifdsusertitle = speifdsusertitle;;
		
	}
	public synchronized final String getSpeOperatingCompany(){
		return speOperatingCompany;
	}
	public synchronized final void setSpeOperatingCompany(String speOperatingCompany) {
		this.speOperatingCompany = speOperatingCompany;
	}
	public synchronized final String getSpePhysicalLocale(){
			return spePhysicalLocale;
		}
	public synchronized final void setSpePhysicalLocale(String spePhysicalLocale) {
			this.spePhysicalLocale = spePhysicalLocale;
			
	}
	public synchronized final String getSpeTerritory(){
		return speTerritory;
	}
   public synchronized final void setSpeTerritory(String speTerritory) {
		this.speTerritory = speTerritory;
		}
   public synchronized final String getst(){
		return st;
	}
  public synchronized final void setst(String st) {
		this.st = st;
		}
  public synchronized final String getstreet(){
		return street;
	}
  public synchronized final void setstreet(String street) {
		this.street = street;
	}
  public synchronized final String gettitle(){
		return title;
	}
  public synchronized final void settitle(String title) {
		this.title = title;
	}
  public synchronized final String getSpefcmaccess(){
		return spefcmaccess;
	}
public synchronized final void setSpefcmaccess(String spefcmaccess) {
		this.spefcmaccess = spefcmaccess;
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("User [");
		if (uid != null)
		{
			builder.append("uid=");
			builder.append(uid);
			builder.append(", ");
		}
		if (cn != null)
		{
			builder.append("cn=");
			builder.append(cn);
			builder.append(", ");
		}
		if (sn != null)
		{
			builder.append("sn=");
			builder.append(sn);
			builder.append(", ");
		}
		if (userPassword != null)
		{
			builder.append("userPassword=");
			builder.append(userPassword);
			builder.append(", ");
		}
		if (postalAddress != null)
		{
			builder.append("postalAddress=");
			builder.append(postalAddress);
			builder.append(", ");
		}
		if (telephoneNumber != null)
		{
			builder.append("telephoneNumber=");
			builder.append(telephoneNumber);
			builder.append(", ");
		}
		if (speassistantemail != null)
		{
			builder.append("speassistantemail=");
			builder.append(speassistantemail);
			builder.append(", ");
		}
		if (spemobile2 != null)
		{
			builder.append("spemobile2=");
			builder.append(spemobile2);
			builder.append(", ");
		}
		if (speOfficeFax  != null)
		{
			builder.append("speOfficeFax=");
			builder.append(speOfficeFax );
			builder.append(", ");
		}
		if (speHomeFax != null)
		{
			builder.append("speHomeFax=");
			builder.append(speHomeFax);
			builder.append(", ");
		}
		if (speHomePhone != null)
		{
			builder.append("speHomePhone=");
			builder.append(speHomePhone);
			builder.append(", ");
		}
		if (speonenetflag  != null)
		{
			builder.append("speonenetflag=");
			builder.append(speonenetflag );
			builder.append(", ");
		}
		if (speb2brestrictaccess  != null)
		{
			builder.append("speb2brestrictaccess=");
			builder.append(speb2brestrictaccess);
			builder.append(", ");
		}
		if (speuserPrincipalName  != null)
		{
			builder.append("speuserPrincipalName=");
			builder.append(speuserPrincipalName);
			builder.append(", ");
		}
	
		
		if (spepwpolicyflag  != null)
		{
			builder.append("spepwpolicyflag=");
			builder.append(spepwpolicyflag);
			builder.append(", ");
		}
		if (spedicersonyaccess  != null)
		{
			builder.append("spedicersonyaccess=");
			builder.append(spedicersonyaccess);
			builder.append(", ");
		}
		if (spepawsaccess  != null)
		{
			builder.append("spepawsaccess=");
			builder.append(spepawsaccess);
			builder.append(", ");
		}
		if (spebebanjoid  != null)
		{
			builder.append("spebebanjoid=");
			builder.append(spebebanjoid);
			builder.append(", ");
		}
		if(spebirthome != null)
		{
			builder.append("spebirthome=");
			builder.append(spebirthome);
			builder.append(", ");
		}
		if(spebirtaccess != null)
		{
			builder.append("spebirtaccess=");
			builder.append(spebirtaccess);
			builder.append(", ");
		}
		if(spelastdayofwork != null)
		{
			builder.append("spelastdayofwork=");
			builder.append(spelastdayofwork);
			builder.append(", ");
		}
		if(spemedgateaccess != null)
		{
			builder.append("spemedgateaccess=");
			builder.append(spemedgateaccess);
			builder.append(", ");
		}
		if(selfservicepwdchgdate  != null)
		{
			builder.append("selfservicepwdchgdate=");
			builder.append(selfservicepwdchgdate);
			builder.append(", ");
		}
		if(speappdynamicaccess  != null)
		{
			builder.append("speappdynamicaccess=");
			builder.append(speappdynamicaccess);
			builder.append(", ");
		}
		if(speOnLeaveFlag  != null)
		{
			builder.append("speOnLeaveFlag=");
			builder.append(speOnLeaveFlag);
			builder.append(", ");
		}
		if(speiiqadminaccess  != null)
		{
			builder.append("speiiqadminaccess=");
			builder.append(speiiqadminaccess);
			builder.append(", ");
		}
		if(spewpfaccess  != null)
		{
			builder.append("spewpfaccess=");
			builder.append(spewpfaccess);
			builder.append(", ");
		}
		if(spespheconnectaccess  != null)
		{
			builder.append("spespheconnectaccess=");
			builder.append(spespheconnectaccess);
			builder.append(", ");
		}
		if(spespecialeventsaccess  != null)
		{
			builder.append("spespecialeventsaccess=");
			builder.append(spespecialeventsaccess);
			builder.append(", ");
		}
		if(spec2access  != null)
		{
			builder.append("spec2access=");
			builder.append(spec2access);
			builder.append(", ");
		}
		if(spediceraccess  != null)
		{
			builder.append("spediceraccess=");
			builder.append(spediceraccess);
			builder.append(", ");
		}
		if(spewebmethodsaccess  != null)
		{
			builder.append("spewebmethodsaccess=");
			builder.append(spewebmethodsaccess);
			builder.append(", ");
		}
		if(spewptsaccess  != null)
		{
			builder.append("spewptsaccess=");
			builder.append(spewptsaccess);
			builder.append(", ");
		}
		if(spebebanjoaccess  != null)
		{
			builder.append("spebebanjoaccess=");
			builder.append(spebebanjoaccess);
			builder.append(", ");
		}
		if(spefclaccess  != null)
		{
			builder.append("spefclaccess=");
			builder.append(spefclaccess);
			builder.append(", ");
		}
		if(spezlarchive2faaccess  != null)
		{
			builder.append("spezlarchive2faaccess=");
			builder.append(spezlarchive2faaccess);
			builder.append(", ");
		}
		if(speviasataccess  != null)
		{
			builder.append("speviasataccess=");
			builder.append(speviasataccess);
			builder.append(", ");
		}
		if(spepercussionaccess  != null)
		{
			builder.append("spepercussionaccess=");
			builder.append(spepercussionaccess);
			builder.append(", ");
		}
		if(spesouacceptance  != null)
		{
			builder.append("spesouacceptance=");
			builder.append(spesouacceptance);
			builder.append(", ");
		}
		if(SPE2FATokenClass   != null)
		{
			builder.append("SPE2FATokenClass=");
			builder.append(SPE2FATokenClass);
			builder.append(", ");
		}
		if(spe2faoathotp   != null)
		{
			builder.append("spe2faoathotp=");
			builder.append(spe2faoathotp);
			builder.append(", ");
		}
		if(spe2faoathseed  != null)
		{
			builder.append("spe2faoathseed=");
			builder.append(spe2faoathseed);
			builder.append(", ");
		}
		if(spehightailaccess  != null)
		{
			builder.append("spehightailaccess=");
			builder.append(spehightailaccess);
			builder.append(", ");
		}
		if(spe2faoathseed  != null)
		{
			builder.append("spe2faoathseed=");
			builder.append(spe2faoathseed);
			builder.append(", ");
		}
		if(spedrmaccess  != null)
		{
			builder.append("spedrmaccess=");
			builder.append(spedrmaccess);
			builder.append(", ");
		}
		if(spegnetaccess  != null)
		{
			builder.append("spegnetaccess=");
			builder.append(spedrmaccess);
			builder.append(", ");
		}
		if(speorganizationlevel  != null)
		{
			builder.append("speorganizationlevel=");
			builder.append(speorganizationlevel);
			builder.append(", ");
		}
		if(speMgrDn  != null)
		{
			builder.append("speMgrDn=");
			builder.append(speMgrDn);
			builder.append(", ");
		}
		if(speMgmtLevel  != null)
		{
			builder.append("speMgmtLevel=");
			builder.append(speMgmtLevel);
			builder.append(", ");
		}
		if(speEndDate  != null)
		{
			builder.append("speEndDate=");
			builder.append(speEndDate);
			builder.append(", ");
		}
		if(speTerminationDate  != null)
		{
			builder.append("speTerminationDate=");
			builder.append(speTerminationDate);
			builder.append(", ");
		}
		if(speairlinesaccess  != null)
		{
			builder.append("speairlinesaccess=");
			builder.append(speairlinesaccess);
			builder.append(", ");
		}
		if(spedesignstudioaccess  != null)
		{
			builder.append("spedesignstudioaccess=");
			builder.append(spedesignstudioaccess);
			builder.append(", ");
		}
		if(sperepetoryaccess  != null)
		{
			builder.append("sperepetoryaccess=");
			builder.append(sperepetoryaccess);
			builder.append(", ");
		}
		if(spedmcmaccess  != null)
		{
			builder.append("spedmcmaccess=");
			builder.append(spedmcmaccess);
			builder.append(", ");
		}
		if(speinflightaccess  != null)
		{
			builder.append("speinflightaccess=");
			builder.append(speinflightaccess);
		}
		if(Istempassword  != null)
		{
			builder.append("Istempassword=");
			builder.append(Istempassword);
			builder.append(", ");
		}
		if(spemediacenteraccess  != null)
		{
			builder.append("spemediacenteraccess=");
			builder.append(spemediacenteraccess);
			builder.append(", ");
		}
		if(speodinaccess  != null)
		{
			builder.append("speodinaccess=");
			builder.append(speodinaccess);
			builder.append(", ");
		}
		if(spealfrescocontenttype  != null)
		{
			builder.append("spealfrescocontenttype=");
			builder.append(spealfrescocontenttype);
			builder.append(", ");
		}
		if(specimsaccess  != null)
		{
			builder.append("specimsaccess=");
			builder.append(specimsaccess);
			builder.append(", ");
		}
		if(speparisaccess  != null)
		{
			builder.append("speparisaccess=");
			builder.append(speparisaccess);
			builder.append(", ");
		}
		if(spetableausite  != null)
		{
			builder.append("spetableausite=");
			builder.append(spetableausite);
			builder.append(", ");
		}
		if(spepinnacleaccess  != null)
		{
			builder.append("spepinnacleaccess=");
			builder.append(spepinnacleaccess);
			builder.append(", ");
		}
		if(spetableauaccess   != null)
		{
			builder.append("spetableauaccess=");
			builder.append(spetableauaccess );
			builder.append(", ");
		}
		if(spenetworkfileconverteraccess   != null)
		{
			builder.append("spenetworkfileconverteraccess=");
			builder.append(spenetworkfileconverteraccess);
			builder.append(", ");
		}
		if(spehorizonwebappaccess    != null)
		{
			builder.append("spehorizonwebappaccess=");
			builder.append(spehorizonwebappaccess);
			builder.append(", ");
		}
		if(speInterplanaccess    != null)
		{
			builder.append("speInterplanaccess=");
			builder.append(speInterplanaccess);
			builder.append(", ");
		}
		if(speprivacyacknowledge    != null)
		{
			builder.append("speprivacyacknowledge=");
			builder.append(speprivacyacknowledge);
			builder.append(", ");
		}
		if(speSystemID    != null)
		{
			builder.append("speSystemID=");
			builder.append(speSystemID);
			builder.append(", ");
		}
		if(speInternationalPhone    != null)
		{
			builder.append("speInternationalPhone=");
			builder.append(speInternationalPhone);
			builder.append(", ");
		}
		if(spepotrackeraccess    != null)
		{
			builder.append("spepotrackeraccess=");
			builder.append(spepotrackeraccess);
			builder.append(", ");
		}
		if(spesspaccessed    != null)
		{
			builder.append("spesspaccessed=");
			builder.append(spesspaccessed);
			builder.append(", ");
		}
		if(spesspeverbridge    != null)
		{
			builder.append("spesspeverbridge=");
			builder.append(spesspeverbridge);
			builder.append(", ");
		}
		if(privacypolicyacceptedon     != null)
		{
			builder.append("privacypolicyacceptedon=");
			builder.append(privacypolicyacceptedon);
			builder.append(", ");
		}
		if(speediscoverycustodianaccess    != null)
		{
			builder.append("speediscoverycustodianaccess=");
			builder.append(speediscoverycustodianaccess);
			builder.append(", ");
		}
		if(speworkdaysitecode    != null)
		{
			builder.append("speworkdaysitecode=");
			builder.append(speworkdaysitecode);
			builder.append(", ");
		}
		if(generationQualifier    != null)
		{
			builder.append("generationQualifier=");
			builder.append(generationQualifier);
			builder.append(", ");
		}
		if(lobindicator    != null)
		{
			builder.append("lobindicator=");
			builder.append(lobindicator);
			builder.append(", ");
		}
		if(spesubdivisionid    != null)
		{
			builder.append("spesubdivisionid=");
			builder.append(spesubdivisionid);
			builder.append(", ");
		}
		if(spebusinessunitid    != null)
		{
			builder.append("spebusinessunitid=");
			builder.append(spebusinessunitid);
			builder.append(", ");
		}
		if(spebusinessunitname    != null)
		{
			builder.append("spebusinessunitname=");
			builder.append(spebusinessunitname);
			builder.append(", ");
		}
		if(spePGPPolicy    != null)
		{
			builder.append("spePGPPolicy=");
			builder.append(spePGPPolicy);
			builder.append(", ");
		}
		if(spepwdplcexmtsts     != null)
		{
			builder.append("spepwdplcexmtsts =");
			builder.append(spepwdplcexmtsts );
			builder.append(", ");
		}
		if(speasvaccess    != null)
		{
			builder.append("speasvaccess=");
			builder.append(speasvaccess);
			builder.append(", ");
		}
		if(speintegrifyaccess    != null)
		{
			builder.append("speintegrifyaccess=");
			builder.append(speintegrifyaccess);
			builder.append(", ");
		}
		if(SPTResearchAdminAccess    != null)
		{
			builder.append("SPTResearchAdminAccess=");
			builder.append(SPTResearchAdminAccess);
			builder.append(", ");
		}
		
		if(spe2faPhone1Type    != null)
		{
			builder.append("spe2faPhone1Type=");
			builder.append(spe2faPhone1Type);
			builder.append(", ");
		}
		
		if(spe2faPhone2Type    != null)
		{
			builder.append("spe2faPhone2Type=");
			builder.append(spe2faPhone2Type);
			builder.append(", ");
		}
		
		if(spe2faPhone1     != null)
		{
			builder.append("spe2faPhone1=");
			builder.append(spe2faPhone1);
			builder.append(", ");
		}
		
		
		if(spe2faPhone1SMS    != null)
		{
			builder.append("spe2faPhone1SMS=");
			builder.append(spe2faPhone1SMS);
			builder.append(", ");
		}
		
		if(spe2faPhone1Email     != null)
		{
			builder.append("spe2faPhone1Email=");
			builder.append(spe2faPhone1Email);
			builder.append(", ");
		}
		
		if(spe2faPhone2    != null)
		{
			builder.append("spe2faPhone2=");
			builder.append(spe2faPhone2);
			builder.append(", ");
		}
		
		if(spe2faPhone2SMS     != null)
		{
			builder.append("spe2faPhone2SMS=");
			builder.append(spe2faPhone2SMS);
			builder.append(", ");
		}
		
		if(spe2faPhone2Email     != null)
		{
			builder.append("spe2faPhone2Email=");
			builder.append(spe2faPhone2Email);
			builder.append(", ");
		}
		
		if(spe2faPhone3    != null)
		{
			builder.append("spe2faPhone3=");
			builder.append(spe2faPhone3);
			builder.append(", ");
		}
		
		if(spe2faPhone3SMS    != null)
		{
			builder.append("spe2faPhone3SMS=");
			builder.append(spe2faPhone3SMS);
			builder.append(", ");
		}
		
		if(spe2faPhone3Email     != null)
		{
			builder.append("spe2faPhone3Email=");
			builder.append(spe2faPhone3Email);
			builder.append(", ");
		}
		
		if(spespticomaccess    != null)
		{
			builder.append("spespticomaccess=");
			builder.append(spespticomaccess);
			builder.append(", ");
		}
		
		if(spenetgainaccess    != null)
		{
			builder.append("spenetgainaccess=");
			builder.append(spenetgainaccess);
			builder.append(", ");
		}
		if(speevmiaccess    != null)
		{
			builder.append("speevmiaccess=");
			builder.append(speevmiaccess);
			builder.append(", ");
		}
		if(spedealpointaccess    != null)
		{
			builder.append("spedealpointaccess=");
			builder.append(spedealpointaccess);
			builder.append(", ");
		}
		
		if(specreativenetworksaccess    != null)
		{
			builder.append("specreativenetworksaccess=");
			builder.append(specreativenetworksaccess);
			builder.append(", ");
		}
		if(spe2faeagl     != null)
		{
			builder.append("spe2faeagl=");
			builder.append(spe2faeagl);
			builder.append(", ");
		}
		if(speScryAccess    != null)
		{
			builder.append("speScryAccess=");
			builder.append(speScryAccess);
			builder.append(", ");
		}
		if(speBusinessObjectsGroup     != null)
		{
			builder.append("speBusinessObjectsGroup=");
			builder.append(speBusinessObjectsGroup);
			builder.append(", ");
		}
		if(speBusinessObjectsAccess     != null)
		{
			builder.append("speBusinessObjectsAccess=");
			builder.append(speBusinessObjectsAccess);
			builder.append(", ");
		}
		if(spePRISMAccess     != null)
		{
			builder.append("spePRISMAccess=");
			builder.append(spePRISMAccess);
			builder.append(", ");
		}
		if(speexecutivedirectoryadmin     != null)
		{
			builder.append("speexecutivedirectoryadmin=");
			builder.append(speexecutivedirectoryadmin);
			builder.append(", ");
		}
		if(speexecutivedirectoryuser     != null)
		{
			builder.append("speexecutivedirectoryuser=");
			builder.append(speexecutivedirectoryuser);
			builder.append(", ");
		}
		if(speebrelaccess     != null)
		{
			builder.append("speebrelaccess=");
			builder.append(speebrelaccess);
			builder.append(", ");
		}
		if(spedartsroles     != null)
		{
			builder.append("spedartsroles=");
			builder.append(spedartsroles);
			builder.append(", ");
		}
		if(myspeaccess      != null)
		{
			builder.append("myspeaccess=");
			builder.append(myspeaccess);
			builder.append(", ");
		}
		if(myspedepts      != null)
		{
			builder.append("myspedepts=");
			builder.append(myspedepts);
			builder.append(", ");
		}
		if(myspeemail      != null)
		{
			builder.append("myspeemail=");
			builder.append(myspeemail);
			builder.append(", ");
		}
		if(mysperole     != null)
		{
			builder.append("mysperole=");
			builder.append(mysperole);
			builder.append(", ");
		}
		if(isMemberOf     != null)
		{
			builder.append("isMemberOf=");
			builder.append(isMemberOf);
			builder.append(", ");
		}
		if(myspeworkspace     != null)
		{
			builder.append("myspeworkspace=");
			builder.append(myspeworkspace);
			builder.append(", ");
		}
		if(myspeworkspacedepts      != null)
		{
			builder.append("myspeworkspacedepts=");
			builder.append(myspeworkspacedepts);
			builder.append(", ");
		}
		if(mysphedepts     != null)
		{
			builder.append("mysphedepts=");
			builder.append(mysphedepts);
			builder.append(", ");
		}
		if(myspherole     != null)
		{
			builder.append("myspherole=");
			builder.append(myspherole);
			builder.append(", ");
		}
		
		if(mysptiregions     != null)
		{
			builder.append("mysptiregions=");
			builder.append(mysptiregions);
			builder.append(", ");
		}
		if(sonyGHD     != null)
		{
			builder.append("sonyGHD=");
			builder.append(sonyGHD);
			builder.append(", ");
		}
		if(SonyRemoteUserBusinessUnitType      != null)
		{
			builder.append("SonyRemoteUserBusinessUnitType=");
			builder.append(SonyRemoteUserBusinessUnitType);
			builder.append(", ");
		}
		if(speaccutracaccess      != null)
		{
			builder.append("speaccutracaccess=");
			builder.append(speaccutracaccess);
			builder.append(", ");
		}
		if(speacshome     != null)
		{
			builder.append("speacshome=");
			builder.append(speacshome);
			builder.append(", ");
		}
		if(speacsproductiona     != null)
		{
			builder.append("speacsproductiona=");
			builder.append(speacsproductiona);
			builder.append(", ");
		}
		if(speacsproductionavpnremote      != null)
		{
			builder.append("speacsproductionavpnremote=");
			builder.append(speacsproductionavpnremote);
			builder.append(", ");
		}
		if(speacsproductionawired    != null)
		{
			builder.append("speacsproductionawired=");
			builder.append(speacsproductionawired);
			builder.append(", ");
		}
		if(speacsproductionawireless   != null)
		{
			builder.append("speacsproductionawireless=");
			builder.append(speacsproductionawireless);
			builder.append(", ");
		}
		if(speacsproductionb    != null)
		{
			builder.append("speacsproductionb=");
			builder.append(speacsproductionb);
			builder.append(", ");
		}
		if(speacsproductionbvpnremote     != null)
		{
			builder.append("speacsproductionbvpnremote=");
			builder.append(speacsproductionbvpnremote);
			builder.append(", ");
		}
		if(speacsproductionbwired    != null)
		{
			builder.append("speacsproductionbwired=");
			builder.append(speacsproductionbwired);
			builder.append(", ");
		}
		if(speacsproductionbwireless    != null)
		{
			builder.append("speacsproductionbwireless=");
			builder.append(speacsproductionbwireless);
			builder.append(", ");
		}
		if(speacsproductionc     != null)
		{
			builder.append("speacsproductionc=");
			builder.append(speacsproductionc);
			builder.append(", ");
		}
		if(speacsproductioncvpnremote     != null)
		{
			builder.append("speacsproductioncvpnremote=");
			builder.append(speacsproductioncvpnremote);
			builder.append(", ");
		}
		if(speacsproductioncwired     != null)
		{
			builder.append("speacsproductioncwired=");
			builder.append(speacsproductioncwired);
			builder.append(", ");
		}
		if(speacsproductioncwireless      != null)
		{
			builder.append("speacsproductioncwireless=");
			builder.append(speacsproductioncwireless);
			builder.append(", ");
		}
		if(speacsproductiond    != null)
		{
			builder.append("speacsproductiond=");
			builder.append(speacsproductiond);
			builder.append(", ");
		}
		if(speacsproductioncwired     != null)
		{
			builder.append("speacsproductioncwired=");
			builder.append(speacsproductioncwired);
			builder.append(", ");
		}
		if(speacsproductiondvpnremote      != null)
		{
			builder.append("speacsproductiondvpnremote=");
			builder.append(speacsproductiondvpnremote);
			builder.append(", ");
		}
		if(speacsproductiondwired     != null)
		{
			builder.append("speacsproductiondwired=");
			builder.append(speacsproductiondwired);
			builder.append(", ");
		}
		if(speacsproductiondwireless       != null)
		{
			builder.append("speacsproductiondwireless=");
			builder.append(speacsproductiondwireless);
			builder.append(", ");
		}
		if(speacsproductionevpnremote        != null)
		{
			builder.append("speacsproductionevpnremote=");
			builder.append(speacsproductionevpnremote);
			builder.append(", ");
		}
		if(speacsproductionewired       != null)
		{
			builder.append("speacsproductionewired=");
			builder.append(speacsproductionewired);
			builder.append(", ");
		}
		if(speacsproductionewired       != null)
		{
			builder.append("speacsproductionewired=");
			builder.append(speacsproductionewired);
			builder.append(", ");
		}
		if(speacsproductionewireless      != null)
		{
			builder.append("speacsproductionewireless=");
			builder.append(speacsproductionewireless);
			builder.append(", ");
		}
		if(speacsproductionfvpnremote       != null)
		{
			builder.append("speacsproductionfvpnremote=");
			builder.append(speacsproductionfvpnremote);
			builder.append(", ");
		}
		if(speacsproductionewired       != null)
		{
			builder.append("speacsproductionewired=");
			builder.append(speacsproductionewired);
			builder.append(", ");
		}
		if(speacsproductionewireless      != null)
		{
			builder.append("speacsproductionewireless=");
			builder.append(speacsproductionewireless);
			builder.append(", ");
		}
		if(speacsproductionewireless      != null)
		{
			builder.append("speacsproductionewireless=");
			builder.append(speacsproductionewireless);
			builder.append(", ");
		}
		if(speacsproductionf       != null)
		{
			builder.append("speacsproductionf=");
			builder.append(speacsproductionf);
			builder.append(", ");
		}
		if(speacsproductionfvpnremote       != null)
		{
			builder.append("speacsproductionfvpnremote=");
			builder.append(speacsproductionfvpnremote);
			builder.append(", ");
		}
		if(speacsproductionfvpnremote       != null)
		{
			builder.append("speacsproductionfvpnremote=");
			builder.append(speacsproductionfvpnremote);
			builder.append(", ");
		}
		if(speacsproductionfvpnremote       != null)
		{
			builder.append("speacsproductionfvpnremote=");
			builder.append(speacsproductionfvpnremote);
			builder.append(", ");
		}
		if(speacsproductionfwired       != null)
		{
			builder.append("speacsproductionfwired=");
			builder.append(speacsproductionfwired);
			builder.append(", ");
		}
		if(speacsproductionfwireless      != null)
		{
			builder.append("speacsproductionfwireless=");
			builder.append(speacsproductionfwireless);
			builder.append(", ");
		}
		if(speacsproductiong      != null)
		{
			builder.append("speacsproductiong=");
			builder.append(speacsproductiong);
			builder.append(", ");
		}
		if(speacsproductiongvpnremote     != null)
		{
			builder.append("speacsproductiongvpnremote=");
			builder.append(speacsproductiongvpnremote);
			builder.append(", ");
		}
		if(speacsproductiongwired      != null)
		{
			builder.append("speacsproductiongwired=");
			builder.append(speacsproductiongwired);
			builder.append(", ");
		}
		if(speacsproductiongwireless     != null)
		{
			builder.append("speacsproductiongwireless=");
			builder.append(speacsproductiongwireless);
			builder.append(", ");
		}
		if(speacsproductionh     != null)
		{
			builder.append("speacsproductionh=");
			builder.append(speacsproductionh);
			builder.append(", ");
		}
		if(speacsproductionhvpnremote      != null)
		{
			builder.append("speacsproductionhvpnremote=");
			builder.append(speacsproductionhvpnremote);
			builder.append(", ");
		}
		if(speacsproductionhwired      != null)
		{
			builder.append("speacsproductionhwired=");
			builder.append(speacsproductionhwired);
			builder.append(", ");
		}
		if(speacsproductionhwireless      != null)
		{
			builder.append("speacsproductionhwireless=");
			builder.append(speacsproductionhwireless);
			builder.append(", ");
		}
		if(speacsproductioni     != null)
		{
			builder.append("speacsproductioni=");
			builder.append(speacsproductioni);
			builder.append(", ");
		}
		if(speacsproductionivpnremote     != null)
		{
			builder.append("speacsproductionivpnremote=");
			builder.append(speacsproductionivpnremote);
			builder.append(", ");
		}
		if(speacsproductioniwired     != null)
		{
			builder.append("speacsproductioniwired=");
			builder.append(speacsproductioniwired);
			builder.append(", ");
		}
		if(speacsproductioniwireless     != null)
		{
			builder.append("speacsproductioniwireless=");
			builder.append(speacsproductioniwireless);
			builder.append(", ");
		}
		if(speacsproductionj     != null)
		{
			builder.append("speacsproductionj=");
			builder.append(speacsproductionj);
			builder.append(", ");
		}
		if(speacsproductionjvpnremote     != null)
		{
			builder.append("speacsproductionjvpnremote=");
			builder.append(speacsproductionjvpnremote);
			builder.append(", ");
		}
		if(speacsproductionjwired     != null)
		{
			builder.append("speacsproductionjwired=");
			builder.append(speacsproductionjwired);
			builder.append(", ");
		}
		if(speacsproductionjwireless     != null)
		{
			builder.append("speacsproductionjwireless=");
			builder.append(speacsproductionjwireless);
			builder.append(", ");
		}
		if(speacsproductionk    != null)
		{
			builder.append("speacsproductionk=");
			builder.append(speacsproductionk);
			builder.append(", ");
		}
		if(speacsproductionkvpnremote    != null)
		{
			builder.append("speacsproductionkvpnremote=");
			builder.append(speacsproductionkvpnremote);
			builder.append(", ");
		}
		if(speacsproductionkwired    != null)
		{
			builder.append("speacsproductionkwired=");
			builder.append(speacsproductionkwired);
			builder.append(", ");
		}
		if(speacsproductionkwireless    != null)
		{
			builder.append("speacsproductionkwireless=");
			builder.append(speacsproductionkwireless);
			builder.append(", ");
		}
		if(speacsproductionl    != null)
		{
			builder.append("speacsproductionl=");
			builder.append(speacsproductionl);
			builder.append(", ");
		}
		if(speacsproductionlvpnremote    != null)
		{
			builder.append("speacsproductionlvpnremote=");
			builder.append(speacsproductionlvpnremote);
			builder.append(", ");
		}
		if(speacsproductionlwired    != null)
		{
			builder.append("speacsproductionlwired=");
			builder.append(speacsproductionlwired);
			builder.append(", ");
		}
		if(speacsproductionlwireless    != null)
		{
			builder.append("speacsproductionlwireless=");
			builder.append(speacsproductionlwireless);
			builder.append(", ");
		}
		if(speacsproductionm    != null)
		{
			builder.append("speacsproductionm=");
			builder.append(speacsproductionm);
			builder.append(", ");
		}
		if(speacsproductionmvpnremote    != null)
		{
			builder.append("speacsproductionmvpnremote=");
			builder.append(speacsproductionmvpnremote);
			builder.append(", ");
		}
		if(speacsproductionmwired    != null)
		{
			builder.append("speacsproductionmwired=");
			builder.append(speacsproductionmwired);
			builder.append(", ");
		}
		if(speacsproductionmwireless    != null)
		{
			builder.append("speacsproductionmwireless=");
			builder.append(speacsproductionmwireless);
			builder.append(", ");
		}
		if(speacsproductionn   != null)
		{
			builder.append("speacsproductionn=");
			builder.append(speacsproductionn);
			builder.append(", ");
		}
		if(speacsproductionnvpnremote   != null)
		{
			builder.append("speacsproductionnvpnremote=");
			builder.append(speacsproductionnvpnremote);
			builder.append(", ");
		}
		if(speacsproductionnwired   != null)
		{
			builder.append("speacsproductionnwired=");
			builder.append(speacsproductionnwired);
			builder.append(", ");
		}
		if(speacsproductionnwireless   != null)
		{
			builder.append("speacsproductionnwireless=");
			builder.append(speacsproductionnwireless);
			builder.append(", ");
		}
		if(spealfrescoaccess   != null)
		{
			builder.append("spealfrescoaccess=");
			builder.append(spealfrescoaccess);
			builder.append(", ");
		}
		if(spealfrescobcaccess   != null)
		{
			builder.append("spealfrescobcaccess=");
			builder.append(spealfrescobcaccess);
			builder.append(", ");
		}
		if(speAppsPermitted   != null)
		{
			builder.append("speAppsPermitted=");
			builder.append(speAppsPermitted);
			builder.append(", ");
		}
		if(speb2baccess   != null)
		{
			builder.append("speb2baccess=");
			builder.append(speb2baccess);
			builder.append(", ");
		}
		if(spebuildingid   != null)
		{
			builder.append("spebuildingid=");
			builder.append(spebuildingid);
			builder.append(", ");
		}
		if(spebusinessunit   != null)
		{
			builder.append("spebusinessunit=");
			builder.append(spebusinessunit);
			builder.append(", ");
		}
		if(specardinusaccess   != null)
		{
			builder.append("specardinusaccess=");
			builder.append(specardinusaccess);
			builder.append(", ");
		}
		if(specompanyid   != null)
		{
			builder.append("specompanyid=");
			builder.append(specompanyid);
			builder.append(", ");
		}
		if(specostcenter   != null)
		{
			builder.append("specostcenter=");
			builder.append(specostcenter);
			builder.append(", ");
		}
		if(specountry   != null)
		{
			builder.append("specountry=");
			builder.append(specountry);
			builder.append(", ");
		}
		if(spedealtrackeraccess   != null)
		{
			builder.append("spedealtrackeraccess=");
			builder.append(spedealtrackeraccess);
			builder.append(", ");
		}
		if(spedepartmentid   != null)
		{
			builder.append("spedepartmentid=");
			builder.append(spedepartmentid);
			builder.append(", ");
		}
		if(spedepartmentname  != null)
		{
			builder.append("spedepartmentname=");
			builder.append(spedepartmentname);
			builder.append(", ");
		}
		if(speDisplayFaxNumber   != null)
		{
			builder.append("speDisplayFaxNumber=");
			builder.append(speDisplayFaxNumber);
			builder.append(", ");
		}
		if(speDisplaygivenName    != null)
		{
			builder.append("speDisplaygivenName=");
			builder.append(speDisplaygivenName);
			builder.append(", ");
		}
		if(speDisplaySurname    != null)
		{
			builder.append("speDisplaySurname=");
			builder.append(speDisplaySurname);
			builder.append(", ");
		}
		if(speDisplayTelephoneNumber    != null)
		{
			builder.append("speDisplayTelephoneNumber=");
			builder.append(speDisplayTelephoneNumber);
			builder.append(", ");
		}
		if(spedivision    != null)
		{
			builder.append("spedivision=");
			builder.append(spedivision);
			builder.append(", ");
		}
		if(spedivisionid    != null)
		{
			builder.append("spedivisionid=");
			builder.append(spedivisionid);
			builder.append(", ");
		}
		if(spedivisionname    != null)
		{
			builder.append("spedivisionname=");
			builder.append(spedivisionname);
			builder.append(", ");
		}
		if(spedominodn    != null)
		{
			builder.append("spedominodn=");
			builder.append(spedominodn);
			builder.append(", ");
		}
		if(spedominomaildb    != null)
		{
			builder.append("spedominomaildb=");
			builder.append(spedominomaildb);
			builder.append(", ");
		}
		if(spedroolsaccess    != null)
		{
			builder.append("spedroolsaccess=");
			builder.append(spedroolsaccess);
			builder.append(", ");
		}
		if(spedrozaccess    != null)
		{
			builder.append("spedrozaccess=");
			builder.append(spedrozaccess);
			builder.append(", ");
		}
		if(speEmpBadgeID    != null)
		{
			builder.append("speEmpBadgeID=");
			builder.append(speEmpBadgeID);
			builder.append(", ");
		}
		if(speEmpBirthDate    != null)
		{
			builder.append("speEmpBirthDate=");
			builder.append(speEmpBirthDate);
			builder.append(", ");
		
		}
		if(speEmpDataSource     != null)
		{
			builder.append("speEmpDataSource=");
			builder.append(speEmpDataSource);
			builder.append(", ");
		}
		if(speEmpFrmCtr    != null)
		{
			builder.append("speEmpFrmCtr=");
			builder.append(speEmpFrmCtr);
			builder.append(", ");
		}
		if(speEmpHireDate    != null)
		{
			builder.append("speEmpHireDate=");
			builder.append(speEmpHireDate);
			builder.append(", ");
		}
		if(speEmpID    != null)
		{
			builder.append("speEmpID=");
			builder.append(speEmpID);
			builder.append(", ");
		}
		if(speEmpPwdChg    != null)
		{
			builder.append("speEmpPwdChg=");
			builder.append(speEmpPwdChg);
			builder.append(", ");
		}
		if(speEmpSrvyComp   != null)
		{
			builder.append("speEmpSrvyComp=");
			builder.append(speEmpSrvyComp);
			builder.append(", ");
		}
		if(speEmpTermDate   != null)
		{
			builder.append("speEmpTermDate=");
			builder.append(speEmpTermDate);
			builder.append(", ");
		}
		if(speEmpWorkState   != null)
		{
			builder.append("speEmpWorkState=");
			builder.append(speEmpWorkState);
			builder.append(", ");
		}
		if(speGlobalID   != null)
		{
			builder.append("speGlobalID=");
			builder.append(speGlobalID);
			builder.append(", ");
		}
		if(speIDMAccountLocked    != null)
		{
			builder.append("speIDMAccountLocked=");
			builder.append(speIDMAccountLocked);
			builder.append(", ");
			
		}
		if(speIDMRegion    != null)
		{
			builder.append("speIDMRegion=");
			builder.append(speIDMRegion);
			builder.append(", ");
		}
		if(speIDMTerritory    != null)
		{
			builder.append("speIDMTerritory=");
			builder.append(speIDMTerritory);
			builder.append(", ");
		}
		if(speidmusertype    != null)
		{
			builder.append("speidmusertype=");
			builder.append(speidmusertype);
			builder.append(", ");
		}
		if(speiptvpackages    != null)
		{
			builder.append("speiptvpackages=");
			builder.append(speiptvpackages);
			builder.append(", ");
		}
		if(speJoggerA1    != null)
		{
			builder.append("speJoggerA1=");
			builder.append(speJoggerA1);
			builder.append(", ");
		}
		if(speJoggerA2    != null)
		{
			builder.append("speJoggerA2=");
			builder.append(speJoggerA2);
			builder.append(", ");
		}
		if(speJoggerQ1    != null)
		{
			builder.append("speJoggerQ1=");
			builder.append(speJoggerQ1);
			builder.append(", ");
		}
		if(speJoggerQ2    != null)
		{
			builder.append("speJoggerQ2=");
			builder.append(speJoggerQ2);
			builder.append(", ");
		}
		if(speMgrID    != null)
		{
			builder.append("speMgrID=");
			builder.append(speMgrID);
			builder.append(", ");
		}
		if(speMobile    != null)
		{
			builder.append("speMobile=");
			builder.append(speMobile);
			builder.append(", ");
		}
		if(speNativeEmail  != null)
		{
			builder.append("speNativeEmail=");
			builder.append(speNativeEmail);
			builder.append(", ");
		}
		
		if(speNativeEmail  != null)
		{
			builder.append("speNativeEmail=");
			builder.append(speNativeEmail);
			builder.append(", ");
		}
		if(speNativeEmailServer  != null)
		{
			builder.append("speNativeEmailServer=");
			builder.append(speNativeEmailServer);
			builder.append(", ");
		}
		if(speNativeNotesShortName  != null)
		{
			builder.append("speNativeNotesShortName=");
			builder.append(speNativeNotesShortName);
			builder.append(", ");
		}
		
		if(spenikuid  != null)
		{
			builder.append("spenikuid=");
			builder.append(spenikuid);
			builder.append(", ");
		}
		if(spenotesshortname  != null)
		{
			builder.append("spenotesshortname=");
			builder.append(spenotesshortname);
			builder.append(", ");
		}
		if(spenovatusaccess  != null)
		{
			builder.append("spenovatusaccess=");
			builder.append(spenovatusaccess);
			builder.append(", ");
		}
		if(speOfficeLocation2  != null)
		{
			builder.append("speOfficeLocation2=");
			builder.append(speOfficeLocation2);
			builder.append(", ");
		}
		if(speOfficeLocation3  != null)
		{
			builder.append("speOfficeLocation3=");
			builder.append(speOfficeLocation3);
			builder.append(", ");
		}
		if(speoversightaccess  != null)
		{
			builder.append("speoversightaccess=");
			builder.append(speoversightaccess);
			builder.append(", ");
		}
		if(spePasswordFlag  != null)
		{
			builder.append("spePasswordFlag=");
			builder.append(spePasswordFlag);
			builder.append(", ");
		}
		if(spepeoplefluentaccess  != null)
		{
			builder.append("spepeoplefluentaccess=");
			builder.append(spepeoplefluentaccess);
			builder.append(", ");
		}
		if(spePGPRegion  != null)
		{
			builder.append("spePGPRegion=");
			builder.append(spePGPRegion);
			builder.append(", ");
		}
		if(spePhone  != null)
		{
			builder.append("spePhone=");
			builder.append(spePhone);
			builder.append(", ");
		}
		if(spepinnumber  != null)
		{
			builder.append("spepinnumber=");
			builder.append(spepinnumber);
			builder.append(", ");
		}
		if(speprodsafetyaccess  != null)
		{
			builder.append("speprodsafetyaccess=");
			builder.append(speprodsafetyaccess);
			builder.append(", ");
		}
		if(speproductionbackboneaccess   != null)
		{
			builder.append("speproductionbackboneaccess=");
			builder.append(speproductionbackboneaccess);
			builder.append(", ");
		}
		if(spepsid  != null)
		{
			builder.append("spepsid=");
			builder.append(spepsid);
			builder.append(", ");
		}
		if(spepssaccess  != null)
		{
			builder.append("spepssaccess=");
			builder.append(spepssaccess);
			builder.append(", ");
		}
		if(spepwdexprydt   != null)
		{
			builder.append("spepwdexprydt=");
			builder.append(spepwdexprydt );
			builder.append(", ");
		}
		if(spepwdplcexmtstatus  != null)
		{
			builder.append("spepwdplcexmtstatus=");
			builder.append(spepwdplcexmtstatus );
			builder.append(", ");
		}
		if(speqcaccess   != null)
		{
			builder.append("speqcaccess=");
			builder.append(speqcaccess );
			builder.append(", ");
		}
		if(speRoomNumber3   != null)
		{
			builder.append("speRoomNumber3=");
			builder.append(speRoomNumber3 );
			builder.append(", ");
		}
		if(SPERPMAccess   != null)
		{
			builder.append("SPERPMAccess=");
			builder.append(SPERPMAccess );
			builder.append(", ");
		}
		if(spesabaaccess   != null)
		{
			builder.append("spesabaaccess=");
			builder.append(spesabaaccess );
			builder.append(", ");
		}
		if(spesalesbankaccess   != null)
		{
			builder.append("spesalesbankaccess=");
			builder.append(spesalesbankaccess );
			builder.append(", ");
		}
		if(spespeedid   != null)
		{
			builder.append("spespeedid=");
			builder.append(spespeedid );
			builder.append(", ");
		}
		if(spestoreroomaccess   != null)
		{
			builder.append("spestoreroomaccess=");
			builder.append(spestoreroomaccess );
			builder.append(", ");
		}
		if(spesubdivisionname   != null)
		{
			builder.append("spesubdivisionname=");
			builder.append(spesubdivisionname );
			builder.append(", ");
		}
		if(speswiftaccess   != null)
		{
			builder.append("speswiftaccess=");
			builder.append(speswiftaccess );
			builder.append(", ");
		}
		if(spetestapplicationaccess    != null)
		{
			builder.append("spetestapplicationaccess=");
			builder.append(spetestapplicationaccess );
			builder.append(", ");
		}
		if(speTrial   != null)
		{
			builder.append("speTrial=");
			builder.append(speTrial);
			builder.append(", ");
		}
		if(spetrintechaccess   != null)
		{
			builder.append("spetrintechaccess=");
			builder.append(spetrintechaccess);
			builder.append(", ");
		}
		if(speVipFlag   != null)
		{
			builder.append("speVipFlag=");
			builder.append(speVipFlag);
			builder.append(", ");
		}
		if(speVPNGroup   != null)
		{
			builder.append("speVPNGroup=");
			builder.append(speVPNGroup);
			builder.append(", ");
		}
		if(spewdempid   != null)
		{
			builder.append("spewdempid=");
			builder.append(spewdempid);
			builder.append(", ");
		}
		if(speworktype   != null)
		{
			builder.append("speworktype=");
			builder.append(speworktype);
			builder.append(", ");
		}
		if(VPNEnabled   != null)
		{
			builder.append("VPNEnabled=");
			builder.append(VPNEnabled);
			builder.append(", ");
		}
		if(speifdsaccess   != null)
		{
			builder.append("speifdsaccess=");
			builder.append(speifdsaccess);
			builder.append(", ");
		}
		if(speIFDSReportLanguage   != null)
		{
			builder.append("speIFDSReportLanguage=");
			builder.append(speIFDSReportLanguage);
			builder.append(", ");
		}
		if(speifdstemporaryuser   != null)
		{
			builder.append("speifdstemporaryuser=");
			builder.append(speifdstemporaryuser);
			builder.append(", ");
		}
		if(speifdsuseraccessenddate   != null)
		{
			builder.append("speifdsuseraccessenddate=");
			builder.append(speifdsuseraccessenddate);
			builder.append(", ");
		}
		if(speifdsusertitle   != null)
		{
			builder.append("speifdsusertitle=");
			builder.append(speifdsusertitle);
			builder.append(", ");
		}
		if(speOperatingCompany   != null)
		{
			builder.append("speOperatingCompany=");
			builder.append(speOperatingCompany);
			builder.append(", ");
		}
		if(spePhysicalLocale   != null)
		{
			builder.append("spePhysicalLocale=");
			builder.append(spePhysicalLocale);
			builder.append(", ");
		}
		if(speTerritory   != null)
		{
			builder.append("speTerritory=");
			builder.append(speTerritory);
			builder.append(", ");
		}
		if(st   != null)
		{
			builder.append("st=");
			builder.append(st);
			builder.append(", ");
		}
		if(street   != null)
		{
			builder.append("street=");
			builder.append(street);
			builder.append(", ");
		}
		if(title   != null)
		{
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}
		if(spefcmaccess   != null)
		{
			builder.append("spefcmaccess=");
			builder.append(spefcmaccess);
			
		}
		
		builder.append("]");
		return builder.toString();
	}

	
}
