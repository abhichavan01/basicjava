package basics.looping;

import java.util.Scanner;

public class SeriesOfX {
    public static void main(String[] args) {
        double x, sum = 0;
        int n,sign=1 ;
        Scanner sc = new Scanner(System.in);
      try {
          System.out.print("Input the number of terms: ");
          n = sc.nextInt();
          System.out.print("Input the value of x: ");
          x = sc.nextDouble();
          System.out.print("The given series = ");
          if (n > 0) {
              for (int i = 1, a = 1; i <= n; i++, a += 2) {
                  int terms;
                  terms = (int) (Math.pow(x, a));
                  terms = terms * sign;
                  System.out.print(terms + " + ");
                  sum = sum + terms;
                  sign = sign * -1;
              }
              System.out.println();
              System.out.println("The sum of the series = " + sum);
          } else {
              System.out.println("Invalid input!");
          }
      }
      catch (Exception e){
          System.out.println("Invalid input!");
      }
    }
}
