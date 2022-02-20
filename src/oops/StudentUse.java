package oops;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Student s1 = new Student("Anusha", 21, 19);

        System.out.println("Student Use: " + s1);

        Student s2 = new Student();
        Student s3 = new Student(21, 19, "Alok");

        s2.age = 19;

//        s1.print();
//        s2.print();
        System.out.println(Student.numberOfStudents);
//        System.out.println(s1.name + " "+ s1.age + " " + s1.getRollNumber());
    }
}

/*
Constructors in Java

Constructor overloading, Constructor overriding


 */

/*
Access specifiers

1. default - access inside the same package
2. public - access from all packages
3. private - access within same class

Can we have a private class? If yes, why? if no, why?

4. protected
 */


