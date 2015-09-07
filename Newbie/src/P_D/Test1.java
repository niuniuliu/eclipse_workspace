package refactor1;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test1 {
	public static void main(String[] args) throws Exception {
		try {
			URL u = new URL("http://127.0.0.1:8080/index.jsp");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestProperty("RANGE", "bytes=0*1024-");
			RandomAccessFile raf = new RandomAccessFile("d:\\2.jsp", "rw");
			InputStream is = conn.getInputStream();
			int b = -1;
			while ((b = is.read()) != -1) {
				raf.write(b);
			}
			raf.close();
			System.out.println("success");
		} catch (IOException e) {
			System.out.println("error");
		}
	}
}
