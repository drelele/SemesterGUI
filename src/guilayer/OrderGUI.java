package guilayer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controllerlayer.OrderController;
import modellayer.*;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class OrderGUI extends JFrame {

	private JPanel contentPane;
	private JTextField createEmployeeName;
	private JTextField createEmployeeAddress;
	private JTextField createEmployeeCity;
	private JTextField createEmployeeZip;
	private JTextField createCustomerName;
	private JTextField createCustomerAddress;
	private JTextField createCustomerCity;
	private JTextField createCustomerZip;
	private JTextField updateEmployeeName;
	private JTextField updateEmployeeAddress;
	private JTextField updateEmployeeCity;
	private JTextField updateEmployeeZip;
	private JTextField updateCustomerName;
	private JTextField updateCustomerAddress;
	private JTextField updateCustomerCity;
	private JTextField updateCustomerZip;
	private JTextField orderSearchInputField;
	private JTable createProductTable;
	private static DefaultTableModel tab;
	private JTable updateProductTable;
	private JTextField personSeachInputField;
	private JTextField personEmployeeName;
	private JTextField personEmployeeAddress;
	private JTextField personEmployeeCity;
	private JTextField personEmployeeZip;
	private JTextField personCustomerName;
	private JTextField personCustomerAddress;
	private JTextField personCustomerCity;
	private JTextField personCustomerZip;
	private JTextField personReturnName;
	private JTextField personReturnAddress;
	private JTextField personReturnCity;
	private JTextField personReturnZip;
	private JTextField productSearchInputField;
	private JTable productProductTable;
	private JTextField productReturnBarcode;
	private JTextField productReturnTitle;
	private JTextField productReturnDesc;
	
	private OrderController orderController = new OrderController();
	
	private Person personReturn;
	private Person employee;
	private Person customer;
	
	private Product productReturn;
	private JTextField productReturnPrice;
	
	private Order orderReturn;
	
	HashMap<String, Integer> barcodes = new HashMap<>();
	HashMap<String, Integer> tmp = new HashMap<>();
	
	private JTextField createEmployeePhone;
	private JTextField createCustomerPhone;
	private JTextField updateEmployeePhone;
	private JTextField updateCustomerPhone;
	private JTextField personReturnPhone;
	private JTextField personEmployeePhone;
	private JTextField personCustomerPhone;
	private JTextField productReturnStock;
	private JSlider productReturnSlider;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					OrderGUI frame = new OrderGUI();
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
	public OrderGUI() {
		
        String[] columNames = {"Titel", "Antal", "Pris/Stk.", "Pris"};
		DefaultTableModel createProductTab = new DefaultTableModel();
        for (String string: columNames) {
        	createProductTab.addColumn(string);
        }
        
        DefaultTableModel updateProductTab = new DefaultTableModel();
        for (String string: columNames) {
        	updateProductTab.addColumn(string);
        }
        
        DefaultTableModel productProductTab = new DefaultTableModel();
        for (String string: columNames) {
        	productProductTab.addColumn(string);
        }
        
		Vector<String> columnIdentifiers = new Vector<String>();
		columnIdentifiers.add("Titel");
		columnIdentifiers.add("Antal");
		columnIdentifiers.add("Pris/Stk.");
		columnIdentifiers.add("Pris");
        
		setResizable(false);
		setTitle("Salg - Vestbjerg Byggecenter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Filer");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Afslut");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel createPanel = new JPanel();
		tabbedPane.addTab("Opret Salg", null, createPanel, null);
		createPanel.setLayout(null);
		
		JButton createBackBtn = new JButton("Tilbage");
		createBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		createBackBtn.setBounds(10, 278, 89, 23);
		createPanel.add(createBackBtn);
		
		JButton createConfirmBtn = new JButton("Opret Salg");
		createConfirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				orderController.createOrder(createEmployeePhone.getText(), createCustomerPhone.getText(), barcodes);
				
				barcodes = new HashMap<String, Integer>();
				
			}
		});
		createConfirmBtn.setBounds(580, 278, 89, 23);
		createPanel.add(createConfirmBtn);
		
		JButton createCancelBtn = new JButton("Ryd");
		createCancelBtn.setBounds(481, 278, 89, 23);
		createPanel.add(createCancelBtn);
		
		JPanel createEmployeePanel = new JPanel();
		createEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createEmployeePanel.setBounds(10, 11, 187, 256);
		createPanel.add(createEmployeePanel);
		GridBagLayout gbl_createEmployeePanel = new GridBagLayout();
		gbl_createEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_createEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_createEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_createEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		createEmployeePanel.setLayout(gbl_createEmployeePanel);
		
		JLabel lblNewLabel = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		createEmployeePanel.add(lblNewLabel, gbc_lblNewLabel);
		
		createEmployeeName = new JTextField();
		createEmployeeName.setEditable(false);
		GridBagConstraints gbc_createEmployeeName = new GridBagConstraints();
		gbc_createEmployeeName.insets = new Insets(0, 0, 5, 0);
		gbc_createEmployeeName.fill = GridBagConstraints.HORIZONTAL;
		gbc_createEmployeeName.gridx = 1;
		gbc_createEmployeeName.gridy = 0;
		createEmployeePanel.add(createEmployeeName, gbc_createEmployeeName);
		createEmployeeName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		createEmployeePanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		createEmployeeAddress = new JTextField();
		createEmployeeAddress.setEditable(false);
		GridBagConstraints gbc_createEmployeeAddress = new GridBagConstraints();
		gbc_createEmployeeAddress.insets = new Insets(0, 0, 5, 0);
		gbc_createEmployeeAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_createEmployeeAddress.gridx = 1;
		gbc_createEmployeeAddress.gridy = 1;
		createEmployeePanel.add(createEmployeeAddress, gbc_createEmployeeAddress);
		createEmployeeAddress.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		createEmployeePanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		createEmployeeCity = new JTextField();
		createEmployeeCity.setEditable(false);
		GridBagConstraints gbc_createEmployeeCity = new GridBagConstraints();
		gbc_createEmployeeCity.insets = new Insets(0, 0, 5, 0);
		gbc_createEmployeeCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_createEmployeeCity.gridx = 1;
		gbc_createEmployeeCity.gridy = 2;
		createEmployeePanel.add(createEmployeeCity, gbc_createEmployeeCity);
		createEmployeeCity.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		createEmployeePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		createEmployeeZip = new JTextField();
		createEmployeeZip.setEditable(false);
		GridBagConstraints gbc_createEmployeeZip = new GridBagConstraints();
		gbc_createEmployeeZip.insets = new Insets(0, 0, 5, 0);
		gbc_createEmployeeZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_createEmployeeZip.gridx = 1;
		gbc_createEmployeeZip.gridy = 3;
		createEmployeePanel.add(createEmployeeZip, gbc_createEmployeeZip);
		createEmployeeZip.setColumns(10);
		
		JLabel lblTelefon = new JLabel("Telefon");
		GridBagConstraints gbc_lblTelefon = new GridBagConstraints();
		gbc_lblTelefon.anchor = GridBagConstraints.WEST;
		gbc_lblTelefon.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelefon.gridx = 0;
		gbc_lblTelefon.gridy = 4;
		createEmployeePanel.add(lblTelefon, gbc_lblTelefon);
		
		createEmployeePhone = new JTextField();
		createEmployeePhone.setEditable(false);
		GridBagConstraints gbc_createEmployeePhone = new GridBagConstraints();
		gbc_createEmployeePhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_createEmployeePhone.gridx = 1;
		gbc_createEmployeePhone.gridy = 4;
		createEmployeePanel.add(createEmployeePhone, gbc_createEmployeePhone);
		createEmployeePhone.setColumns(10);
		
		JPanel createPersonPanel = new JPanel();
		createPersonPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createPersonPanel.setBounds(207, 11, 187, 256);
		createPanel.add(createPersonPanel);
		GridBagLayout gbl_createPersonPanel = new GridBagLayout();
		gbl_createPersonPanel.columnWidths = new int[]{0, 0, 0};
		gbl_createPersonPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_createPersonPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_createPersonPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		createPersonPanel.setLayout(gbl_createPersonPanel);
		
		JLabel lblNewLabel_4 = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		createPersonPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		createCustomerName = new JTextField();
		createCustomerName.setEditable(false);
		GridBagConstraints gbc_createCustomerName = new GridBagConstraints();
		gbc_createCustomerName.insets = new Insets(0, 0, 5, 0);
		gbc_createCustomerName.fill = GridBagConstraints.HORIZONTAL;
		gbc_createCustomerName.gridx = 1;
		gbc_createCustomerName.gridy = 0;
		createPersonPanel.add(createCustomerName, gbc_createCustomerName);
		createCustomerName.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 1;
		createPersonPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		createCustomerAddress = new JTextField();
		createCustomerAddress.setEditable(false);
		GridBagConstraints gbc_createCustomerAddress = new GridBagConstraints();
		gbc_createCustomerAddress.insets = new Insets(0, 0, 5, 0);
		gbc_createCustomerAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_createCustomerAddress.gridx = 1;
		gbc_createCustomerAddress.gridy = 1;
		createPersonPanel.add(createCustomerAddress, gbc_createCustomerAddress);
		createCustomerAddress.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 2;
		createPersonPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		createCustomerCity = new JTextField();
		createCustomerCity.setEditable(false);
		GridBagConstraints gbc_createCustomerCity = new GridBagConstraints();
		gbc_createCustomerCity.insets = new Insets(0, 0, 5, 0);
		gbc_createCustomerCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_createCustomerCity.gridx = 1;
		gbc_createCustomerCity.gridy = 2;
		createPersonPanel.add(createCustomerCity, gbc_createCustomerCity);
		createCustomerCity.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 3;
		createPersonPanel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		createCustomerZip = new JTextField();
		createCustomerZip.setEditable(false);
		GridBagConstraints gbc_createCustomerZip = new GridBagConstraints();
		gbc_createCustomerZip.insets = new Insets(0, 0, 5, 0);
		gbc_createCustomerZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_createCustomerZip.gridx = 1;
		gbc_createCustomerZip.gridy = 3;
		createPersonPanel.add(createCustomerZip, gbc_createCustomerZip);
		createCustomerZip.setColumns(10);
		
		JLabel label_20 = new JLabel("Telefon");
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.anchor = GridBagConstraints.WEST;
		gbc_label_20.insets = new Insets(0, 0, 0, 5);
		gbc_label_20.gridx = 0;
		gbc_label_20.gridy = 4;
		createPersonPanel.add(label_20, gbc_label_20);
		
		createCustomerPhone = new JTextField();
		createCustomerPhone.setEditable(false);
		createCustomerPhone.setColumns(10);
		GridBagConstraints gbc_createCustomerPhone = new GridBagConstraints();
		gbc_createCustomerPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_createCustomerPhone.gridx = 1;
		gbc_createCustomerPhone.gridy = 4;
		createPersonPanel.add(createCustomerPhone, gbc_createCustomerPhone);
		
		JPanel createProductPanel = new JPanel();
		createProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createProductPanel.setBounds(404, 11, 265, 256);
		createPanel.add(createProductPanel);
		createProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		createProductPanel.add(scrollPane, BorderLayout.CENTER);
		
		createProductTable = new JTable();
		scrollPane.setViewportView(createProductTable);
		createProductTable.setModel(createProductTab);
		
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Find Salg", null, updatePanel, null);
		updatePanel.setLayout(null);
		
		JButton updateBackBtn = new JButton("Tilbage");
		updateBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		updateBackBtn.setBounds(10, 278, 89, 23);
		updatePanel.add(updateBackBtn);
		
		JButton updateCancelBtn = new JButton("Ryd");
		updateCancelBtn.setBounds(481, 278, 89, 23);
		updatePanel.add(updateCancelBtn);
		
		JButton updateConfirmBtn = new JButton("\u00C6ndre Salg");
		updateConfirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int c = updateProductTab.getRowCount();
				
				orderController.updateOrder(orderReturn, updateEmployeePhone.getText(), updateCustomerPhone.getText(), barcodes);
				
				barcodes = new HashMap<>();
				
				for(int i = 0; i < c; i++) {
					Integer amount = Integer.valueOf(updateProductTab.getValueAt(i, 1).toString());
					orderController.updatePartOrder(orderReturn, i, amount);
				}				
				
			}
		});
		updateConfirmBtn.setBounds(580, 278, 89, 23);
		updatePanel.add(updateConfirmBtn);
		
		JPanel updateEmployeePanel = new JPanel();
		updateEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateEmployeePanel.setBounds(10, 82, 187, 185);
		updatePanel.add(updateEmployeePanel);
		GridBagLayout gbl_updateEmployeePanel = new GridBagLayout();
		gbl_updateEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_updateEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_updateEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_updateEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		updateEmployeePanel.setLayout(gbl_updateEmployeePanel);
		
		JLabel label = new JLabel("Navn");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		updateEmployeePanel.add(label, gbc_label);
		
		updateEmployeeName = new JTextField();
		updateEmployeeName.setEditable(false);
		updateEmployeeName.setColumns(10);
		GridBagConstraints gbc_updateEmployeeName = new GridBagConstraints();
		gbc_updateEmployeeName.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateEmployeeName.insets = new Insets(0, 0, 5, 0);
		gbc_updateEmployeeName.gridx = 1;
		gbc_updateEmployeeName.gridy = 0;
		updateEmployeePanel.add(updateEmployeeName, gbc_updateEmployeeName);
		
		JLabel label_1 = new JLabel("Adresse");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		updateEmployeePanel.add(label_1, gbc_label_1);
		
		updateEmployeeAddress = new JTextField();
		updateEmployeeAddress.setEditable(false);
		updateEmployeeAddress.setColumns(10);
		GridBagConstraints gbc_updateEmployeeAddress = new GridBagConstraints();
		gbc_updateEmployeeAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateEmployeeAddress.insets = new Insets(0, 0, 5, 0);
		gbc_updateEmployeeAddress.gridx = 1;
		gbc_updateEmployeeAddress.gridy = 1;
		updateEmployeePanel.add(updateEmployeeAddress, gbc_updateEmployeeAddress);
		
		JLabel label_2 = new JLabel("By");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		updateEmployeePanel.add(label_2, gbc_label_2);
		
		updateEmployeeCity = new JTextField();
		updateEmployeeCity.setEditable(false);
		updateEmployeeCity.setColumns(10);
		GridBagConstraints gbc_updateEmployeeCity = new GridBagConstraints();
		gbc_updateEmployeeCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateEmployeeCity.insets = new Insets(0, 0, 5, 0);
		gbc_updateEmployeeCity.gridx = 1;
		gbc_updateEmployeeCity.gridy = 2;
		updateEmployeePanel.add(updateEmployeeCity, gbc_updateEmployeeCity);
		
		JLabel label_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 3;
		updateEmployeePanel.add(label_3, gbc_label_3);
		
		updateEmployeeZip = new JTextField();
		updateEmployeeZip.setEditable(false);
		updateEmployeeZip.setColumns(10);
		GridBagConstraints gbc_updateEmployeeZip = new GridBagConstraints();
		gbc_updateEmployeeZip.insets = new Insets(0, 0, 5, 0);
		gbc_updateEmployeeZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateEmployeeZip.gridx = 1;
		gbc_updateEmployeeZip.gridy = 3;
		updateEmployeePanel.add(updateEmployeeZip, gbc_updateEmployeeZip);
		
		JLabel label_21 = new JLabel("Telefon");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.anchor = GridBagConstraints.WEST;
		gbc_label_21.insets = new Insets(0, 0, 0, 5);
		gbc_label_21.gridx = 0;
		gbc_label_21.gridy = 4;
		updateEmployeePanel.add(label_21, gbc_label_21);
		
		updateEmployeePhone = new JTextField();
		updateEmployeePhone.setColumns(10);
		GridBagConstraints gbc_updateEmployeePhone = new GridBagConstraints();
		gbc_updateEmployeePhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateEmployeePhone.gridx = 1;
		gbc_updateEmployeePhone.gridy = 4;
		updateEmployeePanel.add(updateEmployeePhone, gbc_updateEmployeePhone);
		
		JPanel updateCustomerPanel = new JPanel();
		updateCustomerPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateCustomerPanel.setBounds(207, 82, 187, 185);
		updatePanel.add(updateCustomerPanel);
		GridBagLayout gbl_updateCustomerPanel = new GridBagLayout();
		gbl_updateCustomerPanel.columnWidths = new int[]{0, 0, 0};
		gbl_updateCustomerPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_updateCustomerPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_updateCustomerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		updateCustomerPanel.setLayout(gbl_updateCustomerPanel);
		
		JLabel label_4 = new JLabel("Navn");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 0;
		updateCustomerPanel.add(label_4, gbc_label_4);
		
		updateCustomerName = new JTextField();
		updateCustomerName.setEditable(false);
		updateCustomerName.setColumns(10);
		GridBagConstraints gbc_updateCustomerName = new GridBagConstraints();
		gbc_updateCustomerName.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateCustomerName.insets = new Insets(0, 0, 5, 0);
		gbc_updateCustomerName.gridx = 1;
		gbc_updateCustomerName.gridy = 0;
		updateCustomerPanel.add(updateCustomerName, gbc_updateCustomerName);
		
		JLabel label_5 = new JLabel("Adresse");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 1;
		updateCustomerPanel.add(label_5, gbc_label_5);
		
		updateCustomerAddress = new JTextField();
		updateCustomerAddress.setEditable(false);
		updateCustomerAddress.setColumns(10);
		GridBagConstraints gbc_updateCustomerAddress = new GridBagConstraints();
		gbc_updateCustomerAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateCustomerAddress.insets = new Insets(0, 0, 5, 0);
		gbc_updateCustomerAddress.gridx = 1;
		gbc_updateCustomerAddress.gridy = 1;
		updateCustomerPanel.add(updateCustomerAddress, gbc_updateCustomerAddress);
		
		JLabel label_6 = new JLabel("By");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 2;
		updateCustomerPanel.add(label_6, gbc_label_6);
		
		updateCustomerCity = new JTextField();
		updateCustomerCity.setEditable(false);
		updateCustomerCity.setColumns(10);
		GridBagConstraints gbc_updateCustomerCity = new GridBagConstraints();
		gbc_updateCustomerCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateCustomerCity.insets = new Insets(0, 0, 5, 0);
		gbc_updateCustomerCity.gridx = 1;
		gbc_updateCustomerCity.gridy = 2;
		updateCustomerPanel.add(updateCustomerCity, gbc_updateCustomerCity);
		
		JLabel label_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 3;
		updateCustomerPanel.add(label_7, gbc_label_7);
		
		updateCustomerZip = new JTextField();
		updateCustomerZip.setEditable(false);
		updateCustomerZip.setColumns(10);
		GridBagConstraints gbc_updateCustomerZip = new GridBagConstraints();
		gbc_updateCustomerZip.insets = new Insets(0, 0, 5, 0);
		gbc_updateCustomerZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateCustomerZip.gridx = 1;
		gbc_updateCustomerZip.gridy = 3;
		updateCustomerPanel.add(updateCustomerZip, gbc_updateCustomerZip);
		
		JLabel label_22 = new JLabel("Telefon");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.anchor = GridBagConstraints.WEST;
		gbc_label_22.insets = new Insets(0, 0, 0, 5);
		gbc_label_22.gridx = 0;
		gbc_label_22.gridy = 4;
		updateCustomerPanel.add(label_22, gbc_label_22);
		
		updateCustomerPhone = new JTextField();
		updateCustomerPhone.setColumns(10);
		GridBagConstraints gbc_updateCustomerPhone = new GridBagConstraints();
		gbc_updateCustomerPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_updateCustomerPhone.gridx = 1;
		gbc_updateCustomerPhone.gridy = 4;
		updateCustomerPanel.add(updateCustomerPhone, gbc_updateCustomerPhone);
		
		JPanel updateProductPanel = new JPanel();
		updateProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateProductPanel.setBounds(407, 82, 262, 185);
		updatePanel.add(updateProductPanel);
		updateProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		updateProductPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		updateProductTable = new JTable();
		scrollPane_1.setViewportView(updateProductTable);
		updateProductTable.setModel(updateProductTab);
		
		JPanel updateSearchPanel = new JPanel();
		updateSearchPanel.setBackground(Color.DARK_GRAY);
		updateSearchPanel.setBounds(0, 0, 679, 71);
		updatePanel.add(updateSearchPanel);
		updateSearchPanel.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Salg", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(174, 11, 331, 49);
		updateSearchPanel.add(panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0};
		gbl_panel_11.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		JLabel lblIndtastOrdernr = new JLabel("Indtast ordernr.");
		lblIndtastOrdernr.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIndtastOrdernr = new GridBagConstraints();
		gbc_lblIndtastOrdernr.insets = new Insets(0, 0, 0, 5);
		gbc_lblIndtastOrdernr.gridx = 0;
		gbc_lblIndtastOrdernr.gridy = 0;
		panel_11.add(lblIndtastOrdernr, gbc_lblIndtastOrdernr);
		
		orderSearchInputField = new JTextField();
		GridBagConstraints gbc_orderSearchInputField = new GridBagConstraints();
		gbc_orderSearchInputField.fill = GridBagConstraints.HORIZONTAL;
		gbc_orderSearchInputField.insets = new Insets(0, 0, 0, 5);
		gbc_orderSearchInputField.gridx = 1;
		gbc_orderSearchInputField.gridy = 0;
		panel_11.add(orderSearchInputField, gbc_orderSearchInputField);
		orderSearchInputField.setColumns(10);
		
		JButton orderSearchBtn = new JButton("Find");
		orderSearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				orderReturn = orderController.getOrder(Integer.parseInt(orderSearchInputField.getText()));
				
				updateEmployeeName.setText(orderReturn.getEmployee().getName());
				updateEmployeeAddress.setText(orderReturn.getEmployee().getAddress());
				updateEmployeeCity.setText(orderReturn.getEmployee().getCity());
				updateEmployeeZip.setText(orderReturn.getEmployee().getPostalCode());
				updateEmployeePhone.setText(orderReturn.getEmployee().getPhone());
				
				updateCustomerName.setText(orderReturn.getCustomer().getName());
				updateCustomerAddress.setText(orderReturn.getCustomer().getAddress());
				updateCustomerCity.setText(orderReturn.getCustomer().getCity());
				updateCustomerZip.setText(orderReturn.getCustomer().getPostalCode());
				updateCustomerPhone.setText(orderReturn.getCustomer().getPhone());
				
				personEmployeeName.setText(orderReturn.getEmployee().getName());
				personEmployeeAddress.setText(orderReturn.getEmployee().getAddress());
				personEmployeeCity.setText(orderReturn.getEmployee().getCity());
				personEmployeeZip.setText(orderReturn.getEmployee().getPostalCode()); 
				personEmployeePhone.setText(orderReturn.getEmployee().getPhone());
				
				personCustomerName.setText(orderReturn.getCustomer().getName());
				personCustomerAddress.setText(orderReturn.getCustomer().getAddress());
				personCustomerCity.setText(orderReturn.getCustomer().getCity());
				personCustomerZip.setText(orderReturn.getCustomer().getPostalCode());
				personCustomerPhone.setText(orderReturn.getCustomer().getPhone());
				
				emptyTable(updateProductTab);
				
				//Get partOrders and add to update product tab
				for(PartOrder partOrder : orderReturn.getPartOrders()) {
					String lineTotal = String.valueOf(partOrder.getAmount() * partOrder.getProduct().getPrice());
					updateProductTab.addRow(new Object[]{partOrder.getProduct().getTitle(), partOrder.getAmount(), partOrder.getProduct().getPrice(), lineTotal});
				}
				
//				emptyTable(productProductTab);
//				
//				//Add from update tab to product tab
//				int c = updateProductTab.getRowCount();
//				
//				for(int i = 0; i < c; i++) {
//					productProductTab.addRow(new Object[]{updateProductTab.getValueAt(i, 0), updateProductTab.getValueAt(i, 1), updateProductTab.getValueAt(i, 2), updateProductTab.getValueAt(i, 3)});
//				}
				
				productProductTab.setDataVector(updateProductTab.getDataVector(), columnIdentifiers);
			}
		});
		GridBagConstraints gbc_orderSearchBtn = new GridBagConstraints();
		gbc_orderSearchBtn.gridx = 2;
		gbc_orderSearchBtn.gridy = 0;
		panel_11.add(orderSearchBtn, gbc_orderSearchBtn);
		
		JPanel personPanel = new JPanel();
		tabbedPane.addTab("Tilf\u00F8j Personer", null, personPanel, null);
		personPanel.setLayout(null);
		
		JPanel personSearchPanel = new JPanel();
		personSearchPanel.setLayout(null);
		personSearchPanel.setBackground(Color.DARK_GRAY);
		personSearchPanel.setBounds(0, 0, 679, 71);
		personPanel.add(personSearchPanel);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Person", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(174, 11, 331, 49);
		personSearchPanel.add(panel_13);
		GridBagLayout gbl_panel_13 = new GridBagLayout();
		gbl_panel_13.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_13.rowHeights = new int[]{0, 0};
		gbl_panel_13.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_13.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_13.setLayout(gbl_panel_13);
		
		JLabel lblIndtastTelefonnr = new JLabel("Indtast telefonnr.");
		lblIndtastTelefonnr.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIndtastTelefonnr = new GridBagConstraints();
		gbc_lblIndtastTelefonnr.insets = new Insets(0, 0, 0, 5);
		gbc_lblIndtastTelefonnr.gridx = 0;
		gbc_lblIndtastTelefonnr.gridy = 0;
		panel_13.add(lblIndtastTelefonnr, gbc_lblIndtastTelefonnr);
		
		personSeachInputField = new JTextField();
		personSeachInputField.setColumns(10);
		GridBagConstraints gbc_personSeachInputField = new GridBagConstraints();
		gbc_personSeachInputField.fill = GridBagConstraints.HORIZONTAL;
		gbc_personSeachInputField.insets = new Insets(0, 0, 0, 5);
		gbc_personSeachInputField.gridx = 1;
		gbc_personSeachInputField.gridy = 0;
		panel_13.add(personSeachInputField, gbc_personSeachInputField);
		
		JButton personSeachBtn = new JButton("Find");
		personSeachBtn.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				personReturn = getPerson(personSeachInputField.getText());
				personReturnName.setText(personReturn.getName());
				personReturnAddress.setText(personReturn.getAddress());
				personReturnCity.setText(personReturn.getCity());
				personReturnZip.setText(personReturn.getPostalCode());
				personReturnPhone.setText(personReturn.getPhone());
			}

			private Person getPerson(String phone) {
				return orderController.getPerson(phone);
			}
		});
		GridBagConstraints gbc_personSeachBtn = new GridBagConstraints();
		gbc_personSeachBtn.gridx = 2;
		gbc_personSeachBtn.gridy = 0;
		panel_13.add(personSeachBtn, gbc_personSeachBtn);
		
		JButton personBackBtn = new JButton("Tilbage");
		personBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		personBackBtn.setBounds(10, 278, 89, 23);
		personPanel.add(personBackBtn);
		
		JButton personCancelBtn = new JButton("Ryd");
		personCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				personEmployeeName.setText("");
				personEmployeeAddress.setText("");
				personEmployeeCity.setText("");
				personEmployeeZip.setText("");
				personEmployeePhone.setText("");
				
				personCustomerName.setText("");
				personCustomerAddress.setText("");
				personCustomerCity.setText("");
				personCustomerZip.setText("");
				personCustomerPhone.setText("");
				
			}
		});
		personCancelBtn.setBounds(481, 278, 89, 23);
		personPanel.add(personCancelBtn);
		
		JButton personConfirmBtn = new JButton("Tilf\u00F8j til Salg");
		personConfirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				/*createEmployeeName.setText(employee.getName());
				createEmployeeAddress.setText(employee.getAddress());
				createEmployeeCity.setText(employee.getCity());
				createEmployeeZip.setText(employee.getPostalCode());
				createEmployeePhone.setText(employee.getPhone());
				
				createCustomerName.setText(customer.getName());
				createCustomerAddress.setText(customer.getAddress());
				createCustomerCity.setText(customer.getCity());
				createCustomerZip.setText(customer.getPostalCode());
				createCustomerPhone.setText(customer.getPhone());
				
				updateEmployeeName.setText(employee.getName());
				updateEmployeeAddress.setText(employee.getAddress());
				updateEmployeeCity.setText(employee.getCity());
				updateEmployeeZip.setText(employee.getPostalCode());
				updateEmployeePhone.setText(employee.getPhone());
				
				updateCustomerName.setText(customer.getName());
				updateCustomerAddress.setText(customer.getAddress());
				updateCustomerCity.setText(customer.getCity());
				updateCustomerZip.setText(customer.getPostalCode());
				updateCustomerPhone.setText(customer.getPhone());*/
				
				
				
				createEmployeeName.setText(personEmployeeName.getText());
				createEmployeeAddress.setText(personEmployeeAddress.getText());
				createEmployeeCity.setText(personEmployeeCity.getText());
				createEmployeeZip.setText(personEmployeeZip.getText());
				createEmployeePhone.setText(personEmployeePhone.getText());
				
				createCustomerName.setText(personCustomerName.getText());
				createCustomerAddress.setText(personCustomerAddress.getText());
				createCustomerCity.setText(personCustomerCity.getText());
				createCustomerZip.setText(personCustomerZip.getText());
				createCustomerPhone.setText(personCustomerPhone.getText());
				
				updateEmployeeName.setText(personEmployeeName.getText());
				updateEmployeeAddress.setText(personEmployeeAddress.getText());
				updateEmployeeCity.setText(personEmployeeCity.getText());
				updateEmployeeZip.setText(personEmployeeZip.getText());
				updateEmployeePhone.setText(personEmployeePhone.getText());
				
				updateCustomerName.setText(personCustomerName.getText());
				updateCustomerAddress.setText(personCustomerAddress.getText());
				updateCustomerCity.setText(personCustomerCity.getText());
				updateCustomerZip.setText(personCustomerZip.getText());
				updateCustomerPhone.setText(personCustomerPhone.getText());
				
			}
		});
		personConfirmBtn.setBounds(580, 278, 89, 23);
		personPanel.add(personConfirmBtn);
		
		JPanel personEmployeePanel = new JPanel();
		personEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		personEmployeePanel.setBounds(285, 82, 187, 185);
		personPanel.add(personEmployeePanel);
		GridBagLayout gbl_personEmployeePanel = new GridBagLayout();
		gbl_personEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_personEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_personEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_personEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		personEmployeePanel.setLayout(gbl_personEmployeePanel);
		
		JLabel label_8 = new JLabel("Navn");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 0;
		personEmployeePanel.add(label_8, gbc_label_8);
		
		personEmployeeName = new JTextField();
		personEmployeeName.setEditable(false);
		personEmployeeName.setColumns(10);
		GridBagConstraints gbc_personEmployeeName = new GridBagConstraints();
		gbc_personEmployeeName.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeeName.insets = new Insets(0, 0, 5, 0);
		gbc_personEmployeeName.gridx = 1;
		gbc_personEmployeeName.gridy = 0;
		personEmployeePanel.add(personEmployeeName, gbc_personEmployeeName);
		
		JLabel label_9 = new JLabel("Adresse");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 1;
		personEmployeePanel.add(label_9, gbc_label_9);
		
		personEmployeeAddress = new JTextField();
		personEmployeeAddress.setEditable(false);
		personEmployeeAddress.setColumns(10);
		GridBagConstraints gbc_personEmployeeAddress = new GridBagConstraints();
		gbc_personEmployeeAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeeAddress.insets = new Insets(0, 0, 5, 0);
		gbc_personEmployeeAddress.gridx = 1;
		gbc_personEmployeeAddress.gridy = 1;
		personEmployeePanel.add(personEmployeeAddress, gbc_personEmployeeAddress);
		
		JLabel label_10 = new JLabel("By");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 2;
		personEmployeePanel.add(label_10, gbc_label_10);
		
		personEmployeeCity = new JTextField();
		personEmployeeCity.setEditable(false);
		personEmployeeCity.setColumns(10);
		GridBagConstraints gbc_personEmployeeCity = new GridBagConstraints();
		gbc_personEmployeeCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeeCity.insets = new Insets(0, 0, 5, 0);
		gbc_personEmployeeCity.gridx = 1;
		gbc_personEmployeeCity.gridy = 2;
		personEmployeePanel.add(personEmployeeCity, gbc_personEmployeeCity);
		
		JLabel label_11 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 3;
		personEmployeePanel.add(label_11, gbc_label_11);
		
		personEmployeeZip = new JTextField();
		personEmployeeZip.setEditable(false);
		personEmployeeZip.setColumns(10);
		GridBagConstraints gbc_personEmployeeZip = new GridBagConstraints();
		gbc_personEmployeeZip.insets = new Insets(0, 0, 5, 0);
		gbc_personEmployeeZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeeZip.gridx = 1;
		gbc_personEmployeeZip.gridy = 3;
		personEmployeePanel.add(personEmployeeZip, gbc_personEmployeeZip);
		
		JLabel label_23 = new JLabel("Telefon");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.anchor = GridBagConstraints.WEST;
		gbc_label_23.insets = new Insets(0, 0, 0, 5);
		gbc_label_23.gridx = 0;
		gbc_label_23.gridy = 4;
		personEmployeePanel.add(label_23, gbc_label_23);
		
		personEmployeePhone = new JTextField();
		personEmployeePhone.setEditable(false);
		personEmployeePhone.setColumns(10);
		GridBagConstraints gbc_personEmployeePhone = new GridBagConstraints();
		gbc_personEmployeePhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeePhone.gridx = 1;
		gbc_personEmployeePhone.gridy = 4;
		personEmployeePanel.add(personEmployeePhone, gbc_personEmployeePhone);
		
		JPanel personCustomerPanel = new JPanel();
		personCustomerPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		personCustomerPanel.setBounds(482, 82, 187, 185);
		personPanel.add(personCustomerPanel);
		GridBagLayout gbl_personCustomerPanel = new GridBagLayout();
		gbl_personCustomerPanel.columnWidths = new int[]{0, 0, 0};
		gbl_personCustomerPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_personCustomerPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_personCustomerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		personCustomerPanel.setLayout(gbl_personCustomerPanel);
		
		JLabel label_12 = new JLabel("Navn");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.WEST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 0;
		personCustomerPanel.add(label_12, gbc_label_12);
		
		personCustomerName = new JTextField();
		personCustomerName.setEditable(false);
		personCustomerName.setColumns(10);
		GridBagConstraints gbc_personCustomerName = new GridBagConstraints();
		gbc_personCustomerName.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerName.insets = new Insets(0, 0, 5, 0);
		gbc_personCustomerName.gridx = 1;
		gbc_personCustomerName.gridy = 0;
		personCustomerPanel.add(personCustomerName, gbc_personCustomerName);
		
		JLabel label_13 = new JLabel("Adresse");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.WEST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 1;
		personCustomerPanel.add(label_13, gbc_label_13);
		
		personCustomerAddress = new JTextField();
		personCustomerAddress.setEditable(false);
		personCustomerAddress.setColumns(10);
		GridBagConstraints gbc_personCustomerAddress = new GridBagConstraints();
		gbc_personCustomerAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerAddress.insets = new Insets(0, 0, 5, 0);
		gbc_personCustomerAddress.gridx = 1;
		gbc_personCustomerAddress.gridy = 1;
		personCustomerPanel.add(personCustomerAddress, gbc_personCustomerAddress);
		
		JLabel label_14 = new JLabel("By");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.WEST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 2;
		personCustomerPanel.add(label_14, gbc_label_14);
		
		personCustomerCity = new JTextField();
		personCustomerCity.setEditable(false);
		personCustomerCity.setColumns(10);
		GridBagConstraints gbc_personCustomerCity = new GridBagConstraints();
		gbc_personCustomerCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerCity.insets = new Insets(0, 0, 5, 0);
		gbc_personCustomerCity.gridx = 1;
		gbc_personCustomerCity.gridy = 2;
		personCustomerPanel.add(personCustomerCity, gbc_personCustomerCity);
		
		JLabel label_15 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.WEST;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 3;
		personCustomerPanel.add(label_15, gbc_label_15);
		
		personCustomerZip = new JTextField();
		personCustomerZip.setEditable(false);
		personCustomerZip.setColumns(10);
		GridBagConstraints gbc_personCustomerZip = new GridBagConstraints();
		gbc_personCustomerZip.insets = new Insets(0, 0, 5, 0);
		gbc_personCustomerZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerZip.gridx = 1;
		gbc_personCustomerZip.gridy = 3;
		personCustomerPanel.add(personCustomerZip, gbc_personCustomerZip);
		
		JLabel label_24 = new JLabel("Telefon");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.anchor = GridBagConstraints.WEST;
		gbc_label_24.insets = new Insets(0, 0, 0, 5);
		gbc_label_24.gridx = 0;
		gbc_label_24.gridy = 4;
		personCustomerPanel.add(label_24, gbc_label_24);
		
		personCustomerPhone = new JTextField();
		personCustomerPhone.setEditable(false);
		personCustomerPhone.setColumns(10);
		GridBagConstraints gbc_personCustomerPhone = new GridBagConstraints();
		gbc_personCustomerPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerPhone.gridx = 1;
		gbc_personCustomerPhone.gridy = 4;
		personCustomerPanel.add(personCustomerPhone, gbc_personCustomerPhone);
		
		JPanel personReturnPanel = new JPanel();
		personReturnPanel.setBorder(new TitledBorder(null, "Person Fundet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		personReturnPanel.setBounds(10, 82, 265, 185);
		personPanel.add(personReturnPanel);
		GridBagLayout gbl_personReturnPanel = new GridBagLayout();
		gbl_personReturnPanel.columnWidths = new int[]{0, 0, 0};
		gbl_personReturnPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_personReturnPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_personReturnPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		personReturnPanel.setLayout(gbl_personReturnPanel);
		
		JLabel label_16 = new JLabel("Navn");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.WEST;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 0;
		gbc_label_16.gridy = 0;
		personReturnPanel.add(label_16, gbc_label_16);
		
		personReturnName = new JTextField();
		personReturnName.setEditable(false);
		personReturnName.setColumns(10);
		GridBagConstraints gbc_personReturnName = new GridBagConstraints();
		gbc_personReturnName.fill = GridBagConstraints.HORIZONTAL;
		gbc_personReturnName.insets = new Insets(0, 0, 5, 0);
		gbc_personReturnName.gridx = 1;
		gbc_personReturnName.gridy = 0;
		personReturnPanel.add(personReturnName, gbc_personReturnName);
		
		JLabel label_17 = new JLabel("Adresse");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.anchor = GridBagConstraints.WEST;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 0;
		gbc_label_17.gridy = 1;
		personReturnPanel.add(label_17, gbc_label_17);
		
		personReturnAddress = new JTextField();
		personReturnAddress.setEditable(false);
		personReturnAddress.setColumns(10);
		GridBagConstraints gbc_personReturnAddress = new GridBagConstraints();
		gbc_personReturnAddress.insets = new Insets(0, 0, 5, 0);
		gbc_personReturnAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_personReturnAddress.gridx = 1;
		gbc_personReturnAddress.gridy = 1;
		personReturnPanel.add(personReturnAddress, gbc_personReturnAddress);
		
		JLabel label_18 = new JLabel("By");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.WEST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 0;
		gbc_label_18.gridy = 2;
		personReturnPanel.add(label_18, gbc_label_18);
		
		personReturnCity = new JTextField();
		personReturnCity.setEditable(false);
		personReturnCity.setColumns(10);
		GridBagConstraints gbc_personReturnCity = new GridBagConstraints();
		gbc_personReturnCity.insets = new Insets(0, 0, 5, 0);
		gbc_personReturnCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_personReturnCity.gridx = 1;
		gbc_personReturnCity.gridy = 2;
		personReturnPanel.add(personReturnCity, gbc_personReturnCity);
		
		JLabel label_19 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.anchor = GridBagConstraints.WEST;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 0;
		gbc_label_19.gridy = 3;
		personReturnPanel.add(label_19, gbc_label_19);
		
		personReturnZip = new JTextField();
		personReturnZip.setEditable(false);
		personReturnZip.setColumns(10);
		GridBagConstraints gbc_personReturnZip = new GridBagConstraints();
		gbc_personReturnZip.insets = new Insets(0, 0, 5, 0);
		gbc_personReturnZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_personReturnZip.gridx = 1;
		gbc_personReturnZip.gridy = 3;
		personReturnPanel.add(personReturnZip, gbc_personReturnZip);
		
		JButton personAddEmployee = new JButton("Tilf\u00F8j Medarbejder");
		personAddEmployee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				employee = personReturn;
				personEmployeeName.setText(employee.getName());
				personEmployeeAddress.setText(employee.getAddress());
				personEmployeeCity.setText(employee.getCity());
				personEmployeeZip.setText(employee.getPostalCode());
				personEmployeePhone.setText(employee.getPhone());
			}
		});
		
		JLabel lblTelefon_1 = new JLabel("Telefon");
		GridBagConstraints gbc_lblTelefon_1 = new GridBagConstraints();
		gbc_lblTelefon_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefon_1.anchor = GridBagConstraints.WEST;
		gbc_lblTelefon_1.gridx = 0;
		gbc_lblTelefon_1.gridy = 4;
		personReturnPanel.add(lblTelefon_1, gbc_lblTelefon_1);
		
		personReturnPhone = new JTextField();
		personReturnPhone.setEditable(false);
		personReturnPhone.setColumns(10);
		GridBagConstraints gbc_personReturnPhone = new GridBagConstraints();
		gbc_personReturnPhone.insets = new Insets(0, 0, 5, 0);
		gbc_personReturnPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_personReturnPhone.gridx = 1;
		gbc_personReturnPhone.gridy = 4;
		personReturnPanel.add(personReturnPhone, gbc_personReturnPhone);
		GridBagConstraints gbc_personAddEmployee = new GridBagConstraints();
		gbc_personAddEmployee.fill = GridBagConstraints.HORIZONTAL;
		gbc_personAddEmployee.insets = new Insets(0, 0, 0, 5);
		gbc_personAddEmployee.gridx = 0;
		gbc_personAddEmployee.gridy = 5;
		personReturnPanel.add(personAddEmployee, gbc_personAddEmployee);
		
		JButton personAddCustomer = new JButton("Tilf\u00F8j Kunde");
		personAddCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				customer = personReturn;
				personCustomerName.setText(customer.getName());
				personCustomerAddress.setText(customer.getAddress());
				personCustomerCity.setText(customer.getCity());
				personCustomerZip.setText(customer.getPostalCode());
				personCustomerPhone.setText(customer.getPhone());
			}
		});
		GridBagConstraints gbc_personAddCustomer = new GridBagConstraints();
		gbc_personAddCustomer.fill = GridBagConstraints.HORIZONTAL;
		gbc_personAddCustomer.gridx = 1;
		gbc_personAddCustomer.gridy = 5;
		personReturnPanel.add(personAddCustomer, gbc_personAddCustomer);
		
		JPanel productPanel = new JPanel();
		tabbedPane.addTab("Tilf\u00F8j Produkter", null, productPanel, null);
		productPanel.setLayout(null);
		
		JPanel productSearchPanel = new JPanel();
		productSearchPanel.setLayout(null);
		productSearchPanel.setBackground(Color.DARK_GRAY);
		productSearchPanel.setBounds(0, 0, 679, 71);
		productPanel.add(productSearchPanel);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_18.setBackground(Color.DARK_GRAY);
		panel_18.setBounds(174, 11, 331, 49);
		productSearchPanel.add(panel_18);
		GridBagLayout gbl_panel_18 = new GridBagLayout();
		gbl_panel_18.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_18.rowHeights = new int[]{0, 0};
		gbl_panel_18.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_18.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_18.setLayout(gbl_panel_18);
		
		JLabel lblIndtastStregkode = new JLabel("Indtast stregkode");
		lblIndtastStregkode.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIndtastStregkode = new GridBagConstraints();
		gbc_lblIndtastStregkode.insets = new Insets(0, 0, 0, 5);
		gbc_lblIndtastStregkode.gridx = 0;
		gbc_lblIndtastStregkode.gridy = 0;
		panel_18.add(lblIndtastStregkode, gbc_lblIndtastStregkode);
		
		productSearchInputField = new JTextField();
		productSearchInputField.setColumns(10);
		GridBagConstraints gbc_productSearchInputField = new GridBagConstraints();
		gbc_productSearchInputField.fill = GridBagConstraints.HORIZONTAL;
		gbc_productSearchInputField.insets = new Insets(0, 0, 0, 5);
		gbc_productSearchInputField.gridx = 1;
		gbc_productSearchInputField.gridy = 0;
		panel_18.add(productSearchInputField, gbc_productSearchInputField);
		
		JButton productSearchBtn = new JButton("Find");
		productSearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				productReturn = getProduct(productSearchInputField.getText());
				
				productReturnBarcode.setText(productReturn.getBarcode());
				productReturnTitle.setText(productReturn.getTitle());
				productReturnDesc.setText(productReturn.getDescription());
				productReturnPrice.setText(String.valueOf(productReturn.getPrice()));
				productReturnStock.setText(String.valueOf(productReturn.getAmount()));
				productReturnSlider.setMaximum(productReturn.getAmount());
			}

			private Product getProduct(String barcode) {
				return orderController.getProduct(barcode);
			}
		});
		GridBagConstraints gbc_productSearchBtn = new GridBagConstraints();
		gbc_productSearchBtn.gridx = 2;
		gbc_productSearchBtn.gridy = 0;
		panel_18.add(productSearchBtn, gbc_productSearchBtn);
		
		JButton productBackBtn = new JButton("Tilbage");
		productBackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		productBackBtn.setBounds(10, 278, 89, 23);
		productPanel.add(productBackBtn);
		
		JButton productCancelBtn = new JButton("Ryd");
		productCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emptyTable(productProductTab);
				tmp = new HashMap<>();
			}
		});
		productCancelBtn.setBounds(481, 278, 89, 23);
		productPanel.add(productCancelBtn);
		
		JButton productConfirmBtn = new JButton("Tilf\u00F8j til Salg");
		productConfirmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				barcodes = tmp;
				
				tmp = new HashMap<String, Integer>();
				
//				emptyTable(createProductTab);
//				
//				emptyTable(updateProductTab);
//				
//				int c = productProductTab.getRowCount();
//				
//				for(int i = 0; i < c; i++) {
//					createProductTab.addRow(new Object[]{productProductTab.getValueAt(i, 0), productProductTab.getValueAt(i, 1), productProductTab.getValueAt(i, 2), productProductTab.getValueAt(i, 3)});
//					updateProductTab.addRow(new Object[]{productProductTab.getValueAt(i, 0), productProductTab.getValueAt(i, 1), productProductTab.getValueAt(i, 2), productProductTab.getValueAt(i, 3)});
//				}				
				
				createProductTab.setDataVector(productProductTab.getDataVector(), columnIdentifiers);
				updateProductTab.setDataVector(productProductTab.getDataVector(), columnIdentifiers);
				
			}
		});
		productConfirmBtn.setBounds(580, 278, 89, 23);
		productPanel.add(productConfirmBtn);
		
		JPanel productReturnPanel = new JPanel();
		productReturnPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Produkt Fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		productReturnPanel.setBounds(10, 82, 265, 185);
		productPanel.add(productReturnPanel);
		GridBagLayout gbl_productReturnPanel = new GridBagLayout();
		gbl_productReturnPanel.columnWidths = new int[]{0, 0, 0};
		gbl_productReturnPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_productReturnPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_productReturnPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		productReturnPanel.setLayout(gbl_productReturnPanel);
		
		JLabel lblStregkode = new JLabel("Stregkode");
		GridBagConstraints gbc_lblStregkode = new GridBagConstraints();
		gbc_lblStregkode.anchor = GridBagConstraints.WEST;
		gbc_lblStregkode.insets = new Insets(0, 0, 5, 5);
		gbc_lblStregkode.gridx = 0;
		gbc_lblStregkode.gridy = 0;
		productReturnPanel.add(lblStregkode, gbc_lblStregkode);
		
		productReturnBarcode = new JTextField();
		productReturnBarcode.setEditable(false);
		GridBagConstraints gbc_productReturnBarcode = new GridBagConstraints();
		gbc_productReturnBarcode.insets = new Insets(0, 0, 5, 0);
		gbc_productReturnBarcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_productReturnBarcode.gridx = 1;
		gbc_productReturnBarcode.gridy = 0;
		productReturnPanel.add(productReturnBarcode, gbc_productReturnBarcode);
		productReturnBarcode.setColumns(10);
		
		JLabel lblTitel = new JLabel("Titel");
		GridBagConstraints gbc_lblTitel = new GridBagConstraints();
		gbc_lblTitel.anchor = GridBagConstraints.WEST;
		gbc_lblTitel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitel.gridx = 0;
		gbc_lblTitel.gridy = 1;
		productReturnPanel.add(lblTitel, gbc_lblTitel);
		
		productReturnTitle = new JTextField();
		productReturnTitle.setEditable(false);
		GridBagConstraints gbc_productReturnTitle = new GridBagConstraints();
		gbc_productReturnTitle.insets = new Insets(0, 0, 5, 0);
		gbc_productReturnTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_productReturnTitle.gridx = 1;
		gbc_productReturnTitle.gridy = 1;
		productReturnPanel.add(productReturnTitle, gbc_productReturnTitle);
		productReturnTitle.setColumns(10);
		
		JLabel lblBeskrivelse = new JLabel("Beskrivelse");
		GridBagConstraints gbc_lblBeskrivelse = new GridBagConstraints();
		gbc_lblBeskrivelse.anchor = GridBagConstraints.WEST;
		gbc_lblBeskrivelse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeskrivelse.gridx = 0;
		gbc_lblBeskrivelse.gridy = 2;
		productReturnPanel.add(lblBeskrivelse, gbc_lblBeskrivelse);
		
		productReturnDesc = new JTextField();
		productReturnDesc.setEditable(false);
		GridBagConstraints gbc_productReturnDesc = new GridBagConstraints();
		gbc_productReturnDesc.insets = new Insets(0, 0, 5, 0);
		gbc_productReturnDesc.fill = GridBagConstraints.BOTH;
		gbc_productReturnDesc.gridx = 1;
		gbc_productReturnDesc.gridy = 2;
		productReturnPanel.add(productReturnDesc, gbc_productReturnDesc);
		productReturnDesc.setColumns(10);
		
		JButton btnTilfjProdukt = new JButton("Tilf\u00F8j");
		btnTilfjProdukt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String lineTotal = String.valueOf(productReturn.getPrice() * (productReturnSlider.getValue()));
				productProductTab.addRow(new Object[]{productReturnTitle.getText(), productReturnSlider.getValue(), productReturnPrice.getText(), lineTotal});
				
				tmp.put(productReturn.getBarcode(), (productReturnSlider.getValue()));
				productReturnStock.setText(String.valueOf(productReturn.getAmount() - productReturnSlider.getValue()));
				productReturnSlider.setMaximum(productReturn.getAmount() - productReturnSlider.getValue());
			}
		});
		
		JLabel lblPris = new JLabel("Pris");
		GridBagConstraints gbc_lblPris = new GridBagConstraints();
		gbc_lblPris.anchor = GridBagConstraints.WEST;
		gbc_lblPris.insets = new Insets(0, 0, 5, 5);
		gbc_lblPris.gridx = 0;
		gbc_lblPris.gridy = 3;
		productReturnPanel.add(lblPris, gbc_lblPris);
		
		productReturnPrice = new JTextField();
		productReturnPrice.setEditable(false);
		GridBagConstraints gbc_productReturnPrice = new GridBagConstraints();
		gbc_productReturnPrice.insets = new Insets(0, 0, 5, 0);
		gbc_productReturnPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_productReturnPrice.gridx = 1;
		gbc_productReturnPrice.gridy = 3;
		productReturnPanel.add(productReturnPrice, gbc_productReturnPrice);
		productReturnPrice.setColumns(10);
		
		JLabel lblAntal = new JLabel("Lagerbeholdning");
		GridBagConstraints gbc_lblAntal = new GridBagConstraints();
		gbc_lblAntal.anchor = GridBagConstraints.WEST;
		gbc_lblAntal.insets = new Insets(0, 0, 5, 5);
		gbc_lblAntal.gridx = 0;
		gbc_lblAntal.gridy = 4;
		productReturnPanel.add(lblAntal, gbc_lblAntal);		
		
		productReturnStock = new JTextField();
		productReturnStock.setEditable(false);
		GridBagConstraints gbc_productReturnStock = new GridBagConstraints();
		gbc_productReturnStock.insets = new Insets(0, 0, 5, 0);
		gbc_productReturnStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_productReturnStock.gridx = 1;
		gbc_productReturnStock.gridy = 4;
		productReturnPanel.add(productReturnStock, gbc_productReturnStock);
		productReturnStock.setColumns(10);
		GridBagConstraints gbc_btnTilfjProdukt = new GridBagConstraints();
		gbc_btnTilfjProdukt.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTilfjProdukt.insets = new Insets(0, 0, 0, 5);
		gbc_btnTilfjProdukt.gridx = 0;
		gbc_btnTilfjProdukt.gridy = 5;
		productReturnPanel.add(btnTilfjProdukt, gbc_btnTilfjProdukt);
		
		productReturnSlider = new JSlider();
		productReturnSlider.setPaintLabels(true);
		productReturnSlider.setMinimum(1);
		productReturnSlider.setSnapToTicks(true);
		GridBagConstraints gbc_productReturnSlider = new GridBagConstraints();
		gbc_productReturnSlider.fill = GridBagConstraints.HORIZONTAL;
		gbc_productReturnSlider.gridx = 1;
		gbc_productReturnSlider.gridy = 5;
		productReturnPanel.add(productReturnSlider, gbc_productReturnSlider);
		
		JPanel productProductPanel = new JPanel();
		productProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		productProductPanel.setBounds(285, 82, 384, 185);
		productPanel.add(productProductPanel);
		productProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		productProductPanel.add(scrollPane_2, BorderLayout.CENTER);
		
		productProductTable = new JTable();
		scrollPane_2.setViewportView(productProductTable);
		productProductTable.setModel(productProductTab);
	}
	
	//Empty/reset table
	private void emptyTable(DefaultTableModel table) {
		int c = table.getRowCount();	
		for(int i = c; 0 < i; i--) {
			table.removeRow(i - 1);
		}
	}
}
