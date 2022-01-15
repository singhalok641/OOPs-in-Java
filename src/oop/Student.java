package oop;

public class Student {
    String name;
    private int age;
    private final int rollNo;
    private static int numStudents;

    public Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
//        System.out.println("inside constructor = " + this);
        numStudents++;
    }

    public static int getNumStudents(){
        return numStudents;
    }

    public void setAge(int age){
        if(age <= 0) {
            System.out.println("Please enter a valid age. We do not allow age to be a negative value");
            return;
        }
        this.age = age;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public int getAge(){
        return this.age;
    }

    public void print(){
        System.out.println(name + " "+ age + " " + rollNo);
    }
}

/*
1. Default - accessible within the same package
2. Public - accessible from other packages as well
3. Private - accessible only in the same class
4. Protected - When we have covered inheritance
 */