package bank.business;

/**
 * @author
 *
 */
public class SavingAccount extends Account
{
	/**
	 *  This is  a  <B>class</B>  javadoc!
	 */
	private static final long serialVersionUID = 1L;
	double rate =0.05;
	public SavingAccount(String name, double balance){
		super(name, balance);
	}
	public SavingAccount(String id,String name,double balance)
	{
		super(id,name,balance);
	}

	public double getInterest(){
		return super.getBalance()*rate;
	}
}
