package by.javatr.task10;

public class ValidNumber {

    public static boolean isValidNum(int number) {
        return number % 10 != 0 && (number >= 11 || number <= -11) || number == 0;
    }
}
