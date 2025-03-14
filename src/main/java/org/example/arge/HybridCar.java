package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
         return getClass().getSimpleName() + ": Starting hybrid engine with " + cylinders + " cylinders and " + batterySize + " kWh battery.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving hybrid, average " + avgKmPerLiter + " km/l and electric support.";

    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
