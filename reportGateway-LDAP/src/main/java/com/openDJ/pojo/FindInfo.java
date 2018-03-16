package com.openDJ.pojo;

import java.util.ArrayList;
import java.util.List;

import com.openDJ.pojo.FilterInfo.Comparision;
import com.openDJ.pojo.FilterInfo.Type;

public class FindInfo {
	
	public enum SortOrder {
		ASC, DESC
	};
	
	private String orderBy;
	private SortOrder sortOrder = SortOrder.DESC;
	private int start;
	private int limit;
	
	private List<FilterInfo> filterInfoList = new ArrayList<FilterInfo>();
	
	public FindInfo() {
		orderBy = "id";
		start = 0;
		limit = 4000;
	}

	public SortOrder getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public List<FilterInfo> getFilterInfoList() {
		return filterInfoList;
	}
		
	public void addFilterInfo(FilterInfo filterInfo) {
		getFilterInfoList().add(filterInfo);		
	}
	
	public void addFilterInfo(Type type, Object value, String field, Comparision comparision){
		FilterInfo filterInfo = new FilterInfo(type, value, field, comparision);
		addFilterInfo(filterInfo);
	}

	public void sortBy(String propertyName, SortOrder sortOrder) {
		setOrderBy(propertyName);
		setSortOrder(sortOrder);		
	}

	public void paginate(int start, int limit) {
		setLimit(limit);
		setStart(start);
	}

	public void removeFilterInfo(FilterInfo filterInfo) {
		getFilterInfoList().remove(filterInfo);
	}
	
}
