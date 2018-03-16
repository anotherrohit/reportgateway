package com.openDJ.view.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

	@JsonProperty("start")
	private int start;

	@JsonProperty("limit")
	private int limit;

	public Pagination() {
	}

	public Pagination(int start, int limit) {
		this.start = start;
		this.limit = limit;
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

}
