package com.keybind.seikyukanri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bushomaster")
public class Bushomaster{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String busho_cd;
	
	@Column
	private String busho_name;
}