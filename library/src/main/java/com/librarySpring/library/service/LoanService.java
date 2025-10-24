package com.librarySpring.library.service;

import com.librarySpring.library.model.Loan;
import com.librarySpring.library.model.LoanStatus;
import com.librarySpring.library.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> findActiveLoansByUser(Long userId) {
        return loanRepository.findActiveLoansByUser(userId, LoanStatus.ACTIVE);
    }

    public List<Loan> findLateLoans() {
        return loanRepository.findLateLoans(LocalDate.now(), LoanStatus.ACTIVE);
    }
}
