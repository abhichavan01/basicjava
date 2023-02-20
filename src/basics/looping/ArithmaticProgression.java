package basics.looping;

import java.util.Scanner;

public class ArithmaticProgression {
    public static void main(String[] args) {
        int a, n, diff, sum=0;
        Scanner sc = new Scanner(System.in);
      try {
          System.out.print("Input the number of items for the A.P. series: ");
          n = sc.nextInt();
          System.out.print("Input the starting number of the A.P. series: ");
          a = sc.nextInt();
          System.out.print("Input the common difference of A.P. series: ");
          diff = sc.nextInt();
          if (n>0) {
              for (int i = 0; i < n; i++) {
                  System.out.print( a + "+");
                  sum = sum + a;
                  a = a + diff;


              }
              System.out.println("The sum is: " + sum);
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
