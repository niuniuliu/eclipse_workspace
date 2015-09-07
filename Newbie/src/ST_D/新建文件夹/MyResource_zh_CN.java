package org.nitpro.demo;

import java.util.ListResourceBundle;

//给zh_CN定义的资源包
public class MyResource_zh_CN extends ListResourceBundle {
	// 定义资源
	private final Object my_data[][] = { { "Title", "写字板" }, { "File", "文件" },
			{ "Open", "打开" }, { "Close", "关闭" }, { "Edit", "编辑" },
			{ "Copy", "拷贝" }, { "Paste", "粘贴" } };

	// 实现抽象方法getContents()
	public Object[][] getContents() {
		return my_data;
	}
}
