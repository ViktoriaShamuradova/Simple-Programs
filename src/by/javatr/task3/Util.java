package by.javatr.task3;

public class Util {
    static double[] doubleOrReplaceWithAbsoluteValues(double... numbers) {
        if (checkArrayForDecreasingNumbers(numbers)) {
            doubleTheNumbersInAnArray(numbers);
        } else {
            replaceTheNumbersInTheArrayWithAbsoluteValues(numbers);
        }
        return numbers;
    }

    private static boolean checkArrayForDecreasingNumbers(double[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void doubleTheNumbersInAnArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    private static void replaceTheNumbersInTheArrayWithAbsoluteValues(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }
    }
}
