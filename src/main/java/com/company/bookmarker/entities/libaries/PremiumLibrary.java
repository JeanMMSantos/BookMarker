package com.company.bookmarker.entities.libaries;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="PremiumLibrary")
public class PremiumLibrary extends Library{

    private String name;
    private String theme;
    private Book favorite;
}
