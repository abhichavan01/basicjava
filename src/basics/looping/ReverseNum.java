package basics.looping;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num, ans=0;
        Scanner sc = new Scanner(System.in);
      try {
          System.out.print("Enter any number: ");
          num = sc.nextInt();
          if (num > 0) {
              while (num > 0) {
                  int rem = num % 10;
                  num = num / 10;
                  ans = ans * 10 + rem;
              }
              System.out.println(ans);
          }
          else
              System.out.println("Invalid input!");
      }
      catch (Exception e){
          System.out.println("Invalid Input!");
      }

    }
}

