package com.ox.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
/* @Table(name= "Officer") */
public class Officer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String level;
	
	
	/*
	 * @OneToMany(mappedBy = "officer", cascade = CascadeType.REMOVE) private
	 * Set<Loan> Loans;
	 */
	 

	public Officer() {

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	/*
	 * public Set<Loan> getLoans() { return Loans; }
	 * 
	 * public void setLoans(Set<Loan> loans) { Loans = loans; }
	 */

}
