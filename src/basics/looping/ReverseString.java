package basics.looping;

import java.util.Scanner;

public class ReverseString {
        public static void main (String[] args) {

            String str, temp="";
            char ch;

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a word: ");
            str = sc.next();
            for (int i=0; i < str.length(); i++)
            {
                ch= str.charAt(i);
                temp= ch + temp;
            }
            System.out.println("Reversed word: "+ temp);
        }
}

