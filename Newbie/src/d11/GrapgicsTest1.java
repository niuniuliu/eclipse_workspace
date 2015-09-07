package org.nitpro.gui;

import java.awt.*;

public class GrapgicsTest1 {
	public static void main(String args[]) {
		new MyFrame7("MyFrameWithPanel", 300, 300, 400, 300);
	}
}

class MyFrame7 extends Frame {
	private Panel p1, p2, p3, p4;

	private Point p;

	private Dimension d;

	MyFrame7(String s, int x, int y, int w, int h) {
		super(s);
		setLayout(null);
		p = new Point(x, y);
		d = new Dimension(w, h);
		setBounds(x, y, w, h);
		setVisible(true);
	}

	public void paint(Graphics g) {
		int w = d.width, h = d.height;
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, w / 2, h);
		g.setColor(Color.GREEN);
		g.fillRect(w / 2, 0, w / 2, h);
		g.setColor(Color.YELLOW);
		g.fillOval(w / 4, h / 4, w / 2, h / 2);
	}
}
