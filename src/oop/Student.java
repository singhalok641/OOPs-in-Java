package oop;

public class Student {
    String name;
    private int age;
    private int rollNo;

    public Student(){

    }

    public Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void setAge(int age){
        if(age <= 0) {
            System.out.println("Please enter a valid age. We do not allow age to be a negative value");
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void print(){
        System.out.println(name + " "+ age + " " + rollNo);
    }
}