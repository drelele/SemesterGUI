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
import java.awt.event.ActionEvent;

public class OrderGUI4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtKim;
	private JTextField txtLemvigvej;
	private JTextField txtAalborg;
	private JTextField textField_3;
	private JTextField txtLars;
	private JTextField txtLemvigvej_1;
	private JTextField txtAalborg_1;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTable table;
	private static DefaultTableModel tab;
	private JTable table_1;
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
	private JTextField textField_24;
	private JTable table_2;
	private JTextField textField_25;
	private JTextField txtProdukt;
	private JTextField txtProduktEr;
	
	private Person personReturn;
	private Person employee;
	private Person customer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					OrderGUI4 frame = new OrderGUI4();
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
	public OrderGUI4() {
		tab = new DefaultTableModel();
        String[] columNames = {"Produkt Navn","Antal","Stk. Pris","Samlet Pris"};
        for (String string: columNames) {
            tab.addColumn(string);
        }
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
		createBackBtn.setBounds(10, 278, 89, 23);
		createPanel.add(createBackBtn);
		
		JButton createConfirmBtn = new JButton("Bekr\u00E6ft");
		createConfirmBtn.setBounds(580, 278, 89, 23);
		createPanel.add(createConfirmBtn);
		
		JButton createCancelBtn = new JButton("Annuller");
		createCancelBtn.setBounds(481, 278, 89, 23);
		createPanel.add(createCancelBtn);
		
		JPanel createEmployeePanel = new JPanel();
		createEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createEmployeePanel.setBounds(10, 11, 187, 256);
		createPanel.add(createEmployeePanel);
		GridBagLayout gbl_createEmployeePanel = new GridBagLayout();
		gbl_createEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_createEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_createEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_createEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		createEmployeePanel.setLayout(gbl_createEmployeePanel);
		
		JLabel lblNewLabel = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		createEmployeePanel.add(lblNewLabel, gbc_lblNewLabel);
		
		txtKim = new JTextField();
		txtKim.setText("Kim");
		txtKim.setEditable(false);
		GridBagConstraints gbc_txtKim = new GridBagConstraints();
		gbc_txtKim.insets = new Insets(0, 0, 5, 0);
		gbc_txtKim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtKim.gridx = 1;
		gbc_txtKim.gridy = 0;
		createEmployeePanel.add(txtKim, gbc_txtKim);
		txtKim.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		createEmployeePanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtLemvigvej = new JTextField();
		txtLemvigvej.setText("Lemvigvej 4");
		txtLemvigvej.setEditable(false);
		GridBagConstraints gbc_txtLemvigvej = new GridBagConstraints();
		gbc_txtLemvigvej.insets = new Insets(0, 0, 5, 0);
		gbc_txtLemvigvej.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLemvigvej.gridx = 1;
		gbc_txtLemvigvej.gridy = 1;
		createEmployeePanel.add(txtLemvigvej, gbc_txtLemvigvej);
		txtLemvigvej.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		createEmployeePanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtAalborg = new JTextField();
		txtAalborg.setText("Aalborg");
		txtAalborg.setEditable(false);
		GridBagConstraints gbc_txtAalborg = new GridBagConstraints();
		gbc_txtAalborg.insets = new Insets(0, 0, 5, 0);
		gbc_txtAalborg.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAalborg.gridx = 1;
		gbc_txtAalborg.gridy = 2;
		createEmployeePanel.add(txtAalborg, gbc_txtAalborg);
		txtAalborg.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		createEmployeePanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("9000");
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		createEmployeePanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JPanel createPersonPanel = new JPanel();
		createPersonPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createPersonPanel.setBounds(207, 11, 187, 256);
		createPanel.add(createPersonPanel);
		GridBagLayout gbl_createPersonPanel = new GridBagLayout();
		gbl_createPersonPanel.columnWidths = new int[]{0, 0, 0};
		gbl_createPersonPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_createPersonPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_createPersonPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		createPersonPanel.setLayout(gbl_createPersonPanel);
		
		JLabel lblNewLabel_4 = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		createPersonPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtLars = new JTextField();
		txtLars.setText("Lars");
		txtLars.setEditable(false);
		GridBagConstraints gbc_txtLars = new GridBagConstraints();
		gbc_txtLars.insets = new Insets(0, 0, 5, 0);
		gbc_txtLars.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLars.gridx = 1;
		gbc_txtLars.gridy = 0;
		createPersonPanel.add(txtLars, gbc_txtLars);
		txtLars.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 1;
		createPersonPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtLemvigvej_1 = new JTextField();
		txtLemvigvej_1.setText("Lemvigvej 5");
		txtLemvigvej_1.setEditable(false);
		GridBagConstraints gbc_txtLemvigvej_1 = new GridBagConstraints();
		gbc_txtLemvigvej_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtLemvigvej_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLemvigvej_1.gridx = 1;
		gbc_txtLemvigvej_1.gridy = 1;
		createPersonPanel.add(txtLemvigvej_1, gbc_txtLemvigvej_1);
		txtLemvigvej_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 2;
		createPersonPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtAalborg_1 = new JTextField();
		txtAalborg_1.setText("Aalborg");
		txtAalborg_1.setEditable(false);
		GridBagConstraints gbc_txtAalborg_1 = new GridBagConstraints();
		gbc_txtAalborg_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtAalborg_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAalborg_1.gridx = 1;
		gbc_txtAalborg_1.gridy = 2;
		createPersonPanel.add(txtAalborg_1, gbc_txtAalborg_1);
		txtAalborg_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 3;
		createPersonPanel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setText("9000");
		textField_7.setEditable(false);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 3;
		createPersonPanel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JPanel createProductPanel = new JPanel();
		createProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		createProductPanel.setBounds(404, 11, 265, 256);
		createPanel.add(createProductPanel);
		createProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		createProductPanel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(tab);
		
		JPanel updatePanel = new JPanel();
		tabbedPane.addTab("Find Salg", null, updatePanel, null);
		updatePanel.setLayout(null);
		
		JButton updateBackBtn = new JButton("Tilbage");
		updateBackBtn.setBounds(10, 278, 89, 23);
		updatePanel.add(updateBackBtn);
		
		JButton updateCancelBtn = new JButton("Annuller");
		updateCancelBtn.setBounds(481, 278, 89, 23);
		updatePanel.add(updateCancelBtn);
		
		JButton updateConfirmBtn = new JButton("Bekr\u00E6ft");
		updateConfirmBtn.setBounds(580, 278, 89, 23);
		updatePanel.add(updateConfirmBtn);
		
		JPanel updateEmployeePanel = new JPanel();
		updateEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateEmployeePanel.setBounds(10, 82, 187, 185);
		updatePanel.add(updateEmployeePanel);
		GridBagLayout gbl_updateEmployeePanel = new GridBagLayout();
		gbl_updateEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_updateEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_updateEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_updateEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		updateEmployeePanel.setLayout(gbl_updateEmployeePanel);
		
		JLabel label = new JLabel("Navn");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		updateEmployeePanel.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setText("Kim");
		textField.setEditable(false);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		updateEmployeePanel.add(textField, gbc_textField);
		
		JLabel label_1 = new JLabel("Adresse");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		updateEmployeePanel.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Lemvigvej 4");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		updateEmployeePanel.add(textField_1, gbc_textField_1);
		
		JLabel label_2 = new JLabel("By");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		updateEmployeePanel.add(label_2, gbc_label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("Aalborg");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		updateEmployeePanel.add(textField_2, gbc_textField_2);
		
		JLabel label_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 3;
		updateEmployeePanel.add(label_3, gbc_label_3);
		
		textField_4 = new JTextField();
		textField_4.setText("9000");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 3;
		updateEmployeePanel.add(textField_4, gbc_textField_4);
		
		JPanel updateCustomerPanel = new JPanel();
		updateCustomerPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateCustomerPanel.setBounds(207, 82, 187, 185);
		updatePanel.add(updateCustomerPanel);
		GridBagLayout gbl_updateCustomerPanel = new GridBagLayout();
		gbl_updateCustomerPanel.columnWidths = new int[]{0, 0, 0};
		gbl_updateCustomerPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_updateCustomerPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_updateCustomerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		updateCustomerPanel.setLayout(gbl_updateCustomerPanel);
		
		JLabel label_4 = new JLabel("Navn");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 0;
		updateCustomerPanel.add(label_4, gbc_label_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Lars");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 0;
		updateCustomerPanel.add(textField_5, gbc_textField_5);
		
		JLabel label_5 = new JLabel("Adresse");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 1;
		updateCustomerPanel.add(label_5, gbc_label_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Lemvigvej 5");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 1;
		updateCustomerPanel.add(textField_6, gbc_textField_6);
		
		JLabel label_6 = new JLabel("By");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 2;
		updateCustomerPanel.add(label_6, gbc_label_6);
		
		textField_9 = new JTextField();
		textField_9.setText("Aalborg");
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 2;
		updateCustomerPanel.add(textField_9, gbc_textField_9);
		
		JLabel label_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 3;
		updateCustomerPanel.add(label_7, gbc_label_7);
		
		textField_10 = new JTextField();
		textField_10.setText("9000");
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 3;
		updateCustomerPanel.add(textField_10, gbc_textField_10);
		
		JPanel updateProductPanel = new JPanel();
		updateProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		updateProductPanel.setBounds(407, 82, 262, 185);
		updatePanel.add(updateProductPanel);
		updateProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		updateProductPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(tab);
		
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
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.insets = new Insets(0, 0, 0, 5);
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 0;
		panel_11.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Find");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 0;
		panel_11.add(btnNewButton_3, gbc_btnNewButton_3);
		
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
			private OrderController orderController = new OrderController();

			@Override
			public void actionPerformed(ActionEvent e) {
				personReturn = getPerson(personSeachInputField.getText());
				personReturnName.setText(personReturn.getName());
				personReturnAddress.setText(personReturn.getAddress());
				personReturnCity.setText(personReturn.getCity());
				personReturnZip.setText(personReturn.getPostalCode());
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
		personBackBtn.setBounds(10, 278, 89, 23);
		personPanel.add(personBackBtn);
		
		JButton personCancelBtn = new JButton("Annuller");
		personCancelBtn.setBounds(481, 278, 89, 23);
		personPanel.add(personCancelBtn);
		
		JButton personConfirmBtn = new JButton("Bekr\u00E6ft");
		personConfirmBtn.setBounds(580, 278, 89, 23);
		personPanel.add(personConfirmBtn);
		
		JPanel personEmployeePanel = new JPanel();
		personEmployeePanel.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		personEmployeePanel.setBounds(285, 82, 187, 185);
		personPanel.add(personEmployeePanel);
		GridBagLayout gbl_personEmployeePanel = new GridBagLayout();
		gbl_personEmployeePanel.columnWidths = new int[]{0, 0, 0};
		gbl_personEmployeePanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_personEmployeePanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_personEmployeePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_label_11.insets = new Insets(0, 0, 0, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 3;
		personEmployeePanel.add(label_11, gbc_label_11);
		
		personEmployeeZip = new JTextField();
		personEmployeeZip.setEditable(false);
		personEmployeeZip.setColumns(10);
		GridBagConstraints gbc_personEmployeeZip = new GridBagConstraints();
		gbc_personEmployeeZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_personEmployeeZip.gridx = 1;
		gbc_personEmployeeZip.gridy = 3;
		personEmployeePanel.add(personEmployeeZip, gbc_personEmployeeZip);
		
		JPanel personCustomerPanel = new JPanel();
		personCustomerPanel.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		personCustomerPanel.setBounds(482, 82, 187, 185);
		personPanel.add(personCustomerPanel);
		GridBagLayout gbl_personCustomerPanel = new GridBagLayout();
		gbl_personCustomerPanel.columnWidths = new int[]{0, 0, 0};
		gbl_personCustomerPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_personCustomerPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_personCustomerPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_label_15.insets = new Insets(0, 0, 0, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 3;
		personCustomerPanel.add(label_15, gbc_label_15);
		
		personCustomerZip = new JTextField();
		personCustomerZip.setEditable(false);
		personCustomerZip.setColumns(10);
		GridBagConstraints gbc_personCustomerZip = new GridBagConstraints();
		gbc_personCustomerZip.fill = GridBagConstraints.HORIZONTAL;
		gbc_personCustomerZip.gridx = 1;
		gbc_personCustomerZip.gridy = 3;
		personCustomerPanel.add(personCustomerZip, gbc_personCustomerZip);
		
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
		gbc_label_16.fill = GridBagConstraints.HORIZONTAL;
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
			}
		});
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
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.insets = new Insets(0, 0, 0, 5);
		gbc_textField_24.gridx = 1;
		gbc_textField_24.gridy = 0;
		panel_18.add(textField_24, gbc_textField_24);
		
		JButton button_7 = new JButton("Find");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.gridx = 2;
		gbc_button_7.gridy = 0;
		panel_18.add(button_7, gbc_button_7);
		
		JButton productBackBtn = new JButton("Tilbage");
		productBackBtn.setBounds(10, 278, 89, 23);
		productPanel.add(productBackBtn);
		
		JButton productCancelBtn = new JButton("Annuller");
		productCancelBtn.setBounds(481, 278, 89, 23);
		productPanel.add(productCancelBtn);
		
		JButton productConfirmBtn = new JButton("Bekr\u00E6ft");
		productConfirmBtn.setBounds(580, 278, 89, 23);
		productPanel.add(productConfirmBtn);
		
		JPanel productReturnPanel = new JPanel();
		productReturnPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Produkt Fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		productReturnPanel.setBounds(10, 82, 265, 185);
		productPanel.add(productReturnPanel);
		GridBagLayout gbl_productReturnPanel = new GridBagLayout();
		gbl_productReturnPanel.columnWidths = new int[]{0, 0, 0};
		gbl_productReturnPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_productReturnPanel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_productReturnPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		productReturnPanel.setLayout(gbl_productReturnPanel);
		
		JLabel lblStregkode = new JLabel("Stregkode");
		GridBagConstraints gbc_lblStregkode = new GridBagConstraints();
		gbc_lblStregkode.anchor = GridBagConstraints.WEST;
		gbc_lblStregkode.insets = new Insets(0, 0, 5, 5);
		gbc_lblStregkode.gridx = 0;
		gbc_lblStregkode.gridy = 0;
		productReturnPanel.add(lblStregkode, gbc_lblStregkode);
		
		textField_25 = new JTextField();
		textField_25.setText("1");
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 0);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 1;
		gbc_textField_25.gridy = 0;
		productReturnPanel.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblTitel = new JLabel("Titel");
		GridBagConstraints gbc_lblTitel = new GridBagConstraints();
		gbc_lblTitel.anchor = GridBagConstraints.WEST;
		gbc_lblTitel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitel.gridx = 0;
		gbc_lblTitel.gridy = 1;
		productReturnPanel.add(lblTitel, gbc_lblTitel);
		
		txtProdukt = new JTextField();
		txtProdukt.setText("Produkt 1");
		GridBagConstraints gbc_txtProdukt = new GridBagConstraints();
		gbc_txtProdukt.insets = new Insets(0, 0, 5, 0);
		gbc_txtProdukt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProdukt.gridx = 1;
		gbc_txtProdukt.gridy = 1;
		productReturnPanel.add(txtProdukt, gbc_txtProdukt);
		txtProdukt.setColumns(10);
		
		JLabel lblBeskrivelse = new JLabel("Beskrivelse");
		GridBagConstraints gbc_lblBeskrivelse = new GridBagConstraints();
		gbc_lblBeskrivelse.anchor = GridBagConstraints.WEST;
		gbc_lblBeskrivelse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeskrivelse.gridx = 0;
		gbc_lblBeskrivelse.gridy = 2;
		productReturnPanel.add(lblBeskrivelse, gbc_lblBeskrivelse);
		
		txtProduktEr = new JTextField();
		txtProduktEr.setText("Produkt 1 er produkt 1");
		GridBagConstraints gbc_txtProduktEr = new GridBagConstraints();
		gbc_txtProduktEr.insets = new Insets(0, 0, 5, 0);
		gbc_txtProduktEr.fill = GridBagConstraints.BOTH;
		gbc_txtProduktEr.gridx = 1;
		gbc_txtProduktEr.gridy = 2;
		productReturnPanel.add(txtProduktEr, gbc_txtProduktEr);
		txtProduktEr.setColumns(10);
		
		JButton btnTilfjProdukt = new JButton("Tilf\u00F8j");
		GridBagConstraints gbc_btnTilfjProdukt = new GridBagConstraints();
		gbc_btnTilfjProdukt.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTilfjProdukt.gridwidth = 2;
		gbc_btnTilfjProdukt.gridx = 0;
		gbc_btnTilfjProdukt.gridy = 5;
		productReturnPanel.add(btnTilfjProdukt, gbc_btnTilfjProdukt);
		
		JPanel productProductPanel = new JPanel();
		productProductPanel.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		productProductPanel.setBounds(285, 82, 384, 185);
		productPanel.add(productProductPanel);
		productProductPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		productProductPanel.add(scrollPane_2, BorderLayout.CENTER);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(tab);
	}
}
