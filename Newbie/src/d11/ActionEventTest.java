package org.nitpro.gui;

import java.awt.*;
import java.awt.event.*;
public class ActionEventTest {
  public static void main(String args[]) {
    MyFrame3 f = new MyFrame3();
  }
}
class MyFrame3 extends Frame {
  MyFrame3() {
    super("MyFrame");
    setBackground(new Color(204,204,255));
    setLayout(null);
    setBounds(300,300,300,200); setVisible(true);
    TextField input = new TextField();
    input.setBounds(50,50,200,20);
    add(input); 
    input.addActionListener(new Monitor());
  }
}

class Monitor implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    TextField tf = (TextField)e.getSource();
      tf.setText(tf.getText().toUpperCase());
  }
}
