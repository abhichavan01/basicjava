package basics.looping;

import java.util.Scanner;

public class OctalToBin {
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
                String str= "";
                while (number != 0){
                    int remainer = number % 2;
                    str = remainer + str;
                    number = number / 2;
                }
                System.out.println("The decimal conversion of given number is :"+str);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
    }
}



