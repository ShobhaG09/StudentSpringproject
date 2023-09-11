package com.spring;

public class Address 
{
	private Integer  houseNo;
	private String houseName;
	private  String pinCode;
	public Address(Integer houseNo, String houseName, String pinCode) 
	{
		super();
		this.houseNo = houseNo;
		this.houseName = houseName;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "\t houseNo : " + houseNo + "\n\t\t\t houseName : " + houseName + "\n\t\t\t pinCode : " + pinCode ;
	}
	
	
	

}
