package basics.looping;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value of range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the ending value of range: ");
        int n2= sc.nextInt();
      try {
          if (n1>0) {
              ArrayList<Integer> List = new ArrayList<>();
              for (int n = n1; n <= n2; n++) {
                  int c = 0;
                  for (int i = 1; i <= n; i++)
                      if (n % i == 0)
                          c++;
                  if (c == 2)
                      List.add(n);
              }
              System.out.println(List);
          }
          else {
              System.out.println("Invalid input! The range should be of positive numbers.");
          }
      }
      catch (Exception e){
          System.out.println("invalid input!");
      }
    }
}

