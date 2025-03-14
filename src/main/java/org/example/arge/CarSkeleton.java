package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Parametresiz Constructor
    public CarSkeleton() {
        this.name = "Default Car";
        this.description = "Default Description";
    }

    // Parametreli Constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Public Metotlar
    public String startEngine() {
        return getClass().getSimpleName() + ": Engine is starting.";
    }

    public String drive() {
        runEngine(); // Protected metot çağırılıyor
        return getClass().getSimpleName() + ": Driving...";

    }

    // Protected Metot
    protected String runEngine() {
        return getClass().getSimpleName() + ": Engine is running.";
    }

    // Getter'lar
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
