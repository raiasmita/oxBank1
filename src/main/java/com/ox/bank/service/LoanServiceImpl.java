package com.ox.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ox.bank.Exception.LoanException;
import com.ox.bank.entity.Customer;
import com.ox.bank.entity.Loan;
import com.ox.bank.repository.CustomerRepository;
import com.ox.bank.repository.LoanRepository;

public class LoanServiceImpl implements ILoanService {
	
	@Autowired
	LoanRepository loanRepo;
	
	@Autowired
	CustomerRepository customerRepo;

	public Loan applyLoan(Loan loan){
		return customerRepo.save(loan);
	}
	@Override
	public List<Loan> findByLoanStatus(String loanStatus) {
		List<Loan> loanList = loanRepo.findByLoanStatus(loanStatus);
		return loanList;
	}

	@Override
	public String loanApproval(long accountNumber) throws LoanException {
		Loan loan = new Loan();
		Customer customer = new Customer();
		customer.setAccountNumber(accountNumber);
		loan = loanRepo.findByCustomer(customer);
		if (loan != null) {
			loan = loanRepo.findByloanNumber(loan.getLoanNumber());
			if (loan != null) {
				return "customer is already having loan";
			}else if (loan == null) {
				customer = customerRepo.findByAccountNumber(accountNumber);
				if(loan.getSecurityAmount() == 2*loan.getLoanAmount()) {
					if(customer.getCreditScore()>=600) {
						
						if(customer.getAge()>=24 && customer.getAge()<60) {
							
							if(customer.getMaritalStatus().equals("married") && (customer.getAge()>=24 && customer.getAge()<29)) {
								
								loan.setLoanStatus("Approved");
								
							}else {
								loan.setLoanStatus("Rejected");
								throw new LoanException("If you are married and your age is between 24 to 29");
							}
						}else {
							loan.setLoanStatus("Rejected");
							throw new LoanException("Age should have maximum age of 60 and minimum of 24");
						}
						
					}else {
						loan.setLoanStatus("Rejected");
						throw new LoanException("Customer cannot have less than 600 Credit Score");
					}
					
				}else {
					loan.setLoanStatus("Rejected");
					throw new LoanException("Security valued should be double the loan amount ");
				}
					
					
		}
		}
		return null;
		
}
}
