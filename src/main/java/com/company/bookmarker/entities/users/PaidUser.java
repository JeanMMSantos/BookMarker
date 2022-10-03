package com.company.bookmarker.entities.users;

import java.time.LocalDate;

public class PaidUser extends User{

    private int paymentType;

    //Methods
    public PaidUser(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone, int paymentType) {
        super(name, password, email, gender, photo, date, cpf, phone);
        this.paymentType = paymentType;
    }

    public PaidUser() {
    }

    //Getters and Setters
    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }
}
