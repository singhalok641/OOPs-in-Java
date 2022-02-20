package dsaProblems;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        double[][] arr = new double[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (double) (i+j) / 2;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
