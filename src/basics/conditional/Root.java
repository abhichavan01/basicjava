package basics.conditional;

import java.util.Scanner;
public class  Root {
    public static void main(String[] Strings) {
            Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a:");
            double a = input.nextDouble();
            System.out.println("Enter the value of b:");
            double b = input.nextDouble();
            System.out.println("Enter the value of c:");
            double c = input.nextDouble();
            double d = b * b - 4.0 * a * c;
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("The roots are" + r1 + "and" + r2);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is" + r1);
            } else {
                System.out.println("Roots are imaginery");
            }
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
