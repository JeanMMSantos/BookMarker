package com.company.bookmarker.entities.users;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name, password, email, gender, photo;
    private LocalDate date;
    private Long cpf, phone;
    
    //Constructors
    public User() {
    }
}