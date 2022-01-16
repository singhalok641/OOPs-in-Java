package assignments.patterns;
/*
Print this triangle
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

where n = 5.
0 <= n <= 50
 */

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){ // first iteration i=1 -> 5, 4, 3, 2; i = 2 -> 5, 4, 3
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
