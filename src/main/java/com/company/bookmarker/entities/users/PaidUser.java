package com.company.bookmarker.entities.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.entities.libraries.PremiumLibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.tomcat.jni.Library;

@Entity
public class PaidUser extends User{    

    @OneToMany
    @JoinColumn(name = "paidUser_id")
    private Set<PremiumLibrary> premiumLibraries;

    @OneToOne
    private FreeLibrary freeLibrary;

    @ManyToOne
    private PaymentType paymentType;
    
    private int paymentTypeNumber;
    private float paymentValue;
    //private FreeLibrary freeLibrary;
    //private ArrayList<PremiumLibrary> premiumLibraries = new ArrayList<PremiumLibrary>();
    

    //Constructors
    public PaidUser() {
    }


    public Set<PremiumLibrary> getPremiumLibraries() {
        return premiumLibraries;
    }


    public void setPremiumLibraries(Set<PremiumLibrary> premiumLibraries) {
        this.premiumLibraries = premiumLibraries;
    }


    public FreeLibrary getFreeLibrary() {
        return freeLibrary;
    }


    public void setFreeLibrary(FreeLibrary freeLibrary) {
        this.freeLibrary = freeLibrary;
    }


    public PaymentType getPaymentType() {
        return paymentType;
    }


    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    public int getPaymentTypeNumber() {
        return paymentTypeNumber;
    }


    public void setPaymentTypeNumber(int paymentTypeNumber) {
        this.paymentTypeNumber = paymentTypeNumber;
    }


    public float getPaymentValue() {
        return paymentValue;
    }


    public void setPaymentValue(float paymentValue) {
        this.paymentValue = paymentValue;
    }

    
    
}
