package by.epamtc.task6;

public class Util {
    private static final double MAX_LIMIT_INT = Integer.MAX_VALUE;
    private static final double MIN_LIMIT_INT = Integer.MIN_VALUE;
    private static final double MAX_LIMIT_LONG = Long.MAX_VALUE;
    private static final double MIN_LIMIT_LONG = Long.MIN_VALUE;

    public static int findWhenOverInt(int a1, int d) {
        return findWhenOver(a1, d, MAX_LIMIT_INT, MIN_LIMIT_INT);
    }

    public static int findWhenOverLong(int a1, int d) {
        return findWhenOver(a1, d, MAX_LIMIT_LONG, MIN_LIMIT_LONG);
    }

    public static int findWhenOver(int a1, int d, double limitMax, double limitMin) {
        int counter = 1;
        double an = a1;
        double sumOfArithmeticProgression = 0;

        while (sumOfArithmeticProgression < limitMax && sumOfArithmeticProgression > limitMin) {
            an = an + d;
            counter++;
            sumOfArithmeticProgression = (a1 + an) * (counter / 2);
        }

        return counter;
    }


}
