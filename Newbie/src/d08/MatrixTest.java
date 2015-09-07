package org.nitpro.exception;


public class MatrixTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matrix m1 = new Matrix("1,2,3;4,5,6");
		Matrix m2 = new Matrix("2,2;2,2;2,2");
		System.out.println(m1);
		System.out.println(m2);

		Matrix m = m1.mul(m2);
		System.out.println(m);

	}

}
