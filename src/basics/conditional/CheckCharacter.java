package basics.conditional;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("This is alphabate");
        else if ((ch >= '0' && ch <= '9'))
            System.out.println("This is digit");
        else
            System.out.println("This is special character");

    }
}
