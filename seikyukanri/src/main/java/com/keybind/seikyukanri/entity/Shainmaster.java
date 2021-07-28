package com.keybind.seikyukanri.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Shainmaster")
public class Shainmaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String shain_no;
	
	@Column
	private String shain_name;
	@Column
	private String division;
	@Column
	private String post;
	@Column
	private String mailaddress;
	@Column
	private String password;
	@Column
	private String permission;
	@Column
	private Date applying_date;
	@Column
	private String last_division;
	
	
	public String getShain_no() {
		return shain_no;
	}
	public void setShain_no(String shain_no) {
		this.shain_no = shain_no;
	}
	public String getShain_name() {
		return shain_name;
	}
	public void setShain_name(String shain_name) {
		this.shain_name = shain_name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getMailaddress() {
		return mailaddress;
	}
	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public Date getApplying_date() {
		return applying_date;
	}
	public void setApplying_date(Date applying_date) {
		this.applying_date = applying_date;
	}
	public String getLast_division() {
		return last_division;
	}
	public void setLast_division(String last_division) {
		this.last_division = last_division;
	}
	
	
}
