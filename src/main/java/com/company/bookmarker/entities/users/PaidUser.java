package com.company.bookmarker.entities.users;

import java.time.LocalDate;
import java.util.ArrayList;

import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.entities.libraries.PremiumLibrary;

public class PaidUser extends User{

    private int paymentTypeNumber;
    private float paymentValue;
    private FreeLibrary freeLibrary;
    private ArrayList<PremiumLibrary> premiumLibraries = new ArrayList<PremiumLibrary>();
    private PaymentType paymentType;

    //Constructors
    public PaidUser() {
    }
    
}
