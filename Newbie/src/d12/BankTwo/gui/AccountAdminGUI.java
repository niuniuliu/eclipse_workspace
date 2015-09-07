/**
 * 
 */
package bank.gui;

import javax.swing.*;

import bank.business.Bank;
import bank.store.AccountDataStore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Container;

/**
 * @author
 * 
 */
public class AccountAdminGUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	private JMenuItem exit;

	private JMenuItem addAccount;

	private JMenuItem save;

	private JMenuItem deposit;

	private JMenuItem allAccount;

	private JMenuItem selectAccount;

	private JMenuItem index;

	private Container c;

	private AddAccount add = null;

	private AllAccount all = null;

	private Bank bank;

	public AccountAdminGUI() throws Exception {
		bank = Bank.getBank();
		AccountDataStore.dataLoad("account.dat", bank);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				try {
					int option = JOptionPane.showConfirmDialog(null,
							" Are you sure to exit !!", "System Information",
							JOptionPane.YES_OPTION);
					if (option == JOptionPane.YES_OPTION) {
						AccountDataStore.dataStore("account.dat", bank);
						System.exit(0);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		});
		JMenu accountInfo = new JMenu("AccountInfo");

		addAccount = new JMenuItem("AddAccount");
		addAccount.addActionListener(this);
		accountInfo.add(addAccount);

		accountInfo.addSeparator();

		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		accountInfo.add(exit);

		JMenu operate = new JMenu("Operate");
		save = new JMenuItem("Saving");
		operate.add(save);
		save.addActionListener(this);

		deposit = new JMenuItem("Deposit");
		operate.add(deposit);
		deposit.addActionListener(this);

		JMenu search = new JMenu("SearchAccount");
		allAccount = new JMenuItem("AllAccount");
		allAccount.addActionListener(this);
		search.add(allAccount);

		selectAccount = new JMenuItem("SelectAccount");
		selectAccount.addActionListener(this);
		search.add(selectAccount);

		JMenu help = new JMenu("Help");
		index = new JMenuItem("Index");
		help.add(index);

		JMenuBar mb = new JMenuBar();
		mb.add(accountInfo);
		mb.add(operate);
		mb.add(search);
		mb.add(help);
		c = this.getContentPane();		
		c.add(mb);
		this.setJMenuBar(mb);
		this.setSize(1200, 1200);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("Exit")) {
				int option = JOptionPane.showConfirmDialog(null,
						" Are you sure to exit !!", "System Information",
						JOptionPane.YES_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			if (e.getActionCommand().equals("AddAccount")) {
				add = new AddAccount(this, bank);
			}
			if (e.getActionCommand().equals("Saving")) {

			}
			if (e.getActionCommand().equals("Deposit")) {

			}
			if (e.getActionCommand().equals("AllAccount")) {

				all = new AllAccount();
				all.setVisible(true);
				all.getAllAccount(bank);
			}
			if (e.getActionCommand().equals("SelectAccount")) {
				// new SelectAccount("Search Account").setVisible(true);
			}
			if (e.getActionCommand().equals("Index")) {

			}
		} catch (NumberFormatException e1) {
			System.out.println("Please select number!!!");
		}

	}

}
