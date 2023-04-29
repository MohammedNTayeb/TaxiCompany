package Vehicle;

import Enums.Tariffs;

public class VanVehicle extends Vehicle {
    public VanVehicle(int ID, String brand, String model, int age, String color, String size) {
        super(ID, brand, model, age, color, size);

    }

    @Override
    public double chargePerKm() {
        if (size.equals("Mini")) {
            return Tariffs.MINI.getTariffs();
        } else if (size.equals("Compact")) {
            return Tariffs.COMPACT.getTariffs();
        } else if (size.equals("Luxury")) {
            return Tariffs.LUXURY.getTariffs();
        } else
            return Tariffs.VAN.getTariffs();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
