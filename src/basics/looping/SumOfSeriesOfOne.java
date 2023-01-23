package basics.looping;

import java.util.Scanner;

public class SumOfSeriesOfOne {
    public static void main(String[] args) {
        try {
            int i, Num = 1, NumOfTerms;
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the number of terms: ");
            NumOfTerms = sc.nextInt();
            if (NumOfTerms>0) {
                int sum = 0;
                for (i = 1; i <= NumOfTerms; i++) {
                    sum = sum + Num;
                    System.out.println(Num);
                    Num = Num * 10 + 1;
                }
                System.out.println("The sum of the series " + sum);
            }
            else {
                System.out.println("Invalid input! Enter positive number");
            }
        }
        catch (Exception e){
            System.out.println("Invalid user input");
        }
    }

}

