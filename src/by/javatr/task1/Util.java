package by.javatr.task1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Util {

    public static double calcTheValueOfTheExpression(double a, double b, double c) {
        checkTheValueUnderTheRootForNegation(a, b, c);
        return solveTheExpressionByTheFormula(a, b, c);
    }

    private static double solveTheExpressionByTheFormula(double a, double b, double c) {
        return (b + sqrt(b * b + 4 * a * c)) / 2 - pow(a, 3) * c + pow(1 / b, 2);
    }

    private static void checkTheValueUnderTheRootForNegation(double a, double b, double c) {
        if ((b * b) + 4 * a * c < 0) {
            throw new IllegalArgumentException("the number or expression under the root sign must be non-negative!");
        }
    }
}
