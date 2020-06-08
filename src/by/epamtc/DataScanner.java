package by.epamtc;

import java.util.Scanner;

public class DataScanner {
    private static Scanner sc = new Scanner(System.in);

    private DataScanner() {
    }

    public static double enterDoubleFromConsole() {
        double a = 0.0;
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        a = sc.nextDouble();
        return a;
    }

    public static int enterIntegerFromConsole() {
        int a = 0;
        while (!sc.hasNextInt()) {
            sc.next();
        }
        a = sc.nextInt();
        return a;
    }
    public static String enterStringFromConsole(){
        return sc.nextLine();
    }

}
