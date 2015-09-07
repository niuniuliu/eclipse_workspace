package org.nitpro.gui2;

import javax.swing.*;
import java.awt.event.*;

public class SwingTest {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(200, 200);

		JButton btn = new JButton("123456");
		JButton btn1 = new JButton("123456");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		jf.add(btn, "West");

		jf.add(btn1, "East");
		// jf.getContentPane().add(btn);
		jf.setVisible(true);
	}
}
