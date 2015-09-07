package bank.gui;

import java.awt.BorderLayout;
import java.util.Collection;
import java.util.Iterator;
import bank.business.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author
 * 
 */
public class AllAccount extends JFrame {
	
	private String title[] = { "ID", "Name", "Balance" };
	private DefaultTableModel dtm = new DefaultTableModel(title, 1);

	/**
	 * @param args
	 */

	public AllAccount() {
		super();

		initUI();
	}

	private void initUI() {
		setLayout(new BorderLayout());

		JTable jt = new JTable(dtm);

		JScrollPane jsp = new JScrollPane(jt);
		getContentPane().add(jsp, BorderLayout.CENTER);

		setSize(500, 300);
		this.setLocationRelativeTo(null);

	}

	public void getAllAccount(Bank bank) {

		Collection c = (Collection) bank.getAccount();

		if (c == null) {
			System.out.println("Not Any Data");
		} else {
			Iterator it = c.iterator();

			while (it.hasNext()) {
				System.out.println();
				Account acc = (Account) it.next();
				System.out.println(acc.getID());
				dtm.setValueAt(acc.getID(), dtm.getRowCount() - 1, 0);
				dtm.setValueAt(new String(acc.getName()),
						dtm.getRowCount() - 1, 1);
				dtm.setValueAt(new Double(acc.getBalance()),
						dtm.getRowCount() - 1, 2);
				dtm.setRowCount(dtm.getRowCount() + 1);
			}
		}
	}
}
