package basics.looping;

import java.util.Scanner;

public class DecToHexadec {
    public static void main(String[] args) {
        int rem, decimal;
        String hexaNum="";
        char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the decimal value: ");
            decimal = sc.nextInt();
            if (decimal > 0) {
                while (decimal > 0) {
                    rem = decimal % 16;
                    hexaNum = hexa[rem] + hexaNum;
                    decimal = decimal / 16;
                }
                System.out.println("The Hexa decimal value of given decimal number is: " + hexaNum);
            }
            else {
                System.out.println("Invalid input!");
            }
        }
        catch (Exception e){
            System.out.println("Invalid input!");
        }
    }
}
