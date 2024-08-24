package com.example.demo.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "loan_amount", precision = 10, scale = 0)
    private BigDecimal loanAmount;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column(name = "status", length = 5)
    private String status;
    

    public Loan() {
    }

    public Loan(Long id, Client client, BigDecimal loanAmount, LocalDateTime dueDate, String status) {
        this.id = id;
        this.client = client;
        this.loanAmount = loanAmount;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BigDecimal getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LocalDateTime getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loan id(Long id) {
        setId(id);
        return this;
    }

    public Loan client(Client client) {
        setClient(client);
        return this;
    }

    public Loan loanAmount(BigDecimal loanAmount) {
        setLoanAmount(loanAmount);
        return this;
    }

    public Loan dueDate(LocalDateTime dueDate) {
        setDueDate(dueDate);
        return this;
    }

    public Loan status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Loan)) {
            return false;
        }
        Loan loan = (Loan) o;
        return Objects.equals(id, loan.id) && Objects.equals(client, loan.client) && Objects.equals(loanAmount, loan.loanAmount) && Objects.equals(dueDate, loan.dueDate) && Objects.equals(status, loan.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, loanAmount, dueDate, status);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", client='" + getClient() + "'" +
            ", loanAmount='" + getLoanAmount() + "'" +
            ", dueDate='" + getDueDate() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    
}
