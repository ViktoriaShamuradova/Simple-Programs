package by.epamtc.task2;

import by.epamtc.DataScanner;

public class Runner {
    public static void main(String[] args) {
        int numberOfDay = DataScanner.enterIntegerFromConsole();
        String dayAndMonth = FinderTheDayAndMonth.calcNumberOfDayAndMonth(numberOfDay);
        System.out.println(dayAndMonth);


    }
}
