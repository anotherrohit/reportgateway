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
	@JsonProperty("user_name")
	private String uid;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	@JsonProperty("common_name")
	private String cn;
	@JsonProperty("ser_name")
	private String sn;
	@JsonProperty("password")
	private String userPassword;
	@JsonProperty("address")
	private String postalAddress;
	@JsonProperty("contact_number")
	private String telephoneNumber;

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

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
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
		}
		builder.append("]");
		return builder.toString();
	}
}
