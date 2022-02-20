package oops;

public class Student {
    final String name;
    int age;
    private final int rollNumber;
    static int numberOfStudents;

    public Student(String name, int rollNumber, int age){
        this.name = name;  // s1.name = name
        this.rollNumber = rollNumber;
        this.age = age;

        numberOfStudents++;

        System.out.println("Student: " + this);
    }

    public Student(int rollNumber, int age, String name){
        this.rollNumber = rollNumber; // s2.rollNumber = rollNumber
        this.age = age;
        this.name = name;

        numberOfStudents++;
    }

    public Student(){
        this.name = null;
        this.rollNumber = 0;
        this.age = 0;

        numberOfStudents++;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

//    public void setRollNumber(int rollNumber){
//        if(rollNumber < 0 || this.rollNumber != 0 || rollNumber > 500) return;
//
//        this.rollNumber = rollNumber;
//    }

    public void print(){
        System.out.println(name + " "+ age + " " + rollNumber);
    }
}

/*
Important keywords in Java

1. final - cannot change
   2 places to define a final variable - When you are declaring it and inside the constructor

2. this keyword

3. static


 */