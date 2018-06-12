package guilayer;



import java.awt.Color;
import java.awt.Component;
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
import java.util.ArrayList;

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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controllerlayer.PersonController;
import modellayer.Customer;
import modellayer.Employee;
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
	private JTextField textFieldCreateName;
	private JTextField textFieldCreatePhone;
	private JTextField textFieldCreateAddress;
	private JTextField textFieldCreateCity;
	private JTextField textFieldCreatePostalCode;
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
	private JTextField textFieldNumberID;




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

		personCtrl = new PersonController();

		getAllPersons();

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

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnKunde);	
		btnGroup.add(rdbtnMedarbejder);	

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(334, 11, 335, 304);
		panelCreatePerson.add(panel_2);
		panel_2.setLayout(null);

		/*
		 * Text fields createTab none editable 
		 */
		textFieldCreateName = new JTextField();
		textFieldCreateName.setEditable(false);
		textFieldCreateName.setColumns(10);
		textFieldCreateName.setBounds(83, 0, 216, 20);
		panel_2.add(textFieldCreateName);

		textFieldCreatePhone = new JTextField();
		textFieldCreatePhone.setEditable(false);
		textFieldCreatePhone.setColumns(10);
		textFieldCreatePhone.setBounds(83, 25, 216, 20);
		panel_2.add(textFieldCreatePhone);

		textFieldCreateAddress = new JTextField();
		textFieldCreateAddress.setEditable(false);
		textFieldCreateAddress.setColumns(10);
		textFieldCreateAddress.setBounds(83, 50, 216, 20);
		panel_2.add(textFieldCreateAddress);

		textFieldCreateCity = new JTextField();
		textFieldCreateCity.setEditable(false);
		textFieldCreateCity.setColumns(10);
		textFieldCreateCity.setBounds(83, 75, 216, 20);
		panel_2.add(textFieldCreateCity);

		textFieldCreatePostalCode = new JTextField();
		textFieldCreatePostalCode.setEditable(false);
		textFieldCreatePostalCode.setColumns(10);
		textFieldCreatePostalCode.setBounds(83, 100, 216, 20);
		panel_2.add(textFieldCreatePostalCode);

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

		JCheckBox chckbxMedarbejderNummer = new JCheckBox("Medarbejder");
		chckbxMedarbejderNummer.setEnabled(false);
		chckbxMedarbejderNummer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxMedarbejderNummer.setBounds(188, 127, 111, 14);
		panel_2.add(chckbxMedarbejderNummer);

		JCheckBox chckbxKundenummer = new JCheckBox("Kunde");
		chckbxKundenummer.setEnabled(false);
		chckbxKundenummer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxKundenummer.setBounds(83, 127, 85, 14);
		panel_2.add(chckbxKundenummer);

		/*
		 * Button confirmPerson
		 */

		JButton btnCreate = new JButton("Bekr\u00E6ft");
		JButton btnConfirmPerson = new JButton("Bekr\u00E6ft");
		btnCreate.addMouseListener(new MouseAdapter() {


			private void printCreated() {

				JPanel personCreated = new JPanel();
				personCreated.setBounds(237, 140, 205, 115);
				panelCreatePerson.add(personCreated);
				personCreated.setBackground(Color.DARK_GRAY);
				personCreated.setForeground(Color.DARK_GRAY);
				personCreated.setLayout(null);

				JLabel lblPersonCreated = new JLabel("Personen blev oprettet");
				lblPersonCreated.setForeground(Color.WHITE);
				lblPersonCreated.setBackground(Color.WHITE);
				lblPersonCreated.setBounds(38, 29, 137, 29);
				personCreated.add(lblPersonCreated);

				JButton btnLuk_1 = new JButton("Luk ");
				btnLuk_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						emptyFields(panel_1);
						emptyFields(panel_2);
						chckbxKundenummer.setSelected(false);
						chckbxMedarbejderNummer.setSelected(false);
						btnGroup.clearSelection();
						personCreated.setVisible(false);
						btnCreate.setEnabled(false);
						btnConfirmPerson.setEnabled(false);

					}
				});

				btnLuk_1.setBounds(59, 69, 89, 23);
				personCreated.add(btnLuk_1);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textFieldCreateName.getText();
				String phone = textFieldCreatePhone.getText();
				String address = textFieldCreateAddress.getText();
				String city = textFieldCreateCity.getText();
				String postalCode = textFieldCreatePostalCode.getText();

				if(chckbxKundenummer.isSelected() && personCtrl.phoneExists(phone) ==  false) {
					personCtrl.createCustomer(name, phone, address, city, postalCode);
					printCreated();
				} else if (chckbxMedarbejderNummer.isSelected() && personCtrl.phoneExists(phone) == false ) {
					personCtrl.createEmployee(name, phone, address, city, postalCode);
					printCreated();
				} else {
					errorString(panelCreatePerson, "Nummeret er i brug"); 
				}

			}

		});
		btnCreate.setEnabled(false);
		btnCreate.setBounds(570, 333, 89, 23);
		panelCreatePerson.add(btnCreate);

		btnConfirmPerson.setEnabled(false);
		btnConfirmPerson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnConfirmPerson.isEnabled() && rdbtnKunde.isSelected() || rdbtnMedarbejder.isSelected()) {
					if(rdbtnKunde.isSelected()) {
						chckbxKundenummer.setSelected(true);
					}
					else if(rdbtnMedarbejder.isSelected()) {
						chckbxMedarbejderNummer.setSelected(true);
					}
					btnCreate.setEnabled(true);
					confirmPersonInput();
				} else {
					btnCreate.setEnabled(false);
				}

			}
			private void confirmPersonInput() {
				textFieldCreateName.setText(textFieldName.getText());
				textFieldCreatePhone.setText(textFieldPhone.getText());
				textFieldCreateAddress.setText(textFieldAddress.getText());
				textFieldCreateCity.setText(textFieldCity.getText());
				textFieldCreatePostalCode.setText(textFieldPostalCode.getText());

			}
		});


		btnConfirmPerson.setBounds(225, 270, 89, 23);
		panel_1.add(btnConfirmPerson);

		/*
		 * Check if Fields is empty
		 */

		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(93, 0, 221, 20);
		panel_1.add(textFieldName);

		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(93, 25, 221, 20);
		panel_1.add(textFieldPhone);

		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(93, 50, 221, 20);
		textFieldAddress.setColumns(10);
		panel_1.add(textFieldAddress);

		textFieldCity = new JTextField();
		textFieldCity.setBounds(93, 75, 221, 20);
		textFieldCity.setColumns(10);
		panel_1.add(textFieldCity);

		textFieldPostalCode = new JTextField();
		textFieldPostalCode.setBounds(93, 100, 221, 20);
		textFieldPostalCode.setColumns(10);
		panel_1.add(textFieldPostalCode);

		JTextField[] textFieldCreateAll = {textFieldName, textFieldPhone, textFieldAddress, textFieldCity, textFieldPostalCode};

		for (JTextField fieldCreate : textFieldCreateAll){
			fieldCreate.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					ArrayList<Integer> results = new ArrayList<>();

					for(JTextField fieldCreate : textFieldCreateAll) {

						if (fieldCreate.getText().length() != 0) {
							results.add(1);
						}else {
							results.add(0);
						}
					}

					if(!results.contains(0)) {
						btnConfirmPerson.setEnabled(true);
					} else {
						btnConfirmPerson.setEnabled(false);
					}

				}
			});

		}

		JButton backCreate = new JButton("Tilbage");
		backCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		backCreate.setBounds(0, 333, 89, 23);
		panelCreatePerson.add(backCreate);

		/* 
		 *  Create & Cancel buttons
		 */ 

		JButton cancelCreate = new JButton("Annuller");
		cancelCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyFields(panel_1);
				emptyFields(panel_2);
				btnGroup.clearSelection();
				chckbxKundenummer.setSelected(false);
				chckbxMedarbejderNummer.setSelected(false);
				btnConfirmPerson.setEnabled(false);
				btnCreate.setEnabled(false);

			}
		});

		cancelCreate.setBounds(471, 333, 89, 23);
		panelCreatePerson.add(cancelCreate);

		/*
		 * Edit Person Tab
		 */
		JPanel panel_9 = new JPanel();
		JPanel panel_8 = new JPanel();
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
		JCheckBox checkBoxEmployeeNumb = new JCheckBox("Medarbejdernummer");
		JCheckBox checkBoxCustomerNumb = new JCheckBox("Kundenummer");


		/*
		 * Buttons confirmAll & cancel
		 */
		JButton button_ConfirmAll = new JButton("Bekr\u00E6ft");		
		JButton btnDeletePerson = new JButton("Slet person");
		JButton btnBekrft = new JButton("Bekr\u00E6ft");
		JButton button_1 = new JButton("Annuller");

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

		btnDeletePerson.setEnabled(false);
		btnBekrft.setEnabled(false);
		btnBekrft.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (returnPerson instanceof Customer) {
					Customer customer = (Customer) returnPerson;
					checkBoxCustomerNumb.setSelected(true);
					textFieldNumberID.setText(String.valueOf(customer.getCustomerNumber()));
				} else if (returnPerson instanceof Employee) {
					Employee employee = (Employee) returnPerson;
					textFieldNumberID.setText(String.valueOf(employee.getEmployeeNumber()));
					checkBoxEmployeeNumb.setSelected(true);
				}

				if(btnBekrft.isEnabled()) {
					button_ConfirmAll.setEnabled(true);
					if (button_ConfirmAll.isEnabled()) {
						btnDeletePerson.setEnabled(true);
					} else {
						btnDeletePerson.setEnabled(false);			
					}
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

		btnBekrft.setBounds(225, 219, 89, 23);
		panel_8.add(btnBekrft);
		button_ConfirmAll.setBounds(570, 333, 89, 23);
		panelEditPerson.add(button_ConfirmAll);

		JButton button_4 = new JButton("Tilbage");
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		button_4.setBounds(0, 333, 89, 23);
		panelEditPerson.add(button_4);

		panel_9.setLayout(null);
		panel_9.setBounds(334, 76, 335, 253);
		panelEditPerson.add(panel_9);

		textFieldReturnName = new JTextField();
		textFieldReturnName.setEditable(false);
		textFieldReturnName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				btnBekrft.setEnabled(true);
			}
		});
		textFieldReturnName.setColumns(10);
		textFieldReturnName.setBounds(93, 0, 221, 20);
		panel_8.add(textFieldReturnName);

		textFieldReturnAddress = new JTextField();
		textFieldReturnAddress.setEditable(false);
		textFieldReturnAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnBekrft.setEnabled(true);
			}
		});
		textFieldReturnAddress.setColumns(10);
		textFieldReturnAddress.setBounds(93, 25, 221, 20);
		panel_8.add(textFieldReturnAddress);

		textFieldReturnCity = new JTextField();
		textFieldReturnCity.setEditable(false);
		textFieldReturnCity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnBekrft.setEnabled(true);
			}
		});
		textFieldReturnCity.setColumns(10);
		textFieldReturnCity.setBounds(93, 50, 221, 20);
		panel_8.add(textFieldReturnCity);

		textFieldReturnPostalCode = new JTextField();
		textFieldReturnPostalCode.setEditable(false);
		textFieldReturnPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnBekrft.setEnabled(true);
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

		textFieldNumberID = new JTextField();
		textFieldNumberID.setEditable(false);
		textFieldNumberID.setColumns(10);
		textFieldNumberID.setBounds(109, 148, 216, 20);
		panel_9.add(textFieldNumberID);


		checkBoxEmployeeNumb.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBoxEmployeeNumb.setEnabled(false);
		checkBoxEmployeeNumb.setBounds(214, 127, 111, 14);
		panel_9.add(checkBoxEmployeeNumb);

		checkBoxCustomerNumb.setFont(new Font("Tahoma", Font.PLAIN, 9));
		checkBoxCustomerNumb.setEnabled(false);
		checkBoxCustomerNumb.setBounds(109, 127, 91, 14);
		panel_9.add(checkBoxCustomerNumb);

		button_ConfirmAll.setEnabled(false);
		button_ConfirmAll.addActionListener(new ActionListener() {

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

						emptyFields(panel_8);
						emptyFields(panel_9);
						disableAllFields();

						checkBoxEmployeeNumb.setSelected(false);
						checkBoxCustomerNumb.setSelected(false);
						personUpdated.setVisible(false);
						button_ConfirmAll.setEnabled(false);

					}
				});

				btnLuk.setBounds(59, 69, 89, 23);
				personUpdated.add(btnLuk);


			}
		});

		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				emptyFields(panel_8);
				emptyFields(panel_9);
				disableAllFields();
				checkBoxEmployeeNumb.setSelected(false);
				checkBoxCustomerNumb.setSelected(false);
				button_ConfirmAll.setEnabled(false);
				btnDeletePerson.setEnabled(false);
				btnBekrft.setEnabled(false);

			}
		});
		button_1.setBounds(471, 333, 89, 23);
		panelEditPerson.add(button_1);

		btnDeletePerson.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {								
				personCtrl.deletePerson(returnPerson);

				JPanel personDeleted = new JPanel();
				personDeleted.setBounds(237, 140, 205, 115);
				panelEditPerson.add(personDeleted);
				personDeleted.setBackground(Color.DARK_GRAY);
				personDeleted.setForeground(Color.DARK_GRAY);
				personDeleted.setLayout(null);

				JLabel lblPersonenBlevRedigeret = new JLabel("Personen blev Slettet");
				lblPersonenBlevRedigeret.setForeground(Color.WHITE);
				lblPersonenBlevRedigeret.setBackground(Color.WHITE);
				lblPersonenBlevRedigeret.setBounds(38, 29, 137, 29);
				personDeleted.add(lblPersonenBlevRedigeret);

				JButton btnLuk = new JButton("Luk ");

				btnLuk.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						emptyFields(panel_8);
						emptyFields(panel_9);
						disableAllFields();
						checkBoxEmployeeNumb.setSelected(false);
						checkBoxCustomerNumb.setSelected(false);
						button_ConfirmAll.setEnabled(false);
						btnDeletePerson.setEnabled(false);
						personDeleted.setVisible(false);

					}
				});

				btnLuk.setBounds(59, 69, 89, 23);
				personDeleted.add(btnLuk);

			}
		});
		btnDeletePerson.setForeground(Color.WHITE);
		btnDeletePerson.setBackground(new Color(204, 0, 0));
		btnDeletePerson.setBounds(10, 219, 101, 23);
		panel_9.add(btnDeletePerson);

		/*
		 * FIND BUTTON
		 */
		JButton button_3 = new JButton("Find");
		button_3.setEnabled(false);

		textFieldfindPerson.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent e) {
				changed();
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				changed();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				changed();
			}

			public void changed() {
				if(textFieldfindPerson.getText().equals("")) {
					button_3.setEnabled(false);
				} else {
					button_3.setEnabled(true);
				}

			}
		});

		button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changes();
				try {	
					returnPerson = getPerson(textFieldfindPerson.getText());
					textFieldReturnName.setText(returnPerson.getName());
					textFieldReturnAddress.setText(returnPerson.getAddress());
					textFieldReturnCity.setText(returnPerson.getCity());
					textFieldReturnPostalCode.setText(returnPerson.getPostalCode());

					emptyFields(panel_9);

					checkBoxEmployeeNumb.setSelected(false);
					checkBoxCustomerNumb.setSelected(false);

					btnBekrft.setEnabled(false);
					button_ConfirmAll.setEnabled(false);;
				} catch (NullPointerException ee) {
					errorString(panelEditPerson, "Person findes ikke");
					emptyFields(panel_8);
					emptyFields(panel_9);
					disableAllFields();
				}
			}

			private void changes() {
				JTextField[] textFieldReturnAll = {textFieldReturnName, textFieldReturnAddress, textFieldReturnCity, textFieldReturnPostalCode};
				for (JTextField textfields : textFieldReturnAll) {
					if(textfields.getText().equals(" ")) {
						textfields.setEditable(false);
					} else {
						textfields.setEditable(true);
					}

				}

			} 

		});

		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 0;
		panel_11.add(button_3, gbc_button_3);

	}

	private void errorString(JPanel panel, String textPane) {

		JPanel errorPanel = new JPanel();
		errorPanel.setBounds(237, 140, 205, 115);
		panel.add(errorPanel);
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
		txtpnDuSkalSkrive.setText(textPane);
		txtpnDuSkalSkrive.setBounds(45, 11, 125, 47);
		errorPanel.add(txtpnDuSkalSkrive);

	}

	/*
	 * Prints all persons and customerNumber and employeeNumber
	 */
	
	private void getAllPersons(){
		ArrayList<Person> persons = personCtrl.getAllPersons();
		
		for (Person person : persons){
			if (person instanceof Customer) {			
				Customer customer = (Customer) person;
				System.out.println(person.getName().toString() + "Kundenummer" + String.valueOf(customer.getCustomerNumber()));	
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				System.out.println(person.getName().toString() + " Medarbejdernummer: " + String.valueOf(employee.getEmployeeNumber()));	
			}
		}
	}

	private Person getPerson(String phone) {
		return personCtrl.getPerson(phone);

	}

	private void disableAllFields() {
		JTextField[] textFieldReturnAll = {textFieldReturnName, textFieldReturnAddress, textFieldReturnCity, textFieldReturnPostalCode};
		for (JTextField textfields : textFieldReturnAll) {
			textfields.setEditable(false);
		}
	}

	private void emptyFields(JPanel panel) {
		Component[] components = panel.getComponents();
		for(Component component : components) {
			if(component instanceof JTextField) {
				JTextField textField = (JTextField) component;
				textField.setText("");
			}
		}
	}
}
