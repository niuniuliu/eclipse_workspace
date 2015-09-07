package org.nitpro.gui;

import java.awt.*;
import java.awt.event.*;

public class ActionEventTest1 {
	public static void main(String args[]) {
		new MyFrame();
	}
}

class MyFrame extends Frame implements ActionListener {
	private TextField input = null;

	MyFrame() {
		super("MyFrame");
		setBackground(new Color(204, 204, 255));
		setLayout(null);
		setBounds(300, 300, 300, 100);
		setVisible(true);
		input = new TextField();
		input.setBounds(50, 40, 200, 20);
		input.setEchoChar('*');
		add(input);
		input.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (input.getText().equals("sunjava")) {
			input.setEchoChar('\u0000');
			input.setText("密码正确");
			input.setEditable(false);
			this.setBackground(Color.ORANGE);
		} else {
			input.selectAll();
		}
	}
}
