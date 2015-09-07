
class TestBank 
{
	public static void main(String[] args) 
	{
		Account acc[] = new Account[5];
		for (int i = 0 ; i < acc.length ; i++ )
		{
			acc[i] = new Account("Name" + i,  i * 1000);
		}
		
		Bank bank = Bank.getBank();
		for (int i = 0 ; i < acc.length ; i++ )
		{
			bank.addAccount(acc[i]);
		}
		for(int s=0;s<acc.length;s++)
		{
			System.out.println("a["+s+"]="+acc[s]);
		}

		Account accTmp = bank.getAccount(10002);
		System.out.println("Account Name : " + accTmp.getName());

		bank.removeAccount(10002);

		accTmp = bank.getAccount(10003);
		if (accTmp == null)
		{
			System.out.println("Account doesn't exist!!!");
		}else
			System.out.println("Account Name : " + accTmp.getName());
	}
}
