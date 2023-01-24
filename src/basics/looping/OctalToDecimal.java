package basics.looping;

import java.util.Scanner;

public class OctalToDecimal {
        public static void main(String[] args) {
            int num, rem, product, number = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any octal number: ");
            try {
                num = sc.nextInt();
                int i = 0;
                while (i <= 10) {
                    rem = num % 10;
                    product = rem * ((int) Math.pow(8, i));
                    number = number + product;
                    num = num / 10;
                    i++;
                }
                System.out.println("The decimal conversion of given number is :"+number);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
}


