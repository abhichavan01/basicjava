package basics.looping;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        int check, Number, remainder, result = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter any number to check: ");
            check = sc.nextInt();

            Number = check;
            while (Number != 0) {
                remainder = Number % 10;
                result = result + remainder * remainder * remainder;
                Number = Number / 10;
            }

            if (result == check)
                System.out.println(check + " is an Armstrong number.");
            else
                System.out.println(check + " is not an Armstrong number.");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
