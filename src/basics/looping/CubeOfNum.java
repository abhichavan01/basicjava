package basics.looping;

import java.util.Scanner;

public class CubeOfNum {
    public static void main(String[] args) {

        int i,n;
        double cube;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input the value of n: ");
            n = sc.nextInt();
            if (n > 0) {

                for (i = 1; i <= n; i++) {
                    cube = i * i * i;
                    System.out.println("Number is :" + i + " and cube of the " + i + " is :" + cube);
                }
                } else
                System.out.println("invalid input! Enter positive value");
        }catch (Exception e){
            System.out.println("Invalid input!");
        }
    }
}

