package org.nitpro.demo;

import java.awt.*;
public class PriorityTest {
  public static void main(String[] args) {
    Frame f = new Frame("thread");
    f.setLayout(null);
    f.setBounds(300,60,300,200); f.setVisible(true);
    f.add(new MyTextArea(150,0,Thread.NORM_PRIORITY));
    f.add(new MyTextArea(0,0,Thread.MAX_PRIORITY));
  }  
}
class MyTextArea extends TextArea implements Runnable{
  MyTextArea(int x, int y, int priority){
    setForeground(Color.BLUE);
    setSize(150,200); setLocation(x,y);
    Thread writer = new Thread(this);
    writer.setPriority(priority);
    writer.start();
  }
  public void run(){
    for(int i = 1;i<=5000;i++){append(i+"\n");}
  }
}

