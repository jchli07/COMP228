
package exercise1;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

    }

    public simulateQuestion(){

    }

    public checkAnswer(){

    }

    public generateMessage(){
        Random random = new Random();

        String goodMessage[] = {"Good Job!", "Fantastic!"};
        String wrongMessage[] = {"Try again!", "Please try harder"};
        if (inputAnswer.good){
            return goodMessage[random.nextInt(goodMessage.length)];
        }
        else
            return wrongMessage[0];
    }

    public inputAnswer(){

    }
}

