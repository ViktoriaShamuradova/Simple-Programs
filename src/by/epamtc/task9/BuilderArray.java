package by.epamtc.task9;

public class BuilderArray {

    public static int[] buildArrayOneToNumber(int number) {
        if (Validation.isNatural(number)) {
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = i + 1;
            }
            return array;
        } else {
            return null;
        }
    }
}
