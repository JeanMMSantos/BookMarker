package com.company.bookmarker.entities.libraries;

public class AmateurWriterBook {

    private int id;
    private double bookValue;

    public AmateurWriterBook(int id, double bookValue) {
        this.id = id;
        this.bookValue = bookValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBookValue() {
        return bookValue;
    }

    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }
}
