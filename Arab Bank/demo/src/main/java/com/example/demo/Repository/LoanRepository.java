package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    
}
