package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
public class Accounts {
    @Id
    private int accountNumber;
    private String accountDescription;

    @OneToOne(mappedBy = "account")
    private Vendors vendor;

    public Accounts() {
    }

    public Accounts(int accountNumber, String accountDescription) {
        this.accountNumber = accountNumber;
        this.accountDescription = accountDescription;
    }

    public Accounts(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
}
