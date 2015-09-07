package org.nitpro.gui;

import java.awt.*;
import java.awt.event.*;

public class CardTest {
	public static void  main(String[] args){
		Frame frame = new Frame();
		frame.setBounds(100, 100, 400, 400);
		frame.setBackground(Color.BLUE);
		frame.setLocation(200, 200);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			} 
		});
		final CardLayout cl = new CardLayout();
		final Panel cardPanel = new Panel();
		cardPanel.setBounds(1, 1, 98, 98);
		cardPanel.setBackground(Color.RED);
		cardPanel.setLayout(cl);
		Button btn = new Button("aaa");
		Button btn1 = new Button("bbb");
		ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				cl.next(cardPanel);				
			}
			
		};		
		btn.addActionListener(al);
		btn1.addActionListener(al);
		cardPanel.add(btn,"1");
		cardPanel.add(btn1,"2");
		frame.add(cardPanel);
		frame.setVisible(true);
	}
}
