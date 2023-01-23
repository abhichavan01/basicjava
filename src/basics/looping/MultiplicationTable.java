package basics.looping;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i, n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n= sc.nextInt();
        try {
                for (i=1;i<=10;i++){
                    System.out.println( +n+" * "+i+" = "+n*i );
                }
            }
        catch (Exception e){
            System.out.println("Invalid input! Please input integer value");
        }
    }
}
