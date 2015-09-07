package org.nitpro.news;

import java.util.Date;

public class ChangeArgTest {
	public void write(String str){
		
	}
	
	public void write(String str,Date date){
		
	}

	
	public void write(String str1,String str2,String str3){
		
	}
	
	public void write(int n,Object ... str){
		
	}
	
	public static void main(String[] args){
		ChangeArgTest t = new ChangeArgTest();
		t.write(2,"A",2,new Date(),new EnumTest2(),5);
	}
}
