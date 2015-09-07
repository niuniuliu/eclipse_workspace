package org.nitpro.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class Draw {
	public static void main(String[] args) {
		Frame11 f = new Frame11();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Frame11 extends JFrame {
	public Frame11() {
		setSize(300, 300);
		add(new MyPanel());
	}
}

class MyPanel extends JPanel {
	public MyPanel() {
		points = new ArrayList<Point2D>();
		clickpoint = new Point2D.Float(0, 0);
		clean = new JButton("清空");

		setLayout(new BorderLayout());
		// add ActionListener
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points.removeAll(points);
				repaint();
			}
		});
		add(clean, BorderLayout.SOUTH);
		// add MouseListener
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				clickpoint = new Point2D.Float((float) e.getX(), e.getY());
				drawpoint(clickpoint);
			}

			public void mouseMoved(MouseEvent e) {
			}
		});

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				clickpoint = new Point2D.Float((float) e.getX(), e.getY());
				drawpoint(clickpoint);
			}
		});// end add
		add(clean, BorderLayout.SOUTH);

	}

	// paint save points
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // 需调用父类的此方法
		Graphics2D g2 = (Graphics2D) g;
		for (Point2D p : points) {
			g2.draw(new Line2D.Float(p, p));// draw a point;
		}
	}

	// save point when clicked
	public void drawpoint(Point2D p) {
		points.add(p);
		repaint();
	}

	private ArrayList<Point2D> points;

	private Point2D clickpoint;

	private JButton clean;
}
