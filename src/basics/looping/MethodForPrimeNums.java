package basics.looping;

public class MethodForPrimeNums {


    //method to find prime numbers

    public boolean primeNums(int i) {
        int k = 0;
        int m = i / 2;
        if (i != 0 || i != 1) {
            for (int j = 2; j <= m; j++) {
                if (i % j == 0) {
                }
            }
            if (k == 0) {
                return true;
            }
        }
        return false;
    }
}
