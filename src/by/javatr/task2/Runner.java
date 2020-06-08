package by.javatr.task2;

import by.javatr.DataScanner;

public class Runner {
    public static void main(String[] args) {
        int numberOfDay = DataScanner.enterIntegerFromConsole();
        String dayAndMonth = FinderTheDayAndMonth.calcNumberOfDayAndMonth(numberOfDay);
        System.out.println(dayAndMonth);


    }
}
