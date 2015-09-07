package bank.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bank.business.Account;
import bank.business.Bank;

/**
 * @author
 *
 */
public class SelectAccount extends JFrame implements ActionListener {
	/**
	 *  This is  a  <B>class</B>  javadoc!
	 */

	/**
	 * @param args
	 */
	
	private JTextField txtId;
	private JTextField txtName;
	//private JTextField txtBalance;
	public SelectAccount(String title)
	{
		super(title);
		
		Container c=this.getContentPane();
		
		c.setLayout(null);
		JLabel lblId=new JLabel("ID:");
		lblId.setFont(new Font("宋体",Font.BOLD,20));
		lblId.setForeground(Color.BLACK);
		lblId.setSize(200,40);
		lblId.setLocation(50,20);
		c.add(lblId);
		
		JLabel lblName=new JLabel("Name:");
		lblName.setFont(new Font("宋体",Font.BOLD,20));
		lblName.setForeground(Color.BLACK);
		lblName.setSize(200,40);
		lblName.setLocation(50,80);
		c.add(lblName);
		
//		JLabel lblBalance=new JLabel("Balance:");
//		lblBalance.setFont(new Font("宋体",Font.BOLD,20));
//		lblBalance.setForeground(Color.BLACK);
//		lblBalance.setSize(200,40);
//		lblBalance.setLocation(50,140);
//		c.add(lblBalance);
		
		txtId=new JTextField();
		txtId.setForeground(Color.BLACK);
		txtId.setSize(150,30);
		txtId.setLocation(160,20);
		c.add(txtId);
		
		txtName=new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setSize(150,30);
		txtName.setLocation(160,80);
		c.add(txtName);
		
//		txtBalance=new JTextField();
//		txtBalance.setForeground(Color.BLACK);
//		txtBalance.setSize(150,30);
//		txtBalance.setLocation(160,140);
//		c.add(txtBalance);
		JButton btnOk=new JButton("OK");
		btnOk.setForeground(Color.BLACK);
		btnOk.setSize(120,30);
		btnOk.setLocation(50,130);
		c.add(btnOk);
		btnOk.addActionListener(this);
		
		JButton btnCancel=new JButton("Cancel");
		btnCancel.setSize(120,30);
		btnCancel.setLocation(190,130);
		c.add(btnCancel);
		btnCancel.addActionListener(this);
		
		this.setSize(360,200);
	}
	public static void main(String[] args) {
		new SelectAccount("Search Account").setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {
		Bank b=Bank.getBank();
		String id=txtId.getText();
		//String name=txtName.getText();
		
		//double balance=(new Double(txtBalance.getText())).doubleValue();
		if(e.getActionCommand().equals("OK"))
		{
			b.getAccount(id);
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			txtId.setText("");
			txtName.setText("");
			//txtBalance.setText("");
		}
		
		
	}

}
