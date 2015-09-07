package bank.business;

import bank.exception.*;
import java.io.*;

/**
 * @author
 * 
 */
public class Account implements Serializable {
	/**
	 * This is a <B>class</B> javadoc!
	 */
	private static final long serialVersionUID = 1L;

	// private int id;
	private String id;

	// private static int currentID = 10000;
	private String name;

	private double balance;

	/**
	 * This is a constructor javadoc!
	 */
	public Account(String name, double balance) {
		// this.id = ++currentID;
		this.name = name;
		this.balance = balance;
	}

	/**
	 * This is a constructor javadoc!
	 */
	public Account(String name) {
		this(name, 0);
	}

	/**
	 * This is a constructor javadoc!
	 */
	public Account(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// public static int getCurrentID()
	// {
	// return currentID;
	// }

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double num) {
		balance += num;
	}

	public void debit(double num) throws BalanceNotEnoughException {
		if (this.getBalance() < num) {
			throw new BalanceNotEnoughException("Balance Not Enough !!");
		} else {
			balance -= num;
		}

	}

	public double getInterest() {
		return 0;
	}

	public String toString() {
		return name + ":" + balance;
	}

	public boolean equals(Object o) {
		Account acc;
		if (o instanceof Account) {
			acc = (Account) o;
		} else
			return false;

		if (this.name == acc.getName() && this.balance == acc.getBalance()) {
			return true;
		} else
			return false;
	}
	
	public int hashCode(Object obj){
		return Integer.parseInt(id);
	}
}
