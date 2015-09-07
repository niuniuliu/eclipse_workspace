package org.nitpro.util;

import java.io.UnsupportedEncodingException;

public class ExceptionTest {
	public static void main(String[] args) {
		Foo foo = new Foo();
		try {
			foo.f();
		} catch (Exception e) {
			e.printStackTrace();
		}

		A a = new A();
		try {
			a.g();
		} catch (Exception e1) {
			e1.printStackTrace();
			// ...处理Exception
		}

		String str = "中国人";
		try {
			byte[] b = str.getBytes("UTF-8");
			for(int i = 0;i<b.length;i++){
				System.out.println(b[i]);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}

class Foo {
	int i = 0;

	public void f() throws Exception {
		if (i == 0) {
			throw new Exception("异常出现了");
		}
	}
}

class A {
	public void g() throws Exception {
		Foo foo = new Foo();
		foo.f();
		// ....
	}

	public int h() {
		int n = 1;
		Foo foo = new Foo();
		try {
			foo.f();
			return n;
		} catch (Exception e) {
			// 替代方案
			return n;
		} finally {
			n = 0;
		}

	}
}
