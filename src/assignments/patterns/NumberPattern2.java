package assignments.patterns;

import java.util.Scanner;

/*
1        1
12      21
123    321
1234  4321
1234554321
n = 5

1      1
12    21
123  321
12344321
n=4
 */
public class NumberPattern2 {
    public static void main(String[] args){
        System.out.print("Enter n value:");
        int n=new Scanner(System.in).nextInt();

        if(!(n>=0 && n<=50))
            return;

        for(int i =1; i<=n; i++){
            for(int j = 1;j<=i; j++)
                System.out.print(j);

            for(int k=n*2-i;k>i; k--)
                System.out.print(" ");

            for(int j=i; j>0; j--)
                System.out.print(j);

            System.out.println();
        }
    }
}
