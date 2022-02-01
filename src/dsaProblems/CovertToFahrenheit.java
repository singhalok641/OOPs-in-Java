package dsaProblems;

/*

Write a Java program to take the temperature from a user in Celsius,
convert it into Fahrenheit and then display it to the user.
You can use the following formula for this purpose:

F = 9C/5+32

Where, C is the temperature in Celsius and F is the temperature in Fahrenheit

Note: C will be entered in integer form, but F can be a float.

*/

import java.util.Scanner;

public class CovertToFahrenheit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        int tempCelsius = in.nextInt();

        double tempFahrenheit = (9.0 * tempCelsius) / 5 + 32;

        System.out.println("Temperature in fahrenheit is: " + tempFahrenheit);

    }
}