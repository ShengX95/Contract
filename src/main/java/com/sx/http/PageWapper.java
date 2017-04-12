package com.sx.http;

import java.util.List;

public class PageWapper<T> {
	private int total;
	private List<T> rows;
	public PageWapper(int total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "PageWapper [total=" + total + ", rows=" + rows + "]";
	}
}
