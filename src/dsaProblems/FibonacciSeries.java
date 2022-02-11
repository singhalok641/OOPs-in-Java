package dsaProblems;

/*
a  b  c - previous iteration
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.......
   a  b  c                    -> 4
      a  b  c
         a b  c
 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        int a = 0, b = 1;
        //printed 2 numbers
        System.out.print(a + ", " + b + ", ");

        //print rest of the count - 2 numbers
        for(int i=1; i <= (count-2); i++){
            int c = a + b;
            System.out.print(c + ", ");

            a = b;
            b = c;
        }
    }
}
