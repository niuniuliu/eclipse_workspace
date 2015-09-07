package bank.business;

import java.util.*;
import java.io.*;

/**
 * @author
 * 
 */
public class Bank implements Serializable {
	/**
	 * This is a <B>class</B> javadoc!
	 */
	private static final long serialVersionUID = 1L;

	private Map accMap;

	private static Bank bank = new Bank();

	public static Bank getBank() {
		return bank;
	}

	private Bank() {
		accMap = new HashMap();
	}

	/**
	 * This is a addAccount method javadoc!
	 * 
	 * @param acc
	 *            It's an object of Account
	 */
	public void addAccount(Account acc) {
		String id = acc.getID();
		accMap.put(id, acc);
	}

	/**
	 * This is a removeAccount method javadoc!
	 */
	public void removeAccount(String id) {
		accMap.remove(id);
	}

	/**
	 * This is a getAccount method javadoc!
	 */
	public Account getAccount(String id) {
		Account accTmp = (Account) (accMap.get(id));
		return accTmp;
	}

	/**
	 * This is a getAccount method javadoc!
	 */
	public Collection getAccount() {
		return accMap.values();
	}

	/**
	 * This is a getAccount method javadoc!
	 */
	public Account[] getAllAccount() {
		Collection c = accMap.values();
		Account[] accArray = (Account[]) c.toArray(new Account[0]);
		return accArray;
	}

}
