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
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "amount", precision = 65, scale = 0)
    private BigDecimal amount;

    @Column(name = "transaction_type", length = 20)
    private String transactionType;

    @Column(name = "description", length = 25)
    private String description;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;
    

    public Transaction() {
    }

    public Transaction(Long id, Client client, BigDecimal amount, String transactionType, String description, LocalDateTime timestamp) {
        this.id = id;
        this.client = client;
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
        this.timestamp = timestamp;
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

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction id(Long id) {
        setId(id);
        return this;
    }

    public Transaction client(Client client) {
        setClient(client);
        return this;
    }

    public Transaction amount(BigDecimal amount) {
        setAmount(amount);
        return this;
    }

    public Transaction transactionType(String transactionType) {
        setTransactionType(transactionType);
        return this;
    }

    public Transaction description(String description) {
        setDescription(description);
        return this;
    }

    public Transaction timestamp(LocalDateTime timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return Objects.equals(id, transaction.id) && Objects.equals(client, transaction.client) && Objects.equals(amount, transaction.amount) && Objects.equals(transactionType, transaction.transactionType) && Objects.equals(description, transaction.description) && Objects.equals(timestamp, transaction.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, amount, transactionType, description, timestamp);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", client='" + getClient() + "'" +
            ", amount='" + getAmount() + "'" +
            ", transactionType='" + getTransactionType() + "'" +
            ", description='" + getDescription() + "'" +
            ", timestamp='" + getTimestamp() + "'" +
            "}";
    }
    
}
