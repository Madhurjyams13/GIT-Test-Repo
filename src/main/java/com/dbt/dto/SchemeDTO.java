package com.dbt.dto;


import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value="schemeDetails")
public class SchemeDTO {

	
	public String schemeCode;
	
	public String schemeName;
	
	public String month;
	
	public String year;
	
	public String dataB;
	
	public String dataC;

	public String getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDataB() {
		return dataB;
	}

	public void setDataB(String dataB) {
		this.dataB = dataB;
	}

	public String getDataC() {
		return dataC;
	}

	public void setDataC(String dataC) {
		this.dataC = dataC;
	}

	
	
	
	
	
	
}
