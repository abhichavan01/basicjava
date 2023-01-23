package basics.looping;

import java.util.Scanner;

public class PyramidOfIncreaseNum {
        public static void main(String[] args)
        {
            int i, j,k=1,n;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of n: ");
                n = sc.nextInt();
                if (n>0) {
                    for (i = 0; i < n; i++) {

                        for (j = n - i; j > 1; j--) {

                            System.out.print(" ");
                        }


                        for (j = 0; j <= i; j++) {

                            System.out.print(" "+k++);
                        }

                        System.out.println();
                    }
                }
                else {
                    System.out.println("Enter the positive value of n");
                }
            }
            catch (Exception e){
                System.out.println("Invalid user input! The value should be integer");
            }
        }
}

