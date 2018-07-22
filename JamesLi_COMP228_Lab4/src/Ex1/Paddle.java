package Ex1;

import javax.swing.*;
import java.awt.*;

public class Paddle extends JPanel{
    private static final int WIDTH = 20;
    private static final int HEIGHT = 100;
    private double y, yVel;
    private final double GRAVITY = 0.9;
    private boolean upAcel, downAcel;
    private int player, x;

    public Paddle(int player)
    {
        upAcel = false;
        downAcel = false;
        y = 150;
        yVel = 0;
        if(player == 1)
        {
            x = 70;
        }
        else
        {
            x = 625;
        }
        setBounds(x - 40,(int)y ,WIDTH,HEIGHT);
        setBackground(Color.white);
    }

    public void Update()
    {
        if(upAcel) {
            yVel -=50;
        }
        else if(downAcel) {
            yVel +=50;
        }
        else if(!upAcel && !downAcel)
        {
            yVel *= GRAVITY;
        }
        y += yVel;
    }

    public void setUpAcel(boolean input) {
        upAcel = input;
    }

    public void setDownAcel(boolean input) {
        downAcel = input;
    }
}
