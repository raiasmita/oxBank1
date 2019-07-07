package com.ox.bank.service;

import java.util.List;

import com.ox.bank.Exception.LoanException;
import com.ox.bank.entity.Loan;

public interface ILoanService {
	public Loan applyLoan(Loan loan);
	public String  loanApproval(long accountNumber) throws LoanException;
	public List<Loan> findByLoanStatus(String loanStatus);

}
