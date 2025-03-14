package org.example.company;

// Parent class Car
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.engine = true; // Varsayılan olarak motor var
        this.wheels = 4; // Varsayılan olarak 4 tekerlek
        this.cylinders = cylinders;
        this.name = name;
    }

    // Getter'lar
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    // equals metodu
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    // Metodlar
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
}
