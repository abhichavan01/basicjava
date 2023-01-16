package basics.conditional;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        int Age;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age");
            Age = sc.nextInt();
            if (Age >= 18) {
                System.out.println("Congratulation! You are eligible for casting your vote.");
            } else {
                System.out.println("Candidate is not eligible for voting.");
            }
            }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}