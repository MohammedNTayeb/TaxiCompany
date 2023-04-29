package org.example;

public class Employee extends Person {
    private double salary;
    private String department;
    private int yearOfExp;

    public Employee(int ID, String name, String surName, int age, String country, String city, String type, double salary, String department, int yearOfExp) {
        super(ID, name, surName, age, country, city, type);
        this.salary = salary;
        this.department = department;
        this.yearOfExp = yearOfExp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }
}
