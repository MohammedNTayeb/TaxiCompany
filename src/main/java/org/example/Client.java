package org.example;

public class Client extends Person {
    private String discountCat;

    public Client(int ID, String name, String surName, int age, String country, String city, String type, String discountCat) {
        super(ID, name, surName, age, country, city, type);
        this.discountCat = discountCat;
    }

    public String getDiscountCat() {
        return discountCat;
    }

    public void setDiscountCat(String discountCat) {
        this.discountCat = discountCat;
    }
}