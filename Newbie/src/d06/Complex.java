package org.whatisjava.core;

/**
 * 
 * @author steven
 * 
 */
public class Complex {

	double re;

	double im;

	/**
	 * 
	 * @param re1
	 * @param im1
	 */
	public Complex(double re1, double im1) {
		re = re1;
		im = im1;
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public Complex add(Complex c) {
		Complex c1 = new Complex(re + c.re, im + c.im);
		return c1;
	}

	/**
	 * 
	 * @return
	 */
	public double mod() {
		return Math.sqrt(re * re + im * im);
	}
}
