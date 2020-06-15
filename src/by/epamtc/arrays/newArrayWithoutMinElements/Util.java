package by.epamtc.arrays.newArrayWithoutMinElements;

public class Util {

    public static int[] arrayWithoutMinElements(int[] array) {
        int min = minElement(array);
        int count = countOfElement(array, min);

        if (count == 0) {
            return array;
        }
        int[] withoutMin = new int[array.length - count];
        int index=0;
        for (int element : array)
            if (element != min) {
                withoutMin[index++] = element;
            }
        return withoutMin;

    }

    private static int minElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int countOfElement(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count;
    }
}
