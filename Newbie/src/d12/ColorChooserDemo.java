package org.nitpro.gui2;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserDemo extends JFrame {
  public ColorChooserDemo() {
    super();
    createUI();
    setVisible(true);
  }

  protected void createUI() {
    setSize(400, 400);
    getContentPane().setLayout(new GridBagLayout());
    JButton colorButton = new JButton("Choose a color...");
    getContentPane().add(colorButton);
    colorButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color c = JColorChooser.showDialog(ColorChooserDemo.this,
            "Choose a color...", getBackground());
        if (c != null)
          getContentPane().setBackground(c);
      }
    });

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  public static void main(String[] args) {
    new ColorChooserDemo();
  }

  
}

