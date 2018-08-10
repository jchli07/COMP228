package Ex2;

import java.security.SecureRandom;

public class ArrayList {
    private static final SecureRandom generator = new SecureRandom();
    private final Transaction[] array;
    private int writeIndex = 0;

    public ArrayList(int size) {
        array = new Transaction[size];
    }

    public synchronized void add(Transaction value) {
        int position = writeIndex;

        try {
            Thread.sleep(generator.nextInt(500));
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Put the value into the array at the correct position (index)
        array[position] = value;
        ++writeIndex;
    }

    public Transaction getValue(int index)
    {
        return array[index];
    }

}
