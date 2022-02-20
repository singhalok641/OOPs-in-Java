package oops.Inheritance;

public class Car extends Vehicle{
    boolean isSelfDriving;

    Car(String color, int maxSpeed, boolean isSelfDriving){
        super(color, maxSpeed);
        this.isSelfDriving = isSelfDriving;
        System.out.println("Car Constructor");
    }

    public void print(){
//        System.out.println("Car Color: " + this.color);
//        System.out.println("Car Speed:" + this.maxSpeed);
        super.print(); // class print() function in Vehicle class

        System.out.println(this.getMaxSpeed());
        System.out.println("Is self driving?: " + this.isSelfDriving);
    }
}

/*
Points to note:
1. Whenever we create the object of a derived class, the constructor of the parent as well as the
derived class are called.

First parent class constructor is called, and then derived class

2. If there is a default constructor in the parent class, then we are good.
If not, we will have to call super in the child class to make sure that the parent class new constructor
is called first.


 */