package com.openDJ.pojo;

import java.io.Serializable;

/**
 * @author KMaji
 *
 */
public class LDAPUser implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 9081527761576640803L;

	private String givenName;
	private String uid;
	//private String cn;
	private String sn;
	private String speassistantemail;
	
	private String mail;
	private String spemobile;
	private String speHomePhone;
	private String speonenetflag;
	private String speb2brestrictaccess;
	private String speuserPrincipalName;
	private String spepwpolicyflag;
	private String spedicersonyaccess;
	private String spelastdayofwork;
	private String selfservicepwdchgdate;
	private String sedepartmantname;
	private String spebusinessunitname;
	private String title;
	private String spedepartmentname;
	private String spe2fatokenclass;
	private String speEndDate;
	private String speTerminationDate;
	private String speSystemID;
	private String speb2baccess;
	private String spebuildingid;
	private String specostcenter;
	
	private String specountry;
	private String spedepartmentid;
	private String spedivision;
	private String spedivisionid;
	private String speEmpBadgeID;
	private String speEmpFloor;
	private String speMgrID;
	private String speIDMRegion;
	private String speIDMTerritory;
	private String speMobile;
	private String spePhone;
	private String speVipFlag;
	private String speMgrDn;
	private String speMgmtLevel;
	private String spewebmethodsaccess;
	private String spebebanjoaccess;
	private String spesouacceptance;
	private String SonyRemoteUserBusinessUnitType;
	private String sonyGHD;
	private String speifdsaccess;
	private String speIFDSReportLanguage;
	private String speifdstemporaryuser;
	private String speifdsuseraccessenddate;
	private String speifdsusertitle;
	private String speOperatingCompany;
	private String spePhysicalLocale;
	private String speTerritory;
	private String st;
	private String street;
	private String spepinnumber ;
	private String speprodsafetyaccess ;
	private String speproductionbackboneaccess ;
	private String spepsid ;
	private String spepssaccess ;
	private String spepwdexprydt ;
	private String spepwdplcexmtstatus ;
	
	public String getSpecountry() {
		return specountry;
	}

	public void setSpecountry(String specountry) {
		this.specountry = specountry;
	}

	public String getSpedepartmentid() {
		return spedepartmentid;
	}

	public void setSpedepartmentid(String spedepartmentid) {
		this.spedepartmentid = spedepartmentid;
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

	public String getSpeEmpBadgeID() {
		return speEmpBadgeID;
	}

	public void setSpeEmpBadgeID(String speEmpBadgeID) {
		this.speEmpBadgeID = speEmpBadgeID;
	}

	public String getSpeEmpFloor() {
		return speEmpFloor;
	}

	public void setSpeEmpFloor(String speEmpFloor) {
		this.speEmpFloor = speEmpFloor;
	}

	public String getSpeMgrID() {
		return speMgrID;
	}

	public void setSpeMgrID(String speMgrID) {
		this.speMgrID = speMgrID;
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

	public String getSpeMobile() {
		return speMobile;
	}

	public void setSpeMobile(String speMobile) {
		this.speMobile = speMobile;
	}

	public String getSpePhone() {
		return spePhone;
	}

	public void setSpePhone(String spePhone) {
		this.spePhone = spePhone;
	}

	public String getSpeVipFlag() {
		return speVipFlag;
	}

	public void setSpeVipFlag(String speVipFlag) {
		this.speVipFlag = speVipFlag;
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

	public String getSpewebmethodsaccess() {
		return spewebmethodsaccess;
	}

	public void setSpewebmethodsaccess(String spewebmethodsaccess) {
		this.spewebmethodsaccess = spewebmethodsaccess;
	}

	public String getSpebebanjoaccess() {
		return spebebanjoaccess;
	}

	public void setSpebebanjoaccess(String spebebanjoaccess) {
		this.spebebanjoaccess = spebebanjoaccess;
	}

	public String getSpesouacceptance() {
		return spesouacceptance;
	}

	public void setSpesouacceptance(String spesouacceptance) {
		this.spesouacceptance = spesouacceptance;
	}

	public String getSonyRemoteUserBusinessUnitType() {
		return SonyRemoteUserBusinessUnitType;
	}

	public void setSonyRemoteUserBusinessUnitType(
			String sonyRemoteUserBusinessUnitType) {
		SonyRemoteUserBusinessUnitType = sonyRemoteUserBusinessUnitType;
	}

	public String getSonyGHD() {
		return sonyGHD;
	}

	public void setSonyGHD(String sonyGHD) {
		this.sonyGHD = sonyGHD;
	}

	public String getSpeifdsaccess() {
		return speifdsaccess;
	}

	public void setSpeifdsaccess(String speifdsaccess) {
		this.speifdsaccess = speifdsaccess;
	}

	public String getSpeIFDSReportLanguage() {
		return speIFDSReportLanguage;
	}

	public void setSpeIFDSReportLanguage(String speIFDSReportLanguage) {
		this.speIFDSReportLanguage = speIFDSReportLanguage;
	}

	public String getSpeifdstemporaryuser() {
		return speifdstemporaryuser;
	}

	public void setSpeifdstemporaryuser(String speifdstemporaryuser) {
		this.speifdstemporaryuser = speifdstemporaryuser;
	}

	public String getSpeifdsuseraccessenddate() {
		return speifdsuseraccessenddate;
	}

	public void setSpeifdsuseraccessenddate(String speifdsuseraccessenddate) {
		this.speifdsuseraccessenddate = speifdsuseraccessenddate;
	}

	public String getSpeifdsusertitle() {
		return speifdsusertitle;
	}

	public void setSpeifdsusertitle(String speifdsusertitle) {
		this.speifdsusertitle = speifdsusertitle;
	}

	public String getSpeOperatingCompany() {
		return speOperatingCompany;
	}

	public void setSpeOperatingCompany(String speOperatingCompany) {
		this.speOperatingCompany = speOperatingCompany;
	}

	public String getSpePhysicalLocale() {
		return spePhysicalLocale;
	}

	public void setSpePhysicalLocale(String spePhysicalLocale) {
		this.spePhysicalLocale = spePhysicalLocale;
	}

	public String getSpeTerritory() {
		return speTerritory;
	}

	public void setSpeTerritory(String speTerritory) {
		this.speTerritory = speTerritory;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public void setSpeproductionbackboneaccess(String speproductionbackboneaccess) {
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

	public String getSpeEndDate() {
		return speEndDate;
	}

	public void setSpeEndDate(String speEndDate) {
		this.speEndDate = speEndDate;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSpemobile() {
		return spemobile;
	}

	public void setSpemobile(String spemobile) {
		this.spemobile = spemobile;
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

	public String getSpelastdayofwork() {
		return spelastdayofwork;
	}

	public void setSpelastdayofwork(String spelastdayofwork) {
		this.spelastdayofwork = spelastdayofwork;
	}

	public String getSelfservicepwdchgdate() {
		return selfservicepwdchgdate;
	}

	public void setSelfservicepwdchgdate(String selfservicepwdchgdate) {
		this.selfservicepwdchgdate = selfservicepwdchgdate;
	}

	public String getSedepartmantname() {
		return sedepartmantname;
	}

	public void setSedepartmantname(String sedepartmantname) {
		this.sedepartmantname = sedepartmantname;
	}

	public String getSpebusinessunitname() {
		return spebusinessunitname;
	}

	public void setSpebusinessunitname(String spebusinessunitname) {
		this.spebusinessunitname = spebusinessunitname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSpedepartmentname() {
		return spedepartmentname;
	}

	public void setSpedepartmentname(String spedepartmentname) {
		this.spedepartmentname = spedepartmentname;
	}

	public String getSpe2fatokenclass() {
		return spe2fatokenclass;
	}

	public void setSpe2fatokenclass(String spe2fatokenclass) {
		this.spe2fatokenclass = spe2fatokenclass;
	}

	public String getSpeTerminationDate() {
		return speTerminationDate;
	}

	public void setSpeTerminationDate(String speTerminationDate) {
		this.speTerminationDate = speTerminationDate;
	}

	public String getSpeSystemID() {
		return speSystemID;
	}

	public void setSpeSystemID(String speSystemID) {
		this.speSystemID = speSystemID;
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

	public String getSpecostcenter() {
		return specostcenter;
	}

	public void setSpecostcenter(String specostcenter) {
		this.specostcenter = specostcenter;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	
	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	/*public String getCn() {
		return cn;
	}
	
	public void setCn(String cn) {
		this.cn = cn;
	}*/

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSpeassistantemail() {
		return speassistantemail;
	}

	public void setSpeassistantemail(String speassistantemail) {
		this.speassistantemail = speassistantemail;
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
		
		/*if (cn != null) {
			builder.append("cn=");
			builder.append(cn);
			builder.append(", ");
		}*/
		
		if (sn != null) {
			builder.append("sn=");
			builder.append(sn);
			builder.append(", ");
		}
		
		if (speassistantemail != null) {
			builder.append("speassistantemail=");
			builder.append(speassistantemail);
			builder.append(", ");
		}
		
		if (mail != null) {
			builder.append("mail=");
			builder.append(mail);
			builder.append(", ");
		}
		
		if (spemobile != null) {
			builder.append("spemobile=");
			builder.append(spemobile);
			builder.append(", ");
		}
		
		if (speHomePhone != null) {
			builder.append("speHomePhone=");
			builder.append(speHomePhone);
			builder.append(", ");
		}
		
		if (speonenetflag != null) {
			builder.append("speonenetflag=");
			builder.append(speonenetflag);
			builder.append(", ");
		}
		
		if (speb2brestrictaccess != null) {
			builder.append("speb2brestrictaccess=");
			builder.append(speb2brestrictaccess);
			builder.append(", ");
		}
		
		if (speuserPrincipalName != null) {
			builder.append("speuserPrincipalName=");
			builder.append(speuserPrincipalName);
			builder.append(", ");
		}
		
		if (spepwpolicyflag != null) {
			builder.append("spepwpolicyflag=");
			builder.append(spepwpolicyflag);
			builder.append(", ");
		}
		
		if (spedicersonyaccess != null) {
			builder.append("spedicersonyaccess=");
			builder.append(spedicersonyaccess);
			builder.append(", ");
		}
		
		if (spelastdayofwork != null) {
			builder.append("spelastdayofwork=");
			builder.append(spelastdayofwork);
			builder.append(", ");
		}
		
		if (selfservicepwdchgdate != null) {
			builder.append("selfservicepwdchgdate=");
			builder.append(selfservicepwdchgdate);
			builder.append(", ");
		}
		
		if (sedepartmantname != null) {
			builder.append("sedepartmantname=");
			builder.append(sedepartmantname);
			builder.append(", ");
		}
		
		if (spebusinessunitname != null) {
			builder.append("spebusinessunitname=");
			builder.append(spebusinessunitname);
			builder.append(", ");
		}
		
		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}
		
		if (spedepartmentname != null) {
			builder.append("spedepartmentname=");
			builder.append(spedepartmentname);
			builder.append(", ");
		}
		
		if (spe2fatokenclass != null) {
			builder.append("spe2fatokenclass=");
			builder.append(spe2fatokenclass);
			builder.append(", ");
		}
		
		if (speEndDate != null) {
			builder.append("speEndDate=");
			builder.append(speEndDate);
			builder.append(", ");
		}
		
		if (speTerminationDate != null) {
			builder.append("speTerminationDate=");
			builder.append(speTerminationDate);
			builder.append(", ");
		}
		
		if (speSystemID != null) {
			builder.append("speSystemID=");
			builder.append(speSystemID);
			builder.append(", ");
		}
		
		if (speb2baccess != null) {
			builder.append("speb2baccess=");
			builder.append(speb2baccess);
			builder.append(", ");
		}
		
		if (spebuildingid != null) {
			builder.append("spebuildingid=");
			builder.append(spebuildingid);
			builder.append(", ");
		}
		
		if (specostcenter != null) {
			builder.append("specostcenter=");
			builder.append(specostcenter);
			builder.append(", ");
		}		

		if (specountry != null) {
			builder.append("specountry=");
			builder.append(specountry);
			builder.append(", ");
		}
		
		if (spedepartmentid != null) {
			builder.append("spedepartmentid=");
			builder.append(spedepartmentid);
			builder.append(", ");
		}
		
		if (spedivision != null) {
			builder.append("spedivision=");
			builder.append(spedivision);
			builder.append(", ");
		}
		
		if (spedivisionid != null) {
			builder.append("spedivisionid=");
			builder.append(spedivisionid);
			builder.append(", ");
		}
		
		if (speEmpBadgeID != null) {
			builder.append("speEmpBadgeID=");
			builder.append(speEmpBadgeID);
			builder.append(", ");
		}
		
		if (speEmpFloor != null) {
			builder.append("speEmpFloor=");
			builder.append(speEmpFloor);
			builder.append(", ");
		}
		
		if (speMgrID != null) {
			builder.append("speMgrID=");
			builder.append(speMgrID);
			builder.append(", ");
		}
		
		if (speIDMRegion != null) {
			builder.append("speIDMRegion=");
			builder.append(speIDMRegion);
			builder.append(", ");
		}
		
		if (speIDMTerritory != null) {
			builder.append("speIDMTerritory=");
			builder.append(speIDMTerritory);
			builder.append(", ");
		}
		
		if (speMobile != null) {
			builder.append("speMobile=");
			builder.append(speMobile);
			builder.append(", ");
		}
		
		if (spePhone != null) {
			builder.append("spePhone=");
			builder.append(spePhone);
			builder.append(", ");
		}
		
		if (speVipFlag != null) {
			builder.append("speVipFlag=");
			builder.append(speVipFlag);
			builder.append(", ");
		}
		
		if (speMgrDn != null) {
			builder.append("speMgrDn=");
			builder.append(speMgrDn);
			builder.append(", ");
		}
		
		if (speMgmtLevel != null) {
			builder.append("speMgmtLevel=");
			builder.append(speMgmtLevel);
			builder.append(", ");
		}
		
		if (spewebmethodsaccess != null) {
			builder.append("spewebmethodsaccess=");
			builder.append(spewebmethodsaccess);
			builder.append(", ");
		}
		
		if (spebebanjoaccess != null) {
			builder.append("spebebanjoaccess=");
			builder.append(spebebanjoaccess);
			builder.append(", ");
		}
		
		if (spesouacceptance != null) {
			builder.append("spesouacceptance=");
			builder.append(spesouacceptance);
			builder.append(", ");
		}
		
		if (SonyRemoteUserBusinessUnitType != null) {
			builder.append("SonyRemoteUserBusinessUnitType=");
			builder.append(SonyRemoteUserBusinessUnitType);
			builder.append(", ");
		}
		
		if (sonyGHD != null) {
			builder.append("sonyGHD=");
			builder.append(sonyGHD);
			builder.append(", ");
		}
		
		if (speifdsaccess != null) {
			builder.append("speifdsaccess=");
			builder.append(speifdsaccess);
			builder.append(", ");
		}
		
		if (speIFDSReportLanguage != null) {
			builder.append("speIFDSReportLanguage=");
			builder.append(speIFDSReportLanguage);
			builder.append(", ");
		}
		
		if (speifdstemporaryuser != null) {
			builder.append("speifdstemporaryuser=");
			builder.append(speifdstemporaryuser);
			builder.append(", ");
		}
		
		if (speifdsuseraccessenddate != null) {
			builder.append("speifdsuseraccessenddate=");
			builder.append(speifdsuseraccessenddate);
			builder.append(", ");
		}
		
		if (speifdsusertitle != null) {
			builder.append("speifdsusertitle=");
			builder.append(speifdsusertitle);
			builder.append(", ");
		}
		
		if (speOperatingCompany != null) {
			builder.append("speOperatingCompany=");
			builder.append(speOperatingCompany);
			builder.append(", ");
		}
		
		if (spePhysicalLocale != null) {
			builder.append("spePhysicalLocale=");
			builder.append(spePhysicalLocale);
			builder.append(", ");
		}
		
		if (speTerritory != null) {
			builder.append("speTerritory=");
			builder.append(speTerritory);
			builder.append(", ");
		}
		
		if (st != null) {
			builder.append("st=");
			builder.append(st);
			builder.append(", ");
		}
		
		if (street != null) {
			builder.append("street=");
			builder.append(street);
			builder.append(", ");
		}
		
		if (spepinnumber != null) {
			builder.append("spepinnumber=");
			builder.append(spepinnumber);
			builder.append(", ");
		}
		
		if (speprodsafetyaccess != null) {
			builder.append("speprodsafetyaccess=");
			builder.append(speprodsafetyaccess);
			builder.append(", ");
		}
		
		if (speproductionbackboneaccess != null) {
			builder.append("speproductionbackboneaccess=");
			builder.append(speproductionbackboneaccess);
			builder.append(", ");
		}
		
		if (spepsid != null) {
			builder.append("spepsid=");
			builder.append(spepsid);
			builder.append(", ");
		}
		
		if (spepssaccess != null) {
			builder.append("spepssaccess=");
			builder.append(spepssaccess);
			builder.append(", ");
		}
		
		if (spepwdexprydt != null) {
			builder.append("spepwdexprydt=");
			builder.append(spepwdexprydt);
			builder.append(", ");
		}
		
		if (spepwdplcexmtstatus != null) {
			builder.append("spepwdplcexmtstatus=");
			builder.append(spepwdplcexmtstatus);
			builder.append(", ");
		}

		builder.append("]");
		return builder.toString();

	}
}
