package com.keybind.seikyukanri.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="codemaster")
public class Codemaster{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String code_name;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String code;
	
	@Column
	private String meaning;

	public String getCode_name() {
		return code_name;
	}

	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
}