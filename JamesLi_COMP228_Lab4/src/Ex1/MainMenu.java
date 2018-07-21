package Ex1;

import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private final JButton startGame;
    private final JButton quitGame;
    private final JLabel title;

    public MainMenu()
    {
        super("PONG");
        setLayout(new FlowLayout());

        title = new JLabel("PONG");
        title.setHorizontalTextPosition(SwingConstants.CENTER);
        add(title);

        startGame = new JButton("Start");
        add(startGame);

        quitGame = new JButton("Quit");
        add(quitGame);

        ButtonHandler handler = new ButtonHandler();
        startGame.addActionListener(handler);
        quitGame.addActionListener(handler);
    }
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //close current window
            MainMenu.this.setVisible(false);
            MainMenu.this.dispose();


            //PongFrame is the class of the game panel - need to change
            //open pong window if action command is from start game button
            if (e.getActionCommand() == "Start Game") {
                PongFrame pongFrame = new PongFrame();
                pongFrame.setDefaultCloseOperation(pongFrame.EXIT_ON_CLOSE);
                pongFrame.setLocationRelativeTo(null);
                pongFrame.setVisible(true);
            }
        }
    }
}
