package com.zf.test;

import java.io.Serializable;
import java.util.Date;

public class TestTable implements Serializable {
	private static final long serialVersionUID = 1L;
	private int keyIndex = 0;
	private String text = "";
	private Date date = new Date();
	public TestTable() {
		super();
	}
	public TestTable(int index) {
		this.keyIndex = index;
	}
	public int getKeyIndex() {
		return keyIndex;
	}
	public void setKeyIndex(int index) {
		this.keyIndex = index;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
