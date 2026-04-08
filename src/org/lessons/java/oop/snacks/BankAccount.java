package org.lessons.java.oop.snacks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    // public void setAccountNumber(int accountNumber) {
    // this.accountNumber = accountNumber;
    // }

    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    public void deposit(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(amount);
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0 && this.balance.compareTo(amount) >= 0) {
            this.balance = this.balance.subtract(amount);
        }
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public BankAccount() {
        Random r = new Random();
        this.accountNumber = r.nextInt(999999);

        this.balance = BigDecimal.ZERO;

    }
}
