package basics.looping;

import java.util.Scanner;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= number / 2; ++i) {

                if (primeNumber(i)) {

                    if (primeNumber(number - i)) {

                        System.out.println( number+ " = " +i+ " + " +(number - i));
                        flag = true;
                    }

                }
            }

            if (!flag)
                System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }

        //function to check if given number is prime or not
        static boolean primeNumber(int num) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
    }
}

