package by.epamtc.task4;

public class Util {

    public static double calcFunction(double x) {
        if (x <= 13) {
            return -Math.pow(x, 3) + 9;
        } else {
            return -(3 / (x + 1));
        }
    }
}
