package assignments.patterns;

/*
            1
           232
          34543
         4567654
        567898765


 */

import java.util.Scanner;

public class TriangleOfNumbersWithSpaces {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=i;j<2*i;j++){
                System.out.print(j);
            }
            for(int j=2*i-2;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
