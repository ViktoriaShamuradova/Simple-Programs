package by.javatr.task2;

public class FinderTheDayAndMonth {
    private static final int countOfMonths = 12;
    private static final int numberOfDaysInFebruary = 28;


    public static void main(String[] args) {
        int numberOfDay = 60;
        System.out.println(calcNumberOfDayAndMonth(numberOfDay));

    }

    public static String calcNumberOfDayAndMonth(int numberOfDay) {
        if (isValidDay(numberOfDay)) {

            int lastDayInMonth = 0;
            int daysInMonth;
            int day = 0;
            int numberOfMonth = 1;
            for (; numberOfMonth <= countOfMonths; numberOfMonth++) {
                if (numberOfMonth == 2) {
                    daysInMonth = numberOfDaysInFebruary;
                } else {
                    boolean beforeAugust = numberOfMonth < 8;
                    boolean afterJuly = !beforeAugust;
                    boolean even = numberOfMonth % 2 == 0;
                    boolean odd = !even;
                    if (beforeAugust && odd || afterJuly && even) {
                        daysInMonth = 31;
                    } else {
                        daysInMonth = 30;
                    }
                }
                lastDayInMonth = lastDayInMonth + daysInMonth;
                if (numberOfDay <= lastDayInMonth) {
                    day = daysInMonth - (lastDayInMonth - numberOfDay);
                    break;
                }
            }
            return "Day is " + day + "\nMonth is " + numberOfMonth;
        } else {
            return "Not valid number of day";
        }

    }

    private static boolean isValidDay(int currentDay) {
        return currentDay > 0 && currentDay <= 365;
    }
}
