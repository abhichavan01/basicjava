package basics.conditional;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        int x,y;
        try {
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter the coordinate points x and y: ");
                x=sc.nextInt();
                y=sc.nextInt();
             if (x>0&&y>0) {
                 System.out.println("The coordinate point (" +x+ "," +y+") lies in the First quadrant.");
             }
             else if (x<0&&y>0) {
                 System.out.println("The coordinate point (" +x+ "," +y+ ") lies in the Second quadrant.");
             }
             else if (x<0&&y<0) {
                 System.out.println("The coordinate point (" +x+","+y+") lies in the Third quadrant.");
             }
             else if (x>0&&y<0) {
                 System.out.println("The coordinate point (" +x+","+y+") lies in the First quadrant.");
             }
             else
                 System.out.println("The coordinate point (" +x+","+y+") lies on the origin");
        }
        catch (Exception e){
            System.out.println("Enter valid coordinate points");
        }
    }
}
