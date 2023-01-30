package basics.looping;

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
              for (int i = n1; i <= n2; i++) {
                  MethodForPrimeNums object = new MethodForPrimeNums();
                  boolean prime = object.primeNums(i);
                  if (prime) {
                      System.out.print(" "+i);
                  }
              }
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

