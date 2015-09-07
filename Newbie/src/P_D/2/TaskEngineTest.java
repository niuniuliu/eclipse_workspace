package refactor2;

public class TaskEngineTest {
	

	public static void main(String[] args) throws Exception {
		DownloadThread down = new DownloadThread("http://localhost:8080/index.jsp","d:\\1.jsp");
		down.start();
		
		DownloadThread down1 = new DownloadThread("http://localhost:8080/index.jsp","d:\\1.jsp");
		down1.start();
		
		DownloadThread down2 = new DownloadThread("http://localhost:8080/index.jsp","d:\\1.jsp");
		down2.start();		
	}
}
