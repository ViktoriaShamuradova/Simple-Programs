package by.javatr.task5;

import by.javatr.DataScanner;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter -1 to stop");
        while(true) {
            int number = DataScanner.enterIntegerFromConsole();
            if (number == -1) {
                break;
            }else {
                System.out.println(Util.determineTheSumOfTheDigitsOfAThreeDigitNumber(number));
                System.out.println(Util.determineTheMulOfTheDigitsOfAThreeDigitNumber(number));
                System.out.println(Util.determineTheFourDigitNumberObtainedByAttributingTheNumberOfUnitsAsTheNumberOfThousands(number));
                System.out.println(Util.rearrangeTheNumbersOfHundredsAndTens(number));
            }

        }
    }
}
