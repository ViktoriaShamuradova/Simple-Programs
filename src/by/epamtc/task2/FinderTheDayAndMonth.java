package by.epamtc.task2;

public class FinderTheDayAndMonth {
    private static final int COUNT_OF_MONTH = 12;
    private static final int NUMBER_OF_DAY_IN_FEBRUARY = 28;



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
            for (; numberOfMonth <= COUNT_OF_MONTH; numberOfMonth++) {
                if (numberOfMonth == 2) {
                    daysInMonth = NUMBER_OF_DAY_IN_FEBRUARY;
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

