package by.epamtc.arrays.task3;

public class Lock {
    private final int[] CELLS = new int[10];

    public int[] getCELLS() {
        return CELLS;
    }

    public void insert(Dice dice, int cell) {
        if (cell < 0 || cell > 9) throw new RuntimeException();
        CELLS[cell] = dice.getFrontFaceValue();
    }

    public boolean isOpen() {
        for (int i = 0; i < CELLS.length; i++) {
            if (CELLS[i] != 0 && CELLS[i + 1] != 0 && CELLS[i + 2] != 0) {
                if (CELLS[i] + CELLS[i + 1] + CELLS[i + 2] == 10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Lock lock = new Lock();
        lock.insert(new Dice(5), 1);
        lock.insert(new Dice(5), 2);

        System.out.println(lock.isOpen());
    }
}
