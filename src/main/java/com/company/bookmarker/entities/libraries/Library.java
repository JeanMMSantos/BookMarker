package com.company.bookmarker.entities.libraries;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public abstract class Library {
    @ManyToMany
    private Set<BookStatus> defaultFreeLibrary;
}
