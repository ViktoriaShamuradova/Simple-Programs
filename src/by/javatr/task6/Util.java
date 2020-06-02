package by.javatr.task6;

import java.math.BigInteger;

public class Util {
    private final static int INT_BIT_COUNT = 32;
    private final static int LONG_BIT_COUNT = 64;

    public static void findWhenOverInt(long first, long step) {
        findWhenOver(first, step, true);
    }

    public static void findWhenOverLong(long first, long step) {
        findWhenOver(first, step, false);
    }

    private static void findWhenOver(long first, long step, boolean forInt) {
        long numberOrder = 1;
        long number = first;
        while (true) {
            numberOrder++;
            number = number + step;

            // Sn = ( a1 + an )* n / 2
            BigInteger sN = calculateSum(first, number, numberOrder);

            System.out.println("IT: " + numberOrder + " number: " + sN.toString());
            if (forInt && overflowInt(sN)) {
                System.out.printf("Number %s overflows int. \nThe order is %d", sN.toString(), numberOrder);
                return;
            }
            if (!forInt && overflowLong(sN)) {
                System.out.printf("Number %s overflows long. \nThe order is %d", sN.toString(), numberOrder);
                return;
            }
        }
    }

    private static BigInteger calculateSum(long first, long last, long numberOrder) {
        BigInteger firstBI = new BigInteger(String.valueOf(first));
        BigInteger lastBI = new BigInteger(String.valueOf(last));
        BigInteger numberOrderBI = new BigInteger(String.valueOf(numberOrder));

        // (firstBi + lastBI) * numberOrderBI / 2
        return firstBI.add(lastBI).multiply(numberOrderBI).divide(new BigInteger("2"));
    }

    private static boolean overflowInt(BigInteger value) {
        return value.bitLength() >= INT_BIT_COUNT;
    }

    private static boolean overflowLong(final BigInteger value) {
        return value.bitLength() >= LONG_BIT_COUNT;
    }

}
