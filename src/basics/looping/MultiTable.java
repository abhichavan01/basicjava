package basics.looping;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {

        int i,n,j;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input the value of n: ");
            n = sc.nextInt();
            if (n > 0) {

                for (i = 1; i <= n; i++) {
                    for (j = 1; j <= 10; j++) {

                        System.out.print(n + " * " + i + " = " + n * i);
                    }
                }
            }
        else
                System.out.println("invalid input! Enter positive value");
        }catch (Exception e){
            System.out.println("Invalid input!");
        }
    }
}
