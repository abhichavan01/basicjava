package basics.looping;

import java.util.Scanner;

public class Newseries {
    public static void main(String[] args) {
        int  i,n;
        double x,Even, sum=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.print("Enter the value of x: ");
        x= sc.nextInt();
        try {
            if (n > 0) {
                for (i = 1; i <= n; i++) {
                    Even= 2*i;
                    sum = 1-(Math.pow(x,Even)/Even);
                }
                System.out.println("The sum is " + sum);
            } else
                System.out.println("Invalid input! The natural number cannot be negative");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
