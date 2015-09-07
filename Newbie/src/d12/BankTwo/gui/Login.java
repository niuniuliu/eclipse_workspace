package bank.gui;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * @author
 *
 */
public class Login	 extends JFrame implements ActionListener {

	/**
	 *  This is  a  <B>class</B>  javadoc!
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	private JTextField txtUserID;
	private JPasswordField txtPassword;
	public Login(String title)
	{
		super(title);
		Container c=this.getContentPane();
		c.setLayout(null);
		JLabel lblUserID=new JLabel("User ID:");
		lblUserID.setFont(new Font("宋体",Font.BOLD,20));
		lblUserID.setForeground(Color.BLACK);
		lblUserID.setSize(200,40);
		lblUserID.setLocation(50,20);
		c.add(lblUserID);
		
		
		JLabel lblPassword=new JLabel("Password:");
		lblPassword.setFont(new Font("宋体",Font.BOLD,20));
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setSize(200,20);
		lblPassword.setLocation(50,80);
		c.add(lblPassword);
		
		
		txtUserID=new JTextField();
		txtUserID.setForeground(Color.BLACK);
		txtUserID.setSize(200,30);
		txtUserID.setLocation(200,20);
		c.add(txtUserID);
		
		txtPassword=new JPasswordField();
		txtPassword.setForeground(Color.BLACK);
		txtPassword.setSize(200,30);
		txtPassword.setLocation(200,80);
		c.add(txtPassword);
		
		
		JButton btnOk=new JButton("Login");
		btnOk.setForeground(Color.BLACK);
		btnOk.setSize(120,30);
		btnOk.setLocation(100,130);
		c.add(btnOk);
		btnOk.addActionListener(this);
		
		JButton btnCancel=new JButton("Cancel");
		btnCancel.setSize(120,30);
		btnCancel.setLocation(250,130);
		c.add(btnCancel);
		btnCancel.addActionListener(this);
		
		this.setSize(450,200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
				
	}
	public static void main(String[] args) {
		//设置显示样式
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		new Login("Login");

	}
	public boolean isExisting()
	{
		FileReader fis=null;
		boolean flag=false;
		try
		{
			fis=new FileReader("user.dat");
			BufferedReader br=new BufferedReader(fis);
			
			String str = null;

			while((str=br.readLine())!=null)
			{
				StringTokenizer st = new StringTokenizer(str,",");
				String name="";
				String password="";
				name=st.nextToken();
				password=st.nextToken();
				if(txtUserID.getText().equals(name) && (new String(txtPassword.getPassword())).equals(password))
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
				
			}
			fis.close();
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
		catch(IOException ie)
		{
			System.out.println(ie.getMessage());
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
		return flag;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try
		{
			if(e.getActionCommand().equals("Login"))
			{
				if(isExisting())
				{
					this.dispose();
					
					new AccountAdminGUI().setVisible(true);					
				}
				else
				{
					JOptionPane.showConfirmDialog(null," UserID or Password Errors !!","System Information",JOptionPane.DEFAULT_OPTION);
				}
			}
			if(e.getActionCommand().endsWith("Cancel"))
			{
				txtUserID.setText("");
				txtPassword.setText("");
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
	
	}

}
