package by.javatr.task9;

public class BuilderArray {
    public static int[] buildArrayFrom1ToNumber(int number) {
        if (ValidArgument.isNaturalArgument(number)) {
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = i + 1;
            }
            return array;
        } else {
            throw new IllegalArgumentException("Not valid argument, enter natural number");
        }
    }
}
