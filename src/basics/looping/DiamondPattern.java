package basics.looping;

import java.util.Scanner;

public class DiamondPattern {
        public static void main(String[] args)
        {
            int row, col, space, n;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of n: ");
                n = sc.nextInt();
                for (row = 1; row < 2*n; row++) {
                    int totalColsInRow= row > n ? 2 * n - row: row;

                    for (space = 1; space <= n - totalColsInRow; space++) {

                        System.out.print(" ");
                    }


                    for (col = 1; col <= totalColsInRow; col++) {

                        System.out.print("* ");
                    }

                    System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Invalid user input! The value should be integer");
            }
        }
    }


