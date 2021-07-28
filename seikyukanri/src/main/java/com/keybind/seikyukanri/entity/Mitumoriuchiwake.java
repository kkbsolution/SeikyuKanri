package com.keybind.seikyukanri.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mitumoriuchiwake")
public class Mitumoriuchiwake{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mitumori_no;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sequence;
	
	@Column
	private Integer busho;
	
	@Column
	private String name;
	
	@Column
	private Integer unit_price;
	
	@Column
	private Date sagyo_start;
	
	@Column
	private Date sagyo_end;
	
	@Column
	private Integer man_manth;
	
	@Column
	private String time_or_fixed;
	
	@Column
	private Integer time_width;
	
	@Column
	private Integer zougaku_price;
	
	@Column
	private Integer gengaku_price;
	
	@Column
	private String note;

	public String getMitumori_no() {
		return mitumori_no;
	}

	public void setMitumori_no(String mitumori_no) {
		this.mitumori_no = mitumori_no;
	}
	
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Integer getBusho() {
		return busho;
	}

	public void setBusho(Integer busho) {
		this.busho = busho;
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

	public Date getSagyo_start() {
		return sagyo_start;
	}

	public void setSagyo_start(Date sagyo_start) {
		this.sagyo_start = sagyo_start;
	}

	public Date getSagyo_end() {
		return sagyo_end;
	}

	public void setSagyo_end(Date sagyo_end) {
		this.sagyo_end = sagyo_end;
	}

	public Integer getMan_manth() {
		return man_manth;
	}

	public void setMan_manth(Integer man_manth) {
		this.man_manth = man_manth;
	}

	public String getTime_or_fixed() {
		return time_or_fixed;
	}

	public void setTime_or_fixed(String time_or_fixed) {
		this.time_or_fixed = time_or_fixed;
	}

	public Integer getTime_width() {
		return time_width;
	}

	public void setTime_width(Integer time_width) {
		this.time_width = time_width;
	}

	public Integer getZougaku_price() {
		return zougaku_price;
	}

	public void setZougaku_price(Integer zougaku_price) {
		this.zougaku_price = zougaku_price;
	}

	public Integer getGengaku_price() {
		return gengaku_price;
	}

	public void setGengaku_price(Integer gengaku_price) {
		this.gengaku_price = gengaku_price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}