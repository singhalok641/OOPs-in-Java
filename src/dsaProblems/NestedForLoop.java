package dsaProblems;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        int i=1, j=2, k=3;

        int m = i-- - j-- - k--;
//               1  -  2  -  3 = -4
        int n = --i - --j - --k;
//               0  -  1  -   2 = -3

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
        System.out.println("m=" + m);
        System.out.println("n=" + n);

//        for(int i=0;i<=n;i++){
//
//        }
    }
}
