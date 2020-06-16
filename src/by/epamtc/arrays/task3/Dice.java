package by.epamtc.arrays.task3;


public class Dice {
    private int frontFaceValue;

    public Dice(int frontFaceValue) {
        if (frontFaceValue < 1 || frontFaceValue > 6) throw new RuntimeException();
        this.frontFaceValue = frontFaceValue;
    }

    public int getFrontFaceValue() {
        return frontFaceValue;
    }
}

