package com.sohel.dto;

public class Aadhar {
private int aadharId;
private String aadharHolderName;
private int aadharHolderAge;
private char aadharHolderGender;
private long mobileNumder;
private double aadharHolderIncome;
private Address address;
public int getAadharId() {
	return aadharId;
}
public String getAadharHolderName() {
	return aadharHolderName;
}
public int getAadharHolderAge() {
	return aadharHolderAge;
}
public char getAadharHolderGender() {
	return aadharHolderGender;
}
public long getMobileNumder() {
	return mobileNumder;
}
public double getAadharHolderIncome() {
	return aadharHolderIncome;
}
public Address getAddress() {
	return address;
}
public void setAadharId(int aadharId) {
	this.aadharId = aadharId;
}
public void setAadharHolderName(String aadharHolderName) {
	this.aadharHolderName = aadharHolderName;
}
public void setAadharHolderAge(int aadharHolderAge) {
	this.aadharHolderAge = aadharHolderAge;
}
public void setAadharHolderGender(char aadharHolderGender) {
	this.aadharHolderGender = aadharHolderGender;
}
public void setMobileNumder(long mobileNumder) {
	this.mobileNumder = mobileNumder;
}
public void setAadharHolderIncome(double aadharHolderIncome) {
	this.aadharHolderIncome = aadharHolderIncome;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Aadhar [aadharId=" + aadharId + ", aadharHolderName=" + aadharHolderName + ", aadharHolderAge="
			+ aadharHolderAge + ", aadharHolderGender=" + aadharHolderGender + ", mobileNumder=" + mobileNumder
			+ ", aadharHolderIncome=" + aadharHolderIncome + ", address=" + address + "]";
}

}
