package refactor2;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

class DownloadThread extends Thread {

	private String url;

	private boolean isStop = false;

	private String file;

	public void stopThread() {
		this.isStop = true;
		this.interrupt();
	}

	public DownloadThread(String url, String file) {
		this.url = url;
		this.file = file;
	}

	public void run() {
		try {
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestProperty("RANGE", "bytes=" + 0 + "-");
			InputStream is = conn.getInputStream();
			byte[] buffer = new byte[1024];
			int b = -1;
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			while (!isStop &&(b = is.read(buffer)) != -1) {
				raf.write(buffer, 0, b);
			}
			raf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return url;
	}

	public String toString() {
		return null;
	}

	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}
}