package basics.conditional;

import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        try {
            int rno;
            String N;
            Float phy,chem,cs, per, total;
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter the roll no. of the student");
            rno= sc.nextInt();
            System.out.println("Enter the name of the student");
            N= sc.next();
            System.out.println("Enter the marks obtained in Physics,Maths,Computer science");
            phy= sc.nextFloat();
            chem=sc.nextFloat();
            cs=sc.nextFloat();
            total=phy+chem+cs;
            per=total/3;
            System.out.println("Marks in Physics: "+phy);
            System.out.println("Marks in Chemistry: "+chem);
            System.out.println("Marks in Computer science: "+cs);
            System.out.println("Total marks obtained= "+total);
            System.out.println("Percentage of the student is= "+per);
            if (per>=80){
                System.out.println("Division= First");
            }else
                System.out.println("Division= Second");
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}