package com.company.bookmarker.entities.users;

import org.springframework.data.repository.cdi.Eager;

import java.util.Set;

import javax.persistence.*;

@Entity
public class PaymentType implements Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "paymentType")
    private Set<PaidUser> paidUsers;
    
}
