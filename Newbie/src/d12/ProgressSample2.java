package org.nitpro.gui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressSample2 {
	public static void main(String args[]) {
		final JProgressBar aJProgressBar = new JProgressBar(0, 100);
		aJProgressBar.setIndeterminate(true);
		JButton aJButton = new JButton("Toggle");
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean indeterminate = aJProgressBar.isIndeterminate();
				aJProgressBar.setIndeterminate(!indeterminate);
			}
		};
		aJButton.addActionListener(actionListener);
		JFrame theFrame = new JFrame("Indeterminate");
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = theFrame.getContentPane();
		contentPane.add(aJProgressBar, BorderLayout.NORTH);
		contentPane.add(aJButton, BorderLayout.SOUTH);
		theFrame.setSize(300, 100);
		theFrame.show();
	}
}
