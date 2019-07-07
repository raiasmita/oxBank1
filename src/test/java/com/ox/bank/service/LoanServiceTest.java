package com.ox.bank.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ox.bank.entity.Loan;
import com.ox.bank.repository.LoanRepository;

@RunWith(MockitoJUnitRunner.class)
public class LoanServiceTest {

	@InjectMocks
	LoanServiceImpl loanService;
	
	@Mock
	LoanRepository loanRepo;
	
	@Test
	public void applyLoan(Loan loan) {
		Loan loan1 = new Loan(1001,1200, 25000, "pending", 101,120901 );
		when(loanRepo.save(loan1)).thenReturn(loan);
		Loan actualResult = loanService.applyLoan(loan1);
		assertEquals(loan1, actualResult);
	

		// Negative case
		loan1 = null;
		Loan actualResultNegative = loanService.applyLoan(loan);
		assertEquals(null, actualResultNegative);

	}
}

