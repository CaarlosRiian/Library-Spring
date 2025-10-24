package com.librarySpring.library.repository;

import com.librarySpring.library.model.Loan;
import com.librarySpring.library.model.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query("SELECT DISTINCT l FROM Loan l LEFT JOIN FETCH l.items i LEFT JOIN FETCH i.book " +
            "WHERE l.user.id = :userId AND l.status = :status")
    List<Loan> findActiveLoansByUser(@Param("userId") Long userId, @Param("status") LoanStatus status);

    @Query("SELECT DISTINCT l FROM Loan l LEFT JOIN FETCH l.user u LEFT JOIN FETCH l.items i LEFT JOIN FETCH i.book " +
            "WHERE l.dueDate < :today AND l.status = :status")
    List<Loan> findLateLoans(@Param("today") LocalDate today, @Param("status") LoanStatus status);
}
