package by.javatr.task5;

public class Util {

    public static int determineTheSumOfTheDigitsOfAThreeDigitNumber(int number) {
        if (ValidArgument.checkThreeDigitNumber(number)) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        } else return -1;

    }

    public static int determineTheMulOfTheDigitsOfAThreeDigitNumber(int number) {
        if (ValidArgument.checkThreeDigitNumber(number)) {
            int mul = 1;
            while (number > 0) {
                mul *= number % 10;
                number = number / 10;
            }
            return mul;
        } else return -1;


    }

    public static int rearrangeTheNumbersOfHundredsAndTens(int number) {
        if (ValidArgument.checkThreeDigitNumber(number)) {
            number = number / 10 % 10 * 100 + number / 100 * 10 + number % 10;
            return number;
        } else return -1;


    }


    public static int determineTheFourDigitNumberObtainedByAttributingTheNumberOfUnitsAsTheNumberOfThousands(int number) {
        if (ValidArgument.checkThreeDigitNumber(number)) {
            number = number % 10 * 1000 + number;
            return number;
        } else return -1;
    }

}
