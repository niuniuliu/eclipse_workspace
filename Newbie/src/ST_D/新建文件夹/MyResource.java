package org.nitpro.demo;

import java.util.ListResourceBundle;

//For en_US locale
public class MyResource extends ListResourceBundle {
	// 定义资源
	private final Object my_data[][] = { { "Title", "Editor" },
			{ "File", "File" }, { "Open", "Open" }, { "Close", "Close" },
			{ "Edit", "Edit" }, { "Copy", "Copy" }, { "Paste", "Paste" },
			{ "Help", "Help..." } };

	// 实现抽象方法getContents()
	public Object[][] getContents() {
		return my_data;
	}
}
