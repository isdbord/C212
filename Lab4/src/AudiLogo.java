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

import javax.swing.JFrame;

public class AudiLogo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Audi Logo");
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}