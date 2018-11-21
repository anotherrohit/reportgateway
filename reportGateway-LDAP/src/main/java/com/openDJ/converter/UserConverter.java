package com.openDJ.converter;

import com.openDJ.pojo.User;
import com.openDJ.view.json.DatabaseTableJson;
import com.openDJ.view.json.UserJson;

public class UserConverter {
		
		/**
		 * This method create user data for admin
		 * @param user
		 * @return
		 */
		public static UserJson createUserDataForAdmin(User user){
			UserJson userJson = new UserJson();
			userJson.setFirstName(user.getGivenname());
			userJson.setLastName(user.getSn());
			userJson.setCn(user.getCn());
			/*userJson.setUserPassword(user.getUserPassword());
			userJson.setTelephoneNumber(user.getTelephoneNumber());
			userJson.setPostalAddress(user.getPostalAddress());
			userJson.setUid(user.getUid());
			userJson.setSpeassistantemail(user.getSpeassistantemail());
			userJson.setSpemobile2(user.getSpemobile2());
			userJson.setSpeOfficeFax(user.getSpeOfficeFax());
			userJson.setSpeHomeFax(user.getSpeHomeFax());
			userJson.setSpeHomePhone(user.getSpeHomePhone());
			userJson.setSpeonenetflag(user.getSpeonenetflag());
			userJson.setSpeb2brestrictaccess(user.getSpeb2brestrictaccess());
			userJson.setSpeuserPrincipalName(user.getSpeuserPrincipalName());
			userJson.setSpepwpolicyflag(user.getSpepwpolicyflag());
			userJson.setSpedicersonyaccess(user.getSpedicersonyaccess());
			userJson.setSpeprimarybusinesspartner(user.getSpeprimarybusinesspartner());
			userJson.setSpepawsaccess(user.getSpepawsaccess());
			userJson.setSpebebanjoid(user.getSpebebanjoid());
			userJson.setSpebirthome(user.getSpebirthome());
			userJson.setSpebirtaccess(user.getSpebirtaccess());
			userJson.setSpelastdayofwork(user.getSpelastdayofwork());
			userJson.setSpemedgateaccess(user.getSpemedgateaccess());
			userJson.setSelfservicepwdchgdate(user.getSelfservicepwdchgdate());
			userJson.setSpeappdynamicaccess(user.getSpeappdynamicaccess());
		    userJson.setSpeOnLeaveFlag(user.getSpeonenetflag());
			userJson.setSpeiiqadminaccess(user.getSpeiiqadminaccess());
			userJson.setSpewpfaccess(user.getSpewpfaccess());
			userJson.setSpespheconnectaccess(user.getSpespheconnectaccess());
			userJson.setSpespecialeventsaccess(user.getSpespecialeventsaccess());
			userJson.setSpec2access(user.getSpec2access());
			userJson.setSpediceraccess(user.getSpediceraccess());
			userJson.setSpewebmethodsaccess(user.getSpewebmethodsaccess());
			userJson.setSpewptsaccess(user.getSpewptsaccess());
			userJson.setSpebebanjoaccess(user.getSpebebanjoaccess());
			userJson.setSpefclaccess(user.getSpefclaccess());
			userJson.setSpezlarchive2faaccess(user.getSpezlarchive2faaccess());
			userJson.setSpeviasataccess(user.getSpeviasataccess());
			userJson.setSpepercussionaccess(user.getSpepercussionaccess());
			userJson.setSpesouacceptance(user.getSpesouacceptance());
			userJson.setSPE2FATokenClass(user.getSPE2FATokenClass());
			userJson.setSpe2faoathotp(user.getSpe2faoathotp());
			userJson.setSpe2faoathseed(user.getSpe2faoathseed());
			userJson.setSpehightailaccess(user.getSpehightailaccess());
			userJson.setSpedrmaccess(user.getSpedrmaccess());
			userJson.setSpegnetaccess(user.getSpegnetaccess());
			userJson.setSpeorganizationlevel(user.getSpeorganizationlevel());
			userJson.setSpeorganizationlevel(user.getSpeorganizationlevel());
			userJson.setSpeMgrDn(user.getSpeMgrDn());
			userJson.setSpeMgmtLevel(user.getSpeMgmtLevel());
			userJson.setSpeEndDate(user.getSpeEndDate());
			userJson.setSpeTerminationDate(user.getSpeTerminationDate());
			userJson.setSpeairlinesaccess(user.getSpeairlinesaccess());
			userJson.setSpedesignstudioaccess(user.getSpedesignstudioaccess());
			userJson.setSperepetoryaccess(user.getSperepetoryaccess());
			userJson.setSpedmcmaccess(user.getSpedmcmaccess());
			userJson.setSpeinflightaccess(user.getSpeinflightaccess());
			userJson.setIstempassword(user.getIstempassword());
			userJson.setSpemediacenteraccess(user.getSpemediacenteraccess());
			userJson.setSpeodinaccess(user.getSpeodinaccess());
			userJson.setSpealfrescocontenttype(user.getSpealfrescocontenttype());
			userJson.setSpecimsaccess(user.getSpecimsaccess());
			userJson.setSpeparisaccess(user.getSpeparisaccess());
			userJson.setSpetableausite(user.getSpetableausite());
			userJson.setSpepinnacleaccess(user.getSpepinnacleaccess());
			userJson.setSpetableauaccess(user.getSpetableauaccess());
			userJson.setSpenetworkfileconverteraccess(user.getSpenetworkfileconverteraccess());
			userJson.setSpehorizonwebappaccess(user.getSpehorizonwebappaccess());
			userJson.setSpeInterplanaccess(user.getSpeInterplanaccess());
			userJson.setSpeInterplanaccess(user.getSpeInterplanaccess());
			userJson.setSpeprivacyacknowledge(user.getSpeprivacyacknowledge());
			userJson.setSpeoversightapaccess(user.getSpeoversightapaccess());
			userJson.setSpeSystemID(user.getSpeSystemID());
			userJson.setSpeInternationalPhone(user.getSpeInternationalPhone());
			userJson.setSpepotrackeraccess(user.getSpepotrackeraccess());
			userJson.setSpesspaccessed(user.getSpesspaccessed());
			userJson.setSpesspeverbridge(user.getSpesspeverbridge());
			userJson.setSpeprivacyacknowledge(user.getSpeprivacyacknowledge());
			userJson.setSpeoversightapaccess(user.getSpeoversightapaccess());
			userJson.setSpeSystemID(user.getSpeSystemID());
			userJson.setSpeInternationalPhone(user.getSpeInternationalPhone());
			userJson.setSpepotrackeraccess(user.getSpepotrackeraccess());
			userJson.setSpesspeverbridge(user.getSpesspeverbridge());
			userJson.setPrivacypolicyacceptedon(user.getPrivacypolicyacceptedon());
			userJson.setSpeediscoverycustodianaccess(user.getSpeediscoverycustodianaccess());
			userJson.setSpeworkdaysitecode(user.getSpeworkdaysitecode());
			userJson.setGenerationQualifier(user.getGenerationQualifier());
			userJson.setLobindicator(user.getLobindicator());
			userJson.setSpesubdivisionid(user.getSpesubdivisionid());
			userJson.setSpebusinessunitid(user.getSpebusinessunitid());
			userJson.setSpePGPPolicy(user.getSpePGPPolicy());
			userJson.setSpepwdplcexmtstatus(user.getSpepwdplcexmtstatus());
			userJson.setSpeasvaccess(user.getSpeasvaccess());
			userJson.setSpeintegrifyaccess(user.getSpeintegrifyaccess());
			userJson.setSPTResearchAdminAccess(user.getSPTResearchAdminAccess());
			userJson.setSpe2faPhone1Type(user.getSpe2faPhone1Type());
			userJson.setSpe2faPhone2Type(user.getSpe2faPhone2Type());
			userJson.setSpe2faPhone1(user.getSpe2faPhone1());
			userJson.setSpe2faPhone1SMS(user.getSpe2faPhone1SMS());
			userJson.setSpe2faPhone1Email(user.getSpe2faPhone1Email());
			userJson.setSpe2faPhone2(user.getSpe2faPhone2());
			userJson.setSpe2faPhone2SMS(user.getSpe2faPhone2SMS());
			userJson.setSpe2faPhone2Email(user.getSpe2faPhone2Email());
			userJson.setSpe2faPhone3(user.getSpe2faPhone3());
			userJson.setSpe2faPhone3SMS(user.getSpe2faPhone3SMS());
			userJson.setSpe2faPhone3Email(user.getSpe2faPhone3Email());
			userJson.setSpespticomaccess(user.getSpespticomaccess());
			userJson.setSpenetgainaccess(user.getSpenetgainaccess());
			userJson.setSpeevmiaccess(user.getSpeevmiaccess());
			userJson.setSpedealpointaccess(user.getSpedealpointaccess());
			userJson.setSpecreativenetworksaccess(user.getSpecreativenetworksaccess());
			userJson.setSpe2faeagl(user.getSpe2faeagl());
			userJson.setSpeScryAccess(user.getSpeScryAccess());
			userJson.setSpeBusinessObjectsAccess(user.getSpeBusinessObjectsAccess());
			userJson.setSpeBusinessObjectsGroup(user.getSpeBusinessObjectsGroup());
			userJson.setSpePRISMAccess(user.getSpePRISMAccess());
			userJson.setSpeexecutivedirectoryadmin(user.getSpeexecutivedirectoryadmin());
			userJson.setSpeexecutivedirectoryuser(user.getSpeexecutivedirectoryuser());
			userJson.setSpeebrelaccess(user.getSpeebrelaccess());
			userJson.setSpedartsroles(user.getSpedartsroles());
			userJson.setMyspeaccess(user.getMyspeaccess());
			userJson.setMyspedepts(user.getMyspedepts());
			userJson.setMyspeemail(user.getMyspeemail());
			userJson.setMysperole(user.getMysperole());
			userJson.setIsMemberOf(user.getIsMemberOf());
			userJson.setMyspeworkspace(user.getMyspeworkspace());
			userJson.setMyspeworkspacedepts(user.getMyspeworkspacedepts());
			userJson.setMysphedepts(user.getMysphedepts());
			userJson.setMyspherole(user.getMyspherole());
			userJson.setMysptiregions(user.getMysptiregions());
			userJson.setSonyGHD(user.getSonyGHD());
			userJson.setSonyRemoteUserBusinessUnitType(user.getSonyRemoteUserBusinessUnitType());
			userJson.setSpeaccutracaccess(user.getSpeaccutracaccess());
			userJson.setSpeacshome(user.getSpeacshome());
			userJson.setSpeacsproductiona(user.getSpeacsproductiona());
			userJson.setSpeacsproductionavpnremote(user.getSpeacsproductionavpnremote());
			userJson.setSpeacsproductionawired(user.getSpeacsproductionawired());
			userJson.setSpeacsproductionawireless(user.getSpeacsproductionawireless());
			userJson.setSpeacsproductionb(user.getSpeacsproductionb());
			userJson.setSpeacsproductionbvpnremote(user.getSpeacsproductionbvpnremote());
			userJson.setSpeacsproductionbwired(user.getSpeacsproductionbwired());
			userJson.setSpeacsproductionbwireless(user.getSpeacsproductionbwireless());
			userJson.setSpeacsproductionc(user.getSpeacsproductionc());
			userJson.setSpeacsproductioncvpnremote(user.getSpeacsproductioncvpnremote());
			userJson.setSpeacsproductioncwired(user.getSpeacsproductioncwired());
			userJson.setSpeacsproductioncwireless(user.getSpeacsproductioncwireless());
			
			userJson.setSpeacsproductiond(user.getSpeacsproductiond());
			userJson.setSpeacsproductiondvpnremote(user.getSpeacsproductiondvpnremote());
			userJson.setSpeacsproductiondwired(user.getSpeacsproductiondwired());
			userJson.setSpeacsproductiondwireless(user.getSpeacsproductiondwireless());
			
			userJson.setSpeacsproductione(user.getSpeacsproductione());
			userJson.setSpeacsproductionevpnremote(user.getSpeacsproductionevpnremote());
			userJson.setSpeacsproductionewired(user.getSpeacsproductionewired());
			userJson.setSpeacsproductionewireless(user.getSpeacsproductionewireless());
			
			userJson.setSpeacsproductionf(user.getSpeacsproductionf());
			userJson.setSpeacsproductionfvpnremote(user.getSpeacsproductionfvpnremote());
			userJson.setSpeacsproductionfwired(user.getSpeacsproductionfwired());
			userJson.setSpeacsproductionfwireless(user.getSpeacsproductionfwireless());
			
			userJson.setSpeacsproductiong(user.getSpeacsproductiong());
			userJson.setSpeacsproductiongvpnremote(user.getSpeacsproductiongvpnremote());
			userJson.setSpeacsproductiongwired(user.getSpeacsproductiongwired());
			userJson.setSpeacsproductiongwireless(user.getSpeacsproductiongwireless());
			
			userJson.setSpeacsproductionh(user.getSpeacsproductionh());
			userJson.setSpeacsproductionhvpnremote(user.getSpeacsproductionhvpnremote());
			userJson.setSpeacsproductionhwired(user.getSpeacsproductionhwired());
			userJson.setSpeacsproductionhwireless(user.getSpeacsproductionhwireless());
			
			userJson.setSpeacsproductioni(user.getSpeacsproductioni());
			userJson.setSpeacsproductionivpnremote(user.getSpeacsproductionivpnremote());
			userJson.setSpeacsproductioniwired(user.getSpeacsproductioniwired());
			userJson.setSpeacsproductioniwireless(user.getSpeacsproductioniwireless());
			
			userJson.setSpeacsproductionj(user.getSpeacsproductionj());
			userJson.setSpeacsproductionjvpnremote(user.getSpeacsproductionjvpnremote());
			userJson.setSpeacsproductionjwired(user.getSpeacsproductionjwired());
			userJson.setSpeacsproductionjwireless(user.getSpeacsproductionjwireless());
			
			userJson.setSpeacsproductionk(user.getSpeacsproductionk());
			userJson.setSpeacsproductionkvpnremote(user.getSpeacsproductionkvpnremote());
			userJson.setSpeacsproductionkwired(user.getSpeacsproductionkwired());
			userJson.setSpeacsproductionkwireless(user.getSpeacsproductionkwireless());
			
					
		    userJson.setSpeacsproductionl(user.getSpeacsproductionl());
			userJson.setSpeacsproductionlvpnremote(user.getSpeacsproductionlvpnremote());
			userJson.setSpeacsproductionlwired(user.getSpeacsproductionlwired());
			userJson.setSpeacsproductionlwireless(user.getSpeacsproductionlwireless());
		
			userJson.setSpeacsproductionm(user.getSpeacsproductionm());
			userJson.setSpeacsproductionmvpnremote(user.getSpeacsproductionmvpnremote());
			userJson.setSpeacsproductionmwired(user.getSpeacsproductionmwired());
			userJson.setSpeacsproductionmwireless(user.getSpeacsproductionmwireless());
	
			userJson.setSpeacsproductionn(user.getSpeacsproductionn());
			userJson.setSpeacsproductionnvpnremote(user.getSpeacsproductionnvpnremote());
			userJson.setSpeacsproductionnwired(user.getSpeacsproductionnwired());
			userJson.setSpeacsproductionnwireless(user.getSpeacsproductionnwireless());
	
			userJson.setSpealfrescoaccess(user.getSpealfrescoaccess());
			userJson.setSpealfrescobcaccess(user.getSpealfrescobcaccess());
			
			userJson.setSpeAppsPermitted(user.getSpeAppsPermitted());
			userJson.setSpeb2baccess(user.getSpeb2baccess());
			userJson.setSpebuildingid(user.getSpebuildingid());
			
			userJson.setSpebusinessunit(user.getSpebusinessunit());
			userJson.setSpecardinusaccess(user.getSpecardinusaccess());
			userJson.setSpecitrixaccess(user.getSpecitrixaccess());
			userJson.setSpecompanyid(user.getSpecompanyid());
			userJson.setSpecostcenter(user.getSpecostcenter());
			userJson.setSpecountry(user.getSpecountry());
			userJson.setSpedealtrackeraccess(user.getSpedealtrackeraccess());
			userJson.setSpedepartmentid(user.getSpedepartmentid());
			userJson.setSpedepartmentname(user.getSpedepartmentname());
			userJson.setSpeDisplayFaxNumber(user.getSpeDisplayFaxNumber());
			userJson.setSpeDisplaygivenName(user.getSpeDisplaygivenName());
			userJson.setSpeDisplaySurname(user.getSpeDisplaySurname());
			userJson.setSpeDisplayTelephoneNumber(user.getSpeDisplayTelephoneNumber());
			userJson.setSpedivision(user.getSpedivision());
			userJson.setSpedivisionid(user.getSpedivisionid());
			userJson.setSpedivisionname(user.getSpedivisionname());
			userJson.setSpedominodn(user.getSpedominodn());
			userJson.setSpedominomaildb(user.getSpedominomaildb());
			userJson.setSpedroolsaccess(user.getSpedroolsaccess());
			userJson.setSpedrozaccess(user.getSpedrozaccess());
	        userJson.setSpeEmpBadgeID(user.getSpeEmpBadgeID());
			userJson.setSpeEmpBirthDate(user.getSpeEmpBirthDate());
			userJson.setSpeEmpDataSource(user.getSpeEmpDataSource());
			userJson.setSpeEmpFloor(user.getSpeEmpFloor());
			userJson.setSpeEmpFrmCtr(user.getSpeEmpFrmCtr());
			userJson.setSpeEmpID(user.getSpeEmpID());
			userJson.setSpeEmpPwdChg(user.getSpeEmpPwdChg());
			userJson.setSpeEmpSrvyComp(user.getSpeEmpSrvyComp());
			userJson.setSpeEmpTermDate(user.getSpeEmpTermDate());
			userJson.setSpeEmpWorkState(user.getSpeEmpWorkState());
			userJson.setSpeGlobalID(user.getSpeGlobalID());
			userJson.setSpeIDMAccountLocked(user.getSpeIDMAccountLocked());
			userJson.setSpeIDMRegion(user.getSpeIDMRegion());
			userJson.setSpeIDMTerritory(user.getSpeIDMTerritory());
			userJson.setSpeidmusertype(user.getSpeidmusertype());
			userJson.setSpeiptvpackages(user.getSpeiptvpackages());
			userJson.setSpeJoggerA1(user.getSpeJoggerA1());
			userJson.setSpeJoggerA2(user.getSpeJoggerA2());
			userJson.setSpeJoggerQ1(user.getSpeJoggerQ1());
			userJson.setSpeJoggerQ2(user.getSpeJoggerQ2());
			userJson.setSpeMgrID(user.getSpeMgrID());
			userJson.setSpeMobile(user.getSpeMobile());
			userJson.setSpeNativeEmail(user.getSpeNativeEmail());
			userJson.setSpeNativeEmailServer(user.getSpeNativeEmailServer());
			userJson.setSpeNativeNotesShortName(user.getSpeNativeNotesShortName());
			userJson.setSpenovatusaccess(user.getSpenovatusaccess());
			userJson.setSpeOfficeLocation2(user.getSpeOfficeLocation2());
			userJson.setSpeOfficeLocation3(user.getSpeOfficeLocation3());
			userJson.setSpeoversightaccess(user.getSpeoversightaccess());
			userJson.setSpePasswordFlag(user.getSpePasswordFlag());
			userJson.setSpepeoplefluentaccess(user.getSpepeoplefluentaccess());
			userJson.setSpePGPRegion(user.getSpePGPRegion());
			userJson.setSpePhone(user.getSpePhone());
			userJson.setSpepinnumber(user.getSpepinnumber());
			userJson.setSpeprodsafetyaccess(user.getSpeprodsafetyaccess());
			userJson.setSpeproductionbackboneaccess(user.getSpeproductionbackboneaccess());
			userJson.setSpepsid(user.getSpepsid());
			userJson.setSpepssaccess(user.getSpepssaccess());
			userJson.setSpepwdexprydt(user.getSpepwdexprydt());
			userJson.setSpepwdplcexmtstatus(user.getSpepwdplcexmtstatus());
			userJson.setSpeqcaccess(user.getSpeqcaccess());
			userJson.setSpeRoomNumber3(user.getSpeRoomNumber3());
			userJson.setSPERPMAccess(user.getSPERPMAccess());
			userJson.setSpesabaaccess(user.getSpesabaaccess());
			userJson.setSpesalesbankaccess(user.getSpesalesbankaccess());
			userJson.setSpeSecondaryPhone(user.getSpeSecondaryPhone());
			userJson.setSpespeedid(user.getSpespeedid());
			userJson.setSpestoreroomaccess(user.getSpestoreroomaccess());
			userJson.setSpesubdivisionname(user.getSpesubdivisionname());
			userJson.setSpeswiftaccess(user.getSpeswiftaccess());
			userJson.setSpetestapplicationaccess(user.getSpetestapplicationaccess());
			userJson.setSpeTrial(user.getSpeTrial());
			userJson.setSpetrintechaccess(user.getSpetrintechaccess());
			userJson.setSpeVipFlag(user.getSpeVipFlag());
			userJson.setSpeVPNGroup(user.getSpeVPNGroup());
			userJson.setSpewdempid(user.getSpewdempid());
			userJson.setSpeworktype(user.getSpeworktype());
			userJson.setVPNEnabled(user.getVPNEnabled());
			userJson.setSpeifdsaccess(user.getSpeifdsaccess());
			userJson.setSpeIFDSReportLanguage(user.getSpeIFDSReportLanguage());
			userJson.setSpeifdstemporaryuser(user.getSpeifdstemporaryuser());
			userJson.setSpeifdsuseraccessenddate(user.getSpeifdsuseraccessenddate());
			userJson.setSpeifdsusertitle(user.getSpeifdsusertitle());
			userJson.setSpeOperatingCompany(user.getSpeOperatingCompany());
			userJson.setSpePhysicalLocale(user.getSpePhysicalLocale());
			userJson.setSpeTerritory(user.getSpeTerritory());
			userJson.setst(user.getSt());
			userJson.setstreet(user.getStreet());
			//userJson.settitle(user.gettitle());
			//userJson.setSpefcmaccess(user.getSpefcmaccess());*/
			return userJson;
		}
		
		public static DatabaseTableJson createDatabaseTable(Object object)
		{
			DatabaseTableJson databaseTableJson = new DatabaseTableJson();
			databaseTableJson.setName(object.toString());
			return databaseTableJson;
		}
}
