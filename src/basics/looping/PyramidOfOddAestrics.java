package basics.looping;

public class PyramidOfOddAestrics {
    public static void main(String[] args) {
        int i, j, n=4;
        for(i=0;i<n;i++)
        {
            for(j=1;j<=n-i;j++)
                System.out.println(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
        }
    }
}
