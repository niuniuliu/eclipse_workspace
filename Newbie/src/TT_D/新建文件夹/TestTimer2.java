import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public class TestTimer2{
	public JFrame jf = new JFrame("Timer2"); 
	public JPanel p = new JPanel();
	public JLabel l = new JLabel("hehe");
	
	
	
	public TestTimer2(){
		p.add(l);
		Container c = jf.getContentPane();
		c.add(p);
		l.setBackground(Color.red);
		jf.setSize(300, 300);
		jf.setVisible(true);
		java.util.Timer t = new java.util.Timer();
		t.schedule(new MyTimerTask(), 0, 1000);
		
	}
	
	
	public class MyTimerTask extends TimerTask{
			public void run(){
				l.setText(new Date().toString());				
			}
		
	}
	
	public static void main(String[] args){
		TestTimer2 tt = new TestTimer2();
		
		
		
		
	}
	
	
}