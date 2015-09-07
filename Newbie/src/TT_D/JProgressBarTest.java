package nitpro.mthread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarTest extends Thread {
	static File file = new File("1.chm");
	static File file1 = new File("2.chm");
	public void run() {
		try{
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		int b = -1;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();}catch(Exception e){
			e.printStackTrace();
		}
	}

	static class BarThread extends Thread {
		private static int DELAY = 500;

		JProgressBar progressBar;

		public BarThread(JProgressBar bar) {
			progressBar = bar;
		}

		public void run() {
			int minimum = progressBar.getMinimum();
			int maximum = progressBar.getMaximum();
			for (int i = minimum; i < maximum; i++) {
				try {
					//int value = progressBar.getValue();
					progressBar.setValue((int)file1.length());

					Thread.sleep(DELAY);
				} catch (InterruptedException ignoredException) {
				}
			}
		}
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Stepping Progress");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JProgressBar aJProgressBar = new JProgressBar(0, (int)file.length());
		aJProgressBar.setStringPainted(true);
		
		final JButton aJButton = new JButton("Start");
		
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aJButton.setEnabled(false);
				JProgressBarTest jbt = new JProgressBarTest();
				jbt.start();
				Thread stepper = new BarThread(aJProgressBar);
				stepper.start();
			}
		};
		aJButton.addActionListener(actionListener);
		frame.add(aJProgressBar, BorderLayout.NORTH);
		frame.add(aJButton, BorderLayout.SOUTH);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
