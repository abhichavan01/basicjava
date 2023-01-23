package basics.looping;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
            double a, r, n, sum=0.0;

            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Input the number of items for the G.P. series: ");
                n = sc.nextInt();
                System.out.println("Input the starting number of the G.P. series: ");
                a = sc.nextInt();
                System.out.println("Input the common ratio of G.P. series: ");
                r = sc.nextInt();
                if (n>0) {
                    System.out.println("The series is: ");
                    for (double i = 0; i < n; i++) {
                        System.out.print( +a + "+");
                        sum = sum + a;
                        a = a * r;
                    }
                    System.out.println();
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


