package pattenQuestions;

/*
        You are given a number n. Print the pattern shown below.
        Input: 4

        Output:

        * * * *
         * * *
          * *
           *
            *
           * *
          * * *
         * * * *

*/

import java.util.Scanner;

public class upgradPatternQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k;
        for (i= 0; i<= n-1 ; i++)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=n-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (i= n-1; i>= 0; i--)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=n-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
