package oop;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Shefali", 24, 123);
        System.out.println("s1 = " + s1);
        Student s2 = new Student("Abhijeet", 24, 121);
        System.out.println("s2 = " + s2);
        System.out.println("Number of students are: " + Student.getNumStudents());
        s1.print();
        s2.print();
    }
}
