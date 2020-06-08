package by.epamtc.task10;

import by.epamtc.DataScanner;

public class Util {

    public static boolean sequenceIsIncreasing() {
        return identifySeq(true, false, false);
    }

    public static boolean isHaveOnePairOrMoreEqualsNumbers() {
        return identifySeq(false, true, false);
    }

    public static boolean isTheSequenceAlternating() {
        return identifySeq(false, false, true);
    }

    private static boolean identifySeq(boolean isIncreasing, boolean isPair, boolean isAlternating) {
        System.out.println("Enter 0 to stop");
        int previous = 0;
        while (true) {
            int number = DataScanner.enterIntegerFromConsole();
            if (Validation.isValid(number)) {
                if (number == 0) {
                    break;
                }
                if (previous == 0) {
                    previous = number;
                    continue;
                }
                if (isIncreasing) {
                    if (previous > number) {
                        return false;
                    }
                }
                if (isPair) {
                    if (previous == number) {
                        return true;
                    }
                }
                if (isAlternating) {
                    if ((previous > 0 && number > 0) || (previous < 0 && number < 0)) {
                        return false;
                    }
                    previous = number;
                }

            } else {
                System.out.println("Not valid sequence");
                return false;
            }
        }
        return isIncreasing || isAlternating;
    }
}


