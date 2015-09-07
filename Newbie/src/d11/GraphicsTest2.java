package org.nitpro.gui;

import java.awt.*;

public class GraphicsTest2 {
	public static void main(String args[]) {
		new MyFrame8("MyFrameWithPanel", 300, 300, 400, 300);
	}
}

class MyFrame8 extends Frame {
	MyFrame8(String s, int x, int y, int w, int h) {
		super(s);
		setLayout(null);
		setBounds(x, y, w, h);
		setBackground(Color.BLUE);
		setVisible(true);		
	}

	public void paint(Graphics g) {
		int w = this.getWidth();
		int h = this.getHeight();
		g.setColor(Color.YELLOW);
		g.fillOval(w / 4, h / 4, w / 2, h / 2);
	}
}
