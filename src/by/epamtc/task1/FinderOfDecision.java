package by.epamtc.task1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class FinderOfDecision {

    public static String calcTheValueOfTheExpression(double a, double b, double c) {
        if (isNegativeUnderTheRoot(a, b, c)) {
            return "No solution, negative number under the root";
        }
        if(isDividerZero(a)){
            return "No solution, divider is zero";
        }

        return String.valueOf(solveTheExpressionByTheFormula(a, b, c));
    }

    private static double solveTheExpressionByTheFormula(double a, double b, double c) {
        return (b + sqrt(b * b + 4 * a * c)) / 2 - pow(a, 3) * c + pow(1 / b, 2);
    }

    private static boolean isNegativeUnderTheRoot(double a, double b, double c) {
        return b * b + 4 * a * c < 0;
    }

    private static boolean isDividerZero(double a) {
        return 2 * a == 0;
    }
}
