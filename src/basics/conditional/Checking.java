package basics.conditional;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        int m;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the integer");
            m = sc.nextInt();
            if (m > 0)
                System.out.println("The value of n = 1\n ");
            else if (m < 0)
                System.out.println("The value of n = -1\n");
            else
                System.out.println("The value of n = 0\n");
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}

