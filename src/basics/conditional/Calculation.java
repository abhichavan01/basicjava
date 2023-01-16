package basics.conditional;

import java.util.Scanner;

public class Calculation {
    public static void main(String args[]) {
        int a, b;
        try {
             Scanner sc = new Scanner(System.in);

             System.out.println("Enter A for addition");
             System.out.println("Enter S for substraction");
             System.out.println("Enter M for multiplication");
             System.out.println("Enter D for division");
             System.out.print("Enter your choice : ");
         char choice = sc.next().charAt(0);

        switch(choice) {
            case 'A':
                System.out.print("Enter two Numbers ");
                a = sc.nextInt();
                b = sc.nextInt();
                int Add = a + b;
                System.out.println("The Addition of " + a + " and " + b + " is " + Add);
                break;

            case 'S':
                System.out.print("Enter two Numbers ");
                a = sc.nextInt();
                b = sc.nextInt();
                int Sub = a - b;
                System.out.println("The Substraction of " + a + " and " + b + " is " + Sub);
                break;


            case 'M':
                System.out.print("Enter two Numbers ");
                a = sc.nextInt();
                b = sc.nextInt();
                int Multi = a * b;
                System.out.println("The Multiplication of " + a + " and " + b + " is " + Multi);
                break;

            case 'D':
                System.out.print("Enter two Numbers ");
                a = sc.nextInt();
                b = sc.nextInt();
                int Div = a / b;
                System.out.println("The Division of " + a + " and " + b + " is " + Div);
                break;
            default:
                System.out.println("Invalid input");
                break;

            }
        }
        catch (Exception e){
            System.out.println("Invalid choice");
        }
    }
}
