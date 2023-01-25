package basics.looping;

import java.util.Scanner;

public class OddNaturalNumSum{
        public static void main(String[] args) {
            int n, i, sum=0, Odd;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            try {
                n = sc.nextInt();
                System.out.print("The odd natural numbers are:");

                if (n > 0) {
                        for (i = 1; i <= n; i++) {
                            Odd= 2*i-1;
                            System.out.print(" "+Odd);
                            sum=sum+Odd;
                        }
                        System.out.println();
                        System.out.println("The sum is: " + sum);
                }else
                    System.out.println("Invalid input! The natural number cannot be negative");
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
}

