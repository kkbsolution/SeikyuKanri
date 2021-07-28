package com.keybind.seikyukanri.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="torihikimaster")
public class Torihikimaster{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer torihiki_code;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String torihiki_name;
	
	@Column
	private String torihiki_address;
	
	@Column
	private String torihiki_phone;
}