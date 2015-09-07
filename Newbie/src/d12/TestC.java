package org.nitpro.gui2;

import java.awt.FileDialog;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class TestC {
	JFrame f = new JFrame();

	public void test() {

		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("文件");
		MenuItem m1_1 = new MenuItem("打开");
		MenuItem m1_2 = new MenuItem("关闭");
		MenuItem m1_3 = new MenuItem("保存");
		m1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog fd = new FileDialog(f, "我的对话框", FileDialog.LOAD);
				fd.setVisible(true);
			}
		});

		m1_1.setShortcut(new MenuShortcut(KeyEvent.VK_ALT, false));

		MenuItem m1_4 = new MenuItem("退出");
		m1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		MenuShortcut s = new MenuShortcut(KeyEvent.VK_1, false);
		m1_4.setShortcut(s);

		m1.add(m1_1);
		m1.add(m1_2);
		m1.add(m1_3);
		m1.add(m1_4);

		Menu m2 = new Menu("编辑");
		Menu m3 = new Menu("帮助");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		// 将菜单栏绑定到窗口上
		f.setMenuBar(mb);
		f.setBounds(200, 200, 200, 200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		TestC t = new TestC();
		t.test();
	}

}