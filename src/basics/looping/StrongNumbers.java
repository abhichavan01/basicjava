package basics.looping;

import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {

            int i, num1, num2, sum, j, fact = 1;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Input a range : ");
                num1 = sc.nextInt();
                System.out.print("Input the end value of range: ");
                num2 = sc.nextInt();
                if (num1>0) {
                    for (int k = num1; k <= num2; k++) {
                    sum =0;
                    for (j = k; j > 0; j = j / 10) {
                        for (i = 1; i <= j % 10; i++) {
                            MethodForFactorial object = new MethodForFactorial();
                            fact = object.factorial(i);
                        }
                        sum = sum + fact;

                    }

                    if (sum == k) {
                        System.out.println(sum);
                    }
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


