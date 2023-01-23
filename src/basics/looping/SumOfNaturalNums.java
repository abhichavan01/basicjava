package basics.looping;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        int i, sum=0;
        System.out.println("The sum of 10 natural numbers is: ");

        for (i=1;i<=10;i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
