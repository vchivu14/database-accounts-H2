package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;

    private String invoiceNumber;
    private String invoiceDate;
    private float invoiceTotal;
    private float paymentTotal;
    private float creditTotal;
    private String invoiceDueDate;
    private String paymentDate;

    @OneToOne
    @JoinColumn
    private Terms term;

    @ManyToOne
    @JoinColumn
    private Vendors vendor;

    public Invoices() {
    }

    public Invoices(String invoiceNumber, String invoiceDate, float invoiceTotal, float paymentTotal, float creditTotal, String invoiceDueDate, String paymentDate, Terms term, Vendors vendor) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.invoiceTotal = invoiceTotal;
        this.paymentTotal = paymentTotal;
        this.creditTotal = creditTotal;
        this.invoiceDueDate = invoiceDueDate;
        this.paymentDate = paymentDate;
        this.term = term;
        this.vendor = vendor;
    }

    public Terms getTerm() {
        return term;
    }

    public void setTerm(Terms term) {
        this.term = term;
    }

    public Vendors getVendor() {
        return vendor;
    }

    public void setVendor(Vendors vendor) {
        this.vendor = vendor;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(float invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public float getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(float paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public float getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(float creditTotal) {
        this.creditTotal = creditTotal;
    }

    public String getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(String invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
