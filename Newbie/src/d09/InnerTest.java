package org.nitpro.demo;

public class InnerTest {
	public static void main(String[] args){
		TestB b = new TestB();
		TestB.TestA a = b.new TestA();	
		
		InnerTest inner = new InnerTest();
		
	}
	
	public static void f() {
		final String s1 = "inner";
		class InnerClass {
			public void g(){
				System.out.println(s1);
			}
		}
	}
}

class TestB{	
	class TestA{
		void g(){
			
		}
	}	
}
