package basics.looping;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        int num, rem, product, number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary value: ");
        try {
            num = sc.nextInt();
            int i = 0;
            while (i <= 10) {
                rem = num % 10;
                product = rem * ((int) Math.pow(2, i));
                number = number + product;
                num = num / 10;
                i++;
            }
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
