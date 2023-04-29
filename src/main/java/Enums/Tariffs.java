package Enums;

public enum Tariffs {
    MINI(10),
    COMPACT(12.5),
    VAN(15),
    LUXURY(20);

    private final double tariffs;

    Tariffs(double tariffs) {
        this.tariffs = tariffs;
    }

    public double getTariffs() {
        return tariffs;
    }
}
