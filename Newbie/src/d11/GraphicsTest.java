package org.nitpro.gui;

import java.awt.*;

public class GraphicsTest {
	public static void main(String args[]) {
		Point p = new Point(200, 200);
		Dimension d = new Dimension(500, 350);
		MyFrame6 f = new MyFrame6(p, d);
	}
}

class MyFrame6 extends Frame {
	MyFrame6(Point p, Dimension d) {
		super("Graphics");
		setLayout(null);
		setLocation(p);
		setSize(d);
		setBackground(new Color(255, 255, 196));
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Courier", Font.BOLD, 20));
		g.setColor(new Color(128, 0, 128));
		g.drawString("java Graphics", 25, 40);
		g.setFont(new Font("TimesRoman", Font.ITALIC, 15));
		g.setColor(new Color(0, 0, 160));
		g.drawString("java.awt.Graphics 用于绘制图形", 20, 60);
		g.setColor(new Color(0, 64, 128));
		g.drawLine(35, 70, 335, 70);
		g.drawRect(50, 100, 80, 60);
		g.fillRect(150, 100, 80, 60);
		g.fillRoundRect(300, 100, 80, 60, 20, 20);
		g.drawRoundRect(80, 200, 60, 60, 60, 60);
		g.fillRoundRect(150, 190, 80, 80, 80, 80);
		g.fillOval(250, 190, 100, 70);
	}
}
