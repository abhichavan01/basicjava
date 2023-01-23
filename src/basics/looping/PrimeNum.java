package basics.looping;

import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        int i,m,k=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value to check given condition: ");
        n= sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    k=1;
                }
            }
            if(k==0)  { System.out.println(n+" is prime number");
            }
        }
    }
}

