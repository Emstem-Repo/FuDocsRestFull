package com.emst.Fudocs.dto;

public class AcademicYearDTO {
	
	private long id;
	private String year;
	private String dataEntries;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDataEntries() {
		return dataEntries;
	}
	public void setDataEntries(String dataEntries) {
		this.dataEntries = dataEntries;
	}
}
