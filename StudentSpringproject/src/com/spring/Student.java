package com.spring;

import java.util.Date;

public class Student 
{
	private Integer studRollNo;
	private String studName;
	private Double studContact;
	private Date studAdmissionDate;
	private Address studAddress;
	private Float studPercentage;
	public Student(Integer studRollNo, String studName, Double studContact, Date studAdmissionDate, Address studAddress,Float studPercentage) 
	{
		super();
		this.studRollNo = studRollNo;
		this.studName = studName;
		this.studContact = studContact;
		this.studAdmissionDate = studAdmissionDate;
		this.studAddress = studAddress;
		this.studPercentage = studPercentage;
	}
	@Override
	public String toString() 
	{
		System.out.println("------------------------------------------------");
		System.out.println(" ***************Student Details*************** ");
		return "\n studRollNo = " + studRollNo + "\n studName = " + studName + "\n studContact = " + studContact
				+ "\n studAdmissionDate = " + studAdmissionDate + "\n studAddress = " + studAddress + "\n studPercentage = "
				+ studPercentage ;
	}
	
	
	

}
