import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestTimer{
	public JFrame jf = new JFrame("Timer"); 
	public JPanel p = new TimerPanel();
	public JButton jb = new JButton("Stop");
	public JButton jb1 = new JButton("Start"); 
	MyTimer mt = new MyTimer(jf);
	
	
	public TestTimer(){
		p.add(jb);
		p.add(jb1);
		
		Container c = jf.getContentPane();
		c.add(p);
		
		jf.setSize(300, 300);
		
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			mt.stop();
			}
		}
		);
		
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread t = new Thread(mt);		
				mt.flag = true;
				t.start();
			}
		}
		);
		
		
		
		jf.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args){
		TestTimer tt = new TestTimer();
		
		
		
		
	}
	
	
}