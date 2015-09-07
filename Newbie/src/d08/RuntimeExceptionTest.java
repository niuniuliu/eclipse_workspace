package org.nitpro.exception;

public class RuntimeExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c = new C1();
		C2 c2 = null;
		c2 = (C2) c;   		// ClassCastException
		String str = null;
		str.toUpperCase();	// NullPointerException
		String sn = "123hello";
		int n = Integer.parseInt(sn); // NumberFormatException
		
		int[] array = {1,2,3};
		System.out.println(array[3]); //ArrayIndexOutOfBoundsException
		System.out.println("ok");
	}
}

class C {

}

class C1 extends C {

}

class C2 extends C {

}
