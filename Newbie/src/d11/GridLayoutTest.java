package org.nitpro.gui;

import java.awt.*;
public class GridLayoutTest {
    public static void main(String args[]) {
        Frame f = new Frame("Java Frame");
        GridLayout g = new GridLayout(3,4);
        f.setLayout(g);
        f.setLocation(300,400);
        f.setSize(300,200);
        f.setBackground(new Color(204,204,255));
        for(int i = 1;i<=4;i++){
            f.add(new Button("BUTTON "+i));
        }
        f.setVisible(true);
    }
}

