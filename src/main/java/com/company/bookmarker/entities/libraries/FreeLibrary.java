package com.company.bookmarker.entities.libaries;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="FreeLibrary")
public class FreeLibrary extends Library{

    public FreeLibrary() {
    }
}
