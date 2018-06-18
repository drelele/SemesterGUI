package guilayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controllerlayer.OrderController;
import controllerlayer.PersonController;
import modellayer.Customer;
import modellayer.Employee;
import modellayer.Order;
import modellayer.Person;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainMenuGUI extends JFrame {

	private JFrame jFrameMain;
	private JPanel contentPane;
	private JTable mainOrderTable;
	private OrderController orderController = new OrderController();
	private PersonController personController = new PersonController();
	private JTable mainPersonTable;
	private DefaultTableModel mainOrderTab;
	private DefaultTableModel mainPersonTab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuGUI frame = new MainMenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 496);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Menu", null, panel, null);
		panel.setLayout(null);

		JLabel lblVestbjergByggecenterStyringssystem = new JLabel("Vestbjerg Byggecenter Styringssystem");
		lblVestbjergByggecenterStyringssystem.setBounds(10, 11, 394, 25);
		panel.add(lblVestbjergByggecenterStyringssystem);
		lblVestbjergByggecenterStyringssystem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		JPanel headPanel = new JPanel();
		headPanel.setBounds(39, 84, 590, 155);
		panel.add(headPanel);
		headPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dine muligheder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		headPanel.setLayout(null);

		JButton btnProdukter = new JButton("Produkter");
		btnProdukter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductGUI productTab = new ProductGUI();
				productTab.setVisible(true);
				productTab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnProdukter.setBackground(Color.WHITE);
		btnProdukter.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnProdukter.setBounds(25, 67, 162, 73);
		headPanel.add(btnProdukter);

		JButton btnPersoner = new JButton("Personer");
		btnPersoner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonGUI personTab = new PersonGUI();
				personTab.setVisible(true);
				personTab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnPersoner.setBackground(Color.WHITE);
		btnPersoner.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPersoner.setBounds(215, 67, 162, 73);
		headPanel.add(btnPersoner);

		JButton btnSalg = new JButton("Salg");
		btnSalg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderGUI salgTab = new OrderGUI();
				salgTab.setVisible(true);
				salgTab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnSalg.setBackground(Color.WHITE);
		btnSalg.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalg.setBounds(400, 67, 162, 73);
		headPanel.add(btnSalg);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 649, 2);
		panel.add(separator);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Personer", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Produkter", null, panel_2, null);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Salg", null, panel_3, null);
		panel_3.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane1 = new JScrollPane();
		panel_1.add(scrollPane1, BorderLayout.CENTER);

		// Person 
		String[] personColumns = {"Navn.", "Telefon", "Kundenummer", "Medarbejdernummer", };
		mainPersonTab = new DefaultTableModel();

		for (String column1: personColumns) {
			mainPersonTab.addColumn(column1);
		}

		mainPersonTable = new JTable();
		scrollPane1.setViewportView(mainPersonTable);
		mainPersonTable.setModel(mainPersonTab); //SH was here! 

		JButton btnOpdater = new JButton("Opdater");
		btnOpdater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				updatePersons();
			}
		});

		updatePersons();
		panel_1.add(btnOpdater, BorderLayout.NORTH);

 

		//JN START

		String[] orderColumns = {"Ordrenr.", "Medarbejder", "Kunde", "Total"};
		mainOrderTab = new DefaultTableModel();

		for (String column: orderColumns) {
			mainOrderTab.addColumn(column);
		}

		JButton mainOrderUpdateBtn = new JButton("Opdater");
		mainOrderUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateOrders();
			}
		});

		panel_3.add(mainOrderUpdateBtn, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);


		mainOrderTable = new JTable();
		scrollPane.setViewportView(mainOrderTable);
		mainOrderTable.setModel(mainOrderTab);

		updateOrders();

		//JN END

	}

	private void updatePersons() {
		emptyTable(mainPersonTab);
		for(Person person : personController.getAllPersons()) {
			if (person instanceof Customer) {			
				Customer customer = (Customer) person;
				mainPersonTab.addRow(new Object[]{customer.getName(), customer.getPhone(), customer.getCustomerNumber(), ""});
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				mainPersonTab.addRow(new Object[]{employee.getName(), employee.getPhone(), "", employee.getEmployeeNumber()});
			}
		}
	}

	private void updateOrders() {
		emptyTable(mainOrderTab);
		for(Order order : orderController.getOrders()) {
			mainOrderTab.addRow(new Object[]{order.getOrderNumber(), order.getEmployee().getName(), order.getCustomer().getName(), order.getTotal()});
		}
	}

	//Empty/reset table
	private void emptyTable(DefaultTableModel table) {
		int c = table.getRowCount();	
		for(int i = c; 0 < i; i--) {
			table.removeRow(i - 1);
		}
	}

}
