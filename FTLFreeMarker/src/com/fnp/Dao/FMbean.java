package com.fnp.Dao;
public class FMbean {

	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIntrests() {
		return intrests;
	}
	public void setIntrests(String intrests) {
		this.intrests = intrests;
	}
	private String lastName;
	private String email;
	private String dob;
	private String mobile;
	private String address;
	private String qualification;
	private String gender;
	private String intrests;
	private int eno;
	@Override
	public String toString() {
		return "FMDao [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dob=" + dob
				+ ", mobile=" + mobile + ", address=" + address + ", qualification=" + qualification + ", gender="
				+ gender + ", intrests=" + intrests + "]";
	}
	
	
}
