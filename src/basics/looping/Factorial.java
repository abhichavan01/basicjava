package basics.looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1, number;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
         if (number >= 0) {
              for (i = 1; i <= number; i++) {
                  fact = fact * i;
              }
              System.out.println("Factorial of " + number + " is: " + fact);
         }
          else{
              System.out.println("The number should be positive");
         }
        } catch (Exception e) {
            System.out.println("Invalid user input");
        }
    }
}
