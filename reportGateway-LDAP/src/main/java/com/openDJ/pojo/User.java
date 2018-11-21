package com.openDJ.pojo;

import java.io.Serializable;

/**
 * @author KMaji
 *
 */
public class User implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 9081527761576640803L;

	private String givenName;
	private String uid;
	private String cn;
	private String sn;
	private String userPassword;
	private String postalAddress;
	private String telephoneNumber;

	private String speassistantemail;
	private String spemobile2;
	private String speOfficeFax;
	private String speHomeFax;
	private String speHomePhone;
	private String speonenetflag;
	private String speb2brestrictaccess;
	private String speuserPrincipalName;
	private String spepwpolicyflag;
	private String spedicersonyaccess;
	private String speprimarybusinesspartner;
	private String spepawsaccess;
	private String spebebanjoid;
	private String spebirthome;
	private String spebirtaccess;
	private String spelastdayofwork;
	private String spemedgateaccess;
	private String selfservicepwdchgdate;
	private String speappdynamicaccess;
	private String speOnLeaveFlag;
	private String speiiqadminaccess;
	private String spewpfaccess;
	private String spespheconnectaccess;
	private String spespecialeventsaccess;
	private String spec2access;
	private String spediceraccess;
	private String spewebmethodsaccess;
	private String spewptsaccess;
	private String spebebanjoaccess;
	private String spefclaccess;
	private String speappdynamicsaccess;
	private String spezlarchive2faaccess;
	private String speviasataccess;
	private String spepercussionaccess;
	private String spesouacceptance;
	private String SPE2FATokenClass;
	private String spe2faoathotp;
	private String spe2faoathseed;
	private String spehightailaccess;
	private String spedrmaccess;
	private String spegnetaccess;
	private String speorganizationlevel;
	private String speMgrDn;
	private String speMgmtLevel;
	private String speEndDate;
	private String speTerminationDate;
	private String speairlinesaccess;
	private String spedesignstudioaccess;
	private String sperepetoryaccess;
	private String spedmcmaccess;
	private String speinflightaccess;
	private String Istempassword;
	private String spemediacenteraccess;
	private String speodinaccess;
	private String spealfrescocontenttype;
	private String specimsaccess;
	private String speparisaccess;
	private String spetableausite;
	private String spepinnacleaccess;
	private String spetableauaccess;
	private String spenetworkfileconverteraccess;
	private String spehorizonwebappaccess;
	private String speInterplanaccess;
	private String speprivacyacknowledge;
	private String speoversightapaccess;
	private String speSystemID;
	private String speInternationalPhone;
	private String spepotrackeraccess;
	private String spesspaccessed;
	private String spesspeverbridge;
	private String privacypolicyacceptedon;
	private String speediscoverycustodianaccess;
	private String speworkdaysitecode;
	private String generationQualifier;
	private String lobindicator;
	private String spesubdivisionid;
	private String spebusinessunitid;
	private String spebusinessunitname;
	private String spePGPPolicy;
	private String spepwdplcexmtsts;
	private String speasvaccess;
	private String speintegrifyaccess;
	private String SPTResearchAdminAccess;
	private String spe2faPhone1Type;
	private String spe2faPhone2Type;
	private String spe2faPhone1;
	private String spe2faPhone1SMS;
	private String spe2faPhone1Email;
	private String spe2faPhone2;
	private String spe2faPhone2SMS;
	private String spe2faPhone2Email;
	private String spe2faPhone3;
	private String spe2faPhone3SMS;
	private String spe2faPhone3Email;
	private String spespticomaccess;
	private String spenetgainaccess;
	private String speevmiaccess;
	private String spedealpointaccess;
	private String specreativenetworksaccess;
	private String spe2faeagl;
	private String speScryAccess;
	private String speBusinessObjectsGroup;
	private String speBusinessObjectsAccess;
	private String spePRISMAccess;
	private String speexecutivedirectoryadmin;
	private String speexecutivedirectoryuser;
	private String speebrelaccess;
	private String spedartsroles;
	private String myspeaccess;
	private String myspedepts;
	private String myspeemail;
	private String mysperole;
	private String isMemberOf;
	private String myspeworkspace;
	private String myspeworkspacedepts;
	private String mysphedepts;
	private String myspherole;
	private String mysptiregions;
	private String sonyGHD;
	private String SonyRemoteUserBusinessUnitType;
	private String speaccutracaccess;
	private String speacshome;
	private String speacsproductiona;
	private String speacsproductionavpnremote;
	private String speacsproductionawired;
	private String speacsproductionawireless;
	private String speacsproductionb;
	private String speacsproductionbvpnremote;
	private String speacsproductionbwired;
	private String speacsproductionbwireless;
	private String speacsproductionc;
	private String speacsproductioncvpnremote;
	private String speacsproductioncwired;
	private String speacsproductioncwireless;
	private String speacsproductiond;
	private String speacsproductiondvpnremote;
	private String speacsproductiondwired;
	private String speacsproductiondwireless;
	private String speacsproductione;
	private String speacsproductionevpnremote;
	private String speacsproductionewired;
	private String speacsproductionewireless;
	private String speacsproductionf;
	private String speacsproductionfvpnremote;
	private String speacsproductionfwired;
	private String speacsproductionfwireless;
	private String speacsproductiong;
	private String speacsproductiongvpnremote;
	private String speacsproductiongwired;
	private String speacsproductiongwireless;
	private String speacsproductionh;
	private String speacsproductionhvpnremote;
	private String speacsproductionhwired;
	private String speacsproductionhwireless;
	private String speacsproductioni;
	private String speacsproductionivpnremote;
	private String speacsproductioniwired;
	private String speacsproductioniwireless;
	private String speacsproductionj;
	private String speacsproductionjvpnremote;
	private String speacsproductionjwired;
	private String speacsproductionjwireless;
	private String speacsproductionk;
	private String speacsproductionkvpnremote;
	private String speacsproductionkwired;
	private String speacsproductionkwireless;
	private String speacsproductionl;
	private String speacsproductionlvpnremote;
	private String speacsproductionlwired;
	private String speacsproductionlwireless;
	private String speacsproductionm;
	private String speacsproductionmvpnremote;
	private String speacsproductionmwired;
	private String speacsproductionmwireless;
	private String speacsproductionn;
	private String speacsproductionnvpnremote;
	private String speacsproductionnwired;
	private String speacsproductionnwireless;
	private String spealfrescoaccess;
	private String spealfrescobcaccess;
	private String speAppsPermitted;
	private String speb2baccess;
	private String spebuildingid;
	private String spebusinessunit;
	private String specardinusaccess;
	private String specitrixaccess;
	private String specompanyid;
	private String specostcenter;
	private String specountry;
	private String spedealtrackeraccess;
	private String spedepartmentid;
	private String spedepartmentname;
	private String speDisplayFaxNumber;
	private String speDisplaygivenName;
	private String speDisplaySurname;
	private String speDisplayTelephoneNumber;
	private String spedivision;
	private String spedivisionid;
	private String spedivisionname;
	private String spedominodn;
	private String spedominomaildb;
	private String spedroolsaccess;
	private String spedrozaccess;
	private String speEmpBadgeID;
	private String speEmpBirthDate;
	private String speEmpDataSource;
	private String speEmpFloor;
	private String speEmpFrmCtr;
	private String speEmpHireDate;
	private String speEmpID;
	private String speEmpPwdChg;
	private String speEmpSrvyComp;
	private String speEmpTermDate;
	private String speEmpWorkState;
	private String speGlobalID;
	private String speIDMAccountLocked;
	private String speIDMRegion;
	private String speIDMTerritory;
	private String speidmusertype;
	private String speiptvpackages;
	private String speJoggerA1;
	private String speJoggerA2;
	private String speJoggerQ1;
	private String speJoggerQ2;
	private String speMgrID;
	private String speMobile;
	private String speNativeEmail;
	private String speNativeEmailServer;
	private String speNativeNotesShortName;
	private String spenikuid;
	private String spenotesshortname;
	private String spenovatusaccess;
	private String speOfficeLocation2;
	private String speOfficeLocation3;
	private String speoversightaccess;
	private String spePasswordFlag;
	private String spepeoplefluentaccess;
	private String spePGPRegion;
	private String spePhone;
	private String spepinnumber;
	private String speprodsafetyaccess;
	private String speproductionbackboneaccess;
	private String spepsid;
	private String spepssaccess;
	private String spepwdexprydt;
	private String spepwdplcexmtstatus;
	private String speqcaccess;
	private String speRoomNumber3;
	private String SPERPMAccess;
	private String spesabaaccess;
	private String spesalesbankaccess;
	private String speSecondaryPhone;
	private String spespeedid;
	private String spestoreroomaccess;
	private String spesubdivisionname;
	private String speswiftaccess;
	private String spetestapplicationaccess;
	private String speTrial;
	private String spetrintechaccess;
	private String speVipFlag;
	private String speVPNGroup;
	private String spewdempid;
	private String speworktype;
	private String VPNEnabled;

	/**
	 * @return the uid
	 */
	public synchronized final String getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public synchronized final void setUid(String uid) {
		this.uid = uid;
	}

	

	/**
	 * @return the cn
	 */
	public synchronized final String getCn() {
		return cn;
	}

	/**
	 * @param cn
	 *            the cn to set
	 */
	public synchronized final void setCn(String cn) {
		this.cn = cn;
	}

	/**
	 * @return the sn
	 */
	public synchronized final String getSn() {
		return sn;
	}

	/**
	 * @param sn
	 *            the sn to set
	 */
	public synchronized final void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * @return the userPassword
	 */
	public synchronized final String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword
	 *            the userPassword to set
	 */
	public synchronized final void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the postalAddress
	 */
	public synchronized final String getPostalAddress() {
		return postalAddress;
	}

	/**
	 * @param postalAddress
	 *            the postalAddress to set
	 */
	public synchronized final void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	/**
	 * @return the telephoneNumber
	 */
	public synchronized final String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * @param telephoneNumber
	 *            the telephoneNumber to set
	 */
	public synchronized final void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getSpeassistantemail() {
		return speassistantemail;
	}

	public void setSpeassistantemail(String speassistantemail) {
		this.speassistantemail = speassistantemail;
	}

	public String getSpemobile2() {
		return spemobile2;
	}

	public void setSpemobile2(String spemobile2) {
		this.spemobile2 = spemobile2;
	}

	public String getSpeOfficeFax() {
		return speOfficeFax;
	}

	public void setSpeOfficeFax(String speOfficeFax) {
		this.speOfficeFax = speOfficeFax;
	}

	public String getSpeHomeFax() {
		return speHomeFax;
	}

	public void setSpeHomeFax(String speHomeFax) {
		this.speHomeFax = speHomeFax;
	}

	public String getSpeHomePhone() {
		return speHomePhone;
	}

	public void setSpeHomePhone(String speHomePhone) {
		this.speHomePhone = speHomePhone;
	}

	public String getSpeonenetflag() {
		return speonenetflag;
	}

	public void setSpeonenetflag(String speonenetflag) {
		this.speonenetflag = speonenetflag;
	}

	public String getSpeb2brestrictaccess() {
		return speb2brestrictaccess;
	}

	public void setSpeb2brestrictaccess(String speb2brestrictaccess) {
		this.speb2brestrictaccess = speb2brestrictaccess;
	}

	public String getSpeuserPrincipalName() {
		return speuserPrincipalName;
	}

	public void setSpeuserPrincipalName(String speuserPrincipalName) {
		this.speuserPrincipalName = speuserPrincipalName;
	}

	public String getSpepwpolicyflag() {
		return spepwpolicyflag;
	}

	public void setSpepwpolicyflag(String spepwpolicyflag) {
		this.spepwpolicyflag = spepwpolicyflag;
	}

	public String getSpedicersonyaccess() {
		return spedicersonyaccess;
	}

	public void setSpedicersonyaccess(String spedicersonyaccess) {
		this.spedicersonyaccess = spedicersonyaccess;
	}

	public String getSpeprimarybusinesspartner() {
		return speprimarybusinesspartner;
	}

	public void setSpeprimarybusinesspartner(String speprimarybusinesspartner) {
		this.speprimarybusinesspartner = speprimarybusinesspartner;
	}

	public String getSpepawsaccess() {
		return spepawsaccess;
	}

	public void setSpepawsaccess(String spepawsaccess) {
		this.spepawsaccess = spepawsaccess;
	}

	public String getSpebebanjoid() {
		return spebebanjoid;
	}

	public void setSpebebanjoid(String spebebanjoid) {
		this.spebebanjoid = spebebanjoid;
	}

	public String getSpebirthome() {
		return spebirthome;
	}

	public void setSpebirthome(String spebirthome) {
		this.spebirthome = spebirthome;
	}

	public String getSpebirtaccess() {
		return spebirtaccess;
	}

	public void setSpebirtaccess(String spebirtaccess) {
		this.spebirtaccess = spebirtaccess;
	}

	public String getSpelastdayofwork() {
		return spelastdayofwork;
	}

	public void setSpelastdayofwork(String spelastdayofwork) {
		this.spelastdayofwork = spelastdayofwork;
	}

	public String getSpemedgateaccess() {
		return spemedgateaccess;
	}

	public void setSpemedgateaccess(String spemedgateaccess) {
		this.spemedgateaccess = spemedgateaccess;
	}

	public String getSelfservicepwdchgdate() {
		return selfservicepwdchgdate;
	}

	public void setSelfservicepwdchgdate(String selfservicepwdchgdate) {
		this.selfservicepwdchgdate = selfservicepwdchgdate;
	}

	public String getSpeappdynamicaccess() {
		return speappdynamicaccess;
	}

	public void setSpeappdynamicaccess(String speappdynamicaccess) {
		this.speappdynamicaccess = speappdynamicaccess;
	}

	public String getSpeOnLeaveFlag() {
		return speOnLeaveFlag;
	}

	public void setSpeOnLeaveFlag(String speOnLeaveFlag) {
		this.speOnLeaveFlag = speOnLeaveFlag;
	}

	public String getSpeiiqadminaccess() {
		return speiiqadminaccess;
	}

	public void setSpeiiqadminaccess(String speiiqadminaccess) {
		this.speiiqadminaccess = speiiqadminaccess;
	}

	public String getSpewpfaccess() {
		return spewpfaccess;
	}

	public void setSpewpfaccess(String spewpfaccess) {
		this.spewpfaccess = spewpfaccess;
	}

	public String getSpespheconnectaccess() {
		return spespheconnectaccess;
	}

	public void setSpespheconnectaccess(String spespheconnectaccess) {
		this.spespheconnectaccess = spespheconnectaccess;
	}

	public String getSpespecialeventsaccess() {
		return spespecialeventsaccess;
	}

	public void setSpespecialeventsaccess(String spespecialeventsaccess) {
		this.spespecialeventsaccess = spespecialeventsaccess;
	}

	public String getSpec2access() {
		return spec2access;
	}

	public void setSpec2access(String spec2access) {
		this.spec2access = spec2access;
	}

	public String getSpediceraccess() {
		return spediceraccess;
	}

	public void setSpediceraccess(String spediceraccess) {
		this.spediceraccess = spediceraccess;
	}

	public String getSpewebmethodsaccess() {
		return spewebmethodsaccess;
	}

	public void setSpewebmethodsaccess(String spewebmethodsaccess) {
		this.spewebmethodsaccess = spewebmethodsaccess;
	}

	public String getSpewptsaccess() {
		return spewptsaccess;
	}

	public void setSpewptsaccess(String spewptsaccess) {
		this.spewptsaccess = spewptsaccess;
	}

	public String getSpebebanjoaccess() {
		return spebebanjoaccess;
	}

	public void setSpebebanjoaccess(String spebebanjoaccess) {
		this.spebebanjoaccess = spebebanjoaccess;
	}

	public String getSpefclaccess() {
		return spefclaccess;
	}

	public void setSpefclaccess(String spefclaccess) {
		this.spefclaccess = spefclaccess;
	}

	public String getSpeappdynamicsaccess() {
		return speappdynamicsaccess;
	}

	public void setSpeappdynamicsaccess(String speappdynamicsaccess) {
		this.speappdynamicsaccess = speappdynamicsaccess;
	}

	public String getSpezlarchive2faaccess() {
		return spezlarchive2faaccess;
	}

	public void setSpezlarchive2faaccess(String spezlarchive2faaccess) {
		this.spezlarchive2faaccess = spezlarchive2faaccess;
	}

	public String getSpeviasataccess() {
		return speviasataccess;
	}

	public void setSpeviasataccess(String speviasataccess) {
		this.speviasataccess = speviasataccess;
	}

	public String getSpepercussionaccess() {
		return spepercussionaccess;
	}

	public void setSpepercussionaccess(String spepercussionaccess) {
		this.spepercussionaccess = spepercussionaccess;
	}

	public String getSpesouacceptance() {
		return spesouacceptance;
	}

	public void setSpesouacceptance(String spesouacceptance) {
		this.spesouacceptance = spesouacceptance;
	}

	public String getSPE2FATokenClass() {
		return SPE2FATokenClass;
	}

	public void setSPE2FATokenClass(String sPE2FATokenClass) {
		SPE2FATokenClass = sPE2FATokenClass;
	}

	public String getSpe2faoathotp() {
		return spe2faoathotp;
	}

	public void setSpe2faoathotp(String spe2faoathotp) {
		this.spe2faoathotp = spe2faoathotp;
	}

	public String getSpe2faoathseed() {
		return spe2faoathseed;
	}

	public void setSpe2faoathseed(String spe2faoathseed) {
		this.spe2faoathseed = spe2faoathseed;
	}

	public String getSpehightailaccess() {
		return spehightailaccess;
	}

	public void setSpehightailaccess(String spehightailaccess) {
		this.spehightailaccess = spehightailaccess;
	}

	public String getSpedrmaccess() {
		return spedrmaccess;
	}

	public void setSpedrmaccess(String spedrmaccess) {
		this.spedrmaccess = spedrmaccess;
	}

	public String getSpegnetaccess() {
		return spegnetaccess;
	}

	public void setSpegnetaccess(String spegnetaccess) {
		this.spegnetaccess = spegnetaccess;
	}

	public String getSpeorganizationlevel() {
		return speorganizationlevel;
	}

	public void setSpeorganizationlevel(String speorganizationlevel) {
		this.speorganizationlevel = speorganizationlevel;
	}

	public String getSpeMgrDn() {
		return speMgrDn;
	}

	public void setSpeMgrDn(String speMgrDn) {
		this.speMgrDn = speMgrDn;
	}

	public String getSpeMgmtLevel() {
		return speMgmtLevel;
	}

	public void setSpeMgmtLevel(String speMgmtLevel) {
		this.speMgmtLevel = speMgmtLevel;
	}

	public String getSpeEndDate() {
		return speEndDate;
	}

	public void setSpeEndDate(String speEndDate) {
		this.speEndDate = speEndDate;
	}

	public String getSpeTerminationDate() {
		return speTerminationDate;
	}

	public void setSpeTerminationDate(String speTerminationDate) {
		this.speTerminationDate = speTerminationDate;
	}

	public String getSpeairlinesaccess() {
		return speairlinesaccess;
	}

	public void setSpeairlinesaccess(String speairlinesaccess) {
		this.speairlinesaccess = speairlinesaccess;
	}

	public String getSpedesignstudioaccess() {
		return spedesignstudioaccess;
	}

	public void setSpedesignstudioaccess(String spedesignstudioaccess) {
		this.spedesignstudioaccess = spedesignstudioaccess;
	}

	public String getSperepetoryaccess() {
		return sperepetoryaccess;
	}

	public void setSperepetoryaccess(String sperepetoryaccess) {
		this.sperepetoryaccess = sperepetoryaccess;
	}

	public String getSpedmcmaccess() {
		return spedmcmaccess;
	}

	public void setSpedmcmaccess(String spedmcmaccess) {
		this.spedmcmaccess = spedmcmaccess;
	}

	public String getSpeinflightaccess() {
		return speinflightaccess;
	}

	public void setSpeinflightaccess(String speinflightaccess) {
		this.speinflightaccess = speinflightaccess;
	}

	public String getIstempassword() {
		return Istempassword;
	}

	public void setIstempassword(String istempassword) {
		Istempassword = istempassword;
	}

	public String getSpemediacenteraccess() {
		return spemediacenteraccess;
	}

	public void setSpemediacenteraccess(String spemediacenteraccess) {
		this.spemediacenteraccess = spemediacenteraccess;
	}

	public String getSpeodinaccess() {
		return speodinaccess;
	}

	public void setSpeodinaccess(String speodinaccess) {
		this.speodinaccess = speodinaccess;
	}

	public String getSpealfrescocontenttype() {
		return spealfrescocontenttype;
	}

	public void setSpealfrescocontenttype(String spealfrescocontenttype) {
		this.spealfrescocontenttype = spealfrescocontenttype;
	}

	public String getSpecimsaccess() {
		return specimsaccess;
	}

	public void setSpecimsaccess(String specimsaccess) {
		this.specimsaccess = specimsaccess;
	}

	public String getSpeparisaccess() {
		return speparisaccess;
	}

	public void setSpeparisaccess(String speparisaccess) {
		this.speparisaccess = speparisaccess;
	}

	public String getSpetableausite() {
		return spetableausite;
	}

	public void setSpetableausite(String spetableausite) {
		this.spetableausite = spetableausite;
	}

	public String getSpepinnacleaccess() {
		return spepinnacleaccess;
	}

	public void setSpepinnacleaccess(String spepinnacleaccess) {
		this.spepinnacleaccess = spepinnacleaccess;
	}

	public String getSpetableauaccess() {
		return spetableauaccess;
	}

	public void setSpetableauaccess(String spetableauaccess) {
		this.spetableauaccess = spetableauaccess;
	}

	public String getSpenetworkfileconverteraccess() {
		return spenetworkfileconverteraccess;
	}

	public void setSpenetworkfileconverteraccess(
			String spenetworkfileconverteraccess) {
		this.spenetworkfileconverteraccess = spenetworkfileconverteraccess;
	}

	public String getSpehorizonwebappaccess() {
		return spehorizonwebappaccess;
	}

	public void setSpehorizonwebappaccess(String spehorizonwebappaccess) {
		this.spehorizonwebappaccess = spehorizonwebappaccess;
	}

	public String getSpeInterplanaccess() {
		return speInterplanaccess;
	}

	public void setSpeInterplanaccess(String speInterplanaccess) {
		this.speInterplanaccess = speInterplanaccess;
	}

	public String getSpeprivacyacknowledge() {
		return speprivacyacknowledge;
	}

	public void setSpeprivacyacknowledge(String speprivacyacknowledge) {
		this.speprivacyacknowledge = speprivacyacknowledge;
	}

	public String getSpeoversightapaccess() {
		return speoversightapaccess;
	}

	public void setSpeoversightapaccess(String speoversightapaccess) {
		this.speoversightapaccess = speoversightapaccess;
	}

	public String getSpeSystemID() {
		return speSystemID;
	}

	public void setSpeSystemID(String speSystemID) {
		this.speSystemID = speSystemID;
	}

	public String getSpeInternationalPhone() {
		return speInternationalPhone;
	}

	public void setSpeInternationalPhone(String speInternationalPhone) {
		this.speInternationalPhone = speInternationalPhone;
	}

	public String getSpepotrackeraccess() {
		return spepotrackeraccess;
	}

	public void setSpepotrackeraccess(String spepotrackeraccess) {
		this.spepotrackeraccess = spepotrackeraccess;
	}

	public String getSpesspaccessed() {
		return spesspaccessed;
	}

	public void setSpesspaccessed(String spesspaccessed) {
		this.spesspaccessed = spesspaccessed;
	}

	public String getSpesspeverbridge() {
		return spesspeverbridge;
	}

	public void setSpesspeverbridge(String spesspeverbridge) {
		this.spesspeverbridge = spesspeverbridge;
	}

	public String getPrivacypolicyacceptedon() {
		return privacypolicyacceptedon;
	}

	public void setPrivacypolicyacceptedon(String privacypolicyacceptedon) {
		this.privacypolicyacceptedon = privacypolicyacceptedon;
	}

	public String getSpeediscoverycustodianaccess() {
		return speediscoverycustodianaccess;
	}

	public void setSpeediscoverycustodianaccess(
			String speediscoverycustodianaccess) {
		this.speediscoverycustodianaccess = speediscoverycustodianaccess;
	}

	public String getSpeworkdaysitecode() {
		return speworkdaysitecode;
	}

	public void setSpeworkdaysitecode(String speworkdaysitecode) {
		this.speworkdaysitecode = speworkdaysitecode;
	}

	public String getGenerationQualifier() {
		return generationQualifier;
	}

	public void setGenerationQualifier(String generationQualifier) {
		this.generationQualifier = generationQualifier;
	}

	public String getLobindicator() {
		return lobindicator;
	}

	public void setLobindicator(String lobindicator) {
		this.lobindicator = lobindicator;
	}

	public String getSpesubdivisionid() {
		return spesubdivisionid;
	}

	public void setSpesubdivisionid(String spesubdivisionid) {
		this.spesubdivisionid = spesubdivisionid;
	}

	public String getSpebusinessunitid() {
		return spebusinessunitid;
	}

	public void setSpebusinessunitid(String spebusinessunitid) {
		this.spebusinessunitid = spebusinessunitid;
	}

	public String getSpebusinessunitname() {
		return spebusinessunitname;
	}

	public void setSpebusinessunitname(String spebusinessunitname) {
		this.spebusinessunitname = spebusinessunitname;
	}

	public String getSpePGPPolicy() {
		return spePGPPolicy;
	}

	public void setSpePGPPolicy(String spePGPPolicy) {
		this.spePGPPolicy = spePGPPolicy;
	}

	public String getSpepwdplcexmtsts() {
		return spepwdplcexmtsts;
	}

	public void setSpepwdplcexmtsts(String spepwdplcexmtsts) {
		this.spepwdplcexmtsts = spepwdplcexmtsts;
	}

	public String getSpeasvaccess() {
		return speasvaccess;
	}

	public void setSpeasvaccess(String speasvaccess) {
		this.speasvaccess = speasvaccess;
	}

	public String getSpeintegrifyaccess() {
		return speintegrifyaccess;
	}

	public void setSpeintegrifyaccess(String speintegrifyaccess) {
		this.speintegrifyaccess = speintegrifyaccess;
	}

	public String getSPTResearchAdminAccess() {
		return SPTResearchAdminAccess;
	}

	public void setSPTResearchAdminAccess(String sPTResearchAdminAccess) {
		SPTResearchAdminAccess = sPTResearchAdminAccess;
	}

	public String getSpe2faPhone1Type() {
		return spe2faPhone1Type;
	}

	public void setSpe2faPhone1Type(String spe2faPhone1Type) {
		this.spe2faPhone1Type = spe2faPhone1Type;
	}

	public String getSpe2faPhone2Type() {
		return spe2faPhone2Type;
	}

	public void setSpe2faPhone2Type(String spe2faPhone2Type) {
		this.spe2faPhone2Type = spe2faPhone2Type;
	}

	public String getSpe2faPhone1() {
		return spe2faPhone1;
	}

	public void setSpe2faPhone1(String spe2faPhone1) {
		this.spe2faPhone1 = spe2faPhone1;
	}

	public String getSpe2faPhone1SMS() {
		return spe2faPhone1SMS;
	}

	public void setSpe2faPhone1SMS(String spe2faPhone1SMS) {
		this.spe2faPhone1SMS = spe2faPhone1SMS;
	}

	public String getSpe2faPhone1Email() {
		return spe2faPhone1Email;
	}

	public void setSpe2faPhone1Email(String spe2faPhone1Email) {
		this.spe2faPhone1Email = spe2faPhone1Email;
	}

	public String getSpe2faPhone2() {
		return spe2faPhone2;
	}

	public void setSpe2faPhone2(String spe2faPhone2) {
		this.spe2faPhone2 = spe2faPhone2;
	}

	public String getSpe2faPhone2SMS() {
		return spe2faPhone2SMS;
	}

	public void setSpe2faPhone2SMS(String spe2faPhone2SMS) {
		this.spe2faPhone2SMS = spe2faPhone2SMS;
	}

	public String getSpe2faPhone2Email() {
		return spe2faPhone2Email;
	}

	public void setSpe2faPhone2Email(String spe2faPhone2Email) {
		this.spe2faPhone2Email = spe2faPhone2Email;
	}

	public String getSpe2faPhone3() {
		return spe2faPhone3;
	}

	public void setSpe2faPhone3(String spe2faPhone3) {
		this.spe2faPhone3 = spe2faPhone3;
	}

	public String getSpe2faPhone3SMS() {
		return spe2faPhone3SMS;
	}

	public void setSpe2faPhone3SMS(String spe2faPhone3SMS) {
		this.spe2faPhone3SMS = spe2faPhone3SMS;
	}

	public String getSpe2faPhone3Email() {
		return spe2faPhone3Email;
	}

	public void setSpe2faPhone3Email(String spe2faPhone3Email) {
		this.spe2faPhone3Email = spe2faPhone3Email;
	}

	public String getSpespticomaccess() {
		return spespticomaccess;
	}

	public void setSpespticomaccess(String spespticomaccess) {
		this.spespticomaccess = spespticomaccess;
	}

	public String getSpenetgainaccess() {
		return spenetgainaccess;
	}

	public void setSpenetgainaccess(String spenetgainaccess) {
		this.spenetgainaccess = spenetgainaccess;
	}

	public String getSpeevmiaccess() {
		return speevmiaccess;
	}

	public void setSpeevmiaccess(String speevmiaccess) {
		this.speevmiaccess = speevmiaccess;
	}

	public String getSpedealpointaccess() {
		return spedealpointaccess;
	}

	public void setSpedealpointaccess(String spedealpointaccess) {
		this.spedealpointaccess = spedealpointaccess;
	}

	public String getSpecreativenetworksaccess() {
		return specreativenetworksaccess;
	}

	public void setSpecreativenetworksaccess(String specreativenetworksaccess) {
		this.specreativenetworksaccess = specreativenetworksaccess;
	}

	public String getSpe2faeagl() {
		return spe2faeagl;
	}

	public void setSpe2faeagl(String spe2faeagl) {
		this.spe2faeagl = spe2faeagl;
	}

	public String getSpeScryAccess() {
		return speScryAccess;
	}

	public void setSpeScryAccess(String speScryAccess) {
		this.speScryAccess = speScryAccess;
	}

	public String getSpeBusinessObjectsGroup() {
		return speBusinessObjectsGroup;
	}

	public void setSpeBusinessObjectsGroup(String speBusinessObjectsGroup) {
		this.speBusinessObjectsGroup = speBusinessObjectsGroup;
	}

	public String getSpeBusinessObjectsAccess() {
		return speBusinessObjectsAccess;
	}

	public void setSpeBusinessObjectsAccess(String speBusinessObjectsAccess) {
		this.speBusinessObjectsAccess = speBusinessObjectsAccess;
	}

	public String getSpePRISMAccess() {
		return spePRISMAccess;
	}

	public void setSpePRISMAccess(String spePRISMAccess) {
		this.spePRISMAccess = spePRISMAccess;
	}

	public String getSpeexecutivedirectoryadmin() {
		return speexecutivedirectoryadmin;
	}

	public void setSpeexecutivedirectoryadmin(String speexecutivedirectoryadmin) {
		this.speexecutivedirectoryadmin = speexecutivedirectoryadmin;
	}

	public String getSpeexecutivedirectoryuser() {
		return speexecutivedirectoryuser;
	}

	public void setSpeexecutivedirectoryuser(String speexecutivedirectoryuser) {
		this.speexecutivedirectoryuser = speexecutivedirectoryuser;
	}

	public String getSpeebrelaccess() {
		return speebrelaccess;
	}

	public void setSpeebrelaccess(String speebrelaccess) {
		this.speebrelaccess = speebrelaccess;
	}

	public String getSpedartsroles() {
		return spedartsroles;
	}

	public void setSpedartsroles(String spedartsroles) {
		this.spedartsroles = spedartsroles;
	}

	public String getMyspeaccess() {
		return myspeaccess;
	}

	public void setMyspeaccess(String myspeaccess) {
		this.myspeaccess = myspeaccess;
	}

	public String getMyspedepts() {
		return myspedepts;
	}

	public void setMyspedepts(String myspedepts) {
		this.myspedepts = myspedepts;
	}

	public String getMyspeemail() {
		return myspeemail;
	}

	public void setMyspeemail(String myspeemail) {
		this.myspeemail = myspeemail;
	}

	public String getMysperole() {
		return mysperole;
	}

	public void setMysperole(String mysperole) {
		this.mysperole = mysperole;
	}

	public String getIsMemberOf() {
		return isMemberOf;
	}

	public void setIsMemberOf(String isMemberOf) {
		this.isMemberOf = isMemberOf;
	}

	public String getMyspeworkspace() {
		return myspeworkspace;
	}

	public void setMyspeworkspace(String myspeworkspace) {
		this.myspeworkspace = myspeworkspace;
	}

	public String getMyspeworkspacedepts() {
		return myspeworkspacedepts;
	}

	public void setMyspeworkspacedepts(String myspeworkspacedepts) {
		this.myspeworkspacedepts = myspeworkspacedepts;
	}

	public String getMysphedepts() {
		return mysphedepts;
	}

	public void setMysphedepts(String mysphedepts) {
		this.mysphedepts = mysphedepts;
	}

	public String getMyspherole() {
		return myspherole;
	}

	public void setMyspherole(String myspherole) {
		this.myspherole = myspherole;
	}

	public String getMysptiregions() {
		return mysptiregions;
	}

	public void setMysptiregions(String mysptiregions) {
		this.mysptiregions = mysptiregions;
	}

	public String getSonyGHD() {
		return sonyGHD;
	}

	public void setSonyGHD(String sonyGHD) {
		this.sonyGHD = sonyGHD;
	}

	public String getSonyRemoteUserBusinessUnitType() {
		return SonyRemoteUserBusinessUnitType;
	}

	public void setSonyRemoteUserBusinessUnitType(
			String sonyRemoteUserBusinessUnitType) {
		SonyRemoteUserBusinessUnitType = sonyRemoteUserBusinessUnitType;
	}

	public String getSpeaccutracaccess() {
		return speaccutracaccess;
	}

	public void setSpeaccutracaccess(String speaccutracaccess) {
		this.speaccutracaccess = speaccutracaccess;
	}

	public String getSpeacshome() {
		return speacshome;
	}

	public void setSpeacshome(String speacshome) {
		this.speacshome = speacshome;
	}

	public String getSpeacsproductiona() {
		return speacsproductiona;
	}

	public void setSpeacsproductiona(String speacsproductiona) {
		this.speacsproductiona = speacsproductiona;
	}

	public String getSpeacsproductionavpnremote() {
		return speacsproductionavpnremote;
	}

	public void setSpeacsproductionavpnremote(String speacsproductionavpnremote) {
		this.speacsproductionavpnremote = speacsproductionavpnremote;
	}

	public String getSpeacsproductionawired() {
		return speacsproductionawired;
	}

	public void setSpeacsproductionawired(String speacsproductionawired) {
		this.speacsproductionawired = speacsproductionawired;
	}

	public String getSpeacsproductionawireless() {
		return speacsproductionawireless;
	}

	public void setSpeacsproductionawireless(String speacsproductionawireless) {
		this.speacsproductionawireless = speacsproductionawireless;
	}

	public String getSpeacsproductionb() {
		return speacsproductionb;
	}

	public void setSpeacsproductionb(String speacsproductionb) {
		this.speacsproductionb = speacsproductionb;
	}

	public String getSpeacsproductionbvpnremote() {
		return speacsproductionbvpnremote;
	}

	public void setSpeacsproductionbvpnremote(String speacsproductionbvpnremote) {
		this.speacsproductionbvpnremote = speacsproductionbvpnremote;
	}

	public String getSpeacsproductionbwired() {
		return speacsproductionbwired;
	}

	public void setSpeacsproductionbwired(String speacsproductionbwired) {
		this.speacsproductionbwired = speacsproductionbwired;
	}

	public String getSpeacsproductionbwireless() {
		return speacsproductionbwireless;
	}

	public void setSpeacsproductionbwireless(String speacsproductionbwireless) {
		this.speacsproductionbwireless = speacsproductionbwireless;
	}

	public String getSpeacsproductionc() {
		return speacsproductionc;
	}

	public void setSpeacsproductionc(String speacsproductionc) {
		this.speacsproductionc = speacsproductionc;
	}

	public String getSpeacsproductioncvpnremote() {
		return speacsproductioncvpnremote;
	}

	public void setSpeacsproductioncvpnremote(String speacsproductioncvpnremote) {
		this.speacsproductioncvpnremote = speacsproductioncvpnremote;
	}

	public String getSpeacsproductioncwired() {
		return speacsproductioncwired;
	}

	public void setSpeacsproductioncwired(String speacsproductioncwired) {
		this.speacsproductioncwired = speacsproductioncwired;
	}

	public String getSpeacsproductioncwireless() {
		return speacsproductioncwireless;
	}

	public void setSpeacsproductioncwireless(String speacsproductioncwireless) {
		this.speacsproductioncwireless = speacsproductioncwireless;
	}

	public String getSpeacsproductiond() {
		return speacsproductiond;
	}

	public void setSpeacsproductiond(String speacsproductiond) {
		this.speacsproductiond = speacsproductiond;
	}

	public String getSpeacsproductiondvpnremote() {
		return speacsproductiondvpnremote;
	}

	public void setSpeacsproductiondvpnremote(String speacsproductiondvpnremote) {
		this.speacsproductiondvpnremote = speacsproductiondvpnremote;
	}

	public String getSpeacsproductiondwired() {
		return speacsproductiondwired;
	}

	public void setSpeacsproductiondwired(String speacsproductiondwired) {
		this.speacsproductiondwired = speacsproductiondwired;
	}

	public String getSpeacsproductiondwireless() {
		return speacsproductiondwireless;
	}

	public void setSpeacsproductiondwireless(String speacsproductiondwireless) {
		this.speacsproductiondwireless = speacsproductiondwireless;
	}

	public String getSpeacsproductione() {
		return speacsproductione;
	}

	public void setSpeacsproductione(String speacsproductione) {
		this.speacsproductione = speacsproductione;
	}

	public String getSpeacsproductionevpnremote() {
		return speacsproductionevpnremote;
	}

	public void setSpeacsproductionevpnremote(String speacsproductionevpnremote) {
		this.speacsproductionevpnremote = speacsproductionevpnremote;
	}

	public String getSpeacsproductionewired() {
		return speacsproductionewired;
	}

	public void setSpeacsproductionewired(String speacsproductionewired) {
		this.speacsproductionewired = speacsproductionewired;
	}

	public String getSpeacsproductionewireless() {
		return speacsproductionewireless;
	}

	public void setSpeacsproductionewireless(String speacsproductionewireless) {
		this.speacsproductionewireless = speacsproductionewireless;
	}

	public String getSpeacsproductionf() {
		return speacsproductionf;
	}

	public void setSpeacsproductionf(String speacsproductionf) {
		this.speacsproductionf = speacsproductionf;
	}

	public String getSpeacsproductionfvpnremote() {
		return speacsproductionfvpnremote;
	}

	public void setSpeacsproductionfvpnremote(String speacsproductionfvpnremote) {
		this.speacsproductionfvpnremote = speacsproductionfvpnremote;
	}

	public String getSpeacsproductionfwired() {
		return speacsproductionfwired;
	}

	public void setSpeacsproductionfwired(String speacsproductionfwired) {
		this.speacsproductionfwired = speacsproductionfwired;
	}

	public String getSpeacsproductionfwireless() {
		return speacsproductionfwireless;
	}

	public void setSpeacsproductionfwireless(String speacsproductionfwireless) {
		this.speacsproductionfwireless = speacsproductionfwireless;
	}

	public String getSpeacsproductiong() {
		return speacsproductiong;
	}

	public void setSpeacsproductiong(String speacsproductiong) {
		this.speacsproductiong = speacsproductiong;
	}

	public String getSpeacsproductiongvpnremote() {
		return speacsproductiongvpnremote;
	}

	public void setSpeacsproductiongvpnremote(String speacsproductiongvpnremote) {
		this.speacsproductiongvpnremote = speacsproductiongvpnremote;
	}

	public String getSpeacsproductiongwired() {
		return speacsproductiongwired;
	}

	public void setSpeacsproductiongwired(String speacsproductiongwired) {
		this.speacsproductiongwired = speacsproductiongwired;
	}

	public String getSpeacsproductiongwireless() {
		return speacsproductiongwireless;
	}

	public void setSpeacsproductiongwireless(String speacsproductiongwireless) {
		this.speacsproductiongwireless = speacsproductiongwireless;
	}

	public String getSpeacsproductionh() {
		return speacsproductionh;
	}

	public void setSpeacsproductionh(String speacsproductionh) {
		this.speacsproductionh = speacsproductionh;
	}

	public String getSpeacsproductionhvpnremote() {
		return speacsproductionhvpnremote;
	}

	public void setSpeacsproductionhvpnremote(String speacsproductionhvpnremote) {
		this.speacsproductionhvpnremote = speacsproductionhvpnremote;
	}

	public String getSpeacsproductionhwired() {
		return speacsproductionhwired;
	}

	public void setSpeacsproductionhwired(String speacsproductionhwired) {
		this.speacsproductionhwired = speacsproductionhwired;
	}

	public String getSpeacsproductionhwireless() {
		return speacsproductionhwireless;
	}

	public void setSpeacsproductionhwireless(String speacsproductionhwireless) {
		this.speacsproductionhwireless = speacsproductionhwireless;
	}

	public String getSpeacsproductioni() {
		return speacsproductioni;
	}

	public void setSpeacsproductioni(String speacsproductioni) {
		this.speacsproductioni = speacsproductioni;
	}

	public String getSpeacsproductionivpnremote() {
		return speacsproductionivpnremote;
	}

	public void setSpeacsproductionivpnremote(String speacsproductionivpnremote) {
		this.speacsproductionivpnremote = speacsproductionivpnremote;
	}

	public String getSpeacsproductioniwired() {
		return speacsproductioniwired;
	}

	public void setSpeacsproductioniwired(String speacsproductioniwired) {
		this.speacsproductioniwired = speacsproductioniwired;
	}

	public String getSpeacsproductioniwireless() {
		return speacsproductioniwireless;
	}

	public void setSpeacsproductioniwireless(String speacsproductioniwireless) {
		this.speacsproductioniwireless = speacsproductioniwireless;
	}

	public String getSpeacsproductionj() {
		return speacsproductionj;
	}

	public void setSpeacsproductionj(String speacsproductionj) {
		this.speacsproductionj = speacsproductionj;
	}

	public String getSpeacsproductionjvpnremote() {
		return speacsproductionjvpnremote;
	}

	public void setSpeacsproductionjvpnremote(String speacsproductionjvpnremote) {
		this.speacsproductionjvpnremote = speacsproductionjvpnremote;
	}

	public String getSpeacsproductionjwired() {
		return speacsproductionjwired;
	}

	public void setSpeacsproductionjwired(String speacsproductionjwired) {
		this.speacsproductionjwired = speacsproductionjwired;
	}

	public String getSpeacsproductionjwireless() {
		return speacsproductionjwireless;
	}

	public void setSpeacsproductionjwireless(String speacsproductionjwireless) {
		this.speacsproductionjwireless = speacsproductionjwireless;
	}

	public String getSpeacsproductionk() {
		return speacsproductionk;
	}

	public void setSpeacsproductionk(String speacsproductionk) {
		this.speacsproductionk = speacsproductionk;
	}

	public String getSpeacsproductionkvpnremote() {
		return speacsproductionkvpnremote;
	}

	public void setSpeacsproductionkvpnremote(String speacsproductionkvpnremote) {
		this.speacsproductionkvpnremote = speacsproductionkvpnremote;
	}

	public String getSpeacsproductionkwired() {
		return speacsproductionkwired;
	}

	public void setSpeacsproductionkwired(String speacsproductionkwired) {
		this.speacsproductionkwired = speacsproductionkwired;
	}

	public String getSpeacsproductionkwireless() {
		return speacsproductionkwireless;
	}

	public void setSpeacsproductionkwireless(String speacsproductionkwireless) {
		this.speacsproductionkwireless = speacsproductionkwireless;
	}

	public String getSpeacsproductionl() {
		return speacsproductionl;
	}

	public void setSpeacsproductionl(String speacsproductionl) {
		this.speacsproductionl = speacsproductionl;
	}

	public String getSpeacsproductionlvpnremote() {
		return speacsproductionlvpnremote;
	}

	public void setSpeacsproductionlvpnremote(String speacsproductionlvpnremote) {
		this.speacsproductionlvpnremote = speacsproductionlvpnremote;
	}

	public String getSpeacsproductionlwired() {
		return speacsproductionlwired;
	}

	public void setSpeacsproductionlwired(String speacsproductionlwired) {
		this.speacsproductionlwired = speacsproductionlwired;
	}

	public String getSpeacsproductionlwireless() {
		return speacsproductionlwireless;
	}

	public void setSpeacsproductionlwireless(String speacsproductionlwireless) {
		this.speacsproductionlwireless = speacsproductionlwireless;
	}

	public String getSpeacsproductionm() {
		return speacsproductionm;
	}

	public void setSpeacsproductionm(String speacsproductionm) {
		this.speacsproductionm = speacsproductionm;
	}

	public String getSpeacsproductionmvpnremote() {
		return speacsproductionmvpnremote;
	}

	public void setSpeacsproductionmvpnremote(String speacsproductionmvpnremote) {
		this.speacsproductionmvpnremote = speacsproductionmvpnremote;
	}

	public String getSpeacsproductionmwired() {
		return speacsproductionmwired;
	}

	public void setSpeacsproductionmwired(String speacsproductionmwired) {
		this.speacsproductionmwired = speacsproductionmwired;
	}

	public String getSpeacsproductionmwireless() {
		return speacsproductionmwireless;
	}

	public void setSpeacsproductionmwireless(String speacsproductionmwireless) {
		this.speacsproductionmwireless = speacsproductionmwireless;
	}

	public String getSpeacsproductionn() {
		return speacsproductionn;
	}

	public void setSpeacsproductionn(String speacsproductionn) {
		this.speacsproductionn = speacsproductionn;
	}

	public String getSpeacsproductionnvpnremote() {
		return speacsproductionnvpnremote;
	}

	public void setSpeacsproductionnvpnremote(String speacsproductionnvpnremote) {
		this.speacsproductionnvpnremote = speacsproductionnvpnremote;
	}

	public String getSpeacsproductionnwired() {
		return speacsproductionnwired;
	}

	public void setSpeacsproductionnwired(String speacsproductionnwired) {
		this.speacsproductionnwired = speacsproductionnwired;
	}

	public String getSpeacsproductionnwireless() {
		return speacsproductionnwireless;
	}

	public void setSpeacsproductionnwireless(String speacsproductionnwireless) {
		this.speacsproductionnwireless = speacsproductionnwireless;
	}

	public String getSpealfrescoaccess() {
		return spealfrescoaccess;
	}

	public void setSpealfrescoaccess(String spealfrescoaccess) {
		this.spealfrescoaccess = spealfrescoaccess;
	}

	public String getSpealfrescobcaccess() {
		return spealfrescobcaccess;
	}

	public void setSpealfrescobcaccess(String spealfrescobcaccess) {
		this.spealfrescobcaccess = spealfrescobcaccess;
	}

	public String getSpeAppsPermitted() {
		return speAppsPermitted;
	}

	public void setSpeAppsPermitted(String speAppsPermitted) {
		this.speAppsPermitted = speAppsPermitted;
	}

	public String getSpeb2baccess() {
		return speb2baccess;
	}

	public void setSpeb2baccess(String speb2baccess) {
		this.speb2baccess = speb2baccess;
	}

	public String getSpebuildingid() {
		return spebuildingid;
	}

	public void setSpebuildingid(String spebuildingid) {
		this.spebuildingid = spebuildingid;
	}

	public String getSpebusinessunit() {
		return spebusinessunit;
	}

	public void setSpebusinessunit(String spebusinessunit) {
		this.spebusinessunit = spebusinessunit;
	}

	public String getSpecardinusaccess() {
		return specardinusaccess;
	}

	public void setSpecardinusaccess(String specardinusaccess) {
		this.specardinusaccess = specardinusaccess;
	}

	public String getSpecitrixaccess() {
		return specitrixaccess;
	}

	public void setSpecitrixaccess(String specitrixaccess) {
		this.specitrixaccess = specitrixaccess;
	}

	public String getSpecompanyid() {
		return specompanyid;
	}

	public void setSpecompanyid(String specompanyid) {
		this.specompanyid = specompanyid;
	}

	public String getSpecostcenter() {
		return specostcenter;
	}

	public void setSpecostcenter(String specostcenter) {
		this.specostcenter = specostcenter;
	}

	public String getSpecountry() {
		return specountry;
	}

	public void setSpecountry(String specountry) {
		this.specountry = specountry;
	}

	public String getSpedealtrackeraccess() {
		return spedealtrackeraccess;
	}

	public void setSpedealtrackeraccess(String spedealtrackeraccess) {
		this.spedealtrackeraccess = spedealtrackeraccess;
	}

	public String getSpedepartmentid() {
		return spedepartmentid;
	}

	public void setSpedepartmentid(String spedepartmentid) {
		this.spedepartmentid = spedepartmentid;
	}

	public String getSpedepartmentname() {
		return spedepartmentname;
	}

	public void setSpedepartmentname(String spedepartmentname) {
		this.spedepartmentname = spedepartmentname;
	}

	public String getSpeDisplayFaxNumber() {
		return speDisplayFaxNumber;
	}

	public void setSpeDisplayFaxNumber(String speDisplayFaxNumber) {
		this.speDisplayFaxNumber = speDisplayFaxNumber;
	}

	public String getSpeDisplaygivenName() {
		return speDisplaygivenName;
	}

	public void setSpeDisplaygivenName(String speDisplaygivenName) {
		this.speDisplaygivenName = speDisplaygivenName;
	}

	public String getSpeDisplaySurname() {
		return speDisplaySurname;
	}

	public void setSpeDisplaySurname(String speDisplaySurname) {
		this.speDisplaySurname = speDisplaySurname;
	}

	public String getSpeDisplayTelephoneNumber() {
		return speDisplayTelephoneNumber;
	}

	public void setSpeDisplayTelephoneNumber(String speDisplayTelephoneNumber) {
		this.speDisplayTelephoneNumber = speDisplayTelephoneNumber;
	}

	public String getSpedivision() {
		return spedivision;
	}

	public void setSpedivision(String spedivision) {
		this.spedivision = spedivision;
	}

	public String getSpedivisionid() {
		return spedivisionid;
	}

	public void setSpedivisionid(String spedivisionid) {
		this.spedivisionid = spedivisionid;
	}

	public String getSpedivisionname() {
		return spedivisionname;
	}

	public void setSpedivisionname(String spedivisionname) {
		this.spedivisionname = spedivisionname;
	}

	public String getSpedominodn() {
		return spedominodn;
	}

	public void setSpedominodn(String spedominodn) {
		this.spedominodn = spedominodn;
	}

	public String getSpedominomaildb() {
		return spedominomaildb;
	}

	public void setSpedominomaildb(String spedominomaildb) {
		this.spedominomaildb = spedominomaildb;
	}

	public String getSpedroolsaccess() {
		return spedroolsaccess;
	}

	public void setSpedroolsaccess(String spedroolsaccess) {
		this.spedroolsaccess = spedroolsaccess;
	}

	public String getSpedrozaccess() {
		return spedrozaccess;
	}

	public void setSpedrozaccess(String spedrozaccess) {
		this.spedrozaccess = spedrozaccess;
	}

	public String getSpeEmpBadgeID() {
		return speEmpBadgeID;
	}

	public void setSpeEmpBadgeID(String speEmpBadgeID) {
		this.speEmpBadgeID = speEmpBadgeID;
	}

	public String getSpeEmpBirthDate() {
		return speEmpBirthDate;
	}

	public void setSpeEmpBirthDate(String speEmpBirthDate) {
		this.speEmpBirthDate = speEmpBirthDate;
	}

	public String getSpeEmpDataSource() {
		return speEmpDataSource;
	}

	public void setSpeEmpDataSource(String speEmpDataSource) {
		this.speEmpDataSource = speEmpDataSource;
	}

	public String getSpeEmpFloor() {
		return speEmpFloor;
	}

	public void setSpeEmpFloor(String speEmpFloor) {
		this.speEmpFloor = speEmpFloor;
	}

	public String getSpeEmpFrmCtr() {
		return speEmpFrmCtr;
	}

	public void setSpeEmpFrmCtr(String speEmpFrmCtr) {
		this.speEmpFrmCtr = speEmpFrmCtr;
	}

	public String getSpeEmpHireDate() {
		return speEmpHireDate;
	}

	public void setSpeEmpHireDate(String speEmpHireDate) {
		this.speEmpHireDate = speEmpHireDate;
	}

	public String getSpeEmpID() {
		return speEmpID;
	}

	public void setSpeEmpID(String speEmpID) {
		this.speEmpID = speEmpID;
	}

	public String getSpeEmpPwdChg() {
		return speEmpPwdChg;
	}

	public void setSpeEmpPwdChg(String speEmpPwdChg) {
		this.speEmpPwdChg = speEmpPwdChg;
	}

	public String getSpeEmpSrvyComp() {
		return speEmpSrvyComp;
	}

	public void setSpeEmpSrvyComp(String speEmpSrvyComp) {
		this.speEmpSrvyComp = speEmpSrvyComp;
	}

	public String getSpeEmpTermDate() {
		return speEmpTermDate;
	}

	public void setSpeEmpTermDate(String speEmpTermDate) {
		this.speEmpTermDate = speEmpTermDate;
	}

	public String getSpeEmpWorkState() {
		return speEmpWorkState;
	}

	public void setSpeEmpWorkState(String speEmpWorkState) {
		this.speEmpWorkState = speEmpWorkState;
	}

	public String getSpeGlobalID() {
		return speGlobalID;
	}

	public void setSpeGlobalID(String speGlobalID) {
		this.speGlobalID = speGlobalID;
	}

	public String getSpeIDMAccountLocked() {
		return speIDMAccountLocked;
	}

	public void setSpeIDMAccountLocked(String speIDMAccountLocked) {
		this.speIDMAccountLocked = speIDMAccountLocked;
	}

	public String getSpeIDMRegion() {
		return speIDMRegion;
	}

	public void setSpeIDMRegion(String speIDMRegion) {
		this.speIDMRegion = speIDMRegion;
	}

	public String getSpeIDMTerritory() {
		return speIDMTerritory;
	}

	public void setSpeIDMTerritory(String speIDMTerritory) {
		this.speIDMTerritory = speIDMTerritory;
	}

	public String getSpeidmusertype() {
		return speidmusertype;
	}

	public void setSpeidmusertype(String speidmusertype) {
		this.speidmusertype = speidmusertype;
	}

	public String getSpeiptvpackages() {
		return speiptvpackages;
	}

	public void setSpeiptvpackages(String speiptvpackages) {
		this.speiptvpackages = speiptvpackages;
	}

	public String getSpeJoggerA1() {
		return speJoggerA1;
	}

	public void setSpeJoggerA1(String speJoggerA1) {
		this.speJoggerA1 = speJoggerA1;
	}

	public String getSpeJoggerA2() {
		return speJoggerA2;
	}

	public void setSpeJoggerA2(String speJoggerA2) {
		this.speJoggerA2 = speJoggerA2;
	}

	public String getSpeJoggerQ1() {
		return speJoggerQ1;
	}

	public void setSpeJoggerQ1(String speJoggerQ1) {
		this.speJoggerQ1 = speJoggerQ1;
	}

	public String getSpeJoggerQ2() {
		return speJoggerQ2;
	}

	public void setSpeJoggerQ2(String speJoggerQ2) {
		this.speJoggerQ2 = speJoggerQ2;
	}

	public String getSpeMgrID() {
		return speMgrID;
	}

	public void setSpeMgrID(String speMgrID) {
		this.speMgrID = speMgrID;
	}

	public String getSpeMobile() {
		return speMobile;
	}

	public void setSpeMobile(String speMobile) {
		this.speMobile = speMobile;
	}

	public String getSpeNativeEmail() {
		return speNativeEmail;
	}

	public void setSpeNativeEmail(String speNativeEmail) {
		this.speNativeEmail = speNativeEmail;
	}

	public String getSpeNativeEmailServer() {
		return speNativeEmailServer;
	}

	public void setSpeNativeEmailServer(String speNativeEmailServer) {
		this.speNativeEmailServer = speNativeEmailServer;
	}

	public String getSpeNativeNotesShortName() {
		return speNativeNotesShortName;
	}

	public void setSpeNativeNotesShortName(String speNativeNotesShortName) {
		this.speNativeNotesShortName = speNativeNotesShortName;
	}

	public String getSpenikuid() {
		return spenikuid;
	}

	public void setSpenikuid(String spenikuid) {
		this.spenikuid = spenikuid;
	}

	public String getSpenotesshortname() {
		return spenotesshortname;
	}

	public void setSpenotesshortname(String spenotesshortname) {
		this.spenotesshortname = spenotesshortname;
	}

	public String getSpenovatusaccess() {
		return spenovatusaccess;
	}

	public void setSpenovatusaccess(String spenovatusaccess) {
		this.spenovatusaccess = spenovatusaccess;
	}

	public String getSpeOfficeLocation2() {
		return speOfficeLocation2;
	}

	public void setSpeOfficeLocation2(String speOfficeLocation2) {
		this.speOfficeLocation2 = speOfficeLocation2;
	}

	public String getSpeOfficeLocation3() {
		return speOfficeLocation3;
	}

	public void setSpeOfficeLocation3(String speOfficeLocation3) {
		this.speOfficeLocation3 = speOfficeLocation3;
	}

	public String getSpeoversightaccess() {
		return speoversightaccess;
	}

	public void setSpeoversightaccess(String speoversightaccess) {
		this.speoversightaccess = speoversightaccess;
	}

	public String getSpePasswordFlag() {
		return spePasswordFlag;
	}

	public void setSpePasswordFlag(String spePasswordFlag) {
		this.spePasswordFlag = spePasswordFlag;
	}

	public String getSpepeoplefluentaccess() {
		return spepeoplefluentaccess;
	}

	public void setSpepeoplefluentaccess(String spepeoplefluentaccess) {
		this.spepeoplefluentaccess = spepeoplefluentaccess;
	}

	public String getSpePGPRegion() {
		return spePGPRegion;
	}

	public void setSpePGPRegion(String spePGPRegion) {
		this.spePGPRegion = spePGPRegion;
	}

	public String getSpePhone() {
		return spePhone;
	}

	public void setSpePhone(String spePhone) {
		this.spePhone = spePhone;
	}

	public String getSpepinnumber() {
		return spepinnumber;
	}

	public void setSpepinnumber(String spepinnumber) {
		this.spepinnumber = spepinnumber;
	}

	public String getSpeprodsafetyaccess() {
		return speprodsafetyaccess;
	}

	public void setSpeprodsafetyaccess(String speprodsafetyaccess) {
		this.speprodsafetyaccess = speprodsafetyaccess;
	}

	public String getSpeproductionbackboneaccess() {
		return speproductionbackboneaccess;
	}

	public void setSpeproductionbackboneaccess(
			String speproductionbackboneaccess) {
		this.speproductionbackboneaccess = speproductionbackboneaccess;
	}

	public String getSpepsid() {
		return spepsid;
	}

	public void setSpepsid(String spepsid) {
		this.spepsid = spepsid;
	}

	public String getSpepssaccess() {
		return spepssaccess;
	}

	public void setSpepssaccess(String spepssaccess) {
		this.spepssaccess = spepssaccess;
	}

	public String getSpepwdexprydt() {
		return spepwdexprydt;
	}

	public void setSpepwdexprydt(String spepwdexprydt) {
		this.spepwdexprydt = spepwdexprydt;
	}

	public String getSpepwdplcexmtstatus() {
		return spepwdplcexmtstatus;
	}

	public void setSpepwdplcexmtstatus(String spepwdplcexmtstatus) {
		this.spepwdplcexmtstatus = spepwdplcexmtstatus;
	}

	public String getSpeqcaccess() {
		return speqcaccess;
	}

	public void setSpeqcaccess(String speqcaccess) {
		this.speqcaccess = speqcaccess;
	}

	public String getSpeRoomNumber3() {
		return speRoomNumber3;
	}

	public void setSpeRoomNumber3(String speRoomNumber3) {
		this.speRoomNumber3 = speRoomNumber3;
	}

	public String getSPERPMAccess() {
		return SPERPMAccess;
	}

	public void setSPERPMAccess(String sPERPMAccess) {
		SPERPMAccess = sPERPMAccess;
	}

	public String getSpesabaaccess() {
		return spesabaaccess;
	}

	public void setSpesabaaccess(String spesabaaccess) {
		this.spesabaaccess = spesabaaccess;
	}

	public String getSpesalesbankaccess() {
		return spesalesbankaccess;
	}

	public void setSpesalesbankaccess(String spesalesbankaccess) {
		this.spesalesbankaccess = spesalesbankaccess;
	}

	public String getSpeSecondaryPhone() {
		return speSecondaryPhone;
	}

	public void setSpeSecondaryPhone(String speSecondaryPhone) {
		this.speSecondaryPhone = speSecondaryPhone;
	}

	public String getSpespeedid() {
		return spespeedid;
	}

	public void setSpespeedid(String spespeedid) {
		this.spespeedid = spespeedid;
	}

	public String getSpestoreroomaccess() {
		return spestoreroomaccess;
	}

	public void setSpestoreroomaccess(String spestoreroomaccess) {
		this.spestoreroomaccess = spestoreroomaccess;
	}

	public String getSpesubdivisionname() {
		return spesubdivisionname;
	}

	public void setSpesubdivisionname(String spesubdivisionname) {
		this.spesubdivisionname = spesubdivisionname;
	}

	public String getSpeswiftaccess() {
		return speswiftaccess;
	}

	public void setSpeswiftaccess(String speswiftaccess) {
		this.speswiftaccess = speswiftaccess;
	}

	public String getSpetestapplicationaccess() {
		return spetestapplicationaccess;
	}

	public void setSpetestapplicationaccess(String spetestapplicationaccess) {
		this.spetestapplicationaccess = spetestapplicationaccess;
	}

	public String getSpeTrial() {
		return speTrial;
	}

	public void setSpeTrial(String speTrial) {
		this.speTrial = speTrial;
	}

	public String getSpetrintechaccess() {
		return spetrintechaccess;
	}

	public void setSpetrintechaccess(String spetrintechaccess) {
		this.spetrintechaccess = spetrintechaccess;
	}

	public String getSpeVipFlag() {
		return speVipFlag;
	}

	public void setSpeVipFlag(String speVipFlag) {
		this.speVipFlag = speVipFlag;
	}

	public String getSpeVPNGroup() {
		return speVPNGroup;
	}

	public void setSpeVPNGroup(String speVPNGroup) {
		this.speVPNGroup = speVPNGroup;
	}

	public String getSpewdempid() {
		return spewdempid;
	}

	public void setSpewdempid(String spewdempid) {
		this.spewdempid = spewdempid;
	}

	public String getSpeworktype() {
		return speworktype;
	}

	public void setSpeworktype(String speworktype) {
		this.speworktype = speworktype;
	}

	public String getVPNEnabled() {
		return VPNEnabled;
	}

	public void setVPNEnabled(String vPNEnabled) {
		VPNEnabled = vPNEnabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [");
		if (uid != null) {
			builder.append("uid=");
			builder.append(uid);
			builder.append(", ");
		}
		
		if (givenName != null) {
			builder.append("givenName=");
			builder.append(givenName);
			builder.append(", ");
		}
		
		if (cn != null) {
			builder.append("cn=");
			builder.append(cn);
			builder.append(", ");
		}
		if (sn != null) {
			builder.append("sn=");
			builder.append(sn);
			builder.append(", ");
		}
		if (userPassword != null) {
			builder.append("userPassword=");
			builder.append(userPassword);
			builder.append(", ");
		}
		if (postalAddress != null) {
			builder.append("postalAddress=");
			builder.append(postalAddress);
			builder.append(", ");
		}
		if (telephoneNumber != null) {
			builder.append("telephoneNumber=");
			builder.append(telephoneNumber);
			builder.append(", ");
		}

		// ADD Extra attributes here
		if (speassistantemail != null) {
			builder.append("speassistantemail=");
			builder.append(speassistantemail);
			builder.append(", ");
		}
		if (spemobile2 != null) {
			builder.append("spemobile2=");
			builder.append("spemobile");
			builder.append(", ");

		}
		if (speOfficeFax != null) {
			builder.append("speOfficeFax=");
			builder.append("speOfficeFax");
			builder.append(", ");

		}

		if (speHomeFax != null) {
			builder.append("speHomeFax=");
			builder.append("speHomeFax");
			builder.append(", ");

		}
		if (speHomePhone != null) {
			builder.append("speHomePhone=");
			builder.append("speHomePhone");
			builder.append(", ");

		}
		if (speonenetflag != null) {
			builder.append("speonenetflag=");
			builder.append("speonenetflag");
			builder.append(", ");

		}
		if (speb2brestrictaccess != null) {
			builder.append("speb2brestrictaccess=");
			builder.append("speb2brestrictaccess");
			builder.append(", ");

		}
		if (speuserPrincipalName != null) {
			builder.append("speuserPrincipalName=");
			builder.append("speuserPrincipalName");
			builder.append(", ");

		}
		if (spepwpolicyflag != null) {
			builder.append("spepwpolicyflag=");
			builder.append("spepwpolicyflag");
			builder.append(", ");

		}
		if (spedicersonyaccess != null) {
			builder.append("spedicersonyaccess=");
			builder.append("spedicersonyaccess");
			builder.append(", ");

		}
		if (speprimarybusinesspartner != null) {
			builder.append("speprimarybusinesspartner =");
			builder.append("speprimarybusinesspartner");
			builder.append(", ");

		}
		if (spepawsaccess != null) {
			builder.append("spepawsaccess =");
			builder.append("spepawsaccess");
			builder.append(", ");

		}
		if (spebebanjoid != null) {
			builder.append("spebebanjoid =");
			builder.append("spebebanjoid");
			builder.append(", ");

		}
		if (spebirtaccess != null) {
			builder.append("spebirtaccess=");
			builder.append("spebirtaccess");
			builder.append(", ");

		}
		if (spelastdayofwork != null) {
			builder.append("spelastdayofwork=");
			builder.append("spelastdayofwork");
			builder.append(", ");

		}
		if (spemedgateaccess != null) {
			builder.append("spemedgateaccess=");
			builder.append("spemedgateaccess");
			builder.append(", ");

		}
		if (speappdynamicaccess != null) {
			builder.append("speappdynamicaccess =");
			builder.append("speappdynamicaccess ");
			builder.append(", ");

		}
		if (speOnLeaveFlag != null) {
			builder.append("speOnLeaveFlag=");
			builder.append("speOnLeaveFlag ");
			builder.append(", ");

		}
		if (speiiqadminaccess != null) {
			builder.append("speiiqadminaccess =");
			builder.append("speiiqadminaccess ");
			builder.append(", ");

		}
		if (spewpfaccess != null) {
			builder.append("spewpfaccess=");
			builder.append("spewpfaccess");
			builder.append(", ");

		}
		if (spespheconnectaccess != null) {
			builder.append("spespheconnectaccess=");
			builder.append("spespheconnectaccess");
			builder.append(", ");

		}
		if (spespecialeventsaccess != null) {
			builder.append("spespecialeventsaccess=");
			builder.append("spespecialeventsaccess");
			builder.append(", ");

		}
		if (spec2access != null) {
			builder.append("spec2access=");
			builder.append("spec2access");
			builder.append(", ");

		}
		if (spediceraccess != null) {
			builder.append("spediceraccess=");
			builder.append("spediceraccess");
			builder.append(", ");

		}
		if (spewebmethodsaccess != null) {
			builder.append("spewebmethodsaccess=");
			builder.append("spewebmethodsaccess");
			builder.append(", ");

		}
		if (spewptsaccess != null) {
			builder.append("spewptsaccess=");
			builder.append("spewptsaccess");
			builder.append(", ");

		}
		if (spebebanjoaccess != null) {
			builder.append("spebebanjoaccess=");
			builder.append("spebebanjoaccess");
			builder.append(", ");

		}
		if (spefclaccess != null) {
			builder.append("spefclaccess =");
			builder.append("spefclaccess ");
			builder.append(", ");

		}
		if (spezlarchive2faaccess != null) {
			builder.append("spezlarchive2faaccess=");
			builder.append("spezlarchive2faaccess");
			builder.append(", ");

		}
		if (speviasataccess != null) {
			builder.append("speviasataccess=");
			builder.append("speviasataccess");
			builder.append(", ");

		}
		if (spepercussionaccess != null) {
			builder.append("spepercussionaccess=");
			builder.append("spepercussionaccess");
			builder.append(", ");

		}
		if (spesouacceptance != null) {
			builder.append("spesouacceptance =");
			builder.append("spesouacceptance");
			builder.append(", ");

		}
		if (SPE2FATokenClass != null) {
			builder.append("SPE2FATokenClass=");
			builder.append("SPE2FATokenClass");
			builder.append(", ");

		}
		if (spe2faoathotp != null) {
			builder.append("spe2faoathotp=");
			builder.append("spe2faoathotp");
			builder.append(", ");

		}
		if (speOfficeFax != null) {
			builder.append("speOfficeFax=");
			builder.append("speOfficeFax");
			builder.append(", ");

		}
		if (spe2faoathseed != null) {
			builder.append("spe2faoathseed=");
			builder.append("spe2faoathseed");
			builder.append(", ");

		}
		if (spehightailaccess != null) {
			builder.append("spehightailaccess=");
			builder.append("spehightailaccess");
			builder.append(", ");

		}
		if (spedrmaccess != null) {
			builder.append("spedrmaccess=");
			builder.append("spedrmaccess");
			builder.append(", ");

		}
		if (spegnetaccess != null) {
			builder.append("spegnetaccess=");
			builder.append("spegnetaccess");
			builder.append(", ");

		}
		if (speorganizationlevel != null) {
			builder.append("speorganizationlevel=");
			builder.append("speorganizationlevel");
			builder.append(", ");

		}
		if (speMgrDn != null) {
			builder.append("speMgrDn=");
			builder.append("speMgrDn ");
			builder.append(", ");

		}
		if (speMgmtLevel != null) {
			builder.append("speMgmtLevel=");
			builder.append("speMgmtLevel");
			builder.append(", ");

		}
		if (speEndDate != null) {
			builder.append("speEndDate=");
			builder.append("speEndDate");
			builder.append(", ");

		}
		if (speTerminationDate != null) {
			builder.append("speTerminationDate=");
			builder.append("speTerminationDate");
			builder.append(", ");

		}
		if (speairlinesaccess != null) {
			builder.append("speairlinesaccess=");
			builder.append("speairlinesaccess");
			builder.append(", ");

		}
		if (spedesignstudioaccess != null) {
			builder.append("spedesignstudioaccess=");
			builder.append("spedesignstudioaccess");
			builder.append(", ");

		}
		if (sperepetoryaccess != null) {
			builder.append("sperepetoryaccess=");
			builder.append("sperepetoryaccess");
			builder.append(", ");

		}
		if (spedmcmaccess != null) {
			builder.append("spedmcmaccess=");
			builder.append("spedmcmaccess");
			builder.append(", ");

		}
		if (speinflightaccess != null) {
			builder.append("speinflightaccess=");
			builder.append("speinflightaccess");
			builder.append(", ");

		}
		if (Istempassword != null) {
			builder.append("Istempassword=");
			builder.append("Istempassword");
			builder.append(", ");

		}
		if (spemediacenteraccess != null) {
			builder.append("spemediacenteraccess=");
			builder.append("spemediacenteraccess");
			builder.append(", ");

		}
		if (speodinaccess != null) {
			builder.append("speodinaccess =");
			builder.append("speodinaccess");
			builder.append(", ");

		}
		if (spealfrescocontenttype != null) {
			builder.append("spealfrescocontenttype=");
			builder.append("spealfrescocontenttype");
			builder.append(", ");

		}
		if (specimsaccess != null) {
			builder.append("specimsaccess=");
			builder.append("specimsaccess");
			builder.append(", ");

		}
		if (speparisaccess != null) {
			builder.append("speparisaccess=");
			builder.append("speparisaccess");
			builder.append(", ");

		}
		if (spetableausite != null) {
			builder.append("spetableausite=");
			builder.append("spetableausite");
			builder.append(", ");

		}
		if (spepinnacleaccess != null) {
			builder.append("spepinnacleaccess=");
			builder.append("spepinnacleaccess");
			builder.append(", ");

		}
		if (spetableauaccess != null) {
			builder.append("spetableauaccess=");
			builder.append("spetableauaccess");
			builder.append(", ");

		}
		if (spenetworkfileconverteraccess != null) {
			builder.append("spenetworkfileconverteraccess=");
			builder.append("spenetworkfileconverteraccess");
			builder.append(", ");

		}
		if (spehorizonwebappaccess != null) {
			builder.append("spehorizonwebappaccess=");
			builder.append("spehorizonwebappaccess");
			builder.append(", ");

		}
		if (speInterplanaccess != null) {
			builder.append("speInterplanaccess=");
			builder.append("speInterplanaccess");
			builder.append(", ");

		}
		if (speprivacyacknowledge != null) {
			builder.append("speprivacyacknowledge=");
			builder.append("speprivacyacknowledge");
			builder.append(", ");

		}
		if (speoversightapaccess != null) {
			builder.append("speoversightapaccess=");
			builder.append("speoversightapaccess");
			builder.append(", ");

		}
		if (speSystemID != null) {
			builder.append("speSystemID=");
			builder.append("speSystemID");
			builder.append(", ");

		}
		if (speInternationalPhone != null) {
			builder.append("speInternationalPhone=");
			builder.append("speInternationalPhone");
			builder.append(", ");

		}
		if (spepotrackeraccess != null) {
			builder.append("spepotrackeraccess=");
			builder.append("spepotrackeraccess");
			builder.append(", ");

		}
		if (spesspaccessed != null) {
			builder.append("spesspaccessed=");
			builder.append("spesspaccessed");
			builder.append(", ");

		}
		if (spesspeverbridge != null) {
			builder.append("spesspeverbridge=");
			builder.append("spesspeverbridge");
			builder.append(", ");

		}
		if (privacypolicyacceptedon != null) {
			builder.append("privacypolicyacceptedon=");
			builder.append("privacypolicyacceptedon");
			builder.append(", ");

		}
		if (speediscoverycustodianaccess != null) {
			builder.append("speediscoverycustodianaccess=");
			builder.append("speediscoverycustodianaccess");
			builder.append(", ");

		}
		if (speworkdaysitecode != null) {
			builder.append("speworkdaysitecode=");
			builder.append("speworkdaysitecode");
			builder.append(", ");

		}
		if (generationQualifier != null) {
			builder.append("generationQualifier=");
			builder.append("generationQualifier");
			builder.append(", ");

		}
		if (lobindicator != null) {
			builder.append("lobindicator=");
			builder.append("lobindicator");
			builder.append(", ");

		}
		if (spesubdivisionid != null) {
			builder.append("spesubdivisionid=");
			builder.append("spesubdivisionid");
			builder.append(", ");

		}
		if (spebusinessunitid != null) {
			builder.append("spebusinessunitid=");
			builder.append("spebusinessunitid");
			builder.append(", ");

		}
		if (spebusinessunitname != null) {
			builder.append("spebusinessunitname=");
			builder.append("spebusinessunitname ");
			builder.append(", ");

		}
		if (spePGPPolicy != null) {
			builder.append("spePGPPolicy=");
			builder.append("spePGPPolicy");
			builder.append(", ");

		}
		if (spepwdplcexmtsts != null) {
			builder.append("spepwdplcexmtsts=");
			builder.append("spepwdplcexmtsts");
			builder.append(", ");

		}
		if (speasvaccess != null) {
			builder.append("speasvaccess=");
			builder.append("speasvaccess");
			builder.append(", ");

		}
		if (speintegrifyaccess != null) {
			builder.append("speintegrifyaccess=");
			builder.append("speintegrifyaccess");
			builder.append(", ");

		}
		if (SPTResearchAdminAccess != null) {
			builder.append("SPTResearchAdminAccess=");
			builder.append("SPTResearchAdminAccess");
			builder.append(", ");

		}
		if (spe2faPhone1Type != null) {
			builder.append("spe2faPhone1Type=");
			builder.append("spe2faPhone1Type ");
			builder.append(", ");

		}
		if (spe2faPhone2Type != null) {
			builder.append("spe2faPhone2Type=");
			builder.append("spe2faPhone2Type");
			builder.append(", ");

		}
		if (spe2faPhone1 != null) {
			builder.append("spe2faPhone1=");
			builder.append("spe2faPhone1");
			builder.append(", ");

		}
		if (spe2faPhone1SMS != null) {
			builder.append("spe2faPhone1SMS=");
			builder.append("spe2faPhone1SMS");
			builder.append(", ");

		}
		if (spe2faPhone1Email != null) {
			builder.append("spe2faPhone1Email=");
			builder.append("spe2faPhone1Email");
			builder.append(", ");

		}
		if (spe2faPhone2 != null) {
			builder.append("spe2faPhone2=");
			builder.append("spe2faPhone2");
			builder.append(", ");

		}
		if (spe2faPhone2SMS != null) {
			builder.append("spe2faPhone2SMS=");
			builder.append("spe2faPhone2SMS");
			builder.append(", ");

		}
		if (spe2faPhone2Email != null) {
			builder.append("spe2faPhone2Email=");
			builder.append("spe2faPhone2Email");
			builder.append(", ");

		}
		if (spe2faPhone3 != null) {
			builder.append("spe2faPhone3=");
			builder.append("spe2faPhone3");
			builder.append(", ");

		}
		if (spe2faPhone3SMS != null) {
			builder.append("spe2faPhone3SMS=");
			builder.append("spe2faPhone3SMS");
			builder.append(", ");

		}
		if (spe2faPhone3Email != null) {
			builder.append("spe2faPhone3Email =");
			builder.append("spe2faPhone3Email");
			builder.append(", ");

		}
		if (spespticomaccess != null) {
			builder.append("spespticomaccess=");
			builder.append("spespticomaccess");
			builder.append(", ");

		}
		if (spenetgainaccess != null) {
			builder.append("spenetgainaccess=");
			builder.append("spenetgainaccess");
			builder.append(", ");

		}
		if (speevmiaccess != null) {
			builder.append("speevmiaccess=");
			builder.append("speevmiaccess");
			builder.append(", ");

		}
		if (spedealpointaccess != null) {
			builder.append("spedealpointaccess=");
			builder.append("spedealpointaccess");
			builder.append(", ");

		}
		if (specreativenetworksaccess != null) {
			builder.append("specreativenetworksaccess=");
			builder.append("specreativenetworksaccess");
			builder.append(", ");

		}
		if (spe2faeagl != null) {
			builder.append("spe2faeagl=");
			builder.append("spe2faeagl");
			builder.append(", ");

		}
		if (speScryAccess != null) {
			builder.append("speScryAccess=");
			builder.append("speScryAccess");
			builder.append(", ");

		}
		if (speBusinessObjectsGroup != null) {
			builder.append("speBusinessObjectsGroup=");
			builder.append("speBusinessObjectsGroup");
			builder.append(", ");

		}
		if (speBusinessObjectsAccess != null) {
			builder.append("speBusinessObjectsAccess=");
			builder.append("speBusinessObjectsAccess");
			builder.append(", ");

		}
		if (spePRISMAccess != null) {
			builder.append("spePRISMAccess=");
			builder.append("spePRISMAccess");
			builder.append(", ");

		}
		if (speexecutivedirectoryadmin != null) {
			builder.append("speexecutivedirectoryadmin=");
			builder.append("speexecutivedirectoryadmin");
			builder.append(", ");

		}

		if (speexecutivedirectoryuser != null) {
			builder.append("speexecutivedirectoryuser=");
			builder.append("speexecutivedirectoryuser");
			builder.append(", ");

		}
		if (speebrelaccess != null) {
			builder.append("speebrelaccess=");
			builder.append("speebrelaccess");
			builder.append(", ");

		}
		if (spedartsroles != null) {
			builder.append("spedartsroles=");
			builder.append("spedartsroles");
			builder.append(", ");

		}
		if (myspeaccess != null) {
			builder.append("myspeaccess=");
			builder.append("myspeaccess");
			builder.append(", ");

		}
		if (myspedepts != null) {
			builder.append("myspedepts=");
			builder.append("myspedepts");
			builder.append(", ");

		}
		if (myspeemail != null) {
			builder.append("myspeemail=");
			builder.append("myspeemail");
			builder.append(", ");

		}
		if (mysperole != null) {
			builder.append("mysperole=");
			builder.append("mysperole");
			builder.append(", ");

		}
		if (isMemberOf != null) {
			builder.append("isMemberOf=");
			builder.append("isMemberOf");
			builder.append(", ");

		}
		if (myspeworkspace != null) {
			builder.append("myspeworkspace=");
			builder.append("myspeworkspace");
			builder.append(", ");

		}
		if (myspeworkspacedepts != null) {
			builder.append("myspeworkspacedepts=");
			builder.append("myspeworkspacedepts");
			builder.append(", ");

		}
		if (mysphedepts != null) {
			builder.append("mysphedepts=");
			builder.append("mysphedepts");
			builder.append(", ");

		}
		if (myspherole != null) {
			builder.append("myspherole=");
			builder.append("myspherole");
			builder.append(", ");

		}
		if (mysptiregions != null) {
			builder.append("mysptiregions=");
			builder.append("mysptiregions");
			builder.append(", ");

		}
		if (sonyGHD != null) {
			builder.append("sonyGHD=");
			builder.append("sonyGHD");
			builder.append(", ");

		}
		if (SonyRemoteUserBusinessUnitType != null) {
			builder.append("SonyRemoteUserBusinessUnitType=");
			builder.append("SonyRemoteUserBusinessUnitType");
			builder.append(", ");

		}
		if (speaccutracaccess != null) {
			builder.append("speaccutracaccess=");
			builder.append("speaccutracaccess");
			builder.append(", ");

		}
		if (speacshome != null) {
			builder.append("speacshome=");
			builder.append("speacshome");
			builder.append(", ");

		}
		if (speacsproductiona != null) {
			builder.append("speacsproductiona=");
			builder.append("speacsproductiona");
			builder.append(", ");

		}
		if (speacsproductionavpnremote != null) {
			builder.append("speacsproductionavpnremote=");
			builder.append("speacsproductionavpnremote");
			builder.append(", ");

		}
		if (speacsproductionawired != null) {
			builder.append("speacsproductionawired=");
			builder.append("speacsproductionawired");
			builder.append(", ");

		}
		if (speacsproductionawireless != null) {
			builder.append("speacsproductionawireless=");
			builder.append("speacsproductionawireless");
			builder.append(", ");

		}
		if (speacsproductionb != null) {
			builder.append("speacsproductionb=");
			builder.append("speacsproductionb");
			builder.append(", ");

		}
		if (speacsproductionbvpnremote != null) {
			builder.append("speacsproductionbvpnremote=");
			builder.append("speacsproductionbvpnremote");
			builder.append(", ");

		}
		if (speacsproductionbwired != null) {
			builder.append("speacsproductionbwired=");
			builder.append("speacsproductionbwired");
			builder.append(", ");

		}
		if (speacsproductionbwireless != null) {
			builder.append("speacsproductionbwireless=");
			builder.append("speacsproductionbwireless");
			builder.append(", ");

		}
		if (speacsproductionc != null) {
			builder.append("speacsproductionc=");
			builder.append("speacsproductionc");
			builder.append(", ");

		}
		if (speacsproductioncvpnremote != null) {
			builder.append("speacsproductioncvpnremote=");
			builder.append("speacsproductioncvpnremote");
			builder.append(", ");

		}
		if (speacsproductioncwired != null) {
			builder.append("speacsproductioncwired=");
			builder.append("speacsproductioncwired");
			builder.append(", ");

		}
		if (speacsproductioncwireless != null) {
			builder.append("speacsproductioncwireless=");
			builder.append("speacsproductioncwireless");
			builder.append(", ");

		}
		if (speacsproductiond != null) {
			builder.append("speacsproductiond=");
			builder.append("speacsproductiond");
			builder.append(", ");

		}
		if (speacsproductiondvpnremote != null) {
			builder.append("speacsproductiondvpnremote=");
			builder.append("speacsproductiondvpnremote");
			builder.append(", ");

		}
		if (speacsproductiondwired != null) {
			builder.append("speacsproductiondwired=");
			builder.append("speacsproductiondwired");
			builder.append(", ");

		}
		if (speacsproductiondwireless != null) {
			builder.append("speacsproductiondwireless=");
			builder.append("speacsproductiondwireless");
			builder.append(", ");

		}
		if (speacsproductione != null) {
			builder.append("speacsproductione=");
			builder.append("speacsproductione");
			builder.append(", ");

		}
		if (speacsproductionevpnremote != null) {
			builder.append("speacsproductionevpnremote=");
			builder.append("speacsproductionevpnremote");
			builder.append(", ");

		}
		if (speacsproductionewired != null) {
			builder.append("speacsproductionewired=");
			builder.append("speacsproductionewired");
			builder.append(", ");

		}
		if (speacsproductionewireless != null) {
			builder.append("speacsproductionewireless =");
			builder.append("speacsproductionewireless");
			builder.append(", ");

		}
		if (speacsproductionfvpnremote != null) {
			builder.append("speacsproductionfvpnremote=");
			builder.append("speacsproductionfvpnremote");
			builder.append(", ");

		}
		if (speacsproductionfwired != null) {
			builder.append("speacsproductionfwired=");
			builder.append("speacsproductionfwired");
			builder.append(", ");

		}
		if (speacsproductionfwireless != null) {
			builder.append("speacsproductionfwireless =");
			builder.append("speacsproductionfwireless");
			builder.append(", ");

		}
		if (speacsproductiong != null) {
			builder.append("speacsproductiong=");
			builder.append("speacsproductiong");
			builder.append(", ");

		}
		if (speacsproductiongvpnremote != null) {
			builder.append("speacsproductiongvpnremote=");
			builder.append("speacsproductiongvpnremote");
			builder.append(", ");

		}
		if (speacsproductiongwired != null) {
			builder.append("speacsproductiongwired =");
			builder.append("speacsproductiongwired");
			builder.append(", ");

		}
		if (speacsproductiongwireless != null) {
			builder.append("speacsproductiongwireless=");
			builder.append("speacsproductiongwireless");
			builder.append(", ");

		}
		if (speacsproductionh != null) {
			builder.append("speacsproductionh=");
			builder.append("speacsproductionh");
			builder.append(", ");

		}
		if (speacsproductionhvpnremote != null) {
			builder.append("speacsproductionhvpnremote=");
			builder.append("speacsproductionhvpnremote");
			builder.append(", ");

		}
		if (speacsproductionhwireless != null) {
			builder.append("speacsproductionhwireless=");
			builder.append("speacsproductionhwireless");
			builder.append(", ");

		}
		if (speacsproductioni != null) {
			builder.append("speacsproductioni=");
			builder.append("speacsproductioni");
			builder.append(", ");

		}
		if (speacsproductionivpnremote != null) {
			builder.append("speacsproductionivpnremote  =");
			builder.append("speacsproductionivpnremote ");
			builder.append(", ");

		}
		if (speacsproductioniwired != null) {
			builder.append("speacsproductioniwired =");
			builder.append("speacsproductioniwired");
			builder.append(", ");

		}
		if (speacsproductioniwireless != null) {
			builder.append("speacsproductioniwireless =");
			builder.append("speacsproductioniwireless");
			builder.append(", ");

		}
		if (speacsproductionj != null) {
			builder.append("speacsproductionj=");
			builder.append("speacsproductionj");
			builder.append(", ");

		}
		if (speacsproductionjwired != null) {
			builder.append("speacsproductionjwired=");
			builder.append("speacsproductionjwired");
			builder.append(", ");

		}
		if (speacsproductionjwireless != null) {
			builder.append("speacsproductionjwireless=");
			builder.append("speacsproductionjwireless");
			builder.append(", ");

		}
		if (speacsproductionk != null) {
			builder.append("speacsproductionk=");
			builder.append("speacsproductionk");
			builder.append(", ");

		}
		if (speacsproductionkvpnremote != null) {
			builder.append("speacsproductionkvpnremote=");
			builder.append("speacsproductionkvpnremote");
			builder.append(", ");

		}
		if (speacsproductionkwired != null) {
			builder.append("speacsproductionkwired=");
			builder.append("speacsproductionkwired");
			builder.append(", ");

		}
		if (speacsproductionkwireless != null) {
			builder.append("speacsproductionkwireless=");
			builder.append("speacsproductionkwireless");
			builder.append(", ");

		}
		if (speacsproductionl != null) {
			builder.append("speacsproductionl=");
			builder.append("speacsproductionl");
			builder.append(", ");

		}
		if (speacsproductionlvpnremote != null) {
			builder.append("speacsproductionlvpnremote=");
			builder.append("speacsproductionlvpnremote");
			builder.append(", ");

		}
		if (speacsproductionlwired != null) {
			builder.append("speacsproductionlwired=");
			builder.append("speacsproductionlwired");
			builder.append(", ");

		}
		if (speacsproductionlwireless != null) {
			builder.append("speacsproductionlwireless=");
			builder.append("speacsproductionlwireless");
			builder.append(", ");

		}
		if (speacsproductionm != null) {
			builder.append("speacsproductionm=");
			builder.append("speacsproductionm");
			builder.append(", ");

		}
		if (speacsproductionmvpnremote != null) {
			builder.append("speacsproductionmvpnremote=");
			builder.append("speacsproductionmvpnremote");
			builder.append(", ");

		}
		if (speacsproductionmwired != null) {
			builder.append("speacsproductionmwired=");
			builder.append("speacsproductionmwired");
			builder.append(", ");

		}
		if (speacsproductionmwireless != null) {
			builder.append("speacsproductionmwireless=");
			builder.append("speacsproductionmwireless");
			builder.append(", ");

		}
		if (speacsproductionnvpnremote != null) {
			builder.append("speacsproductionnvpnremote=");
			builder.append("speacsproductionnvpnremote");
			builder.append(", ");

		}
		if (speacsproductionnwired != null) {
			builder.append("speacsproductionnwired=");
			builder.append("speacsproductionnwired");
			builder.append(", ");

		}
		if (speacsproductionnwireless != null) {
			builder.append("speacsproductionnwireless=");
			builder.append("speacsproductionnwireless");
			builder.append(", ");

		}
		if (spealfrescoaccess != null) {
			builder.append("spealfrescoaccess=");
			builder.append("spealfrescoaccess");
			builder.append(", ");

		}
		if (spealfrescobcaccess != null) {
			builder.append("spealfrescobcaccess=");
			builder.append("spealfrescobcaccess");
			builder.append(", ");

		}
		if (speAppsPermitted != null) {
			builder.append("speAppsPermitted=");
			builder.append("speAppsPermitted");
			builder.append(", ");

		}
		if (speb2baccess != null) {
			builder.append("speb2baccess=");
			builder.append("speb2baccess");
			builder.append(", ");

		}
		if (spebuildingid != null) {
			builder.append("spebuildingid=");
			builder.append("spebuildingid");
			builder.append(", ");

		}
		if (spebusinessunit != null) {
			builder.append("spebusinessunit=");
			builder.append("spebusinessunit");
			builder.append(", ");

		}
		if (specardinusaccess != null) {
			builder.append("specardinusaccess=");
			builder.append("specardinusaccess");
			builder.append(", ");

		}
		if (specitrixaccess != null) {
			builder.append("specitrixaccess=");
			builder.append("specitrixaccess");
			builder.append(", ");

		}
		if (specompanyid != null) {
			builder.append("specompanyid=");
			builder.append("specompanyid");
			builder.append(", ");

		}
		if (specostcenter != null) {
			builder.append("specostcenter=");
			builder.append("specostcenter");
			builder.append(", ");

		}
		if (specountry != null) {
			builder.append("specountry=");
			builder.append("specountry");
			builder.append(", ");

		}
		if (spedealtrackeraccess != null) {
			builder.append("spedealtrackeraccess=");
			builder.append("spedealtrackeraccess");
			builder.append(", ");

		}
		if (spedepartmentid != null) {
			builder.append("spedepartmentid=");
			builder.append("spedepartmentid");
			builder.append(", ");

		}
		if (spedepartmentname != null) {
			builder.append("spedepartmentname=");
			builder.append("spedepartmentname");
			builder.append(", ");

		}
		if (speDisplayFaxNumber != null) {
			builder.append("speDisplayFaxNumber=");
			builder.append("speDisplayFaxNumber");
			builder.append(", ");

		}
		if (speDisplaygivenName != null) {
			builder.append("speDisplaygivenName=");
			builder.append("speDisplaygivenName");
			builder.append(", ");

		}
		if (speDisplaySurname != null) {
			builder.append("speDisplaySurname=");
			builder.append("speDisplaySurname");
			builder.append(", ");

		}
		if (speDisplayTelephoneNumber != null) {
			builder.append("speDisplayTelephoneNumber=");
			builder.append("speDisplayTelephoneNumber");
			builder.append(", ");

		}
		if (spedivision != null) {
			builder.append("spedivision=");
			builder.append("spedivision");
			builder.append(", ");

		}
		if (spedivisionid != null) {
			builder.append("spedivisionid=");
			builder.append("spedivisionid");
			builder.append(", ");

		}
		if (spedivisionname != null) {
			builder.append("spedivisionname=");
			builder.append("spedivisionname");
			builder.append(", ");

		}
		if (spedominodn != null) {
			builder.append("spedominodn=");
			builder.append("spedominodn");
			builder.append(", ");

		}
		if (spedominomaildb != null) {
			builder.append("spedominomaildb=");
			builder.append("spedominomaildb");
			builder.append(", ");

		}
		if (spedroolsaccess != null) {
			builder.append("spedroolsaccess=");
			builder.append("spedroolsaccess");
			builder.append(", ");

		}
		if (spedrozaccess != null) {
			builder.append("spedrozaccess=");
			builder.append("spedrozaccess");
			builder.append(", ");

		}
		if (speEmpBadgeID != null) {
			builder.append("speEmpBadgeID=");
			builder.append("speEmpBadgeID");
			builder.append(", ");

		}
		if (speEmpBirthDate != null) {
			builder.append("speEmpBirthDate=");
			builder.append("speEmpBirthDate");
			builder.append(", ");

		}
		if (speEmpDataSource != null) {
			builder.append("speEmpDataSource=");
			builder.append("speEmpDataSource ");
			builder.append(", ");

		}
		if (speEmpFloor != null) {
			builder.append("speEmpFloor=");
			builder.append("speEmpFloor");
			builder.append(", ");

		}

		if (speEmpFrmCtr != null) {
			builder.append("speEmpFrmCtr=");
			builder.append("speEmpFrmCtr");
			builder.append(", ");

		}
		if (speEmpHireDate != null) {
			builder.append("speEmpHireDate=");
			builder.append("speEmpHireDate");
			builder.append(", ");

		}
		if (speEmpID != null) {
			builder.append("speEmpID=");
			builder.append("speEmpID");
			builder.append(", ");

		}
		if (speEmpPwdChg != null) {
			builder.append("speEmpPwdChg=");
			builder.append("speEmpPwdChg");
			builder.append(", ");

		}
		if (speEmpTermDate != null) {
			builder.append("speEmpTermDate=");
			builder.append("speEmpTermDate");
			builder.append(", ");

		}
		if (speEmpWorkState != null) {
			builder.append("speEmpWorkState=");
			builder.append("speEmpWorkState");
			builder.append(", ");

		}
		if (speGlobalID != null) {
			builder.append("speGlobalID=");
			builder.append("speGlobalID");
			builder.append(", ");

		}
		if (speIDMAccountLocked != null) {
			builder.append("speIDMAccountLocked=");
			builder.append("speIDMAccountLocked");
			builder.append(", ");

		}
		if (speIDMRegion != null) {
			builder.append("speIDMRegion=");
			builder.append("speIDMRegion");
			builder.append(", ");

		}
		if (speIDMTerritory != null) {
			builder.append("speIDMTerritory=");
			builder.append("speIDMTerritory");
			builder.append(", ");

		}
		if (speidmusertype != null) {
			builder.append("speidmusertype=");
			builder.append("speidmusertype");
			builder.append(", ");

		}
		if (speiptvpackages != null) {
			builder.append("speiptvpackages=");
			builder.append("speiptvpackages");
			builder.append(", ");

		}
		if (speJoggerA1 != null) {
			builder.append("speJoggerA1=");
			builder.append("speJoggerA1");
			builder.append(", ");

		}
		if (speJoggerA2 != null) {
			builder.append("speJoggerA2=");
			builder.append("speJoggerA2");
			builder.append(", ");

		}
		if (speJoggerQ1 != null) {
			builder.append("speJoggerQ1=");
			builder.append("speJoggerQ1");
			builder.append(", ");

		}
		if (speJoggerQ2 != null) {
			builder.append("speJoggerQ2=");
			builder.append("speJoggerQ2");
			builder.append(", ");

		}
		if (speMgrID != null) {
			builder.append("speMgrID=");
			builder.append("speMgrID");
			builder.append(", ");

		}
		if (speMobile != null) {
			builder.append("speMobile=");
			builder.append("speMobile");
			builder.append(", ");

		}
		if (speNativeEmail != null) {
			builder.append("speNativeEmail=");
			builder.append("speNativeEmail");
			builder.append(", ");

		}
		if (speNativeEmailServer != null) {
			builder.append("speNativeEmailServer=");
			builder.append("speNativeEmailServer");
			builder.append(", ");

		}
		if (speNativeNotesShortName != null) {
			builder.append("speNativeNotesShortName=");
			builder.append("speNativeNotesShortName");
			builder.append(", ");

		}
		if (spenikuid != null) {
			builder.append("spenikuid=");
			builder.append("spenikuid");
			builder.append(", ");

		}
		if (spenotesshortname != null) {
			builder.append("spenotesshortname=");
			builder.append("spenotesshortname");
			builder.append(", ");

		}
		if (spenovatusaccess != null) {
			builder.append("spenovatusaccess=");
			builder.append("spenovatusaccess");
			builder.append(", ");

		}
		if (speOfficeLocation2 != null) {
			builder.append("speOfficeLocation2=");
			builder.append("speOfficeLocation2");
			builder.append(", ");

		}
		if (speOfficeLocation3 != null) {
			builder.append("speOfficeLocation3=");
			builder.append("speOfficeLocation3");
			builder.append(", ");

		}
		if (speoversightaccess != null) {
			builder.append("speoversightaccess=");
			builder.append("speoversightaccess");
			builder.append(", ");

		}
		if (spePasswordFlag != null) {
			builder.append("spePasswordFlag=");
			builder.append("spePasswordFlag");
			builder.append(", ");

		}
		if (spepeoplefluentaccess != null) {
			builder.append("spepeoplefluentaccess=");
			builder.append("spepeoplefluentaccess");
			builder.append(", ");

		}
		if (spepinnumber != null) {
			builder.append("spepinnumber=");
			builder.append("spepinnumber");
			builder.append(", ");

		}
		if (speprodsafetyaccess != null) {
			builder.append("speprodsafetyaccess=");
			builder.append("speprodsafetyaccess");
			builder.append(", ");

		}
		if (speproductionbackboneaccess != null) {
			builder.append("speproductionbackboneaccess=");
			builder.append("speproductionbackboneaccess");
			builder.append(", ");

		}
		if (spepsid != null) {
			builder.append("spepsid=");
			builder.append("spepsid");
			builder.append(", ");

		}
		if (spepssaccess != null) {
			builder.append("spepssaccess=");
			builder.append("spepssaccess");
			builder.append(", ");

		}
		if (spepwdexprydt != null) {
			builder.append("spepwdexprydt=");
			builder.append("spepwdexprydt");
			builder.append(", ");

		}
		if (spepwdplcexmtstatus != null) {
			builder.append("spepwdplcexmtstatus=");
			builder.append("spepwdplcexmtstatus");
			builder.append(", ");

		}
		if (speqcaccess != null) {
			builder.append("speqcaccess=");
			builder.append("speqcaccess");
			builder.append(", ");

		}
		if (spePhone != null) {
			builder.append("spePhone=");
			builder.append("spePhone");
			builder.append(", ");

		}
		if (spepinnumber != null) {
			builder.append("spepinnumber=");
			builder.append("spepinnumber");
			builder.append(", ");

		}
		if (speprodsafetyaccess != null) {
			builder.append("speprodsafetyaccess=");
			builder.append("speprodsafetyaccess");
			builder.append(", ");

		}
		if (speproductionbackboneaccess != null) {
			builder.append("speproductionbackboneaccess=");
			builder.append("speproductionbackboneaccess");
			builder.append(", ");

		}
		if (spepsid != null) {
			builder.append("spepsid=");
			builder.append("spepsid");
			builder.append(", ");

		}
		if (spepssaccess != null) {
			builder.append("spepssaccess=");
			builder.append("spepssaccess");
			builder.append(", ");

		}
		if (spepwdplcexmtstatus != null) {
			builder.append("spepwdplcexmtstatus=");
			builder.append("spepwdplcexmtstatus");
			builder.append(", ");

		}
		if (speqcaccess != null) {
			builder.append("speqcaccess=");
			builder.append("speqcaccess");
			builder.append(", ");

		}
		if (speRoomNumber3 != null) {
			builder.append("speRoomNumber3=");
			builder.append("speRoomNumber3");
			builder.append(", ");

		}
		if (SPERPMAccess != null) {
			builder.append("SPERPMAccess=");
			builder.append("speRPMAccess");
			builder.append(", ");

		}
		if (spesabaaccess != null) {
			builder.append("spesabaaccess=");
			builder.append("spesabaaccess");
			builder.append(", ");

		}
		if (spesalesbankaccess != null) {
			builder.append("spesalesbankaccess=");
			builder.append("spesalesbankaccess");
			builder.append(", ");

		}
		if (speSecondaryPhone != null) {
			builder.append("speSecondaryPhone=");
			builder.append("speSecondaryPhone");
			builder.append(", ");

		}
		if (spespeedid != null) {
			builder.append("spespeedid=");
			builder.append("spespeedid");
			builder.append(", ");

		}
		if (spestoreroomaccess != null) {
			builder.append("spestoreroomaccess=");
			builder.append("spestoreroomaccess");
			builder.append(", ");

		}
		if (spesubdivisionname != null) {
			builder.append("spesubdivisionname=");
			builder.append("spesubdivisionname");
			builder.append(", ");

		}
		if (speswiftaccess != null) {
			builder.append("speswiftaccess=");
			builder.append("speswiftaccess");
			builder.append(", ");

		}
		if (spetestapplicationaccess != null) {
			builder.append("spetestapplicationaccess=");
			builder.append("spetestapplicationaccess");
			builder.append(", ");

		}
		if (speTrial != null) {
			builder.append("speTrial=");
			builder.append("speTrial");
			builder.append(", ");

		}
		if (spetrintechaccess != null) {
			builder.append("spetrintechaccess=");
			builder.append("spetrintechaccess");
			builder.append(", ");

		}
		if (speVipFlag != null) {
			builder.append("speVipFlag=");
			builder.append("speVipFlag");
			builder.append(", ");

		}
		if (speVPNGroup != null) {
			builder.append("speVPNGroup=");
			builder.append("speVPNGroup");
			builder.append(", ");

		}
		if (spewdempid != null) {
			builder.append("spewdempid=");
			builder.append("spewdempid");
			builder.append(", ");

		}

		if (speworktype != null) {
			builder.append("speworktype=");
			builder.append("speworktype");
			builder.append(", ");

		}
		if (VPNEnabled != null) {
			builder.append("VPNEnabled=");
			builder.append("VPNEnabled");
			builder.append(", ");

		}

		builder.append("]");
		return builder.toString();

	}
}
