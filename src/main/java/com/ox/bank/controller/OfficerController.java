package com.ox.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.Exception.LoanException;
import com.ox.bank.entity.Loan;
import com.ox.bank.service.ILoanService;

@RestController
public class OfficerController {

	@Autowired
	private ILoanService loanService;

	@GetMapping("/{status}")
	public ResponseEntity<List<Loan>>findAllByStatus(@PathVariable String status) {
		List<Loan> loanList = loanService.findByLoanStatus(status);
		return new ResponseEntity<>(loanList, HttpStatus.OK);
	}
	
	@PutMapping("/loanApproval/{loanId}")
	public ResponseEntity<String> loanApproval(@PathVariable long accountNumber)
			throws LoanException {

		String status = loanService.loanApproval(accountNumber);

		if (status.equalsIgnoreCase("Loan Approved!!"))
			return new ResponseEntity<String>(status, HttpStatus.OK);
		else
			return new ResponseEntity<String>(status, HttpStatus.BAD_REQUEST);

	}
}
