package exercise2;
import javax.swing.JOptionPane;

public class lottoDriver {

    public static void main(String[] args) {

        //Let user choose a number between 3 - 27
        int userNumber = Integer.parseInt( JOptionPane.showInputDialog(null, "Welcome to Lotto! Enter an number between 3 and 27"));

        //Set win variable condition
        boolean win = false;
        //Simulates the lotto game 5 times
        for(int i = 0; i < 5; i++){
            Lotto lotto = new Lotto();
            JOptionPane.showMessageDialog(null, "Lotto has generated the number: " + lotto.getLotto());
            //Set rule for user to win
            if(lotto.getLotto() == userNumber){
                win = true;
                break;
            }
        }
        //Win and lose statement
        if(win){
            JOptionPane.showMessageDialog(null,"Congratulations! You Win!");
        }else{
            JOptionPane.showMessageDialog(null,"You lost. Better luck next time!");
        }
    }
}
