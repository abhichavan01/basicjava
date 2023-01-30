package basics.looping;

import java.util.Scanner;


public class ArmstrongNumbers {
        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the starting number of range :");
                int num1 = sc.nextInt();
                System.out.print("Enter the ending number of range: ");
                int num2 = sc.nextInt();
                for (int i = num1; i < num2; i++) {
                    MethodForArmstrongNum obj = new MethodForArmstrongNum();
                    boolean armstrongNum = obj.armstrongNum(i);
                    if(armstrongNum){
                        System.out.print(" "+i);
                    }
                }
            }catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
}

