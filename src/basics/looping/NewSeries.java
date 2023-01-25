package basics.looping;

import java.util.Scanner;

public class NewSeries{
    public static void main(String[] args) {
        double x, sum = 0;
        int n,sign =-1, fact=1 ;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input the number of terms: ");
            n = sc.nextInt();
            System.out.print("Input the value of x: ");
            x = sc.nextDouble();
            if (n > 0) {
                for (int i = 2; i <= 2 * n; i += 2) {
                    fact = fact * i * (i-1);
                    sum= sum + (sign * (Math.pow(x,i))/fact);
                    sign= sign * (-1);
                }
                double result = 1 + sum;
                System.out.println();
                System.out.println("The sum of the series = " + result);
            } else {
                System.out.println("Invalid input!");
            }
        }
        catch (Exception e){
            System.out.println("Invalid input!");
        }
    }
}
