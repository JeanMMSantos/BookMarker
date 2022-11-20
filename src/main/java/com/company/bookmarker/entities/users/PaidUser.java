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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.tomcat.jni.Library;

@Entity
public class PaidUser extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    @JoinColumn(name = "paidUser_id")
    private Set<PremiumLibrary> premiumLibraries;

    @OneToOne
    private FreeLibrary freeLibrary;
    

    private int paymentTypeNumber;
    private float paymentValue;
    //private FreeLibrary freeLibrary;
    //private ArrayList<PremiumLibrary> premiumLibraries = new ArrayList<PremiumLibrary>();
    private PaymentType paymentType;

    //Constructors
    public PaidUser() {
    }
    
}
