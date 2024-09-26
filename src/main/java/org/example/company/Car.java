package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = Boolean.TRUE;
        this.wheels =4;
    }

    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake() {
        printSimpleName();
        return "the car is braking";
    }

    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }

    private void printSimpleName() {
        System.out.println("Class name" + getClass().getSimpleName());
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

