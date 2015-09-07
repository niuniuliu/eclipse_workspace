/**
 * 
 */
package bank.store;
import bank.business.*;

import java.io.*;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author
 * 
 */
public class AccountDataStore
{
	/**
	 * This is a <B>class</B> javadoc!
	 */

	/**
	 * @param args
	 */
	 ;
	public static void dataStore(String fileName, Bank bank)
	{
		FileWriter fw=null;
		try
		{	
			ObjectOutputStream oos1=new ObjectOutputStream(new FileOutputStream(fileName));
			
			oos1.writeObject(bank);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
		catch(IOException ie)
		{
			System.out.println(ie.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(fw!=null)
				{
					fw.close();
				}
			}
			catch(IOException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
		
	}


	public static void dataLoad(String fileName,Bank bank)
	{
		FileReader fis=null;
		try
		{
			InputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			Object obj = ois.readObject();
			
			Bank b=(Bank)obj;
			if(b!=null){
				if(b.getAccount().size()>0){
					Collection c=b.getAccount();
					Iterator it=c.iterator();
					while(it.hasNext()){
						Account acc=(Account)it.next();
						bank.addAccount(acc);
					}
				}		
				
			}
			
			
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
		catch(IOException ie)
		{
			System.out.println(ie.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(fis!=null)
				{
					fis.close();
				}
			}
			catch(IOException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
	}

}
