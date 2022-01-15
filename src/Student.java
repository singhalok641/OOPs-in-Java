import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        //Check whether a student is above age 18 or not
        System.out.println("===============COVID Vaccine================");
        System.out.println("Please enter your age: ");
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        if(age < 18){
            if(age < 10) {
                System.out.println("You are not eligible");
            }
            else{
                System.out.println("Delhi");
            }
        }
        else if(age < 30)
            System.out.println("Gurugram");
        else {
            System.out.println("Noida");
        }
    }
}

/*
Switch Statement

switch (expression){
    case value1:
     statement1;
     break;
    .
    .
    .
    case valueN:
     statementN;
     break;
    default:
     default statement;
}
 */
