package basics.looping;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      try {
          System.out.print("Enter the decimal number: ");
          int num = sc.nextInt();
          if (num > 0) {
              String str= "";
              while (num != 0){
                  int rem = num % 2;
                  str = rem + str;
                  num = num / 2;
              }
              System.out.println("The binary conversion of given number is: " + str);
          }
          else {
              System.out.println("Invalid input!");
          }
      }
      catch (Exception e){
          System.out.println("Invalid input!");
      }
    }

}
