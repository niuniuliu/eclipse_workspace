package org.nitpro.demo2;

public class JionTest {
	public void test(){
		TestH h = new TestH();
		h.start();		
		
		for(int i = 0;i<5000;i++){			
			System.out.println("Main..."+i);
		}
		
		try {
			h.join();//其他线程统统让路
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		JionTest t = new JionTest();
		t.test();
	}
}
