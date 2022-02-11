package dsaProblems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;
        int temp = num;

        while(temp > 0 ){
            int rem = temp % 10;  // 4 -> 3 -> 2 -> 1
            reverse = reverse * 10 + rem; // 4 -> 43 -> 432 -> 4321

            temp = temp / 10;  // 123 -> 12 -> 1 -> 0
        }

        if(num == reverse) System.out.println("Palindrome Number");
        else System.out.println("Not a Palindrome");
    }
}

/*

1234 -> 123 -> 12 -> 1 -> 0


 */