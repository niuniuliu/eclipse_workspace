package bank.business;

/**
 * @author
 *
 */
public class CheckingAccount extends Account
{
	/**
	 *  This is  a  <B>class</B>  javadoc!
	 */
	private static final long serialVersionUID = 1L;
	//double rate =0.05;
	public CheckingAccount(String name, double balance){
		super(name, balance);
	}
	public CheckingAccount(String id,String name,double balance)
	{
		super(id,name,balance);
	}
	public double getInterest(){
		double rate;
		double bal = getBalance();
		if (bal <= 5000) 
			rate = 0;
		else if (bal > 5000 && bal <= 100000) 
			rate = 0.01;
		else 
			rate = 0.02;
		return bal*rate;
	}
}
