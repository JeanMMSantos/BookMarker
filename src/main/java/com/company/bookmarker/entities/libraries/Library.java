package com.company.bookmarker.entities.libraries;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public abstract class Library {

    private ArrayList<BookStatus> defaultFreeLibrary = new ArrayList<BookStatus>();
}
