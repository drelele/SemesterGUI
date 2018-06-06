package guilayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controllerlayer.PersonController;
import modellayer.Person;

public class PersonGUI extends JFrame {

	
	private PersonController personCtrl;
	
	private Person returnPerson;
	
	private JPanel contentPane;
	private JTextField textFieldCity;
	private JTextField textFieldPostalCode;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress;
	private JTextField textFieldName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textFieldfindPerson;
	private JTextField textFieldReturnAddress;
	private JTextField textFieldReturnCity;
	private JTextField textFieldReturnPostalCode;
	private JTextField textFieldReturnName;
	private JTextField textFieldConfirmName;
	private JTextField textFieldConfirmPhone;
	private JTextField textFieldConfirmAddress;
	private JTextField textFieldConfirmCity;
	private JTextField textFieldConfirmPostalCode;
	private JTextField textField_16;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PersonGUI frame = new PersonGUI();
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
	public PersonGUI() {
		setTitle("Person");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 700, 471);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Filer");
		menuBar.add(mnFile);
		
		JMenuItem mntmQuit = new JMenuItem("Afslut");
		mnFile.add(mntmQuit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(5, 5, 674, 395);
		contentPane.add(tabbedPane);
		
		JPanel panelCreatePerson = new JPanel();
		tabbedPane.addTab("Opret person", null, panelCreatePerson, null);
		panelCreatePerson.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 11, 324, 304);
		panelCreatePerson.add(panel_1);
		panel_1.setLayout(null);
		
		/*
		 * Text fields createTab editable 
		 */
		JLabel lblName = new JLabel("Navn");
		lblName.setBounds(10, 3, 48, 14);
		panel_1.add(lblName);
		
		JLabel lblPhone = new JLabel("Telefon");
		lblPhone.setBounds(10, 28, 48, 14);
		panel_1.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Adresse");
		lblAddress.setBounds(10, 53, 48, 14);
		panel_1.add(lblAddress);
		
		JLabel lblBy = new JLabel("By");
		lblBy.setBounds(10, 78, 48, 14);
		panel_1.add(lblBy);
		
		JLabel lblPostNr = new JLabel("Post nr.");
		lblPostNr.setBounds(10, 103, 48, 14);
		panel_1.add(lblPostNr);
		
		JRadioButton rdbtnKunde = new JRadioButton("Kunde");
		rdbtnKunde.setBounds(93, 127, 70, 23);
		panel_1.add(rdbtnKunde);
		
		JRadioButton rdbtnMedarbejder = new JRadioButton("Medarbejder");
		rdbtnMedarbejder.setBounds(203, 127, 111, 23);
		panel_1.add(rdbtnMedarbejder);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnKunde);	
		group.add(rdbtnMedarbejder);	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(334, 11, 335, 304);
		panelCreatePerson.add(panel_2);
		panel_2.setLayout(null);
		
		/*
		 * Text fields createTab none editable 
		 */
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(83, 0, 216, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(83, 25, 216, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(83, 50, 216, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(83, 75, 216, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(83, 100, 216, 20);
		panel_2.add(textField_4);
		
		JLabel label = new JLabel("Navn");
		label.setBounds(10, 3, 48, 14);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Telefon");
		label_1.setBounds(10, 28, 48, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Adresse");
		label_2.setBounds(10, 53, 48, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("By");
		label_3.setBounds(10, 78, 48, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Post nr.");
		label_4.setBounds(10, 103, 48, 14);
		panel_2.add(label_4);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(83, 148, 216, 20);
		panel_2.add(textField_7);
		
		JCheckBox chckbxMedarbejderNummer = new JCheckBox("Medarbejdernummer");
		chckbxMedarbejderNummer.setEnabled(false);
		chckbxMedarbejderNummer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxMedarbejderNummer.setBounds(188, 127, 111, 14);
		panel_2.add(chckbxMedarbejderNummer);
		
		JCheckBox chckbxKundenummer = new JCheckBox("Kundenummer");
		chckbxKundenummer.setEnabled(false);
		chckbxKundenummer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxKundenummer.setBounds(83, 127, 85, 14);
		panel_2.add(chckbxKundenummer);
		
		/*
		 * Button confirmPerson
		 */
		
		JButton btnConfirmPerson = new JButton("Bek\u00E6ft");
		btnConfirmPerson.setEnabled(isEnabled());
		btnConfirmPerson.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				confirmPersonInput();
			}
			private void confirmPersonInput() {
				textField.setText(textFieldName.getText());
				textField_1.setText(textFieldPhone.getText());
				textField_2.setText(textFieldAddress.getText());
				textField_3.setText(textFieldCity.getText());
				textField_4.setText(textFieldPostalCode.getText());
				
			}
		});
		btnConfirmPerson.setBounds(225, 270, 89, 23);
		panel_1.add(btnConfirmPerson);
		
		/*
		 * Check if Fields is empty
		 */
		textFieldName = new JTextField();
		textFieldName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnConfirmPerson.setEnabled(true);
			}
		});
		textFieldName.setColumns(10);
		textFieldName.setBounds(93, 0, 221, 20);
		panel_1.add(textFieldName);
		
		textFieldPhone = new JTextField();
		textFieldPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnConfirmPerson.setEnabled(true);
			}
		});
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(93, 25, 221, 20);
		panel_1.add(textFieldPhone);
		
		textFieldAddress = new JTextField();
		textFieldAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnConfirmPerson.setEnabled(true);
			}
		});
		textFieldAddress.setBounds(93, 50, 221, 20);
		textFieldAddress.setColumns(10);
		panel_1.add(textFieldAddress);
		
		textFieldCity = new JTextField();
		textFieldCity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnConfirmPerson.setEnabled(true);
			}
		});
		textFieldCity.setBounds(93, 75, 221, 20);
		textFieldCity.setColumns(10);
		panel_1.add(textFieldCity);
		
		textFieldPostalCode = new JTextField();
		textFieldPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnConfirmPerson.setEnabled(true);
			}
		});
		textFieldPostalCode.setBounds(93, 100, 221, 20);
		textFieldPostalCode.setColumns(10);
		panel_1.add(textFieldPostalCode);
		
		JButton button_7 = new JButton("Tilbage");
		button_7.setBounds(0, 333, 89, 23);
		panelCreatePerson.add(button_7);
		
		/*
		 * Create & Cancel buttons
		 */
		
		JButton button_5 = new JButton("Annuller");
		button_5.setBounds(471, 333, 89, 23);
		panelCreatePerson.add(button_5);
		
		JButton btnCreate = new JButton("Bek\u00E6ft");
		btnCreate.setBounds(570, 333, 89, 23);
		panelCreatePerson.add(btnCreate);
		
		btnCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		/*
		 * Edit Person Tab
		 */
		
		JPanel panelEditPerson = new JPanel();
		panelEditPerson.setBorder(null);
		tabbedPane.addTab("\u00C6ndre person", null, panelEditPerson, null);
		panelEditPerson.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 0, 669, 71);
		panelEditPerson.add(panel_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.DARK_GRAY);
		panel_3.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Person", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_11.setBackground(Color.DARK_GRAY);
		panel_10.add(panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0};
		gbl_panel_11.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		/*
		 * Search panel 
		 */
		JLabel label_16 = new JLabel("Indtast telefonnr.");
		label_16.setForeground(Color.WHITE);
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 0;
		gbc_label_16.gridy = 0;
		panel_11.add(label_16, gbc_label_16);
		
		textFieldfindPerson = new JTextField();
		textFieldfindPerson.setColumns(10);
		GridBagConstraints gbc_textFieldfindPerson = new GridBagConstraints();
		gbc_textFieldfindPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldfindPerson.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldfindPerson.gridx = 1;
		gbc_textFieldfindPerson.gridy = 0;
		panel_11.add(textFieldfindPerson, gbc_textFieldfindPerson);
		

		/*
		 * Buttons confirmAll & cancel
		 */
		JButton button_1 = new JButton("Annuller");
		button_1.setBounds(471, 333, 89, 23);
		panelEditPerson.add(button_1);
		
		JButton button_ConfirmAll = new JButton("Bekr\u00E6ft");
		button_ConfirmAll.setEnabled(false);
		button_ConfirmAll.addActionListener(new ActionListener() {
			
			PersonController personCtrl = new PersonController();
			@Override
			public void actionPerformed(ActionEvent e) { 
				
				String newName = textFieldConfirmName.getText();
				String newAddress = textFieldConfirmAddress.getText();
				String newCity = textFieldConfirmCity.getText();
				String newPostalCode = textFieldConfirmPostalCode.getText();
				
				personCtrl.updatePerson(returnPerson, newName, returnPerson.getPhone(), newAddress, newCity, newPostalCode);
				
				JPanel personUpdated = new JPanel();
				personUpdated.setBounds(237, 140, 205, 115);
				panelEditPerson.add(personUpdated);
				personUpdated.setBackground(Color.DARK_GRAY);
				personUpdated.setForeground(Color.DARK_GRAY);
				personUpdated.setLayout(null);
				
				
				JLabel lblPersonenBlevRedigeret = new JLabel("Personen blev opdateret");
				lblPersonenBlevRedigeret.setForeground(Color.WHITE);
				lblPersonenBlevRedigeret.setBackground(Color.WHITE);
				lblPersonenBlevRedigeret.setBounds(38, 29, 137, 29);
				personUpdated.add(lblPersonenBlevRedigeret);
				
				
				
				JButton btnLuk = new JButton("Luk ");
				
				btnLuk.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						textFieldReturnName.setText("");
						textFieldReturnAddress.setText("");
						textFieldReturnCity.setText("");
						textFieldReturnPostalCode.setText("");
						
						textFieldConfirmName.setText("");
						textFieldConfirmPhone.setText("");
						textFieldConfirmAddress.setText("");
						textFieldConfirmCity.setText("");
						textFieldConfirmPostalCode.setText("");
						personUpdated.setVisible(false);
						button_ConfirmAll.setEnabled(false);
						
						
						
					}
				});
				
				btnLuk.setBounds(59, 69, 89, 23);
				personUpdated.add(btnLuk);
				
				
			}
		});
		

		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(null);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 76, 324, 253);
		panelEditPerson.add(panel_8);
		
		JLabel label_5 = new JLabel("Navn");
		label_5.setBounds(10, 3, 48, 14);
		panel_8.add(label_5);
		
		JLabel label_7 = new JLabel("Adresse");
		label_7.setBounds(10, 28, 48, 14);
		panel_8.add(label_7);
		
		JLabel label_8 = new JLabel("By");
		label_8.setBounds(10, 53, 48, 14);
		panel_8.add(label_8);
		
		JLabel label_9 = new JLabel("Post nr.");
		label_9.setBounds(10, 78, 48, 14);
		panel_8.add(label_9);
		
	
		
		JButton button_ConfirmChanges = new JButton("Bek\u00E6ft");
		button_ConfirmChanges.setEnabled(false);
		button_ConfirmChanges.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(button_ConfirmChanges.isEnabled()) {
				button_ConfirmAll.setEnabled(true);
				textFieldConfirmName.setText(textFieldReturnName.getText());
				textFieldConfirmAddress.setText(textFieldReturnAddress.getText());
				textFieldConfirmCity.setText(textFieldReturnCity.getText());
				textFieldConfirmPostalCode.setText(textFieldReturnPostalCode.getText());
				textFieldConfirmPhone.setText(returnPerson.getPhone());
				} else {
					button_ConfirmAll.setEnabled(false);
				}
			}
		});

		button_ConfirmChanges.setBounds(225, 219, 89, 23);
		panel_8.add(button_ConfirmChanges);
		button_ConfirmAll.setBounds(570, 333, 89, 23);
		panelEditPerson.add(button_ConfirmAll);
		
		JButton button_4 = new JButton("Tilbage");
		button_4.setBounds(0, 333, 89, 23);
		panelEditPerson.add(button_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(334, 76, 335, 253);
		panelEditPerson.add(panel_9);
		
		textFieldReturnName = new JTextField();
		textFieldReturnName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				button_ConfirmChanges.setEnabled(true);
			}
		});
		textFieldReturnName.setColumns(10);
		textFieldReturnName.setBounds(93, 0, 221, 20);
		panel_8.add(textFieldReturnName);
		
		textFieldReturnAddress = new JTextField();
		textFieldReturnAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				button_ConfirmChanges.setEnabled(true);
			}
		});
		textFieldReturnAddress.setColumns(10);
		textFieldReturnAddress.setBounds(93, 25, 221, 20);
		panel_8.add(textFieldReturnAddress);
		
		textFieldReturnCity = new JTextField();
		textFieldReturnCity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				button_ConfirmChanges.setEnabled(true);
			}
		});
		textFieldReturnCity.setColumns(10);
		textFieldReturnCity.setBounds(93, 50, 221, 20);
		panel_8.add(textFieldReturnCity);
		
		textFieldReturnPostalCode = new JTextField();
		textFieldReturnPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				button_ConfirmChanges.setEnabled(true);
			}
		});
		textFieldReturnPostalCode.setColumns(10);
		textFieldReturnPostalCode.setBounds(93, 75, 221, 20);
		panel_8.add(textFieldReturnPostalCode);
		
		textFieldConfirmName = new JTextField();
		textFieldConfirmName.setEditable(false);
		textFieldConfirmName.setColumns(10);
		textFieldConfirmName.setBounds(109, 0, 216, 20);
		panel_9.add(textFieldConfirmName);
		
		textFieldConfirmPhone = new JTextField();
		textFieldConfirmPhone.setEditable(false);
		textFieldConfirmPhone.setColumns(10);
		textFieldConfirmPhone.setBounds(109, 25, 216, 20);
		panel_9.add(textFieldConfirmPhone);
		
		textFieldConfirmAddress = new JTextField();
		textFieldConfirmAddress.setEditable(false);
		textFieldConfirmAddress.setColumns(10);
		textFieldConfirmAddress.setBounds(109, 50, 216, 20);
		panel_9.add(textFieldConfirmAddress);
		
		textFieldConfirmCity = new JTextField();
		textFieldConfirmCity.setEditable(false);
		textFieldConfirmCity.setColumns(10);
		textFieldConfirmCity.setBounds(109, 75, 216, 20);
		panel_9.add(textFieldConfirmCity);
		
		textFieldConfirmPostalCode = new JTextField();
		textFieldConfirmPostalCode.setEditable(false);
		textFieldConfirmPostalCode.setColumns(10);
		textFieldConfirmPostalCode.setBounds(109, 100, 216, 20);
		panel_9.add(textFieldConfirmPostalCode);
		
		JLabel label_10 = new JLabel("Navn");
		label_10.setBounds(10, 3, 48, 14);
		panel_9.add(label_10);
		
		JLabel label_11 = new JLabel("Telefon");
		label_11.setBounds(10, 28, 48, 14);
		panel_9.add(label_11);
		
		JLabel label_12 = new JLabel("Adresse");
		label_12.setBounds(10, 53, 48, 14);
		panel_9.add(label_12);
		
		JLabel label_13 = new JLabel("By");
		label_13.setBounds(10, 78, 48, 14);
		panel_9.add(label_13);
		
		JLabel label_14 = new JLabel("Post nr.");
		label_14.setBounds(10, 103, 48, 14);
		panel_9.add(label_14);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(109, 148, 216, 20);
		panel_9.add(textField_16);
		
		JCheckBox checkBox = new JCheckBox("Medarbejdernummer");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox.setEnabled(false);
		checkBox.setBounds(214, 127, 111, 14);
		panel_9.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Kundenummer");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(109, 127, 91, 14);
		panel_9.add(checkBox_1);
		
		JButton btnDeletePerson = new JButton("Slet person");
		btnDeletePerson.setForeground(Color.WHITE);
		btnDeletePerson.setBackground(new Color(204, 0, 0));
		btnDeletePerson.setBounds(10, 219, 101, 23);
		panel_9.add(btnDeletePerson);
		
		JButton button_3 = new JButton("Find");
		button_3.addActionListener(new ActionListener() {
			
			PersonController personCtrl = new PersonController();
			@Override
			public void actionPerformed(ActionEvent e) {				
				try {	
				returnPerson = getPerson(textFieldfindPerson.getText());
				textFieldReturnName.setText(returnPerson.getName());
				textFieldReturnAddress.setText(returnPerson.getAddress());
				textFieldReturnCity.setText(returnPerson.getCity());
				textFieldReturnPostalCode.setText(returnPerson.getPostalCode());
				
				textFieldConfirmName.setText("");
				textFieldConfirmPhone.setText("");
				textFieldConfirmAddress.setText("");
				textFieldConfirmCity.setText("");
				textFieldConfirmPostalCode.setText("");
				
				button_ConfirmChanges.setEnabled(false);
				button_ConfirmAll.setEnabled(false);;
				} catch (NullPointerException ee) {
					errorString();
				}
			}
			
			private Person getPerson(String phone) {
				return personCtrl.getPerson(phone);
				
			}
			
		
			private void errorString() {
				
				JPanel errorPanel = new JPanel();
				errorPanel.setBounds(237, 140, 205, 115);
				panelEditPerson.add(errorPanel);
				errorPanel.setBackground(Color.DARK_GRAY);
				errorPanel.setForeground(Color.DARK_GRAY);
				errorPanel.setLayout(null);
				
				JButton buttonAccept = new JButton("Accepter");
				buttonAccept.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						errorPanel.setVisible(false);
					}
				});

				buttonAccept.setBounds(56, 81, 89, 23);
				errorPanel.add(buttonAccept);
				
				JTextPane txtpnDuSkalSkrive = new JTextPane();
				txtpnDuSkalSkrive.setEditable(false);
				txtpnDuSkalSkrive.setForeground(Color.WHITE);
				txtpnDuSkalSkrive.setBackground(Color.DARK_GRAY);
				txtpnDuSkalSkrive.setText("Personen findes ikke");
				txtpnDuSkalSkrive.setBounds(45, 11, 125, 47);
				errorPanel.add(txtpnDuSkalSkrive);
				
				
			}
		});
		
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 0;
		panel_11.add(button_3, gbc_button_3);
		
		
	}
}
