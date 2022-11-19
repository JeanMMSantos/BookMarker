package com.company.bookmarker.entities.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

import com.company.bookmarker.entities.libraries.FreeLibrary;
import com.company.bookmarker.entities.libraries.PremiumLibrary;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class PaidUser extends User{

    @OneToMany(mappedBy = "paidUser")
    Set<PremiumLibrary> premiumLibraries;

    private int paymentTypeNumber;
    private float paymentValue;
    private FreeLibrary freeLibrary;
    //private ArrayList<PremiumLibrary> premiumLibraries = new ArrayList<PremiumLibrary>();
    private PaymentType paymentType;

    //Constructors
    public PaidUser() {
    }
    
}
