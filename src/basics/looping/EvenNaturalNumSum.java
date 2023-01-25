package basics.looping;

import java.util.Scanner;

public class EvenNaturalNumSum {
        public static void main(String[] args) {
            int n, i, sum=0, Even;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            try {
                n = sc.nextInt();
                System.out.print("The even numbers are: ");

                if (n > 0) {
                    for (i = 1; i <= n; i++) {
                        Even= 2*i;
                        System.out.print(" "+Even);
                        sum=sum+Even;
                    }
                    System.out.println();
                    System.out.println("The sum is " + sum);
                }else
                    System.out.println("Invalid input! The natural number cannot be negative");
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
}


