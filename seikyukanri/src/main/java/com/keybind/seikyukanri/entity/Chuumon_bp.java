package com.keybind.seikyukanri.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chuumon_bp")
public class Chuumon_bp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mitumori_no;
	
	@Column
	private Integer atesaki;
	
	@Column
	private String keiyaku_no;
	
	@Column
	private String shinchoku_no;
	
	@Column
	private Date delivery_deadline;
	
	@Column
	private Date kenshu_deadline;
	
	@Column
	private String delivery_place;
	
	@Column
	private String other;
	
	@Column
	private Integer si_sent;

	public String getMitumori_no() {
		return mitumori_no;
	}

	public void setMitumori_no(String mitumori_no) {
		this.mitumori_no = mitumori_no;
	}

	public Integer getAtesaki() {
		return atesaki;
	}

	public void setAtesaki(Integer atesaki) {
		this.atesaki = atesaki;
	}

	public String getKeiyaku_no() {
		return keiyaku_no;
	}

	public void setKeiyaku_no(String keiyaku_no) {
		this.keiyaku_no = keiyaku_no;
	}

	public String getShinchoku_no() {
		return shinchoku_no;
	}

	public void setShinchoku_no(String shinchoku_no) {
		this.shinchoku_no = shinchoku_no;
	}

	public Date getDelivery_deadline() {
		return delivery_deadline;
	}

	public void setDelivery_deadline(Date delivery_deadline) {
		this.delivery_deadline = delivery_deadline;
	}

	public Date getKenshu_deadline() {
		return kenshu_deadline;
	}

	public void setKenshu_deadline(Date kenshu_deadline) {
		this.kenshu_deadline = kenshu_deadline;
	}

	public String getDelivery_place() {
		return delivery_place;
	}

	public void setDelivery_place(String delivery_place) {
		this.delivery_place = delivery_place;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Integer getSi_sent() {
		return si_sent;
	}

	public void setSi_sent(Integer si_sent) {
		this.si_sent = si_sent;
	}
	
	
	
}
