
/**
 *
 *@author
 */
public class Complex {
	
	double re;
	double im;
	
	/**
	 *
	 *@param
	 *@param
	 */
	public Complex(double re1,double im1) {
		re = re1;
		im = im1;
	}
	/**
	 *
	 *@param
	 *
	 *@return
	 */
	public Complex add(Complex c) {
		Complex c1 = new Complex(re+c.re,im+c.im);
		return c1;
	}
	
	/**
	 *
	 *@param
	 *
	 *@return
	 */
	public double mod(){
		return Math.sqrt(re*re+im*im);
	}
}