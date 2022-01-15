import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuApplication {
    public static void main(String[] args){
        //Requirements
        //We can have choices for cuisine
        // Chinese, South Indian, Italian, Continental, Thai
        System.out.println("======= Choose your cuisine ==========");
        System.out.println("Press 0 to choose Chinese");
        System.out.println("Press 1 to choose South Indian");
        System.out.println("Press 2 to choose Italian");
        System.out.println("Press 3 to choose Continental");
        System.out.println("Press 4 to choose Thai");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch(option){
            case 0:
                System.out.println("Chinese");
            case 1:
                System.out.println("South Indian");
            case 2:
                System.out.println("Italian");
            default:
                System.out.println("Thai");
        }

    }
}
