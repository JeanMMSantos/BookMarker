package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class PremiumLibrary extends Library{
    private String name;
    private String theme;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Book favorite;
}
