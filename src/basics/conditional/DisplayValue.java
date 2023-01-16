package basics.conditional;

import java.util.Scanner;

public class DisplayValue {
    public static void main(String[] args) {
        int m,n;
      try {
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the value of m");
          m= sc.nextInt();
          if (m>0)
              System.out.println("The value of n = 1");
          if (m==0)
              System.out.println("The value of n = 0");
          if (m<0)
              System.out.println("The value of n = -1");

      }
      catch (Exception e){
          System.out.println("Invalid input");
      }
    }
}
