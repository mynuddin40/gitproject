package com.sohel.dto;

public class Address {
private String Village;
private String mandal;
private String district;
private String state;
private long pincode;
public String getVillage() {
	return Village;
}
public String getMandal() {
	return mandal;
}
public String getDistrict() {
	return district;
}
public String getState() {
	return state;
}
public long getPincode() {
	return pincode;
}
public void setVillage(String village) {
	Village = village;
}
public void setMandal(String mandal) {
	this.mandal = mandal;
}
public void setDistrict(String district) {
	this.district = district;
}
public void setState(String state) {
	this.state = state;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [Village=" + Village + ", mandal=" + mandal + ", district=" + district + ", state=" + state
			+ ", pincode=" + pincode + "]";
}

}
