package basics.looping;

import java.util.Scanner;

public class AestricPyramid {
    public static void main(String[]args)
    {
            int row, col,n;
      try {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of n: ");
          n = sc.nextInt();
          if (n>0) {
              for (row = 0; row < n; row++) {
                  for (int space = 0; space < n-row; space++) {

                      System.out.print(" ");
                  }
                  for (col = 0; col <= row; col++) {

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
          System.out.println("Invalid user input! The value should be integer");
      }
    }
}