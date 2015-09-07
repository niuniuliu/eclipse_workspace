package refactor3;

import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 
 * @author ahaowu
 */
public class Task implements Serializable {
	
	private static final long serialVersionUID = 2924691342154934890L;

	public static final int STATE_NEW = 1;

	public static final int STATE_RUNNING = 2;

	public static final int STATE_COMPLETED = 3;

	public static final int STATE_PAUSED = 4;	

	private String url; // 下载地址

	private String file;

	private int antNum; // 下载的线程数目

	private int state;

	private DownloadThread[] dts;

	private Thread innerThread;

	public Task(String url, String file, int antNum) {
		this.url = url;
		this.file = file;
		this.antNum = antNum;
		state = Task.STATE_NEW;
	}

	public Task(String url, String file) {
		this(url, file, 1);
	}

	/**
	 * 开始下载任务
	 * 
	 */
	public void start() {
		if (state == Task.STATE_NEW) {
			dts = new DownloadThread[antNum];
			initThreads();
		}
		for (int i = 0; i < dts.length; i++) {
			dts[i].setStop(false);
			dts[i].start();
		}
		state = Task.STATE_RUNNING;
		innerThread = new InnerThread();
		innerThread.start();
	}

	/**
	 * 结束下载任务
	 * 
	 */
	public void stop() {
		if (state == Task.STATE_COMPLETED)
			return;
		for (int i = 0; i < dts.length; i++) {
			dts[i].stopThread();
		}
		state = Task.STATE_PAUSED;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Task) {
			Task task = (Task) obj;
			return this.url.equals(task.url);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return url.hashCode();
	}

	public int getAntNum() {
		return antNum;
	}

	public String getUrl() {
		return url;
	}

	public int getState() {
		return state;
	}

	public String getFile() {
		return file;
	}

	private boolean isOver() {
		for (int i = 0; i < dts.length; i++) {
			if (dts[i].isAlive()) {
				return false;
			}
		}
		return true;
	}

	private void initThreads() {
		int length = this.getFileLength();
		int startPos = 0;
		int endPos = 0;
		int len = length / getAntNum();
		for (int i = 0; i < dts.length; i++) {
			startPos = endPos;
			if (i == dts.length - 1) {
				endPos = length;
			} else {
				endPos = startPos + len;
			}
			dts[i] = new DownloadThread(i, getUrl(), getFile(), startPos,
					endPos);
		}
	}

	private int getFileLength() {
		try {
			URL u = new URL(getUrl());
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			return conn.getContentLength();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	private class InnerThread extends Thread implements Serializable{
		
		private static final long serialVersionUID = -5653497905844621750L;

		public void run() {
			while (state == Task.STATE_RUNNING) {
				this.printInfo();
				System.out.println("下载状态为：" + state);
				if (isOver()) {
					state = Task.STATE_COMPLETED;
					System.out.println("下载状态为：" + state);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
			}
		}

		private void printInfo() {
			for (DownloadThread dt : dts) {
				System.out.println(dt);
			}
			System.out.println("-----");
		}
	}
}
