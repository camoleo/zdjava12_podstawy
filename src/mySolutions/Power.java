package mySolutions;

import java.math.BigInteger;

public class Power {
    //!4 -> 1 * 2 * 3 *4 = 24
    //5! -> 1 * 2 * 3 * 4 * 5 = 120
    //static BigInteger bigPowerWhile


    static int power(int n) {
        int accumulator = 1;
        for (int i = 1; i <= n; i++) {
            accumulator *= i;
        }
        return accumulator;
    }

    public static void main(String[] args) {

        System.out.println(power(3));
    }
}

