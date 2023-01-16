package basics.conditional;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int x,y,z;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("1st Number=");
            x = sc.nextInt();
            System.out.print("2nd Number=");
            y = sc.nextInt();
            System.out.print("3rd Number=");
            z = sc.nextInt();
            if (x > y) {
                if (x > z)
                    System.out.println("The 1st Number is the greatest among three");
                else
                    System.out.println("The 2nd Number is the greatest among three");
            } else if (y > z) {
                System.out.println("The 2nd Number is the greatest among three");
            } else
                System.out.println("The 3rd Number is the greatest among three");
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }

}
