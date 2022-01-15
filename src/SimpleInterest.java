import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your principal amount: ");
        int principal = in.nextInt();
        System.out.print("Please enter the number of years you want to calculate SI for: ");
        int time = in.nextInt();
        System.out.print("What is the rate of interest?: ");
        double rate = in.nextDouble();

        /*
        int principal = 100;
        int time = 5;
        double rate = 7.5;
        */

        float si = (float)(principal * rate * time) / 100;

        char ch = '$';
        boolean val = true;
        ch = '^';

        System.out.print("Principal is: " + principal);

        System.out.println("Simple Interest calculated here is: " + si());

    }

    private static int si(){
        return 67;
    }
}

// float 3.40282347 x 10^38, 1.40239846 x 10^-45

//-2,147,483,648  2,147,483,647