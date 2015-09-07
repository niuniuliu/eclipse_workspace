package bank.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import bank.business.Account;
import bank.business.Bank;

/**
 * @author
 * 
 */
public class AddAccount extends JDialog implements ActionListener {
	/**
	 * This is a <B>class</B> javadoc!
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private JTextField txtName;

	private JTextField txtBalance;

	private Bank bank;
	
	public AddAccount(JFrame frame, Bank b) {
		super(frame, true);
		setLocationRelativeTo(frame);		
		bank = b;		
		initUI();
	}
	
	private void initUI() {
		Container c = this.getContentPane();
		c.setLayout(null);
		JRadioButton rbCheck = new JRadioButton("CheckingAccount");

		rbCheck.setSize(150, 30);
		rbCheck.setLocation(50, 20);
		rbCheck.setSelected(true);
		c.add(rbCheck);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("宋体", Font.BOLD, 20));
		lblName.setForeground(Color.BLACK);
		lblName.setSize(200, 40);
		lblName.setLocation(50, 80);
		c.add(lblName);

		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setFont(new Font("宋体", Font.BOLD, 20));
		lblBalance.setForeground(Color.BLACK);
		lblBalance.setSize(200, 40);
		lblBalance.setLocation(50, 140);
		c.add(lblBalance);
		JRadioButton rbSaving = new JRadioButton("SavingAccount");
		// rbSaving.setForeground(Color.BLACK);
		rbSaving.setSize(150, 30);
		rbSaving.setLocation(200, 20);
		c.add(rbSaving);

		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setSize(150, 30);
		txtName.setLocation(160, 80);
		c.add(txtName);

		txtBalance = new JTextField();
		txtBalance.setForeground(Color.BLACK);
		txtBalance.setSize(150, 30);
		txtBalance.setLocation(160, 140);
		c.add(txtBalance);
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(Color.BLACK);
		btnOk.setSize(120, 30);
		btnOk.setLocation(50, 200);
		c.add(btnOk);
		btnOk.addActionListener(this);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setSize(120, 30);
		btnCancel.setLocation(190, 200);
		c.add(btnCancel);
		btnCancel.addActionListener(this);

		this.setSize(350, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		try {
			Date myDate = new Date();
			// System.out.println(DateFormat.getDateTimeInstance().format(myDate));
			String strID = DateFormat.getDateTimeInstance().format(myDate)
					+ (int) Math.random() * 10;
			String name = txtName.getText();
			double balance = (new Double(txtBalance.getText())).doubleValue();
			if (e.getActionCommand().equals("OK")) {
				Account acc = new Account(strID, name, balance);
				// Bank a=Bank.getBank();
				bank.addAccount(acc);
				int option = JOptionPane.showConfirmDialog(null,
						" add success !do you continue to add !!",
						"System Information", JOptionPane.YES_OPTION);
				if (option == JOptionPane.NO_OPTION) {
					this.hide();
				}
				txtName.setText("");
				txtBalance.setText("");
			}
			if (e.getActionCommand().equals("Cancel")) {
				// txtId.setText("");
				txtName.setText("");
				txtBalance.setText("");
			}
		} catch (NumberFormatException e3) {
			System.out.println(e3.getMessage());
		}

	}

}
