package org.example;

import Departments.Finance;
import Vehicle.*;

public class App {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "James", "Adam", 35,
                "Poland", "Warsaw", "Employee", 2000, "Finance", 7);
        System.out.println("ID: " + employee1.getID());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Surname: " + employee1.getSurName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Country: " + employee1.getCountry());
        System.out.println("City: " + employee1.getCity());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Years of experience: " + employee1.getYearOfExp());

        System.out.println("============Client============");
        Client client1 = new Client(1, "Mike", "Smith", 35,
                "Poland", "Warsaw", "Client", "Student");
        System.out.println("Client ID: " + client1.getID());
        System.out.println("Client Name: " + client1.getName());
        System.out.println("Client Surname: " + client1.getSurName());
        System.out.println("Client Age: " + client1.getAge());
        System.out.println("Client Country: " + client1.getCountry());
        System.out.println("Client Country: " + client1.getDiscountCat());

        System.out.println("============Driver============");
        Driver driver1 = new Driver(1, "Mark", "Jones", 26, "Poland", "Warsaw", "Driver");
        System.out.println("Driver Name: " + driver1.getName());
        System.out.println("Driver Age: " + driver1.getAge());

        System.out.println("============Vehicle and Charge============");

        CompactVehicle taxi1 = new CompactVehicle(1, "Toyota", "Yaris", 3, "Silver", "Compact");
        System.out.println("Taxi ID: " + taxi1.getID());
        System.out.println("Taxi Brand: " + taxi1.getBrand());
        System.out.println("Taxi Model: " + taxi1.getModel());
        System.out.println("Taxi Age: " + taxi1.getAge());
        System.out.println("Taxi Color: " + taxi1.getColor());
        System.out.println("Taxi Size: " + taxi1.getSize());
        System.out.println("Charge per Km: " + taxi1.chargePerKm());

        System.out.println("============Trip Details============");


        Trip trip1 = new Trip(1, 1, 1, "Toyota", "Yaris", 3, "Silver", "Compact", 16,
                "James", "Adam", "Student");
        System.out.println("Taxi ID: " + trip1.getTripIDID());
        System.out.println("Taxi Brand: " + trip1.getBrand());
        System.out.println("Taxi Model: " + trip1.getModel());
        System.out.println("Taxi Size: " + trip1.getSize());
        System.out.println("Driver Name: " + trip1.getDriverName());
        System.out.println("Client Name: " + trip1.getClientName());
        System.out.println("Trip Distance: " + trip1.getDistance() + " Km");
        System.out.println("Charge Per KM: " + trip1.chargePerKm() + " PLN");
        System.out.println("Discount Applied: " + trip1.calculateDiscount());
        System.out.println("Discount Amount: " + trip1.totalDiscount() + " PLN");
        System.out.println("Discount Category: " + trip1.getClientCat());
        System.out.println("Total charge BEFORE discount: " + trip1.calculateTripBefDisc() + " PLN");
        System.out.println("Total charge AFTER discount: " + trip1.calculateTrip() + " PLN");
        trip1.setRating(5);
        System.out.println("Trip Rating: " + trip1.getRating());

        System.out.println("============Vehicle type initializing============");
        MiniVehicle taxi2 = new MiniVehicle(2, "Hyundai", "Tucson", 4, "White", "Mini");
        VanVehicle taxi3 = new VanVehicle(3, "Nissan", "Maxima", 11, "Blue", "Van");
        LuxuryVehicle taxi4 = new LuxuryVehicle(4, "Rolls-Royce", "Ghost", 7, "Silver", "Luxury");


        Finance finance1 = new Finance(1, "James", "Adam", 35,
                "Poland", "Warsaw", 2200, 7, "Raul", "Mendez");
        Finance finance2 = new Finance(2, "William", "David", 40,
                "Poland", "Warsaw", 2500, 9, "Raul", "Mendez");
        Finance finance3 = new Finance(3, "John", "Smith", 26,
                "Poland", "Warsaw", 1800, 2, "Raul", "Mendez");
    }
}