package com.ox.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanNumber;
	
	private long loanAmount;
	private long securityAmount;
	private String loanStatus;
	long officerId;
	long customerAccNo;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn Officer officer;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn Customer customer;
	 */
	public Loan() {

	}

	public Loan(long loanNumber, long loanAmount, long securityAmount, String loanStatus, long officerId,
			long customerAccNo) {
		super();
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
		this.securityAmount = securityAmount;
		this.loanStatus = loanStatus;
		this.officerId = officerId;
		this.customerAccNo = customerAccNo;
	}

	public long getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getSecurityAmount() {
		return securityAmount;
	}

	public void setSecurityAmount(long securityAmount) {
		this.securityAmount = securityAmount;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public long getOfficerId() {
		return officerId;
	}

	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}

	public long getCustomerAccNo() {
		return customerAccNo;
	}

	public void setCustomerAccNo(long customerAccNo) {
		this.customerAccNo = customerAccNo;
	}

	/*
	 * public Officer getOfficer() { return officer; }
	 * 
	 * public void setOfficer(Officer officer) { this.officer = officer; }
	 * 
	 * public Customer getCustomer() { return customer; }
	 * 
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */
}
