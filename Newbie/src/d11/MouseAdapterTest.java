package org.nitpro.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MouseAdapterTest {
	public static void main(String args[]) {
		new MyFrame10("drawing...");
	}
}

class MyFrame10 extends Frame {
	ArrayList points = null;

	MyFrame10(String s) {
		super(s);
		points = new ArrayList();
		setLayout(null);
		setBounds(300, 300, 400, 300);
		this.setBackground(new Color(204, 204, 255));
		setVisible(true);
		this.addMouseListener(new Monitor1());
	}

	public void paint(Graphics g) {
		Iterator i = points.iterator();
		while (i.hasNext()) {
			Point p = (Point) i.next();
			g.setColor(Color.BLUE);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}

	public void addPoint(Point p) {
		points.add(p);
	}
}

class Monitor1 extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		MyFrame10 f = (MyFrame10) e.getSource();
		f.addPoint(new Point(e.getX(), e.getY()));
		f.repaint();
	}
}
