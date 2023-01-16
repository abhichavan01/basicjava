package basics.conditional;

import java.util.Scanner;

public class FormationOfTriangle {
    public static void main(String[] args) {
        int a1,a2,a3;
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Input the angles to form the triangle");
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            a3 = sc.nextInt();
            int sum=a1+a2+a3;
            if (sum==180)
                System.out.println("Triangle can be formed");
            else
                System.out.println("The triangle is not valid");

        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
