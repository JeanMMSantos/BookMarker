package com.company.bookmarker.entities.libraries;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="PremiumLibrary")
public class PremiumLibrary extends Library{

    private String name;
    private String theme;


    public PremiumLibrary() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
