package refactor3;

import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

class DownloadThread extends Thread implements Serializable {

	private static final long serialVersionUID = -8473393443993425823L;

	private int threadId;

	private String url;

	private int startPos;

	private int endPos;

	private int pos;

	private boolean isStop = false;
	
	private String file;

	public void stopThread() {
		this.isStop = true;
		this.interrupt();
	}

	public DownloadThread(int threadId, String url, String file, int startPos,
			int endPos) {
		this.threadId = threadId;
		this.url = url;
		this.startPos = startPos;
		this.endPos = endPos;
		this.pos = this.startPos;
		this.file = file;
	}

	public void run() {
		try {
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestProperty("RANGE", "bytes=" + pos + "-");
			InputStream is = conn.getInputStream();
			byte[] buffer = new byte[1024];
			int b = -1;
			FileAccess fileAccess = new FileAccess(file);
			fileAccess.setPosition(pos);
			while (!isStop && (b = is.read(buffer)) != -1 && pos < endPos) {
				if (pos + b > endPos) {
					b = (int) (endPos - pos);
				}
				fileAccess.write(buffer, 0, b);
				pos += b;

			}
			fileAccess.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getEndPos() {
		return endPos;
	}

	public int getStartPos() {
		return startPos;
	}

	public String getUrl() {
		return url;
	}

	public int getThreadId() {
		return threadId;
	}

	public int getPos() {
		return pos;
	}

	public String toString() {
		return this.threadId + "(" + this.startPos + "," + this.endPos + ")"
				+ ":" + this.pos;
	}

	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}
}