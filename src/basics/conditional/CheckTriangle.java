package basics.conditional;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        int s1,s2,s3;
      try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Input the  three sides of the triangle");
          s1 = sc.nextInt();
          s2 = sc.nextInt();
          s3 = sc.nextInt();
          if (s1 == s2) {
              if (s1 == s3) {
                  System.out.println("This is an Equilateral triangle");
              } else System.out.println("This is an Isosceles triangle");
          } else if (s2 == s3) {
              System.out.println("This is an Isosceles triangle");
          } else System.out.println("This is a Scalene triangle");
      }
      catch (Exception e){
          System.out.println("Invalid choice");
      }
    }
}
