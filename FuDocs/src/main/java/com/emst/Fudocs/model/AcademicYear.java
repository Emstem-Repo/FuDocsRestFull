package com.emst.Fudocs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcademicYear {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long id;
	private String year;
	private String dataEntries;
	
	public AcademicYear() {
		super();
	}

	public AcademicYear(int[] academicYear, String year, String dataEntries, String description) {
		super();
		this.year = year;
		this.dataEntries = dataEntries;
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


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
