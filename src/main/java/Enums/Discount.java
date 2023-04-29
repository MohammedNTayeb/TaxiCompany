package Enums;

public enum Discount {
    STUDENT(0.10),
    VIP(0.25);

    private final double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}