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
import modellayer.Order;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainMenuGUI extends JFrame {

	private JPanel contentPane;
	private JTable mainOrderTable;
	private OrderController orderController = new OrderController();

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
		setBounds(100, 100, 700, 400);
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
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Salg", null, panel_3, null);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane, BorderLayout.CENTER);
		
		String[] orderColumns = {"Ordrenr.", "Medarbejder", "Kunde", "Total"};
		DefaultTableModel mainOrderTab = new DefaultTableModel();
		
		for (String column: orderColumns) {
			mainOrderTab.addColumn(column);
		}
		
		mainOrderTable = new JTable();
		scrollPane.setViewportView(mainOrderTable);
		mainOrderTable.setModel(mainOrderTab); //JN was here!
		
		for(Order order : orderController.getOrders()) {
			mainOrderTab.addRow(new Object[]{order.getOrderNumber(), order.getEmployee().getName(), order.getCustomer().getName(), order.getTotal()});
		}
	}
}
