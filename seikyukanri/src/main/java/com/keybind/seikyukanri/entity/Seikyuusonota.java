package com.keybind.seikyukanri.entity;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Seikyuusonota")
public class Seikyuusonota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private String seikyuu_no;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer sequense;
	
	@Column
	private String name;
	
	@Column
	private Integer seikyuu_price;
	
	@Column
	private String note;

	
	public String getSeikyuu_no() {
		return seikyuu_no;
	}

	public void setSeikyuu_no(String seikyuu_no) {
		this.seikyuu_no = seikyuu_no;
	}

	public Integer getSequense() {
		return sequense;
	}

	public void setSequense(Integer sequense) {
		this.sequense = sequense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSeikyuu_price() {
		return seikyuu_price;
	}

	public void setSeikyuu_price(Integer seikyuu_price) {
		this.seikyuu_price = seikyuu_price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
