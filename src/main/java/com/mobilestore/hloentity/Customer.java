package com.mobilestore.hloentity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="UDAYKumar")
//@NamedQuery(name = "g1", query = "insert into UDAY values(")
public class Customer {
	
	
	@Id
	@GeneratedValue(generator="g1")
	@GenericGenerator(name="g1",strategy="increment")
	@Column(name="id",length=5,nullable=false)
	private int cid;
	@Column(name="firstname",length=15,nullable=false)
	private String fname;
	@Column(name="lname",length=15,nullable=true)
	private String lname;
	@Column(name="email",length=25,unique=true)
	private String email;
	@Column(name="mobileno",length=12)
	private Long mno;
	@Column(name="gender",length=10)
	private String gender;
	@Column(name="password",length=15)
	private String password;
	/*public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCid() {
		return cid;
	}*/
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}public void setMno(Long mno) {
		this.mno = mno;
	}
	public Long getMno() {
		return mno;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [cid="  + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mmobileno="
				+ mno + ", gender=" + gender + ", password=" + password + "]";
	}
	

}
