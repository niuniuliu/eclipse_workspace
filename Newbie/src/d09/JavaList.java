import java.io.*;

/**
 * 功能：按照扩展名过滤文件（Java）
 * 
 * @version v1.0
 */
public class JavaFilter implements FilenameFilter {
	/**
	 * 只接受java文件
	 * 
	 * @see JavaList
	 * @param args
	 *            Path,FileName
	 * @return true or false
	 */

	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}
