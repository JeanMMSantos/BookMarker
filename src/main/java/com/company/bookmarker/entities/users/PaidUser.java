package com.company.bookmarker.entities.users;

import java.time.LocalDate;
import java.util.ArrayList;

import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.entities.libraries.PremiumLibrary;
import com.company.bookmarker.entities.libraries.PremiumLibraryCollection;

public class PaidUser extends User{

    private int paymentType;
    private float paymentValue;
    private FreeLibrary freeLibrary;
    private PremiumLibraryCollection premiumLibraryCollection;

    //Constructors
    public PaidUser(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone, int paymentType, float paymentValue, FreeLibrary freeLibrary,
            PremiumLibraryCollection premiumLibraryCollection) {
        super(name, password, email, gender, photo, date, cpf, phone);
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
        this.freeLibrary = freeLibrary;
        this.premiumLibraryCollection = premiumLibraryCollection;
    }

    public PaidUser() {
    }

    //Getters and Setters
    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public float getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(float paymentValue) {
        this.paymentValue = paymentValue;
    }

    public FreeLibrary getFreeLibrary() {
        return freeLibrary;
    }

    public void setFreeLibrary(FreeLibrary freeLibrary) {
        this.freeLibrary = freeLibrary;
    }

    public PremiumLibraryCollection getPremiumLibraryCollection() {
        return premiumLibraryCollection;
    }

    public void setPremiumLibraryCollection(PremiumLibraryCollection premiumLibraryCollection) {
        this.premiumLibraryCollection = premiumLibraryCollection;
    }
}
