package basics.conditional;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        try {
            double phyMarks, mathsMarks, chemMarks, totalOfThree, sum;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the marks in the Maths ");
            mathsMarks = sc.nextInt();
            System.out.print("Enter the marks in the physics ");
            phyMarks = sc.nextInt();
            System.out.print("Enter the marks in the chemistry ");
            chemMarks = sc.nextInt();
            if((0 <phyMarks && phyMarks<= 100) && (0 <chemMarks && chemMarks<=100) && (0 <mathsMarks && mathsMarks<=100)) {
                totalOfThree = phyMarks + chemMarks + mathsMarks;
                sum = phyMarks + mathsMarks;

                System.out.println("Total marks of Maths, Physics and Chemistry : " + totalOfThree);
                System.out.println("Total marks of Maths and Physics : " + sum);
                if ((phyMarks >= 55 && chemMarks >= 50 && mathsMarks >= 65) && (totalOfThree >= 190 || sum >= 140)) {
                    System.out.println("The candidate is eligible for admission ");
                } else
                    System.out.println("The candidate is not eligible for admission");
            }else
                System.out.println("Invalid input! The marks should be in between 0 and 100");
        }
        catch (Exception e){
            System.out.println("Invalid input");

        }
    }
}