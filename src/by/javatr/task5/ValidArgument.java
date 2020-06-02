package by.javatr.task5;

public class ValidArgument {

    public static boolean checkThreeDigitNumber(int number) {
        return number >= 100 && number <= 999;
            //throw new IllegalArgumentException("The number should be >=1000 and <=999. Number: " + number);
    }
}
