package basics.looping;

import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args)
    {
        int row, col, space, k=1, n;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            n = sc.nextInt();
            for (row = 0; row < n; row++) {

                for (space = 0; space <=  n - row; space++) {

                    System.out.print(" ");
                }


                for (col = 1; col <= row; col++) {

                    System.out.print(" "+k++);
                }

                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Invalid user input! The value should be integer");
        }
    }
}

