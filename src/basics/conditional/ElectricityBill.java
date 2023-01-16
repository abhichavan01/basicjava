package basics.conditional;

import java.util.Scanner;
class ElectricityBill
{
    public static void main(String[] args)
    {
            int id, units;
            String Name;
            double billToPay = 0, scharge;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Customer id: ");
            id= sc.nextInt();
            System.out.println("Enter the name: ");
            Name=sc.next();
            System.out.println("Enter number of units for calculating electricity bill.");
            units = sc.nextInt();
            if (units>0 && id>0) {
                if (units < 199) {
                    billToPay = units * 1.20;
                } else if (units >= 200 && units < 400) {
                    billToPay = units * 1.50;
                } else if (units >= 400 && units < 600) {
                    billToPay = (units * 1.80);
                    scharge = billToPay * 0.15;
                    billToPay = scharge + billToPay;
                    System.out.println("Surcharge is " + scharge);
                } else if (units > 600) {
                    billToPay = (units * 2.00);
                    scharge = billToPay * 0.15;
                    billToPay = scharge + billToPay;
                    System.out.println("Surcharge is " + scharge);
                }
                System.out.println("Customer id: " + id + " name: " + Name + " units consumed: " + units + " Bill amount is : " + billToPay);
            }
            else System.out.println("Invalid input!");
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}