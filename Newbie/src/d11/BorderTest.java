package org.nitpro.gui;

import java.awt.*;
public class BorderTest {
  public static void main(String args[]) {
    Frame f = new Frame("Java Frame");
    Panel p = new Panel();
    BorderLayout b = new BorderLayout();
    f.setLayout(b); 
    f.setLocation(300,400);
    f.setSize(300,200);
    f.setBackground(new Color(204,204,255));
    f.add(new Button("EAST"),BorderLayout.EAST);
    f.add(new Button("WEST"),BorderLayout.WEST);
    f.add(new Button("SOUTH"),BorderLayout.SOUTH);
    f.add(new Button("NORTH"),BorderLayout.NORTH);
    f.add(p,BorderLayout.CENTER);
    p.add(new Button("1"));
    p.add(new Button("2"));
    p.add(new Button("3"));
    f.setVisible(true);
  }
}

