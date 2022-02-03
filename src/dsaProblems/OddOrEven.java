package dsaProblems;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

//        if(num == 0) {
//            System.out.println("Neither even nor odd");
//        }

        //Using if-else
//        if(num % 2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        //Using Ternary operator
        String output = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(output);
    }
}

/*
if
if-else
if-else-if

Ternary Operator
condition ? statement to execute if true : statement to execute if false
 */
