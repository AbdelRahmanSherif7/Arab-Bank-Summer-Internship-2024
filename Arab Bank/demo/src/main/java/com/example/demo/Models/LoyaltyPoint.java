package com.example.demo.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "loyalty_points")
public class LoyaltyPoint {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "balance", precision = 10, scale = 0)
    private BigDecimal balance;

    @Column(name = "has_credit_card", length = 4)
    private String hasCreditCard;

    @Column(name = "children_count")
    private int childrenCount;

    @Column(name = "loyalty_points")
    private int loyaltyPoints;


    public LoyaltyPoint() {
    }

    public LoyaltyPoint(Long id, String firstName, String lastName, String email, String password, BigDecimal balance, String hasCreditCard, int childrenCount, int loyaltyPoints) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.hasCreditCard = hasCreditCard;
        this.childrenCount = childrenCount;
        this.loyaltyPoints = loyaltyPoints;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getHasCreditCard() {
        return this.hasCreditCard;
    }

    public void setHasCreditCard(String hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public int getChildrenCount() {
        return this.childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public int getLoyaltyPoints() {
        return this.loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public LoyaltyPoint id(Long id) {
        setId(id);
        return this;
    }

    public LoyaltyPoint firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public LoyaltyPoint lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public LoyaltyPoint email(String email) {
        setEmail(email);
        return this;
    }

    public LoyaltyPoint password(String password) {
        setPassword(password);
        return this;
    }

    public LoyaltyPoint balance(BigDecimal balance) {
        setBalance(balance);
        return this;
    }

    public LoyaltyPoint hasCreditCard(String hasCreditCard) {
        setHasCreditCard(hasCreditCard);
        return this;
    }

    public LoyaltyPoint childrenCount(int childrenCount) {
        setChildrenCount(childrenCount);
        return this;
    }

    public LoyaltyPoint loyaltyPoints(int loyaltyPoints) {
        setLoyaltyPoints(loyaltyPoints);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LoyaltyPoint)) {
            return false;
        }
        LoyaltyPoint loyaltyPoint = (LoyaltyPoint) o;
        return Objects.equals(id, loyaltyPoint.id) && Objects.equals(firstName, loyaltyPoint.firstName) && Objects.equals(lastName, loyaltyPoint.lastName) && Objects.equals(email, loyaltyPoint.email) && Objects.equals(password, loyaltyPoint.password) && Objects.equals(balance, loyaltyPoint.balance) && Objects.equals(hasCreditCard, loyaltyPoint.hasCreditCard) && childrenCount == loyaltyPoint.childrenCount && loyaltyPoints == loyaltyPoint.loyaltyPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password, balance, hasCreditCard, childrenCount, loyaltyPoints);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", balance='" + getBalance() + "'" +
            ", hasCreditCard='" + getHasCreditCard() + "'" +
            ", childrenCount='" + getChildrenCount() + "'" +
            ", loyaltyPoints='" + getLoyaltyPoints() + "'" +
            "}";
    }
    
}
