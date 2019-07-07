package com.ox.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.entity.Loan;
import com.ox.bank.service.ILoanService;

@RestController
@RequestMapping("/")
public class LoanController {
	
	@Autowired
	ILoanService loanService;

	
	@PostMapping("/apply")
	public ResponseEntity<Loan> applyLoan(@RequestBody Loan loan) {
		Loan loan1 = loanService.applyLoan(loan);
		return new ResponseEntity<>(loan1, HttpStatus.CREATED);

			}

}
