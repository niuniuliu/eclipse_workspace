package org.nitpro.gui2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame {

	public JTableDemo() {
		super("Simple JTable Test");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTable jt = new JTable(new String[][] { { "This", "is","This", "is" },
				{ "a", "Test","This", "is" }, { "This", "is","This", "is" }, { "a", "Test","This", "is" },
				{ "This", "is","This", "is" }, { "a", "Test","This", "is" }, { "This", "is","This", "is" },
				{ "a", "Test" ,"This", "is"}, { "This", "is","This", "is" }, { "a", "Test","This", "is" },
				{ "This", "is","This", "is" }, { "a", "Test","This", "is" }, { "This", "is" ,"This", "is"},
				{ "a", "Test","This", "is" } }, new String[] { "Column", "Header","Column1", "Header1" });
		JScrollPane jsp = new JScrollPane(jt);
		getContentPane().add(jsp, BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		JTableDemo st = new JTableDemo();
		st.setVisible(true);
	}
}
