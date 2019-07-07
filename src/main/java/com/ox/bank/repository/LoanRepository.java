package com.ox.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ox.bank.entity.Customer;
import com.ox.bank.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

	List<Loan> findByLoanStatus(String loanStatus);
	public Loan findByCustomer(Customer customer);
	Loan findByloanNumber(long loanNumber);

}
