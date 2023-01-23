package basics.looping;

import java.util.Scanner;

public class RepeatNumsTriangle {

        public static void main(String[] args) {
            int i, j, n;

            Scanner sc = new Scanner(System.in);
            System.out.print("Input number of rows: ");
            try {
                n = sc.nextInt();
                if (n > 0) {
                    for (i = 0; i <= n; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(i);
                        }
                        System.out.println();

                    }
                } else
                    System.out.println("Enter positive value of n");
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
}


