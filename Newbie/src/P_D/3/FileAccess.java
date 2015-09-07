package refactor3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileAccess {
	
	private RandomAccessFile raf;

	private long position;

	private String name;

	public FileAccess(String name) {
		this.name = name;
		try {
			raf = new RandomAccessFile(this.name, "rw");
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileAccessException("文件无法访问");
		}
	}

	public void write(byte[] b, int start, int length) {
		try {
			raf.write(b, start, length);
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileAccessException("文件无法访问");
		}
	}

	public void close() {
		try {
			this.raf.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileAccessException("");
		}
	}

	public String getName() {
		return name;
	}

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		try {
			this.position = position;
			raf.seek(position);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
