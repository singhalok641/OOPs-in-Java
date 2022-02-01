package dsaProblems;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        System.out.println("=== Welcome to adding numbers ===");
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number -> ");
        int num1 = in.nextInt();

        System.out.println("Input second number -> ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("Total = " + sum);
    }
}