package basics.looping;

import java.util.Scanner;

public class StringLength {
        public static void main(String[] args)  {
            String str;
            int i = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Input any word : ");
            str = sc.next();
            for(char c: str.toCharArray()) {
                i++;
            }
            System.out.println("Length of the given string : "+i);
        }
}


