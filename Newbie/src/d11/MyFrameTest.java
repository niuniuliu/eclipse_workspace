package org.nitpro.gui;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrameTest extends Frame implements ActionListener {

	public static void main(String args[]) {
		MyFrameTest f = new MyFrameTest();
	}

	private TextField input1 = null;

	private TextField input2 = null;

	private TextField result = null;

	private Button add = null;

	private Button sub = null;

	private Button mul = null;

	private Button div = null;

	MyFrameTest() {
		super("MyFrame");
		setBackground(new Color(204, 204, 255));
		setBounds(300, 300, 300, 105);
		Panel p1 = new Panel(new GridLayout(1, 3));
		input1 = new TextField();
		input2 = new TextField();
		result = new TextField();
		result.setEditable(false);
		p1.add(input1);
		p1.add(input2);
		p1.add(result);
		Panel p2 = new Panel();
		add = new Button("  +  ");
		sub = new Button("  -  ");
		mul = new Button("  *  ");
		div = new Button("  /  ");
		p2.add(add);
		p2.add(sub);
		p2.add(mul);
		p2.add(div);
		add(new Label("输入数据，进行计算："), BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		double d1 = 0, d2 = 0;
		try {
			d1 = Double.parseDouble(input1.getText());
			d2 = Double.parseDouble(input2.getText());
		} catch (NumberFormatException e1) {
			result.setText("数据格式错误");
			return;
		}
		if (e.getSource() == add) {
			result.setText(String.valueOf(d1 + d2));
		} else if (e.getSource() == sub) {
			result.setText(String.valueOf(d1 - d2));
		} else if (e.getSource() == mul) {
			result.setText(String.valueOf(d1 * d2));
		} else if (e.getSource() == div) {
			result.setText(String.valueOf(d1 / d2));
		}
	}
}
