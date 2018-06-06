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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
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
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTable table_2;
	private JTextField textField_25;
	private JTextField txtProdukt;
	private JTextField txtProduktEr;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		setBounds(100, 100, 705, 399);
		
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Opret Salg", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Tilbage");
		btnNewButton.setBounds(10, 278, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bekr\u00E6ft");
		btnNewButton_1.setBounds(580, 278, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Annuller");
		btnNewButton_2.setBounds(481, 278, 89, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 11, 187, 256);
		panel.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_4.add(lblNewLabel, gbc_lblNewLabel);
		
		txtKim = new JTextField();
		txtKim.setText("Kim");
		txtKim.setEditable(false);
		GridBagConstraints gbc_txtKim = new GridBagConstraints();
		gbc_txtKim.insets = new Insets(0, 0, 5, 0);
		gbc_txtKim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtKim.gridx = 1;
		gbc_txtKim.gridy = 0;
		panel_4.add(txtKim, gbc_txtKim);
		txtKim.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_4.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtLemvigvej = new JTextField();
		txtLemvigvej.setText("Lemvigvej 4");
		txtLemvigvej.setEditable(false);
		GridBagConstraints gbc_txtLemvigvej = new GridBagConstraints();
		gbc_txtLemvigvej.insets = new Insets(0, 0, 5, 0);
		gbc_txtLemvigvej.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLemvigvej.gridx = 1;
		gbc_txtLemvigvej.gridy = 1;
		panel_4.add(txtLemvigvej, gbc_txtLemvigvej);
		txtLemvigvej.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_4.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtAalborg = new JTextField();
		txtAalborg.setText("Aalborg");
		txtAalborg.setEditable(false);
		GridBagConstraints gbc_txtAalborg = new GridBagConstraints();
		gbc_txtAalborg.insets = new Insets(0, 0, 5, 0);
		gbc_txtAalborg.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAalborg.gridx = 1;
		gbc_txtAalborg.gridy = 2;
		panel_4.add(txtAalborg, gbc_txtAalborg);
		txtAalborg.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel_4.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("9000");
		textField_3.setEditable(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel_4.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(207, 11, 187, 256);
		panel.add(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Navn");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		panel_5.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtLars = new JTextField();
		txtLars.setText("Lars");
		txtLars.setEditable(false);
		GridBagConstraints gbc_txtLars = new GridBagConstraints();
		gbc_txtLars.insets = new Insets(0, 0, 5, 0);
		gbc_txtLars.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLars.gridx = 1;
		gbc_txtLars.gridy = 0;
		panel_5.add(txtLars, gbc_txtLars);
		txtLars.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 1;
		panel_5.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtLemvigvej_1 = new JTextField();
		txtLemvigvej_1.setText("Lemvigvej 5");
		txtLemvigvej_1.setEditable(false);
		GridBagConstraints gbc_txtLemvigvej_1 = new GridBagConstraints();
		gbc_txtLemvigvej_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtLemvigvej_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLemvigvej_1.gridx = 1;
		gbc_txtLemvigvej_1.gridy = 1;
		panel_5.add(txtLemvigvej_1, gbc_txtLemvigvej_1);
		txtLemvigvej_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("By");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 2;
		panel_5.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtAalborg_1 = new JTextField();
		txtAalborg_1.setText("Aalborg");
		txtAalborg_1.setEditable(false);
		GridBagConstraints gbc_txtAalborg_1 = new GridBagConstraints();
		gbc_txtAalborg_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtAalborg_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAalborg_1.gridx = 1;
		gbc_txtAalborg_1.gridy = 2;
		panel_5.add(txtAalborg_1, gbc_txtAalborg_1);
		txtAalborg_1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 3;
		panel_5.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setText("9000");
		textField_7.setEditable(false);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 3;
		panel_5.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(404, 11, 265, 256);
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_6.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(tab);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Find Salg", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton button = new JButton("Tilbage");
		button.setBounds(10, 278, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Annuller");
		button_1.setBounds(481, 278, 89, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Bekr\u00E6ft");
		button_2.setBounds(580, 278, 89, 23);
		panel_1.add(button_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 82, 187, 185);
		panel_1.add(panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel label = new JLabel("Navn");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_7.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setText("Kim");
		textField.setEditable(false);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel_7.add(textField, gbc_textField);
		
		JLabel label_1 = new JLabel("Adresse");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel_7.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Lemvigvej 4");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_7.add(textField_1, gbc_textField_1);
		
		JLabel label_2 = new JLabel("By");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 2;
		panel_7.add(label_2, gbc_label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("Aalborg");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel_7.add(textField_2, gbc_textField_2);
		
		JLabel label_3 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 3;
		panel_7.add(label_3, gbc_label_3);
		
		textField_4 = new JTextField();
		textField_4.setText("9000");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 3;
		panel_7.add(textField_4, gbc_textField_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(207, 82, 187, 185);
		panel_1.add(panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JLabel label_4 = new JLabel("Navn");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 0;
		panel_8.add(label_4, gbc_label_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Lars");
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 0;
		panel_8.add(textField_5, gbc_textField_5);
		
		JLabel label_5 = new JLabel("Adresse");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 1;
		panel_8.add(label_5, gbc_label_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Lemvigvej 5");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 1;
		panel_8.add(textField_6, gbc_textField_6);
		
		JLabel label_6 = new JLabel("By");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 2;
		panel_8.add(label_6, gbc_label_6);
		
		textField_9 = new JTextField();
		textField_9.setText("Aalborg");
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 2;
		panel_8.add(textField_9, gbc_textField_9);
		
		JLabel label_7 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 3;
		panel_8.add(label_7, gbc_label_7);
		
		textField_10 = new JTextField();
		textField_10.setText("9000");
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 3;
		panel_8.add(textField_10, gbc_textField_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(407, 82, 262, 185);
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_9.add(scrollPane_1, BorderLayout.CENTER);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(tab);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBounds(0, 0, 669, 71);
		panel_1.add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Salg", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(174, 11, 331, 49);
		panel_10.add(panel_11);
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
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tilf\u00F8j Personer", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(0, 0, 679, 71);
		panel_2.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Person", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(174, 11, 331, 49);
		panel_12.add(panel_13);
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
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 0;
		panel_13.add(textField_8, gbc_textField_8);
		
		JButton button_3 = new JButton("Find");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 0;
		panel_13.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("Tilbage");
		button_4.setBounds(10, 278, 89, 23);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Annuller");
		button_5.setBounds(481, 278, 89, 23);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("Bekr\u00E6ft");
		button_6.setBounds(580, 278, 89, 23);
		panel_2.add(button_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(null, "Medarbejder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBounds(285, 82, 187, 185);
		panel_2.add(panel_14);
		GridBagLayout gbl_panel_14 = new GridBagLayout();
		gbl_panel_14.columnWidths = new int[]{0, 0, 0};
		gbl_panel_14.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_14.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_14.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_14.setLayout(gbl_panel_14);
		
		JLabel label_8 = new JLabel("Navn");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 0;
		panel_14.add(label_8, gbc_label_8);
		
		textField_11 = new JTextField();
		textField_11.setText("Kim");
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 0;
		panel_14.add(textField_11, gbc_textField_11);
		
		JLabel label_9 = new JLabel("Adresse");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 1;
		panel_14.add(label_9, gbc_label_9);
		
		textField_13 = new JTextField();
		textField_13.setText("Lemvigvej 4");
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 1;
		panel_14.add(textField_13, gbc_textField_13);
		
		JLabel label_10 = new JLabel("By");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 2;
		panel_14.add(label_10, gbc_label_10);
		
		textField_14 = new JTextField();
		textField_14.setText("Aalborg");
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.insets = new Insets(0, 0, 5, 0);
		gbc_textField_14.gridx = 1;
		gbc_textField_14.gridy = 2;
		panel_14.add(textField_14, gbc_textField_14);
		
		JLabel label_11 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 0, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 3;
		panel_14.add(label_11, gbc_label_11);
		
		textField_15 = new JTextField();
		textField_15.setText("9000");
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 1;
		gbc_textField_15.gridy = 3;
		panel_14.add(textField_15, gbc_textField_15);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(null, "Kunde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(482, 82, 187, 185);
		panel_2.add(panel_15);
		GridBagLayout gbl_panel_15 = new GridBagLayout();
		gbl_panel_15.columnWidths = new int[]{0, 0, 0};
		gbl_panel_15.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_15.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_15.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_15.setLayout(gbl_panel_15);
		
		JLabel label_12 = new JLabel("Navn");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.WEST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 0;
		panel_15.add(label_12, gbc_label_12);
		
		textField_16 = new JTextField();
		textField_16.setText("Lars");
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.insets = new Insets(0, 0, 5, 0);
		gbc_textField_16.gridx = 1;
		gbc_textField_16.gridy = 0;
		panel_15.add(textField_16, gbc_textField_16);
		
		JLabel label_13 = new JLabel("Adresse");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.WEST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 1;
		panel_15.add(label_13, gbc_label_13);
		
		textField_17 = new JTextField();
		textField_17.setText("Lemvigvej 5");
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.insets = new Insets(0, 0, 5, 0);
		gbc_textField_17.gridx = 1;
		gbc_textField_17.gridy = 1;
		panel_15.add(textField_17, gbc_textField_17);
		
		JLabel label_14 = new JLabel("By");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.WEST;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 2;
		panel_15.add(label_14, gbc_label_14);
		
		textField_18 = new JTextField();
		textField_18.setText("Aalborg");
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.insets = new Insets(0, 0, 5, 0);
		gbc_textField_18.gridx = 1;
		gbc_textField_18.gridy = 2;
		panel_15.add(textField_18, gbc_textField_18);
		
		JLabel label_15 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.WEST;
		gbc_label_15.insets = new Insets(0, 0, 0, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 3;
		panel_15.add(label_15, gbc_label_15);
		
		textField_19 = new JTextField();
		textField_19.setText("9000");
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 1;
		gbc_textField_19.gridy = 3;
		panel_15.add(textField_19, gbc_textField_19);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "Person Fundet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setBounds(10, 82, 265, 185);
		panel_2.add(panel_16);
		GridBagLayout gbl_panel_16 = new GridBagLayout();
		gbl_panel_16.columnWidths = new int[]{0, 0, 0};
		gbl_panel_16.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_16.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_16.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_16.setLayout(gbl_panel_16);
		
		JLabel label_16 = new JLabel("Navn");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 0;
		gbc_label_16.gridy = 0;
		panel_16.add(label_16, gbc_label_16);
		
		textField_20 = new JTextField();
		textField_20.setText("Kim");
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.insets = new Insets(0, 0, 5, 0);
		gbc_textField_20.gridx = 1;
		gbc_textField_20.gridy = 0;
		panel_16.add(textField_20, gbc_textField_20);
		
		JLabel label_17 = new JLabel("Adresse");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.anchor = GridBagConstraints.WEST;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 0;
		gbc_label_17.gridy = 1;
		panel_16.add(label_17, gbc_label_17);
		
		textField_21 = new JTextField();
		textField_21.setText("Lemvigvej 4");
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 0);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 1;
		gbc_textField_21.gridy = 1;
		panel_16.add(textField_21, gbc_textField_21);
		
		JLabel label_18 = new JLabel("By");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.WEST;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 0;
		gbc_label_18.gridy = 2;
		panel_16.add(label_18, gbc_label_18);
		
		textField_22 = new JTextField();
		textField_22.setText("Aalborg");
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 0);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 1;
		gbc_textField_22.gridy = 2;
		panel_16.add(textField_22, gbc_textField_22);
		
		JLabel label_19 = new JLabel("Postnr.");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.anchor = GridBagConstraints.WEST;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 0;
		gbc_label_19.gridy = 3;
		panel_16.add(label_19, gbc_label_19);
		
		textField_23 = new JTextField();
		textField_23.setText("9000");
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 0);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 1;
		gbc_textField_23.gridy = 3;
		panel_16.add(textField_23, gbc_textField_23);
		
		JButton btnTilfjMedarbejder = new JButton("Tilf\u00F8j Medarbejder");
		GridBagConstraints gbc_btnTilfjMedarbejder = new GridBagConstraints();
		gbc_btnTilfjMedarbejder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTilfjMedarbejder.insets = new Insets(0, 0, 0, 5);
		gbc_btnTilfjMedarbejder.gridx = 0;
		gbc_btnTilfjMedarbejder.gridy = 5;
		panel_16.add(btnTilfjMedarbejder, gbc_btnTilfjMedarbejder);
		
		JButton btnTilfjKunde = new JButton("Tilf\u00F8j Kunde");
		GridBagConstraints gbc_btnTilfjKunde = new GridBagConstraints();
		gbc_btnTilfjKunde.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTilfjKunde.gridx = 1;
		gbc_btnTilfjKunde.gridy = 5;
		panel_16.add(btnTilfjKunde, gbc_btnTilfjKunde);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Tilf\u00F8j Produkter", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.DARK_GRAY);
		panel_17.setBounds(0, 0, 679, 71);
		panel_3.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_18.setBackground(Color.DARK_GRAY);
		panel_18.setBounds(174, 11, 331, 49);
		panel_17.add(panel_18);
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
		
		JButton button_8 = new JButton("Tilbage");
		button_8.setBounds(10, 278, 89, 23);
		panel_3.add(button_8);
		
		JButton button_9 = new JButton("Annuller");
		button_9.setBounds(481, 278, 89, 23);
		panel_3.add(button_9);
		
		JButton button_10 = new JButton("Bekr\u00E6ft");
		button_10.setBounds(580, 278, 89, 23);
		panel_3.add(button_10);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Produkt Fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBounds(10, 82, 265, 185);
		panel_3.add(panel_19);
		GridBagLayout gbl_panel_19 = new GridBagLayout();
		gbl_panel_19.columnWidths = new int[]{0, 0, 0};
		gbl_panel_19.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_19.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_19.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_19.setLayout(gbl_panel_19);
		
		JLabel lblStregkode = new JLabel("Stregkode");
		GridBagConstraints gbc_lblStregkode = new GridBagConstraints();
		gbc_lblStregkode.anchor = GridBagConstraints.WEST;
		gbc_lblStregkode.insets = new Insets(0, 0, 5, 5);
		gbc_lblStregkode.gridx = 0;
		gbc_lblStregkode.gridy = 0;
		panel_19.add(lblStregkode, gbc_lblStregkode);
		
		textField_25 = new JTextField();
		textField_25.setText("1");
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 0);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 1;
		gbc_textField_25.gridy = 0;
		panel_19.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblTitel = new JLabel("Titel");
		GridBagConstraints gbc_lblTitel = new GridBagConstraints();
		gbc_lblTitel.anchor = GridBagConstraints.WEST;
		gbc_lblTitel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitel.gridx = 0;
		gbc_lblTitel.gridy = 1;
		panel_19.add(lblTitel, gbc_lblTitel);
		
		txtProdukt = new JTextField();
		txtProdukt.setText("Produkt 1");
		GridBagConstraints gbc_txtProdukt = new GridBagConstraints();
		gbc_txtProdukt.insets = new Insets(0, 0, 5, 0);
		gbc_txtProdukt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProdukt.gridx = 1;
		gbc_txtProdukt.gridy = 1;
		panel_19.add(txtProdukt, gbc_txtProdukt);
		txtProdukt.setColumns(10);
		
		JLabel lblBeskrivelse = new JLabel("Beskrivelse");
		GridBagConstraints gbc_lblBeskrivelse = new GridBagConstraints();
		gbc_lblBeskrivelse.anchor = GridBagConstraints.WEST;
		gbc_lblBeskrivelse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeskrivelse.gridx = 0;
		gbc_lblBeskrivelse.gridy = 2;
		panel_19.add(lblBeskrivelse, gbc_lblBeskrivelse);
		
		txtProduktEr = new JTextField();
		txtProduktEr.setText("Produkt 1 er produkt 1");
		GridBagConstraints gbc_txtProduktEr = new GridBagConstraints();
		gbc_txtProduktEr.insets = new Insets(0, 0, 5, 0);
		gbc_txtProduktEr.fill = GridBagConstraints.BOTH;
		gbc_txtProduktEr.gridx = 1;
		gbc_txtProduktEr.gridy = 2;
		panel_19.add(txtProduktEr, gbc_txtProduktEr);
		txtProduktEr.setColumns(10);
		
		JButton btnTilfjProdukt = new JButton("Tilf\u00F8j");
		GridBagConstraints gbc_btnTilfjProdukt = new GridBagConstraints();
		gbc_btnTilfjProdukt.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTilfjProdukt.gridwidth = 2;
		gbc_btnTilfjProdukt.gridx = 0;
		gbc_btnTilfjProdukt.gridy = 5;
		panel_19.add(btnTilfjProdukt, gbc_btnTilfjProdukt);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new TitledBorder(null, "Produkter", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_20.setBounds(285, 82, 384, 185);
		panel_3.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_20.add(scrollPane_2, BorderLayout.CENTER);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(tab);
	}
}
