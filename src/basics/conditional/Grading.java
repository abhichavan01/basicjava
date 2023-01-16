package basics.conditional;

import java.util.Scanner;

public class Grading {
    public static void main(String args[]) {
        System.out.println("Enter the grade among E,V,G,A,F.");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the grade ");
            String Grade = sc.next();
            switch (Grade) {
                case "E":
                    System.out.println("Excellent");
                    break;
                case "V":
                    System.out.println("Very good");
                    break;
                case "G":
                    System.out.println("Good");
                    break;
                case "A":
                    System.out.println("Average");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            }
            catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}