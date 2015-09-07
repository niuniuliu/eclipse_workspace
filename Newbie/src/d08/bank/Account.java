
public class Account{
	private int id;

	private static int currentID = 10000;

	private String name;

	private double balance;

	public Account(String name, double balance) {
		this.id = ++currentID;
		this.name = name;
		this.balance = balance;
	}

	public Account(String name) {
		this(name, 0);
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public static int getCurrentID() {
		return currentID;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
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

	// public void setBalance(double balance) {this.balance = balance;}

	public void deposit(double num) {
		balance += num;
	}

//	public void debit(double num) throws BalanceNotEnoughException {
//		if (this.getBalance() < num) {
//			throw new BalanceNotEnoughException("Balance Not Enough !!");
//		} else {
//			balance -= num;
//		}
//	}

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
			return this.name == acc.getName() && this.balance == acc.getBalance();
		} else
			return false;



	}
}
