package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
public class Terms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int termsId;

    private String termsDescription;
    private int termsDueDays;

    @OneToOne(mappedBy = "term")
    private Vendors vendor;

    @OneToOne(mappedBy = "term")
    private Invoices invoice;

    public Terms() {
    }

    public Terms(String termsDescription, int termsDueDays) {
        this.termsDescription = termsDescription;
        this.termsDueDays = termsDueDays;
    }

    public Vendors getVendor() {
        return vendor;
    }

    public void setVendor(Vendors vendor) {
        this.vendor = vendor;
    }

    public int getTermsId() {
        return termsId;
    }

    public void setTermsId(int termsId) {
        this.termsId = termsId;
    }

    public String getTermsDescription() {
        return termsDescription;
    }

    public void setTermsDescription(String termsDescription) {
        this.termsDescription = termsDescription;
    }

    public int getTermsDueDays() {
        return termsDueDays;
    }

    public void setTermsDueDays(int termsDueDays) {
        this.termsDueDays = termsDueDays;
    }
}
