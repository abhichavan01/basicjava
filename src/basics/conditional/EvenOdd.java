package basics.conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
    int a;
    try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer ");
        a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println(+a + " is even integer");
        else
            System.out.println(+a + " is odd integer");
        }
    catch (Exception e) {
        System.out.println("Invalid input");
    }

    }
}
