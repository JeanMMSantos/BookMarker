package com.company.bookmarker.entities.libraries;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public abstract class Library {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;

    @ManyToMany
    private Set<BookStatus> defaultFreeLibrary;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<BookStatus> getDefaultFreeLibrary() {
        return defaultFreeLibrary;
    }

    public void setDefaultFreeLibrary(Set<BookStatus> defaultFreeLibrary) {
        this.defaultFreeLibrary = defaultFreeLibrary;
    }
}
