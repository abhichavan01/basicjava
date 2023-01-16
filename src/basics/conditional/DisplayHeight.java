package basics.conditional;

import java.util.Scanner;

public class DisplayHeight {
    public static void main(String args[]) {
        int h;
        try {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height");
        h = sc.nextInt();
        if (h > 175) {
            System.out.println("The person is tall");
        } else if (h > 155 && h <= 175) {
            System.out.println("The person has average height");
        } else {
            System.out.println("The person is dwarf");
        }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
    }
}
