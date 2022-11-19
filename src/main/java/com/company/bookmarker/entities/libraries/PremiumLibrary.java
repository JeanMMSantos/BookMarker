package com.company.bookmarker.entities.libraries;

import javax.persistence.*;

import com.company.bookmarker.entities.users.PaidUser;

import java.util.ArrayList;

@Entity
@DiscriminatorValue(value="PremiumLibrary")
public class PremiumLibrary extends Library{

    private String name;
    private String theme;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Book favorite;
}
