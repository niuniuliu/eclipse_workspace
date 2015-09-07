package org.nitpro.news;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EnumTest {

	public void test(){
		Shengfen s = Shengfen.valueOf("北京");
		System.out.println(s);
		
		Shengfen[] sf = Shengfen.values();
		for(Shengfen sg:sf){
			System.out.println(sg);
		}
	}	
	
	public void test2(){
		List list = new ArrayList();
		list.add(new Date());
		list.add(new Date());
		list.add("dddd");
		
		for(Object obj:list){
			if(obj instanceof Date){
				
			}
			if (obj instanceof String){
				
			}
		}
	}
	
	public static void main(String[] args){
		EnumTest t = new EnumTest();
		t.test();
	}
}
