package com.company.bookmarker.entities.users;

import java.util.ArrayList;
public class PremiumLibrary extends Library{
    private String name;
    private String theme;
    private int id;
    private String favorite;
    private ArrayList<BookStatus> defaultPremiumLibrary = new ArrayList<BookStatus>();
}
