package basics.looping;

public class MethodForArmstrongNum {
    // method to find armstrong numbers
    public boolean armstrongNum(int i) {
        int check, remainder, result = 0;
        check = i;
        while (i != 0) {
            remainder = i % 10;
            result = result + remainder * remainder * remainder;
            i = i / 10;
        }
        if (result == check) {
            return true;
        } else {
            return false;
        }
    }

}

