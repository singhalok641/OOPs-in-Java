package dsaProblems;

//import java.util.Scanner;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //   init condition inc/dec
        for(int i=1;i<=10;i++){
            for(int j=1;j<5;j++){
                System.out.println(i + ", " + j);
            }
            System.out.println();
        }

        scan.close();
    }
}