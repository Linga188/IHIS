package com.ashokit.binding;

import java.util.Date;

public class CWAccountForm {
	
	
	private String fullName;

	private String email;

	

	private String gender;

	private Date dob;
	
	private long ssn;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public CWAccountForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CWAccountForm [fullName=" + fullName + ", email=" + email + ", gender="
				+ gender + ", dob=" + dob + ", ssn=" + ssn + "]";
	}


}
