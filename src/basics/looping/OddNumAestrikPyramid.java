package basics.looping;

import java.util.Scanner;

public class OddNumAestrikPyramid {
    public static void main(String[] args) {
        {
            int row, col, space, n;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of n: ");
                n = sc.nextInt();
                for (row = 0; row <= n; row++) {

                    for (space = 0; space <= n - row; space++) {

                        System.out.print(" ");
                    }


                    for (col = 1; col <= row; col++) {
                        if ((row % 2) == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(" *");
                        }
                    }
                    System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Invalid user input! The value should be integer");
            }
        }
    }
}
