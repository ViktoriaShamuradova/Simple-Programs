package by.epamtc.task8;

import java.util.TreeMap;

public class Util {

    public static TreeMap<Double, Double> calcFunctionValues(double a, double b, double h) {
        double y, x;
        TreeMap<Double, Double> xy = new TreeMap<>();
        for (x = a; x <= b; x += h) {
            if (x != 15) {
                y = (x - 5) + 6;
                xy.put(x, y);
            } else {
                y = (x + 5) * 2;
                xy.put(x, y);
            }
        }
        return xy;
    }
}
