package by.epamtc.task7;

public class Util {

    public static double swapFractionalAndIntegerParts(double number) {
        int whole = swapFractionPart(number);
        double fraction = swapIntegerPart(number);
        return whole + fraction;

    }

    private static int swapFractionPart(double number) {
        double hundredthsD = number * 10 % 10 * 100;
        int hundredths = (int) (hundredthsD - hundredthsD % 100);
        double tensD = number * 100 % 10 * 10;
        int tens = (int) (tensD - tensD % 10);
        double unitsD = number * 1000 % 10;
        int units = (int) unitsD;
        return hundredths + tens + units;
    }

    private static double swapIntegerPart(double number) {
        return number / 1000 - number / 1000 % 0.001;
    }
}
