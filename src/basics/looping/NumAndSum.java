package basics.looping;

import java.util.Scanner;

public class NumAndSum {
    public static void main(String[] args) {
        int num1, num2, i, sum=0;
        Scanner sc = new Scanner(System.in);
      try {
          System.out.print("Enter the starting number of the range: ");
          num1 = sc.nextInt();
          System.out.print("Enter the ending number of the range: ");
          num2 = sc.nextInt();
          System.out.print("Numbers between " + num1 + " and " + num2 + " which are divisible by 9: ");
          for (i = num1; i < num2; i++) {
              if (i % 9 == 0) {
                  System.out.print(" " + i);
                  sum = sum + i;
              }
          }
          System.out.println();
          System.out.println(" Sum is: " + sum);
      }
      catch (Exception e){
          System.out.println("Invalid input");
      }
    }
}
