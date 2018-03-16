package com.openDJ.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilterInfo {

	private Type type;
	private Object value;
	private String field;
	private Comparision comparison;
	private List<FilterInfo> filterInfoList = new ArrayList<>();

	public FilterInfo() {
	}
	
	public FilterInfo(Type type) {
		this.type = type;
	}

	public FilterInfo(Type type, Object value, String field) {
		super();
		this.type = type;
		this.value = value;
		this.field = field;
	}

	public FilterInfo(Object value, String field, Comparision comparison) {
		super();
		this.value = value;
		this.field = field;
		this.comparison = comparison;
	}
	
	public FilterInfo(Type type, Object value, String field, Comparision comparision) {
		super();
		this.type = type;
		this.value = value;
		this.field = field;
		this.comparison = comparision;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Comparision getComparison() {
		return comparison;
	}

	public void setComparison(Comparision comparison) {
		this.comparison = comparison;
	}

	public List<FilterInfo> getFilterInfoList() {
		return filterInfoList;
	}

	public void setFilterInfoList(List<FilterInfo> filterInfoList) {
		this.filterInfoList = filterInfoList;
	}

	public void addFilterInfo(FilterInfo filterInfo) {
		this.filterInfoList.add(filterInfo);
	}
	
	public void addFilterInfo(Type type, Object value, String field, Comparision comparison) {
		this.filterInfoList.add(new FilterInfo(type, value, field, comparison));
	}

	public enum Comparision {
		EQ, LE, LT, GE, GT, NE, LKS, iLKS;
	}

	public enum Type {
		STRING, LIST, NUMERIC, DATE, LONG, BOOLEAN, OBJECT, DOUBLE, PROPERTY, OR;
	}

}
