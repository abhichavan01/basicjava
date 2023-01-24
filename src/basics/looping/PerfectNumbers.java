package basics.looping;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int sum, i;
        Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Enter the starting value of range: ");
         int n1 = sc.nextInt();
         System.out.print("Enter the ending value of range: ");
         int n2 = sc.nextInt();
         if (n1>0) {
             for (int j = n1; j <= n2; j++) {
                 sum = 0;
                 for (i = 1; i < j; i++) {
                     if (j % i == 0) {
                         sum = sum + i;
                     }
                 }
                 if (sum == j) {
                     System.out.print(+sum + ",");
                 }
             }
         }
         else{
             System.out.println("Invalid input!");
         }
     }
     catch (Exception e){
         System.out.println("Invalid input!");
     }
    }
}





