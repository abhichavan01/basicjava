package basics.looping;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
             double sum=0,i;
             int n;
             Scanner sc = new Scanner(System.in);
       try {
           System.out.print("Enter the value of n: ");
           n = sc.nextInt();
         if (n>0) {
             for (i = 1; i <= n; i++) {
                 System.out.print(" " + 1 / i);
                 sum = sum + 1 / i;
             }
             System.out.println();
             System.out.println(sum);
         }
         else
             System.out.println("Invalid input! Please enter positive value of n");
       }
       catch (Exception e){
           System.out.println("Invalid input!");
       }
    }
}
