package org.nitpro.io;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GuiRWTest extends Frame implements ActionListener {
	
	private TextArea tx;

	private Button save, open;

	GuiRWTest(int x, int y, int w, int h) {
		super("MyFrame");
		setBackground(new Color(204, 204, 255));
		setLayout(new BorderLayout());
		setBounds(x, y, w, h);
		tx = new TextArea();
		Panel p1 = new Panel(new FlowLayout(FlowLayout.CENTER, 30, 5));
		save = new Button("保存");
		open = new Button("打开");
		p1.add(save);
		p1.add(open);
		add(new Label("编辑文件："), BorderLayout.NORTH);
		add(p1, BorderLayout.SOUTH);
		add(tx, BorderLayout.CENTER);
		save.addActionListener(this);
		open.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		GuiRWTest f = new GuiRWTest(400, 100, 300, 350);
//		f.setBackground(new Color(104, 104, 155));
	}

	public void actionPerformed(ActionEvent e) {
		FileDialog fd = null;
		File file = null;
		FileOutputStream out = null;
		FileReader in = null;
		if (e.getSource() == save) {
			fd = new FileDialog(this, "保存文件", FileDialog.SAVE);
			fd.setVisible(true);
			file = new File(fd.getDirectory(), fd.getFile());
			byte[] text = tx.getText().getBytes();
			try {
				out = new FileOutputStream(file);
				out.write(text);
				out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (e.getSource() == open) {
			fd = new FileDialog(this, "打开文件", FileDialog.LOAD);
			fd.setVisible(true);
			file = new File(fd.getDirectory(), fd.getFile());
			try {
				in = new FileReader(file);
				char[] textBuffer = new char[1000];
				tx.setText("");
				while (in.read(textBuffer) != -1) {
					tx.append(String.valueOf(textBuffer));
				}
				in.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
