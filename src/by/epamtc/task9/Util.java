package by.epamtc.task9;

import java.math.BigInteger;

public class Util {

    public static BigInteger calculateValue(int number) {

        int[] array = BuilderArray.buildArrayOneToNumber(number);
        BigInteger mul = BigInteger.valueOf(1);
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = 0; j <= i; j++) {
                    sum = sum + array[j];
                }
                if (sum == 0) {
                    mul = mul.multiply(BigInteger.valueOf(1));
                } else {
                    mul = mul.multiply(BigInteger.valueOf(sum));
                }
            }
            return mul;

    }
}
