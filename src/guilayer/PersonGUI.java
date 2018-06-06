package guilayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PersonGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCity;
	private JTextField textFieldPostalCode;
	private JTextField textFieldPhone;
	private JTextField textFieldName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
setBounds(100, 100, 700, 400);
		
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 674, 330);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Opret person", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 262, 669, 40);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Tilbage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnNewButton, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("Bek\u00E6ft");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Anuller");
		panel_5.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 11, 324, 253);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Navn");
		lblName.setBounds(10, 3, 48, 14);
		panel_1.add(lblName);
		
		JLabel lblPhone = new JLabel("Telefon");
		lblPhone.setBounds(10, 28, 48, 14);
		panel_1.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Adresse");
		lblAddress.setBounds(10, 53, 48, 14);
		panel_1.add(lblAddress);
		
		JTextField textFieldAddress = new JTextField();
		textFieldAddress.setBounds(93, 50, 221, 20);
		textFieldAddress.setColumns(10);
		panel_1.add(textFieldAddress);
		
		JLabel lblBy = new JLabel("By");
		lblBy.setBounds(10, 78, 48, 14);
		panel_1.add(lblBy);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(93, 75, 221, 20);
		textFieldCity.setColumns(10);
		panel_1.add(textFieldCity);
		
		JLabel lblPostNr = new JLabel("Post nr.");
		lblPostNr.setBounds(10, 103, 48, 14);
		panel_1.add(lblPostNr);
		
		textFieldPostalCode = new JTextField();
		textFieldPostalCode.setBounds(93, 100, 221, 20);
		textFieldPostalCode.setColumns(10);
		panel_1.add(textFieldPostalCode);
		
		
		JRadioButton rdbtnKunde = new JRadioButton("Kunde");
		rdbtnKunde.setBounds(93, 127, 70, 23);
		panel_1.add(rdbtnKunde);
		
		JRadioButton rdbtnMedarbejder = new JRadioButton("Medarbejder");
		rdbtnMedarbejder.setBounds(203, 127, 111, 23);
		panel_1.add(rdbtnMedarbejder);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnKunde);	
		group.add(rdbtnMedarbejder);	
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(93, 25, 221, 20);
		panel_1.add(textFieldPhone);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(93, 0, 221, 20);
		panel_1.add(textFieldName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(334, 11, 335, 253);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
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
		
		
		
		JButton confirmPerson = new JButton("Bek\u00E6ft");
		confirmPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				confirmPersonInput();
			}
			private void confirmPersonInput() {
				textField.setText(textFieldName.getText());
				textField_1.setText(textFieldPhone.getText());
				textField_2.setText(textFieldAddress.getText());
				textField_3.setText(textFieldCity.getText());
				textField_4.setText(textFieldPostalCode.getText());
				
				try {
					if (rdbtnMedarbejder.isSelected() == true) {
						chckbxMedarbejderNummer.setSelected(true);
					} else {
						chckbxMedarbejderNummer.setSelected(false);
					} if (rdbtnKunde.isSelected() == true) {
						chckbxKundenummer.setSelected(true);
					} else {
						chckbxKundenummer.setSelected(false);
					}
					
					    
					
				} catch (Exception e) {
					
					
				}
				
				
			}
			
			
		});
		
		if(textFieldName.getText().trim().isEmpty()) {
			confirmPerson.setEnabled(false);
		} else {
			confirmPerson.setEnabled(true);
		}
		
		confirmPerson.setBounds(233, 219, 81, 23);
		panel_1.add(confirmPerson);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Rediger person", null, panel_3, null);
		tabbedPane.setEnabledAt(1, false);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(174, 11, 331, 49);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Find Person", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_6.setBackground(Color.DARK_GRAY);
		panel_3.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel label_5 = new JLabel("Indtast telefonnr.");
		label_5.setForeground(Color.WHITE);
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 0;
		panel_6.add(label_5, gbc_label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 0;
		panel_6.add(textField_5, gbc_textField_5);
		
		JButton button = new JButton("Find");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 2;
		gbc_button.gridy = 0;
		panel_6.add(button, gbc_button);
		
		
		
		
	}
}
