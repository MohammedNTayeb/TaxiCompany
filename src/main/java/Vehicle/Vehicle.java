package Vehicle;

public abstract class Vehicle {
    protected int ID;
    protected String brand;
    protected String model;
    protected int age;
    protected String color;
    protected String size;

    public Vehicle(int ID, String brand, String model, int age, String color, String size) {
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    public Vehicle() {
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

    public abstract double chargePerKm();

    @Override
    public String toString(){
        return "Vehicle ID: " + ID + "\n" + "Brand: " + brand + "\n" + "Model: " + model
                + "\n" + "Age: " + age + "\n" + "Color: " + color + "\n" + "Size: " + size;
    }
}