package com.ox.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ox.bank.entity.Customer;
import com.ox.bank.entity.Loan;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	public Customer findByAccountNumber(long accountNumber);

	public Loan save(Loan loan);
}
