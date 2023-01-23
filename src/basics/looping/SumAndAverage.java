package basics.looping;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int i,n;
        double avg, sum=0;
        Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Input the value of n: ");
         n = sc.nextInt();
         if (n > 0) {
             System.out.println("Input the numbers : ");
             for (i = 1; i <= n; i++) {
                 System.out.print("Enter the " + i + " number: ");
                 i = sc.nextInt();

                 sum = sum + i;
             }
             avg = sum / n;
             System.out.println("The sum of n no is : " + sum + " The Average is : " + avg);
         } else
             System.out.println("invalid input! Enter positive value");
     }catch (Exception e){
         System.out.println("Invalid input!");
     }
    }
}

