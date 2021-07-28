package com.keybind.seikyukanri.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Seikyuu_bp")
public class Seikyuu_bp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mitumori_no;
	
	@Column
	private String seikyuu_no;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer sequense;
	
	@Column
	private Integer total;
	
	@Column
	private String note;
	
	@Column
	private Date seikyuu_date;
	
	@Column
	private String is_sent;
	
	@Column
	private Integer nyuukin_price;
	
	@Column
	private Date nyuukin_date;

	
	public String getMitumori_no() {
		return mitumori_no;
	}

	public void setMitumori_no(String mitumori_no) {
		this.mitumori_no = mitumori_no;
	}

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

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getSeikyuu_date() {
		return seikyuu_date;
	}

	public void setSeikyuu_date(Date seikyuu_date) {
		this.seikyuu_date = seikyuu_date;
	}

	public String getIs_sent() {
		return is_sent;
	}

	public void setIs_sent(String is_sent) {
		this.is_sent = is_sent;
	}

	public Integer getNyuukin_price() {
		return nyuukin_price;
	}

	public void setNyuukin_price(Integer nyuukin_price) {
		this.nyuukin_price = nyuukin_price;
	}

	public Date getNyuukin_date() {
		return nyuukin_date;
	}

	public void setNyuukin_date(Date nyuukin_date) {
		this.nyuukin_date = nyuukin_date;
	}
	
	
}
