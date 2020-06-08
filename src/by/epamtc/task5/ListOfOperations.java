package by.epamtc.task5;

public class ListOfOperations {

    public static int sumDigits(int threeDigitNumber) {
        if (Validation.checkThreeDigitNumber(threeDigitNumber)) {
            int sum = 0;
            while (threeDigitNumber > 0) {
                sum = sum + threeDigitNumber % 10;
                threeDigitNumber = threeDigitNumber / 10;
            }
            return sum;
        } else return -1;

    }

    public static int mulOfDigits(int threeDigitNumber) {
        if (Validation.checkThreeDigitNumber(threeDigitNumber)) {
            int mul = 1;
            while (threeDigitNumber > 0) {
                mul *= threeDigitNumber % 10;
                threeDigitNumber = threeDigitNumber / 10;
            }
            return mul;
        } else return -1;
    }

    public static int swapTensAndHundreds(int threeDigitNumber) {
        if (Validation.checkThreeDigitNumber(threeDigitNumber)) {
            return threeDigitNumber / 10 % 10 * 100 + threeDigitNumber / 100 * 10 + threeDigitNumber % 10;
        } else return -1;

    }

    public static int addTensToThousands(int threeDigitNumber) {
        if (Validation.checkThreeDigitNumber(threeDigitNumber)) {
            return threeDigitNumber % 10 * 1000 + threeDigitNumber;
        } else return -1;
    }
}
