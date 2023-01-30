package basics.looping;

public class MethodForFactorial {
    public int factorial(int i){
        int fact = 1;
        for (int k = 1; k <= i; k++) {
            fact = fact * k;

        }
        return fact;
    }

}
