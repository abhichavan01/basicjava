package basics.looping;

import java.util.Scanner;

public class DisplayNaturalNumSum {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        try {
            if (n > 0) {
                for (i = 1; i <= n; i++) {
                    System.out.println(i);
                    sum = sum + i;
                }
                System.out.println("The sum is " + sum);
            } else
                System.out.println("Invalid input! The natural number cannot be negative");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
