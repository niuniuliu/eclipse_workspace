package org.nitpro.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest {
	public static void main(String args[]) {
		Frame f = new Frame("Java Frame");
		FlowLayout l = new FlowLayout(FlowLayout.LEFT);
		f.setLayout(l);
		f.setLocation(300, 400);
		f.setSize(300, 200);
		f.setBackground(new Color(204, 204, 255));
		for (int i = 1; i <= 7; i++) {
			l.setHgap(50);
			l.setVgap(20);
			f.add(new Button("BUTTON"));
			f.add(new Label("123"));
		}
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
	}
}
