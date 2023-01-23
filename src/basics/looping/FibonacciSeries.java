package basics.looping;

import java.util.Scanner;

public class FibonacciSeries {
        public static void main(String[] args) {
            int n1 = 0, n2 = 1, n3, i, count;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the count: ");
            try {
                count = sc.nextInt();
                if (count > 0) {
                    System.out.print(n1 + " " + n2);
                    for (i = 2; i < count; i++) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;
                    }
                }
                else {
                    System.out.println("Invalid input! The count should be positive");
                }
            }
            catch (Exception e){
                System.out.println("Invalid input! The count should be an integer value");
            }
        }
}


