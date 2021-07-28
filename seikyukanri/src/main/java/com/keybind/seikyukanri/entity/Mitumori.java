package com.keybind.seikyukanri.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mitumori")
public class Mitumori{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String mitumori_no;
	
	@Column
	private Integer busho;
	
	@Column
	private Integer atesaki;
	
	@Column
	private String gyomu;
	
	@Column
	private String kaihatu;
	
	@Column
	private String gyomu_no;
	
	@Column
	private Integer keiyaku;
	
	@Column
	private String sagyo;
	
	@Column
	private String sagyo_start;
	
	@Column
	private String sagyo_end;
	
	@Column
	private Integer man_month;
	
	@Column
	private String delivery_date;
	
	@Column
	private String delivery_object;
	
	@Column
	private String representative;
	
	@Column
	private String work_skill;
	
	@Column
	private String location;
	
	@Column
	private Integer mitumori_total;
	
	@Column
	private String note;
	
	@Column
	private Integer is_sent;

	public String getMitumori_no() {
		return mitumori_no;
	}

	public void setMitumori_no(String mitumori_no) {
		this.mitumori_no = mitumori_no;
	}

	public Integer getBusho() {
		return busho;
	}

	public void setBusho(Integer busho) {
		this.busho = busho;
	}

	public Integer getAtesaki() {
		return atesaki;
	}

	public void setAtesaki(Integer atesaki) {
		this.atesaki = atesaki;
	}

	public String getGyomu() {
		return gyomu;
	}

	public void setGyomu(String gyomu) {
		this.gyomu = gyomu;
	}

	public String getKaihatu() {
		return kaihatu;
	}

	public void setKaihatu(String kaihatu) {
		this.kaihatu = kaihatu;
	}

	public String getGyomu_no() {
		return gyomu_no;
	}

	public void setGyomu_no(String gyomu_no) {
		this.gyomu_no = gyomu_no;
	}

	public Integer getKeiyaku() {
		return keiyaku;
	}

	public void setKeiyaku(Integer keiyaku) {
		this.keiyaku = keiyaku;
	}

	public String getSagyo() {
		return sagyo;
	}

	public void setSagyo(String sagyo) {
		this.sagyo = sagyo;
	}

	public String getSagyo_start() {
		return sagyo_start;
	}

	public void setSagyo_start(String sagyo_start) {
		this.sagyo_start = sagyo_start;
	}

	public String getSagyo_end() {
		return sagyo_end;
	}

	public void setSagyo_end(String sagyo_end) {
		this.sagyo_end = sagyo_end;
	}

	public Integer getMan_month() {
		return man_month;
	}

	public void setMan_month(Integer man_month) {
		this.man_month = man_month;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getDelivery_object() {
		return delivery_object;
	}

	public void setDelivery_object(String delivery_object) {
		this.delivery_object = delivery_object;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public String getWork_skill() {
		return work_skill;
	}

	public void setWork_skill(String work_skill) {
		this.work_skill = work_skill;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMitumori_total() {
		return mitumori_total;
	}

	public void setMitumori_total(Integer mitumori_total) {
		this.mitumori_total = mitumori_total;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getIs_sent() {
		return is_sent;
	}

	public void setIs_sent(Integer is_sent) {
		this.is_sent = is_sent;
	} 
}