package by.javatr.task8;

import by.javatr.DataScanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter a");
        double a = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter b");
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter h");
        double h = DataScanner.enterDoubleFromConsole();
        System.out.println(Util.calcFunctionValues(a, b, h));
    }
}
