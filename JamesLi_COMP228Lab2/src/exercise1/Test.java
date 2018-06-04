
package exercise1;
import java.util.Random;

public class Test {

    private String goodMessage[] = {"Good Job!", "Fantastic!"};
    private String wrongMessage[] = {"Try again!", "Please try harder"};

    public simulateQuestion(){

    }

    public checkAnswer(){

    }

    public generateMessage(){
        Random random = new Random();

        if (inputAnswer.good){
            return goodMessage[random.nextInt(goodMessage.length)];
        }
        else
            return wrongMessage[0];
    }

    public inputAnswer(){

    }
}

