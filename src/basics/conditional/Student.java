package basics.conditional;

import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        try {
            int rno;
            String N;
            float phy,chem,cs, per, totalOfMarks;
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter the roll no. of the student");
            rno= sc.nextInt();
            System.out.println("Enter the name of the student");
            N= sc.next();
            System.out.println("Enter the marks obtained in Physics,Maths,Computer science");
            phy= sc.nextFloat();
            chem=sc.nextFloat();
            cs=sc.nextFloat();
            if ((0<phy&&phy<=100) && (0<chem&&chem<=100) && (0<cs&&cs<=100)) {
                totalOfMarks = phy + chem + cs;
                per = totalOfMarks / 3;
                System.out.println("The student roll no "+rno+" Name "+N+" has secured");
                System.out.println("Marks in Physics: " + phy);
                System.out.println("Marks in Chemistry: " + chem);
                System.out.println("Marks in Computer science: " + cs);
                System.out.println("Total marks obtained= " + totalOfMarks);
                System.out.println("Percentage of the student is= " + per);
                if (per >= 80) {
                    System.out.println("Division= First");
                } else
                    System.out.println("Division= Second");
            } else
                System.out.println("Invalid input! The marks should be in between 0 and 100");
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}