package basics.conditional;

import java.util.Scanner;

public class EqualUnequal {
    public static void main(String[] args) {
        int a,b;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer");
            a = sc.nextInt();
            System.out.println("Enter the second integer");
            b = sc.nextInt();
            if (a == b)
                System.out.println("Integers are equal");
            else
                System.out.println("Integers are unequal");
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
