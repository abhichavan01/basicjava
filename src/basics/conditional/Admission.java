package basics.conditional;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        try {
            int p, c, m, total, sum;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the marks in the Maths");
            m = sc.nextInt();
            System.out.println("Enter the marks in the physics");
            p = sc.nextInt();
            System.out.println("Enter the marks in the chemistry");
            c = sc.nextInt();
            total = p + c + m;
            sum = p + m;
            System.out.println("Total marks of Maths, Physics and Chemistry : " + total);
            System.out.println("Total marks of Maths and Physics : " + sum);
            if ((p >= 55 && c >= 50 && m >= 65) && (total >= 190 || sum >= 140)) {
                System.out.println("The candidate is eligible for admission ");
            } else
                System.out.println("The candidate is not eligible for admission");
            }
        catch (Exception e){
            System.out.println("Invalid input");

        }
    }
}