import java.io.File;
import java.io.IOException;

public class FileOper
{
	public static void main(String[] args)
	{
		File f = new File("c:\\JDK14");
		
		try
		{
			//在f指定的目录下创建一个临时文件
			f.createTempFile("myTmp",".linshi",f);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
				
		//获得目录下的所有文件和子目录
		File[] files = f.listFiles();
		for(int i = 0;i<files.length;i++)
		{
			if(files[i].isFile())
			{
				System.out.println("文件："+files[i]);
			}
			else
			{
				System.out.println("目录："+files[i]);
			}			
		}
	}
}