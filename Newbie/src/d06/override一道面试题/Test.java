package org.whatisjava.core.override;

public class Test {
	public static void main(String[] args) {
		C c = new C();
		A a = new A();
		c.g(a);
		
		B b = new B();
		c.g(b);
		
		A ab = new B();
		c.g(ab);		
	}
}

class A {
	public void f() {
		System.out.println("A.f()");
	}
}
class B extends A{
	public void f() {
		System.out.println("B.f()");
	}
}
class C {
	public void g(A a) {
		System.out.println("C.g(A)");
		a.f();
	}
	public void g(B b) {
		System.out.println("C.g(B)");
		b.f();
	}	
}




