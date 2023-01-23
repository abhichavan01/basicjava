package basics.looping;

import java.util.Scanner;

public class PerfectInteger {
    public static void main(String[] args) {
        int num, sum=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer you want to check: ");
        try {
            num = sc.nextInt();
            if (num > 0) {
                System.out.println("Positive divisors are: "  );
                for (i = 1; i < num; i++) {
                    if (num % i == 0) {
                        sum = sum + i;
                        System.out.print(" "  +i);
                    }
                }
                System.out.println();

                System.out.println("The sum of positive divisor is: " +sum);

                if (sum == num) {
                    System.out.println("Given number is Perfect");
                } else {
                    System.out.println("Given number is not Perfect");
                }
            } else {
                System.out.println("Invalid input! Perfect number should be positive");
            }
        }
        catch (Exception e){
            System.out.println("Invalid input!enter valid input");
        }
    }
}



