package basics.looping;

import java.util.Scanner;

public class BinToOctal {
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
                String str= "";
                while (number != 0){
                    int remainder = number % 8;
                    str = remainder + str;
                    number = number / 8;
                }
                System.out.println("The octal conversion of given number is :"+str);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
  }
}

