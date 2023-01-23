package basics.looping;

import java.util.Scanner;

public class ArmstrongNumbers {
        public static void main(String[] args) {

            int check, rem;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the starting number of range :");
                int num1 = sc.nextInt();
                System.out.print("Enter the ending number of range: ");
                int num2 = sc.nextInt();
                for (int i = num1; i < num2; i++) {
                    check = i; int sum=0;
                    while (check != 0) {
                        rem = check % 10;
                        sum = sum + (rem * rem * rem);
                        check = check / 10;
                    }
                    if (sum == i) {
                        System.out.println("" + i + " is an Armstrong number.");
                    }
                }
            }catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
}

