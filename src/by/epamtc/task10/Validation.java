package by.epamtc.task10;

public class Validation {

    public static boolean isValid(int number) {
        return number % 10 != 0 && (number >= 11 || number <= -11) || number == 0;
    }
}
