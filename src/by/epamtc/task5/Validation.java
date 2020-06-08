package by.epamtc.task5;

public class Validation {
    private static final int MIN_THREE_DIGIT_NUMBER = 100;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;

    public static boolean checkThreeDigitNumber(int number) {
        return number >= MIN_THREE_DIGIT_NUMBER && number <= MAX_THREE_DIGIT_NUMBER;
    }
}
