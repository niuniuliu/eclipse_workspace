package org.nitpro.gui;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest1 {
	public static void main(String args[]) {
		MyFrame1 f1 = new MyFrame1(100, 100, 200, 200, Color.BLUE);
		MyFrame1 f2 = new MyFrame1(300, 100, 200, 200, Color.YELLOW);
		MyFrame1 f3 = new MyFrame1(100, 300, 200, 200, Color.GREEN);
		MyFrame1 f4 = new MyFrame1(300, 300, 200, 200, Color.MAGENTA);
	}
}

class MyFrame1 extends Frame {
	static int id = 0;

	MyFrame1(int x, int y, int w, int h, Color color) {		
		super("MyFrame " + (++id));		
		setBackground(color);
		setLayout(null);
		setVisible(true);
		setBounds(x, y, w, h);		
	}
}
