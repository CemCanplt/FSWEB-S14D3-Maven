package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Starting electric motor with " + batterySize + " kWh battery.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving electrically, average " + avgKmPerCharge + " km per charge.";
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
