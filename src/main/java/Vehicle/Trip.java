package Vehicle;

import Enums.Discount;
import Enums.Tariffs;
import Interfaces.IDiscount;
import Interfaces.IRating;
import Interfaces.ITripCalculator;


public class Trip implements IDiscount, ITripCalculator, IRating {
    private int tripID;
    private int driverID;
    private int clientID;
    private String brand;
    private String model;
    private int age;
    private String color;
    private String size;
    private double distance;
    private String driverName;
    private String clientName;
    private String clientCat;
    private double charge;
    private double rating;

    public Trip(int tripID, int driverID, int clientID, String brand, String model, int age, String color, String size, double distance, String driverName, String clientName, String clientCat) {
        this.tripID = tripID;
        this.driverID = driverID;
        this.clientID = clientID;
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.color = color;
        this.size = size;
        this.distance = distance;
        this.driverName = driverName;
        this.clientName = clientName;
        this.clientCat = clientCat;
    }

    public double chargePerKm() {
        if (size.equals("Mini")) {
            return charge = Tariffs.MINI.getTariffs();
        } else if (size.equals("Compact")) {
            return charge = Tariffs.COMPACT.getTariffs();
        } else
            return charge = Tariffs.VAN.getTariffs();
    }

    @Override
    public double calculateDiscount() {
        if (clientCat.equals("Student")) {
            return Discount.STUDENT.getDiscount();
        } else if (clientCat.equals("VIP")) {
            return Discount.VIP.getDiscount();
        } else
            return 1;
    }

    public double calculateTripBefDisc() {
        return chargePerKm() * getDistance();
    }

    @Override
    public double totalDiscount() {
        return calculateTripBefDisc() * calculateDiscount();
    }

    @Override
    public double calculateTrip() {
        return calculateTripBefDisc() - totalDiscount();
    }

    public int getTripIDID() {
        return tripID;
    }


    @Override
    public double getRating() {
        return this.rating;
    }

    @Override
    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientCat() {
        return clientCat;
    }

    public void setClientCat(String clientCat) {
        this.clientCat = clientCat;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

}