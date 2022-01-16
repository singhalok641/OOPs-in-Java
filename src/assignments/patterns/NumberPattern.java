package assignments.patterns;
/*
        1
      2 3
    3 4 5
  4 5 6 7
5 6 7 8 9
 */

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--)
                System.out.print("  ");

            for (int j = 0; j < i; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
