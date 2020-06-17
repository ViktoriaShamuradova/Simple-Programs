package by.epamtc.array.findMaxSum;

public class Util {
    public static double findMaxSum(double[] array) {
        if (array != null) {
            double maxSum = array[0] + array[array.length - 1];
            for (int i = 1; i < array.length / 2; i++) {
                if (array[i] + array[array.length - 1 - i] > maxSum) {
                    maxSum = array[i] + array[array.length - 1 - i];
                }
            }
            return maxSum;
        } else return -1;
    }

    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 6, 12, 5, -2, 7, 8, 12, 10};
        System.out.println(Util.findMaxSum(array));
    }
}
