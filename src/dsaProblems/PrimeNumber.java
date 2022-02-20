package dsaProblems;

import oops.Student;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean isPrime = true;

        Student s1 = new Student();

        if(num < 2){
            System.out.println("Please enter a positive number >= 2");
        }
        else{
            for(int i=2;i<num;i++){
                if(num % i == 0){
                    System.out.println(num + " is not prime number");
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println(num + " is a prime number");
    }
}



/*

Control Statements in Java

1. If
2. If else
3. If else If
4. Switch

 */
