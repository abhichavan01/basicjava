package basics.looping;

import java.util.Scanner;

public class SquareNaturalNums {
    public static void main(String[] args) {
        int n, i,square, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        try {
            if (n > 0) {
                for (i = 1; i <= n; i++) {
                    square = i * i;
                    System.out.println(square);
                    sum = sum + square;
                }
                System.out.println("The sum is " + sum);
            } else
                System.out.println("Invalid input! The natural number cannot be negative");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
