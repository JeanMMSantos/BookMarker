package com.company.bookmarker.entities.users;

import org.springframework.data.repository.cdi.Eager;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class PaymentType implements Payment {

    @OneToMany(mappedBy = "paymentType")
    private Set<PaidUser> paidUsers;
    
}
