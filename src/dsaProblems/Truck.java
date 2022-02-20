package dsaProblems;

import oops.Inheritance.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;

    public Truck(String color, int maxSpeed) {
        super(color, maxSpeed);
    }

    public void print(){
        System.out.println("Truck Capacity -> " + this.maxLoadingCapacity);
        System.out.println("Truck color -> " + this.color);
        System.out.println("Truck speed -> " + this.getMaxSpeed());
    }
}
