package org.nitpro.gui;

import java.awt.*;
import java.awt.event.*;

public class Test {
	public static void main(String args[]) {
		new MyFrame9("MyFrameWithPanel");
	}
}

class MyFrame9 extends Frame implements MouseListener {
	private TextField l = null;

	private Panel p = null;

	MyFrame9(String s) {
		super(s);
		setLayout(null);
		setBounds(300, 300, 400, 300);
		p = new Panel(null);
		this.setBackground(new Color(204, 204, 255));
		p.setBackground(Color.BLUE);
		p.setBounds(100, 70, 200, 200);
		l = new TextField("等待鼠标事件...");
		l.setBounds(50, 30, 300, 20);
		l.setEditable(false);
		add(p);
		add(l);
		setVisible(true);
		p.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		l.setText("鼠标点击了,位置是" + e.getX() + "," + e.getY());
		int n = e.getClickCount();
		char c = n == 1 ? '单' : (n == 2 ? '双' : 0);
		if (c != 0) {
			l.setText(l.getText() + ",是" + c + "击");
		}
	}

	public void mousePressed(MouseEvent e) {
		l.setText("鼠标按下了,位置是" + e.getX() + "," + e.getY());
		int i = e.getButton();
		System.out.println(i);
	}

	public void mouseReleased(MouseEvent e) {
		l.setText("鼠标松开了,位置是" + e.getX() + "," + e.getY());
	}

	public void mouseEntered(MouseEvent e) {
		l.setText("鼠标进入了,位置是" + e.getX() + "," + e.getY());
	}

	public void mouseExited(MouseEvent e) {
		l.setText("鼠标离开了,位置是" + e.getX() + "," + e.getY());
	}
}
