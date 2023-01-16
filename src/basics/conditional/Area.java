package basics.conditional;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter c to calculate area of circle");
        System.out.println("Enter s to calculate area of square");
        System.out.println("Enter r to calculate area of rectangle");
        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);
    try {
        switch(choice) {
            case 'c':
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                double ca = 3.142 * r * r;
                System.out.println("Area of circle = " + ca);
                break;

            case 's':
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;

            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = sc.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;

            default:
                System.out.println("Invalid input");
        }
     }
    catch (Exception e){
        System.out.println("Invalid input");
     }
    }
}

