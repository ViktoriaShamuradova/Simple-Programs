package by.epamtc.task3;

public class Util {
    static double[] doubleOrAbsoluteValues(double... numbers) {
        if (checkForDecreasingNumbers(numbers)) {
            doubleTheNumbers(numbers);
        } else {
            replaceTheNumbersWithAbsoluteValues(numbers);
        }
        return numbers;
    }

    private static boolean checkForDecreasingNumbers(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void doubleTheNumbers(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    private static void replaceTheNumbersWithAbsoluteValues(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }
    }
}
