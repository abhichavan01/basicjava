package basics.conditional;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        int month;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input month No : ");
            month = sc.nextInt();
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31 Days in this Month");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 Days in this Month");
            } else if (month == 2) {
                System.out.println(" Either 28 or 29 Days in this Month");
            } else
                System.out.println("Please enter valid number");
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
