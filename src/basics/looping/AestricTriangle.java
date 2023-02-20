package basics.looping;

import java.util.Scanner;

public class AestricTriangle {
    public static void main(String[] args) {
      try {
          int i, j, n;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of n: ");
          n = sc.nextInt();
          if (n>0) {
              for (i = 1; i <= n; i++) {

                  for (j = 1; j <= i; j++) {

                      System.out.print("* ");

                  }
                  System.out.println();
              }
          }
          else {
              System.out.println("Enter the positive value of n");
          }
      }
      catch (Exception e){
          System.out.println("Invalid user input!");
      }
    }
}
