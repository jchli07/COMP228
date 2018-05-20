import javax.swing.JOptionPane;

public class GameObjectTest {
    public static void main(String[] args) {

        GameObject ball = new GameObject(3, 3, 5, true, 10);

        //Display GameObject original settings
        String message1 = String.format("Center of object is at x:%s y:%s%nVelocity: %s%nState: %s%nRotation: %s", ball.getX(), ball.getY(), ball.getVelocity(), ball.getState(), ball.getRotation());
        JOptionPane.showMessageDialog(null, message1);
    }
}
