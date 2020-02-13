////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//
//  Lab 4
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  2/12/2020
//
//
//////////////////////////////////////////////////////////////////////////////////

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        g.setColor (Color.red);
        g.drawOval (80,150,75,75);
        g.setColor (Color.white);
        g.drawOval (125,150,75,75);
        g.setColor (Color.red);
        g.drawOval (205,150,75,75);
        g.setColor (Color.white);
        g.drawOval (255,150,75,75);

    }
}