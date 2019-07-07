package com.ox.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Customer {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private long accountNumber;
	private String Name;
	private int age;
	private String maritalStatus;
	private int creditScore;
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy =
	 * "customer") Loan loan;
	 */
	
	public Customer() {
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public Customer(long accountNumber, String name, int age, String maritalStatus, int creditScore) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.creditScore = creditScore;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
}
