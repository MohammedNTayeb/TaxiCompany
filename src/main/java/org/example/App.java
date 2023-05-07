package org.example;

import Collections.RecruitingDriver;
import Departments.Finance;
import Departments.HR;
import Departments.Operations;
import Vehicle.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main(String[] args) throws Exception {

        Employee employee1 = new Employee(1, "James", "Adam", 35,
                "Poland", "Warsaw", "Employee", 2000, "Finance", 7);
        LOGGER.info(employee1);

        LOGGER.info("============Client============");
        Client client1 = new Client(1, "Mike", "Smith", 35,
                "Poland", "Warsaw", "Client", "Student");
        LOGGER.info(client1);

        LOGGER.info("============Driver============");
        Driver driver1 = new Driver(1, "Mark", "Jones", 26, "Poland", "Warsaw", "Driver");
        LOGGER.info(driver1);
        driver1.validateAge();
        RecruitingDriver.recruitDriver();

        LOGGER.info("============Vehicle and Charge============");

        CompactVehicle taxi1 = new CompactVehicle(1, "Toyota", "Yaris", 3, "Silver", "Compact");
        LOGGER.info(taxi1);
        LOGGER.info("Charge per Km: " + taxi1.chargePerKm());

        LOGGER.info("============Trip Details============");


        Trip trip1 = new Trip(1, 1, 1, "Toyota", "Yaris", 3, "Silver", "Compact", 16,
                "James", "Adam", "Student");
        LOGGER.info(trip1);
        LOGGER.info("Charge Per KM: " + trip1.chargePerKm() + " PLN");
        LOGGER.info("Discount Applied: " + trip1.calculateDiscount());
        LOGGER.info("Discount Amount: " + trip1.totalDiscount() + " PLN");
        LOGGER.info("Discount Category: " + trip1.getClientCat());
        LOGGER.info("Total charge BEFORE discount: " + trip1.calculateTripBefDisc() + " PLN");
        LOGGER.info("Total charge AFTER discount: " + trip1.calculateTrip() + " PLN");
        trip1.setRating(5);
        LOGGER.info("Trip Rating: " + trip1.getRating());
        trip1.validateRating();

        LOGGER.info("============Vehicle type initializing============");
        MiniVehicle taxi2 = new MiniVehicle(2, "Hyundai", "Tucson", 4, "White", "Mini");
        VanVehicle taxi3 = new VanVehicle(3, "Nissan", "Maxima", 11, "Blue", "Van");
        LuxuryVehicle taxi4 = new LuxuryVehicle(4, "Rolls-Royce", "Ghost", 7, "Silver", "Luxury");

        LOGGER.info("============Finance Department Employees============");

        Finance.addShowEmployee();
        HR.addShowEmployee();
        Operations.addShowEmployee();
    }

}