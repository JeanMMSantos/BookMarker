package com.company.bookmarker.entities.libaries;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public abstract class Library {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToMany
    private Set<BookStatus> defaultFreeLibrary;
}
