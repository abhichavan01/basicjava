package basics.looping;

import java.util.Scanner;

public class LcmByHcf {

        public static void main (String[]args){

            int num1, num2, hcf, lcm = 1;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter the first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
                if (num1>0 && num2>0) {
                    for (int i = 1; i <= num1 || i <= num2; i++) {
                        if (num1 % i == 0 && num2 % i == 0) {
                            hcf = i;
                            lcm = (num1 * num2) / hcf;
                        }
                    }

                    System.out.println("The HCF: " + lcm);
                }
                else{
                    System.out.println("Invalid input! Enter positive number.");
                }
            }
            catch (Exception e){
                System.out.println("Invalid input!");
            }
        }
    }


