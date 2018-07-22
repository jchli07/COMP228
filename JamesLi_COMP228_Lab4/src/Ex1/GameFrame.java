package Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame implements KeyListener{
    //Used to create window size
    private static final int WIDTH = 650;
    private static final int HEIGHT = 450;

    private JLabel p1ScoreLabel;
    private JLabel p2ScoreLabel;

    Paddle p1Paddle;
    Paddle p2Paddle;


    public GameFrame()
    {
        super("Pong");
        setLayout(null);
        setResizable(false);
        setSize(new Dimension(WIDTH, HEIGHT));
        Container container = getContentPane();
        container.setBackground(Color.BLACK);

        p1ScoreLabel = new JLabel("0");
        p1ScoreLabel.setForeground(Color.WHITE);
        p1ScoreLabel.setBounds(150,-25, 150,150);
        p1ScoreLabel.setFont(new Font(p1ScoreLabel.getFont().getName(),p1ScoreLabel.getFont().getStyle(), 50));
        p1ScoreLabel.setSize(100,100);
        p1ScoreLabel.setHorizontalTextPosition(JLabel.LEFT);
        add(p1ScoreLabel);

        p2ScoreLabel = new JLabel("0");
        p2ScoreLabel.setForeground(Color.WHITE);
        p2ScoreLabel.setBounds(475,-25, 150,150);
        p2ScoreLabel.setFont(new Font(p1ScoreLabel.getFont().getName(),p1ScoreLabel.getFont().getStyle(), 50));
        p2ScoreLabel.setSize(100,100);
        p2ScoreLabel.setHorizontalTextPosition(JLabel.RIGHT);
        add(p2ScoreLabel);

        p1Paddle = new Paddle(1);
        add(p1Paddle);
        p2Paddle = new Paddle(2);
        add(p2Paddle);

    }

    public void Update()
    {
        p1Paddle.Update();
        p2Paddle.Update();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W)
        {
            p1Paddle.setUpAcel(true);
        }
        else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            p1Paddle.setDownAcel(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            p1Paddle.setUpAcel(false);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            p1Paddle.setDownAcel(false);
        }
    }
}
