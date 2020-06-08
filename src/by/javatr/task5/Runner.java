package by.javatr.task5;

import by.javatr.DataScanner;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter three digit number");

        int threeDigitNumber = DataScanner.enterIntegerFromConsole();

        System.out.println(ListOfOperations.sumDigits(threeDigitNumber));
        System.out.println(ListOfOperations.mulOfDigits(threeDigitNumber));
        System.out.println(ListOfOperations.addTensToThousands(threeDigitNumber));

    }
}
