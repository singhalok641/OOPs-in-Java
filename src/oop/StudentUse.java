package oop;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Shefali", 24, 123);
        Student s2 = new Student("Abhijeet", 24, 121);
        s1.print();
        s2.print();
    }
}
