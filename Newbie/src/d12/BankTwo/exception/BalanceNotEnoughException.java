/**
 * 
 */
package bank.exception;

/**
 * @author 
 *
 */
public class BalanceNotEnoughException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	  public BalanceNotEnoughException(String msg)
	  {
		super(msg); 
		
	  }
	    
	  public BalanceNotEnoughException() 
	  { 
		this("Balance Not Enough!!"); 
	  }

}
