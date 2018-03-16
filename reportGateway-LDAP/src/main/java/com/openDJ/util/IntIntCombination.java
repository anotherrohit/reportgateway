/**
 * 
 */
package com.openDJ.util;

import java.util.Objects;

import org.json.JSONObject;

/**
 * This class is created to store list of combination of two integers with {@link #hashCode()} and {@link #equals(Object)}
 * 
 * @author Sagar Panchasara
 *
 */
public class IntIntCombination {

	private Integer i1;
	private Integer i2;
	private Integer i3;

	public IntIntCombination() {
	}

	public IntIntCombination(Integer i1, Integer i2) {
		this.i1 = i1;
		this.i2 = i2;
	}

	public IntIntCombination(Integer i1, Integer i2, Integer i3) {
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
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

	public Integer getI3() {
		return i3;
	}

	public void setI3(Integer i3) {
		this.i3 = i3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (i1 == null ? 0 : i1.hashCode());
		result = prime * result + (i2 == null ? 0 : i2.hashCode());
		result = prime * result + (i3 == null ? 0 : i3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof IntIntCombination) {
			IntIntCombination other = (IntIntCombination) obj;
			return Objects.equals(other.i1, this.i1) && Objects.equals(other.i2, this.i2) && Objects.equals(other.i3, this.i3);
		}
		return false;
	}

	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}

}
