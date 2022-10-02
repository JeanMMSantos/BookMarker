package com.company.bookmarker.users;

import java.time.LocalDate;

public class user {
    private String name, password, email, gender, photo;
    private LocalDate date;
    private Long cpf, phone;
    
    public user() {
    }
    public user(String name, String password, String email, String gender, String photo, LocalDate date, Long cpf,
            Long phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.photo = photo;
        this.date = date;
        this.cpf = cpf;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
}


