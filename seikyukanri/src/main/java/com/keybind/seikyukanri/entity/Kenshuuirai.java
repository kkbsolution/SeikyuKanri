package com.keybind.seikyukanri.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="kenshuuirai")
public class Kenshuuirai{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mitumori_no;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sequence;
	
	@Column
	private String note;
	
	@Column
	private String is_sent;

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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getIs_sent() {
		return is_sent;
	}

	public void setIs_sent(String is_sent) {
		this.is_sent = is_sent;
	}
	
	
}