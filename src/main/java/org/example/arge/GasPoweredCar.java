package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Starting gas engine with " + cylinders + " cylinders.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving using gasoline, average " + averageKmPerLiter + " km/l.";

    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }


    public int getCylinders() {
        return cylinders;
    }
}
