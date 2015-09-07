package org.whatisjava.io;

import java.awt.*;
import java.util.ResourceBundle;
import java.util.Locale;

public class Editor {
	private Frame f;

	private MenuBar mb;

	private Menu m1;

	private Menu m2;

	private Menu m3;

	private MenuItem mi1;

	private MenuItem mi2;

	private MenuItem mi3;

	private MenuItem mi4;

	private TextArea ta;

	public void init() {
		Locale defaultLocale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle("MyResource_zh_TW",
				Locale.TAIWAN);
		String title = (String) bundle.getObject("Title");
		String mFile = (String) bundle.getObject("File");
		String mOpen = (String) bundle.getObject("Open");
		String mClose = (String) bundle.getObject("Close");

		String mEdit = (String) bundle.getObject("Edit");
		String mCopy = (String) bundle.getObject("Copy");
		String mPaste = (String) bundle.getObject("Paste");

		// 因为在MyResource_zh_CN中没有定义Help，
		// 所以将会到MyResource中寻找
		String mHelp = (String) bundle.getObject("Help");

		f = new Frame(title);
		mb = new MenuBar();
		m1 = new Menu(mFile);
		m2 = new Menu(mEdit);
		m3 = new Menu(mHelp);
		mb.add(m1);
		mb.add(m2);
		mb.setHelpMenu(m3);
		f.setMenuBar(mb);

		mi1 = new MenuItem(mOpen);
		mi2 = new MenuItem(mClose);
		mi3 = new MenuItem(mCopy);
		mi4 = new MenuItem(mPaste);

		ta = new TextArea("", 4, 20);
		f.add(ta, BorderLayout.CENTER);

		m1.add(mi1);
		m1.add(mi2);
		m2.add(mi3);

		m2.add(mi4);

		f.setSize(200, 200);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		Editor editor = new Editor();
		editor.init();
	}
}
