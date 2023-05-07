package org.example;

import Exceptions.DriverAgeValidationException;

public class Driver extends Person {

    public Driver(int ID, String name, String surName, int age, String country, String city, String type) {
        super(ID, name, surName, age, country, city, type);
    }
    public void validateAge() throws DriverAgeValidationException {
            if (age < 18)
                throw new DriverAgeValidationException("Age can not be less than 18");
    }

    @Override
    public String toString(){
        return "Driver ID: " + ID + "\n" + "First Name: " + name + "\n" + "Last Name: " + surName + "\n" + "Age: " + age +
                "\n" + "Country: " + country + "\n" + "City: " + city + "\n" + "Type: " + type;
    }
}