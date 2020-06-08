package by.epamtc.task3;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        double[] array = new double[]{5, 4, 3};
        double[] array2 = new double[]{5, 6, -3};

        System.out.println(Arrays.toString(Util.doubleOrAbsoluteValues(array)));
        System.out.println(Arrays.toString(Util.doubleOrAbsoluteValues(array2)));
    }
}
