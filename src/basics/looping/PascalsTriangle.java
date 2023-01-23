package basics.looping;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args)
        {
            int row, col, space, n, coefficient=1;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of n: ");
                n = sc.nextInt();
                for (row = 0; row < n; row++) {

                    for (space = 0; space <=  n - row; space++) {

                        System.out.print(" ");
                    }


                    for (col = 0; col <= row; col++) {


                        if (col==0||row==0)
                            coefficient=1;
                        else
                            coefficient = coefficient * (row - col + 1) / col;
                        System.out.print(" "+coefficient);
                    }
                    System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Invalid user input! The value should be integer");
            }
        }
    }



