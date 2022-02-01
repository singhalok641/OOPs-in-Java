package dsaProblems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int input1 = in.nextInt();

        System.out.print("Enter second operand: ");
        int input2 = in.nextInt();

        System.out.print("Please enter your operation: ");
        char operation = in.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println(input1 + input2);
//                break;
            case '-':
                System.out.println(input1 - input2);
//                break;
            case '*':
                System.out.println(input1 * input2);
                break;
            default:
                System.out.println("Please enter a valid operation");
                break;
        }
    }
}



/*
Calculator

1. Add -> '+'
2. Subtract -> '-'
3. Divide -> '/'
4. Multiply -> '*'
5. Modulus -> '%'

 */