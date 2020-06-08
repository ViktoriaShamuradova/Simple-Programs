package by.epamtc.task6;

import by.epamtc.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter a1");
        int a1 = DataScanner.enterIntegerFromConsole();
        System.out.println("Please, enter arithmetic progression step");
        int d = DataScanner.enterIntegerFromConsole();

        System.out.println(Util.findWhenOverInt(a1, d));
    }
}
