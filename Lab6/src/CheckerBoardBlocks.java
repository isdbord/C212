////////////////////////////////////////////////////////////////////////////////////
//  C212
//
//
//  Lab 6
//  @Author  Isaac Bordfeld / isdbord
//  Last Edited:  2/25/2020
//
//
//////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;

public class CheckerBoardBlocks extends JComponent
{
    private int length;
    public CheckerBoardBlocks(int length)
    {

        this.length = length;
    }

    public void paintComponent(Graphics g)
    {
        int adjustedLength = 0;
        int adjustedWidth = 0;
        int counter = 0;
        for(int i = 1; i <= 64; i++){
            int[] triangleLengthForTriangleOne = {adjustedLength + 0, adjustedLength + 0, adjustedLength + length};
            int[] triangleWidthForTriangleOne = {adjustedWidth + 0, adjustedWidth + length, adjustedWidth + length};

            int[] triangleLengthForTriangleTwo = {adjustedLength + 0, adjustedLength + length, adjustedLength + length};
            int[] triangleWidthForTriangleTwo = {adjustedWidth + 0, adjustedWidth + 0, adjustedWidth + length};

            if(counter == 0){
                if(i % 2 == 0){
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleOne,triangleWidthForTriangleOne,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleOne,triangleWidthForTriangleOne,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleTwo,triangleWidthForTriangleTwo,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleTwo,triangleWidthForTriangleTwo,3);
                }else{
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleOne, triangleWidthForTriangleOne, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleOne, triangleWidthForTriangleOne, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleTwo, triangleWidthForTriangleTwo, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleTwo, triangleWidthForTriangleTwo, 3);
                }
            }else{
                if(i % 2 == 0){
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleOne, triangleWidthForTriangleOne, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleOne, triangleWidthForTriangleOne, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleTwo, triangleWidthForTriangleTwo, 3);
                    g.setColor(Color.black);
                    g.fillPolygon(triangleLengthForTriangleTwo, triangleWidthForTriangleTwo, 3);
                }else{
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleOne,triangleWidthForTriangleOne,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleOne,triangleWidthForTriangleOne,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleTwo,triangleWidthForTriangleTwo,3);
                    g.setColor (Color.white);
                    g.fillPolygon (triangleLengthForTriangleTwo,triangleWidthForTriangleTwo,3);
                }
            }

            adjustedLength = adjustedLength + length;
            
            if(i % 8 == 0)
            {
                if(counter == 1)
                {
                    counter = 0;
                }else {
                    counter = 1;
                }
                adjustedWidth = adjustedWidth + length;
                adjustedLength = 0;
            }
        }
    }

    /*
     * printCheckBoard : draws a checkerboard that is 8x8 (4 each color)
     * @param int that determines the length of each square on the checkerboard
     * @return image (checkerboard)
     */
    public static void printCheckerBoard(int size)
    {
        JFrame frame = new JFrame();
       frame.setSize(size*8, size*8+22);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setTitle("CheckBoard");
        CheckerBoardBlocks component = new CheckerBoardBlocks(size);
        frame.add(component);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        printCheckerBoard(100);
        printCheckerBoard(50);
    }
}