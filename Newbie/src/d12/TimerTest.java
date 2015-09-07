package org.nitpro.gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import org.omg.SendingContext.RunTime;

public class TimerTest {
	JLabel jl = new JLabel();
	public void test(){
		JFrame jf = new JFrame("test");
		jf.add(jl);
		jf.setBounds(200,200,200,200);
		jf.setVisible(true);
		
		int delay = 1000;
		ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		          jl.setText(new Date().toLocaleString());
		      }
		  };
		 Timer t =  new Timer(delay, taskPerformer);
		 t.start();
	}
	
	public static void main(String[] args){
		TimerTest t = new TimerTest();
		t.test();
	}

}
