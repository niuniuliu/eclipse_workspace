package org.nitpro.gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JMenuBarTest {
	JFrame jf = new JFrame();

	JTextArea jt;

	public void test() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("文件");
		jt = new JTextArea(3, 20);

		JMenuItem mi1 = new JMenuItem("保存");
		mi1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showSaveDialog(jf);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					try {
						File f1 = chooser.getSelectedFile();

						String str = jt.getText();
						File file = new File(f1.getAbsolutePath());
						BufferedWriter bw = new BufferedWriter(new FileWriter(
								file));
						bw.write(str);
						bw.close();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		JMenuItem mi2 = new JMenuItem("打开");
		JMenuItem mi3 = new JMenuItem("关闭");
		jm1.add(mi1);
		jm1.add(mi2);
		jm1.add(mi3);

		JMenu jm2 = new JMenu("帮助");

		jmb.add(jm1);
		jmb.add(jm2);

		jf.setJMenuBar(jmb);
		jf.add(jt);

		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setUndecorated(true);
		jf.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

		jf.setBounds(200, 200, 200, 200);
		jf.setVisible(true);

	}

	public static void main(String[] args) {
		JMenuBarTest t = new JMenuBarTest();
		t.test();
	}

}
