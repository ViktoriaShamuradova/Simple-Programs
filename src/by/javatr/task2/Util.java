package by.javatr.task2;

public class Util {
    private static final int[] DAY_OF_MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31};

    public static String calcTheDayAndMonthInANonLeapYearByDayNumber(int numberOfDay) {
        isValidNumberOfDay(numberOfDay);
        if (checkTheNumberOfDayForJanuary(numberOfDay)) {
            return String.valueOf(numberOfDay) + " " + "January";
        }

        if (checkTheNumberOfDayForFebruary(numberOfDay)) {
            return String.valueOf(numberOfDay - 31) + " " + "February";
        }

        return calcTheDayAndMonthBesidesJanuaryFebruary(numberOfDay);
    }

    private static String calcTheDayAndMonthBesidesJanuaryFebruary(int numberOfDay) {
        int remainder = numberOfDay - 31 - 28;
        int numberOfMonth = 0;
        for (int i = 2; i < DAY_OF_MONTH.length; i++) {
            if (i % 2 == 0) {
                if (remainder <= 31) {
                    numberOfMonth = i;
                    break;
                }
                remainder = remainder - DAY_OF_MONTH[i];
            } else {
                if (remainder <= 30) {
                    numberOfMonth = i;
                    break;
                }
                remainder = remainder - DAY_OF_MONTH[i];

            }
        }
        return String.valueOf(remainder) + " " + determineMonth(numberOfMonth);
    }

    private static void isValidNumberOfDay(int numberOfDay) {
        if (numberOfDay <= 0 || numberOfDay > 365) {
            throw new IllegalArgumentException("The number must be greater than 0 and less than or equal to 365: " + numberOfDay);
        }
    }

    private static boolean checkTheNumberOfDayForJanuary(int numberOfDay) {
        return numberOfDay <= 31;
    }

    private static boolean checkTheNumberOfDayForFebruary(int numberOfDay) {
        return numberOfDay <= 59;
    }

    private static String determineMonth(int number) {
        String month;
        switch (number) {
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
            default:
                return "No such month.";
        }
        return month;
    }
}
