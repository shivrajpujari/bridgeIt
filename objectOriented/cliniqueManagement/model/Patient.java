package com.bridgeIt.objectOriented.cliniqueManagement.model;

public class Patient {
	
	private String name;
	private String mobileNumber;
	private String id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", mobileNumber=" + mobileNumber + ", id=" + id + "]";
	}
	
	
}
