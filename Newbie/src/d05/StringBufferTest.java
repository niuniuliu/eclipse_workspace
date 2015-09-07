package org.whatisjava.lang;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		//追加
		buffer.append("ibm");
		buffer.append("sun");
		System.out.println(buffer); //ibmsun
		
		String str = buffer.toString();
		System.out.println(str);
		
		//插入
		buffer.insert(3, "oracle");
		System.out.println(buffer); //ibmOraclesun
		
		//删除
		buffer.delete(3, 9); //前包含后不包含
		System.out.println(buffer); //ibmsun
		
		//StringBuffer example
/*		long l = System.currentTimeMillis(); //静态方法,取得自1970年到现在的毫秒数
		StringBuffer buffer1 = new StringBuffer();
		for(int i=0;i<10000;i++)
		{
			buffer1.append("java");
		}
		String s = buffer1.toString();
		System.out.println(s.length());
	    l = System.currentTimeMillis() - 1;
	    
	    System.out.println("l = " + l);*/
		
		long l = System.currentTimeMillis();//静态方法
		String s = "";
		for(int i=0;i<10000;i++)
		{
			s += "java";
		}		
		System.out.println(s.length());
	    l = System.currentTimeMillis() - l;
	    
	    System.out.println("l = " + l);		
	}	
}
