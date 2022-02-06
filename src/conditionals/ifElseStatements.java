package conditionals;

import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        // Print "age is 11" if age is 11
        // Print "age is 13" if age is 13
        // Else print neither 11 nor 13

        if(age >= 18) {
            if (age == 22 || age == 23) {
                System.out.println("Age is " + age);
            }
            else {
                System.out.println("Age is neither 22 nor 23");
            }
        }
        else{
            System.out.println("Underage");
        }
    }
}

/*

Decision-making statements -
1. If statements
2. Switch case

Loop statements
(increment/decrement operators)
1. do while loop
2. while loop
3. for loop
4. for-each loop

Jump statements
1. break statement
2. continue statement

 */

/*
If statements
1. If statement
2. If else
3. If else if
4. Nested if


Switch case

 */