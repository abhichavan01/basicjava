package basics.looping;

import java.util.Scanner;

public class PalindromeNum {
        public static void main(String[] args) {
            int num, ans=0, temp;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter any number: ");
                num = sc.nextInt();
                if (num > 0) {
                    temp = num;
                    while (num > 0) {
                        int rem = num % 10;
                        num = num / 10;
                        ans = ans * 10 + rem;
                    }
                    if (temp==ans) {
                        System.out.println(+ans + " is a palindrome number");
                    }
                    else {
                        System.out.println(+ans + " is not a palindrome number");
                    }
                }
                else
                    System.out.println("Invalid input!");
            }
            catch (Exception e){
                System.out.println("Invalid Input!");
            }
        }
}
