package exercise2;
import java.util.Random;

public class Lotto {

    //Random generator variable and array
    private int[] lotNumbers = new int[3];
    private Random random = new Random();

    //This grabs three numbers from 1-9 into the array
    public Lotto() {
        for (int i = 0; i < lotNumbers.length; i++) {
            lotNumbers[i] = random.nextInt(8) + 1;
        }
    }
    //Grabs the Lotto number to the test
    public int getLotto() {
        int count = 0;
        for (int i = 0; i < lotNumbers.length; i++) {
            count += lotNumbers[i];
        }
        return count;
    }
}


