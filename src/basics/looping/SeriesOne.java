package basics.looping;

import java.util.Scanner;

public class SeriesOne {
    public static void main(String[] args) {
        int x, n, i;
        double total = 1.0;
        Scanner sc = new Scanner(System.in);
        try {
                System.out.print("Enter the value of x: ");
                x = sc.nextInt();
                System.out.print("Enter how many term you want: ");
                n = sc.nextInt();
            if (n > 0) {
                for (i = 1; i < n; i++) {
                    MethodForFactorial object = new MethodForFactorial();
                    int fact = object.factorial(i);
                    total = total + Math.pow(x, i) / fact;

                }
                System.out.println("Sum is " + total);
            } else {
                System.out.println("Invalid input! Input positive value.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
