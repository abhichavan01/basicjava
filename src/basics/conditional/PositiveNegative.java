package basics.conditional;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int a;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the integer ");
            a = sc.nextInt();
            if (a > 0)
                System.out.println(+a + " is positive integer");
            else if (a < 0)
                System.out.println(+a + " is negative integer");
            else
                System.out.println("Integer is 0");
            }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}

