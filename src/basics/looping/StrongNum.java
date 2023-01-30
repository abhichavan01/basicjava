package basics.looping;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {

        int i, num, n, sum=0, j, fact=1;
        Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Input a number to check whether it is Strong number: ");
         num = sc.nextInt();
         if (num>0) {
             n = num;
             for (j = num; j > 0; j = j / 10) {
                 for (i = 1; i <= j % 10; i++) {
                     MethodForFactorial object = new MethodForFactorial();
                     fact = object.factorial(i);
                 }
                 sum = sum + fact;

             }

             if (sum == n) {
                 System.out.println("The given number is strong number ");
             } else {
                 System.out.println("The given number is not a strong number ");

             }
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
