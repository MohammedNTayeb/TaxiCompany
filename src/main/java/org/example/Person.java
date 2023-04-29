package org.example;


public abstract class Person {
    protected int ID;
    protected String name;
    protected String surName;
    protected int age;
    protected String country;
    protected String city;
    protected String type;

    Person(int ID, String name, String surName, int age, String country, String city, String type) {
        this.ID = ID;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.country = country;
        this.city = city;
        this.type = type;

    }

    public Person() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
