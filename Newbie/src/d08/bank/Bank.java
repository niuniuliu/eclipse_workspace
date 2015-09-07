import java.util.*;

public class Bank
{
	private Map accMap;
	private static Bank bank=new Bank();
	public static Bank getBank()
	{
		return bank;
	}
	private Bank(){
		accMap = new HashMap();
	}

	// add Account
	public void addAccount(Account acc)
	{
		int id = acc.getID();
		accMap.put(new Integer(id), acc);
	}

	//remove Account
	public void removeAccount(int id)
	{
		accMap.remove(new Integer(id));
	}

	//search Account
	public Account getAccount(int id)
	{
		Account accTmp = (Account)(accMap.get(new Integer(id)));
		return accTmp;
	}
	public Collection getAccount()
	{
		return accMap.values();
	}
	public Account[] getAllAccount()
	{
		Collection c=accMap.values();
		Account[] accArray=(Account[])c.toArray(new Account[0]);
		return accArray;
	}

}
