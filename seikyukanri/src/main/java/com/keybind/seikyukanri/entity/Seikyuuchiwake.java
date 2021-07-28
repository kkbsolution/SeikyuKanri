package com.keybind.seikyukanri.entity;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Seikyuuchiwake")
public class Seikyuuchiwake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String seikyuu_no;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer sequense;
	
	@Column
	private String name;
	
	@Column
	private Integer unit_price;
	
	@Column
	private Integer man_month;
	
	@Column
	private Integer overtime;
	
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

	public Integer getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Integer unit_price) {
		this.unit_price = unit_price;
	}

	public Integer getMan_month() {
		return man_month;
	}

	public void setMan_month(Integer man_month) {
		this.man_month = man_month;
	}

	public Integer getOvertime() {
		return overtime;
	}

	public void setOvertime(Integer overtime) {
		this.overtime = overtime;
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
