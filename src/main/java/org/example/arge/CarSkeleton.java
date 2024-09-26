package org.example.arge;

public class CarSkeleton {
    private  String name;
    private  String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        System.out.println("className" + getClass().getSimpleName());
        return getName()+ "starting engine";
    }

    public String drive() {
    runEngine(this);
    return getName() + "is driving";
    }

    public void runEngine(CarSkeleton carSkeleton) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
