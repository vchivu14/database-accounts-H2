package com.example.databasedemo2.data.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vendors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vendorId;

    private String vendorName;
    private String address1;
    private String vendorCity;
    private String vendorPhone;
    private String vendorContactLastName;
    private String vendorContactFirstName;

    @OneToOne
    @JoinColumn
    private Terms term;

    @OneToOne
    @JoinColumn
    private Accounts account;

    @OneToMany(mappedBy = "vendor")
    private Set<Invoices> invoices;

    public Vendors() {
    }

    public Vendors(String vendorName, String address1, String vendorCity, String vendorPhone, String vendorContactLastName, String vendorContactFirstName) {
        this.vendorName = vendorName;
        this.address1 = address1;
        this.vendorCity = vendorCity;
        this.vendorPhone = vendorPhone;
        this.vendorContactLastName = vendorContactLastName;
        this.vendorContactFirstName = vendorContactFirstName;
    }

    public Vendors(String vendorName, String address1, String vendorCity, String vendorPhone, String vendorContactLastName, String vendorContactFirstName, Terms term, Accounts account) {
        this.vendorName = vendorName;
        this.address1 = address1;
        this.vendorCity = vendorCity;
        this.vendorPhone = vendorPhone;
        this.vendorContactLastName = vendorContactLastName;
        this.vendorContactFirstName = vendorContactFirstName;
        this.term = term;
        this.account = account;
    }

    public Set<Invoices> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoices> invoices) {
        this.invoices = invoices;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Terms getTerm() {
        return term;
    }

    public void setTerm(Terms term) {
        this.term = term;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorContactLastName() {
        return vendorContactLastName;
    }

    public void setVendorContactLastName(String vendorContactLastName) {
        this.vendorContactLastName = vendorContactLastName;
    }

    public String getVendorContactFirstName() {
        return vendorContactFirstName;
    }

    public void setVendorContactFirstName(String vendorContactFirstName) {
        this.vendorContactFirstName = vendorContactFirstName;
    }

}
