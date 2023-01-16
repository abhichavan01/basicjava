package basics.conditional;

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String args[])
    {
        try {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the Costprice: ");
            double cp=sc.nextDouble();
            System.out.print("Enter the Selling price:");
            double sp=sc.nextDouble();

            if(cp-sp>0)
            {
                System.out.println("You had a loss. Lost amount is: " +(cp-sp));
            }
            else if(cp-sp<0)
            {
                System.out.println("You have booked profit. Profit amount is: " +(sp-cp));
            }
            else

                System.out.println("NEUTRAL");

        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
