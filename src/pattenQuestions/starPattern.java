package pattenQuestions;

/*
Take n as input

n = 4

* * * * * * * *   0     1
* * *     * * *   2     2
* *         * *   4     3 * 2 - 2 = 4
*             *   6     4 * 2 - 2 = 6

 */

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int r = in.nextInt();

        for (int i=1; i<=r; i++)
        {
            for (int j = i; j <= r; j++)
            {
                System.out.print("* ");
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print("  ");
            }
            for (int l = i; l <= r; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
