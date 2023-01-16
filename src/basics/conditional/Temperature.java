package basics.conditional;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

           Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter the temperature in centigrade");
            int c= sc.nextInt();
            if (c<0){
                System.out.println("Freezing weather");
            } else if(c>=0&&c<=10)  {
                System.out.println("Very cold weather");
            } else if (c>=11&&c<=20) {
                System.out.println("Cold weather");
            } else if (c>=21&&c<=30) {
                System.out.println("Normal in temp");
            } else if (c>=31&&c<=40) {
                System.out.println("It's hot");
            }else
                System.out.println("It's very hot");

        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
