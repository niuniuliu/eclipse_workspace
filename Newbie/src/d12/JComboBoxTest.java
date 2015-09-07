package org.nitpro.gui2;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest {
	public static void main(String[] a) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComboBox jComboBox1 = new JComboBox();
		jComboBox1.addItem("徐州");
		jComboBox1.addItem("南京");
		jComboBox1.addItem("盐城");
		jComboBox1.addItem("南通");
		jComboBox1.addItemListener(new aListener());
	
//		Object cmboitem = jComboBox1.getSelectedItem();
//		System.out.println(cmboitem);

		frame.add(jComboBox1);

		frame.setSize(200, 80);
		frame.setVisible(true);
	}

}
