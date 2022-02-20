package oops.Inheritance;

public class Vehicle {
    protected String color;
    private int maxSpeed;

    public Vehicle(String color, int maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    public void print(){
        System.out.println("Vehicle Color: " + this.color);
        System.out.println("Vehicle Speed:" + this.maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
