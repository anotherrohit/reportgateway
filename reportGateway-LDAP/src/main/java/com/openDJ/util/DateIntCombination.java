/**
 * 
 */
package com.openDJ.util;

import java.util.Date;
import java.util.Objects;

import org.json.JSONObject;

/**
 * This class is created to store list of combination of two integers and a date with {@link #hashCode()} and {@link #equals(Object)}
 * 
 * @author Sagar Panchasara
 *
 */
public class DateIntCombination {

	private Date date;
	private Integer i1;
	private Integer i2;

	public DateIntCombination() {
	}

	public DateIntCombination(Date date, Integer i1) {
		this.date = date;
		this.i1 = i1;
	}

	public DateIntCombination(Date date, Integer i1, Integer i2) {
		this.date = date;
		this.i1 = i1;
		this.i2 = i2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}

	public Integer getI2() {
		return i2;
	}

	public void setI2(Integer i2) {
		this.i2 = i2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (date == null ? 0 : date.hashCode());
		result = prime * result + (i1 == null ? 0 : i1.hashCode());
		result = prime * result + (i2 == null ? 0 : i2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DateIntCombination) {
			DateIntCombination other = (DateIntCombination) obj;
			return Objects.equals(other.i1, this.i1) && Objects.equals(other.i2, this.i2) && other.date != null && this.date != null && other.date.getTime() == this.date.getTime();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}

}
