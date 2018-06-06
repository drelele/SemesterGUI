package guilayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCtrPrice;
	private JTextField txtShowBarcode;
	private JTextField txtShowTitle;
	private JTextField txtShowPrice;
	private JTextField txtShowAmount;
	private JTextField txtShowStock;
	private JTextField txtSearchBarcode;
	private JTextField txtFoundPrice;
	private JTextField txtFoundBarcode;
	private JTextField txtFoundTitle;
	private JTextField txtFoundAmount;
	private JTextField txtFoundStock;
	private JTextField txtSearchBarcode1;
	private JTextField textField;
	private JTextField txtShowPrice1;
	private JTextField txtShowBarcode1;
	private JTextField txtShowTitle1;
	private JTextField txtShowAmount1;
	private JTextField txtShowStock1;
	private JTextField txtSearchBarcode3;
	private JTextField txtSerialNumber;
	private JTextField textField_2;
	private JTextField txtShowPrice2;
	private JTextField txtShowBarcode2;
	private JTextField txtShowTitle2;
	private JTextField txtShowAmount2;
	private JTextField txtShowStock2;
	private JTextField txtSearchBarcode2;
	private JTextField txtShowBarcode3;
	private JTextField txtShowTitle3;
	private JTextField txtShowAmount3;
	private JTextField txtShowStock3;
	private JTextField txtShowPrice3;
	private JTextField txtSearchBarcode4;
	private JTextField txtShowBarcode4;
	private JTextField txtShowTitle4;
	private JTextField txtShowAmount4;
	private JTextField txtShowStock4;
	private JTextField txtShowPrice4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductGUI frame = new ProductGUI();
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
	public ProductGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Opret produkt", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Opret produkt", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel pnlCtrProduct = new JPanel();
		pnlCtrProduct.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode = new JLabel("Stregkode:");
		
		JLabel lblShowTitle = new JLabel("Titel:");
		
		JLabel lblShowDescription = new JLabel("Beskrivelse:");
		
		JLabel lblShowPrice = new JLabel("Pris:");
		
		JLabel lblShowAmount = new JLabel("Antal:");
		
		JLabel lblShowStock = new JLabel("Stock:");
		
		txtShowBarcode = new JTextField();
		txtShowBarcode.setColumns(10);
		
		txtShowTitle = new JTextField();
		txtShowTitle.setText("");
		txtShowTitle.setColumns(10);
		
		JScrollPane scrShowDescription = new JScrollPane();
		
		txtShowPrice = new JTextField();
		txtShowPrice.setColumns(10);
		
		txtShowAmount = new JTextField();
		txtShowAmount.setColumns(10);
		
		txtShowStock = new JTextField();
		txtShowStock.setColumns(10);
		GroupLayout gl_pnlCtrProduct = new GroupLayout(pnlCtrProduct);
		gl_pnlCtrProduct.setHorizontalGroup(
			gl_pnlCtrProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblShowBarcode)
						.addComponent(lblShowDescription)
						.addComponent(lblShowTitle)
						.addComponent(lblShowPrice)
						.addGroup(gl_pnlCtrProduct.createSequentialGroup()
							.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowStock)
								.addComponent(lblShowAmount))
							.addGap(2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(txtShowPrice, Alignment.TRAILING)
						.addComponent(txtShowBarcode)
						.addComponent(txtShowTitle)
						.addComponent(scrShowDescription, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(txtShowAmount)
						.addComponent(txtShowStock))
					.addGap(8))
		);
		gl_pnlCtrProduct.setVerticalGroup(
			gl_pnlCtrProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode)
						.addComponent(txtShowBarcode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle)
						.addComponent(txtShowTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription)
						.addComponent(scrShowDescription, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtShowPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPrice))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount)
						.addComponent(txtShowAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock)
						.addComponent(txtShowStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		
		JTextArea txtAreaShowDescription = new JTextArea();
		scrShowDescription.setViewportView(txtAreaShowDescription);
		pnlCtrProduct.setLayout(gl_pnlCtrProduct);
		
		JButton btnBack = new JButton("Tilbage");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
							.addComponent(pnlCtrProduct, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnBack))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlCtrProduct, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
							.addComponent(btnBack)))
					.addContainerGap())
		);
		
		JLabel lblCtrName = new JLabel("Navn:");
		
		JLabel lblCtrDescription = new JLabel("Beskrivelse:");
		
		JLabel lblCtrPrice = new JLabel("Pris:");
		
		JTextField txtCtrName = new JTextField();
		txtCtrName.setColumns(10);
		
		JScrollPane scrCtrDescription = new JScrollPane();
		
		txtCtrPrice = new JTextField();
		txtCtrPrice.setColumns(10);
		
		JButton btnCtrCancel = new JButton("Cancel");
		
		JButton btnCtrCreate = new JButton("Opret");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCtrName)
								.addComponent(lblCtrDescription)
								.addComponent(lblCtrPrice))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtCtrName)
								.addComponent(scrCtrDescription, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(txtCtrPrice)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnCtrCreate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCtrCancel)))
					.addGap(8))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCtrName)
						.addComponent(txtCtrName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCtrDescription)
						.addComponent(scrCtrDescription, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCtrPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCtrPrice))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCtrCancel)
						.addComponent(btnCtrCreate))
					.addContainerGap())
		);
		
		JTextArea txtAreaDescription = new JTextArea();
		scrCtrDescription.setViewportView(txtAreaDescription);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Find produkt", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.DARK_GRAY);
		
		JPanel pnlSearch = new JPanel();
		pnlSearch.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlSearch.setBackground(Color.DARK_GRAY);
		pnlSearch.setBounds(164, 11, 331, 49);
		panel_4.add(pnlSearch);
		GridBagLayout gbl_pnlSearch = new GridBagLayout();
		gbl_pnlSearch.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSearch.rowHeights = new int[]{0, 0};
		gbl_pnlSearch.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSearch.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSearch.setLayout(gbl_pnlSearch);
		
		JLabel lblSearchBarcode = new JLabel("Indtast stregkoden:");
		lblSearchBarcode.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode = new GridBagConstraints();
		gbc_lblSearchBarcode.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode.gridx = 0;
		gbc_lblSearchBarcode.gridy = 0;
		pnlSearch.add(lblSearchBarcode, gbc_lblSearchBarcode);
		
		txtSearchBarcode = new JTextField();
		txtSearchBarcode.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode = new GridBagConstraints();
		gbc_txtSearchBarcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode.gridx = 1;
		gbc_txtSearchBarcode.gridy = 0;
		pnlSearch.add(txtSearchBarcode, gbc_txtSearchBarcode);
		
		JButton btnSearchFind = new JButton("Find");
		GridBagConstraints gbc_btnSearchFind = new GridBagConstraints();
		gbc_btnSearchFind.gridx = 2;
		gbc_btnSearchFind.gridy = 0;
		pnlSearch.add(btnSearchFind, gbc_btnSearchFind);
		
		JPanel pnlFoundProduct = new JPanel();
		pnlFoundProduct.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblFoundBarcode = new JLabel("Stregkode:");
		
		JLabel lblFoundDescription = new JLabel("Beskrivelse:");
		
		JLabel lblFoundTitle = new JLabel("Titel:");
		
		JLabel lblFoundPrice = new JLabel("Pris:");
		
		JLabel lblFoundStock = new JLabel("Stock:");
		
		JLabel lblFoundAmount = new JLabel("Antal:");
		
		txtFoundPrice = new JTextField();
		txtFoundPrice.setColumns(10);
		
		txtFoundBarcode = new JTextField();
		txtFoundBarcode.setColumns(10);
		
		txtFoundTitle = new JTextField();
		txtFoundTitle.setText("");
		txtFoundTitle.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		txtFoundAmount = new JTextField();
		txtFoundAmount.setColumns(10);
		
		txtFoundStock = new JTextField();
		txtFoundStock.setColumns(10);
		GroupLayout gl_pnlFoundProduct = new GroupLayout(pnlFoundProduct);
		gl_pnlFoundProduct.setHorizontalGroup(
			gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblFoundBarcode)
						.addComponent(lblFoundDescription)
						.addComponent(lblFoundTitle)
						.addComponent(lblFoundPrice)
						.addGroup(gl_pnlFoundProduct.createSequentialGroup()
							.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblFoundStock)
								.addComponent(lblFoundAmount))
							.addGap(2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFoundProduct.createSequentialGroup()
							.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(txtFoundBarcode, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtFoundTitle, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtFoundAmount, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtFoundStock, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
							.addGap(8))
						.addGroup(gl_pnlFoundProduct.createSequentialGroup()
							.addComponent(txtFoundPrice, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
							.addGap(10))))
		);
		gl_pnlFoundProduct.setVerticalGroup(
			gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundBarcode)
						.addComponent(txtFoundBarcode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundTitle)
						.addComponent(txtFoundTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFoundDescription)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFoundPrice)
						.addComponent(txtFoundPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundAmount)
						.addComponent(txtFoundAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundStock)
						.addComponent(txtFoundStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JTextArea txtFoundAreaDescription = new JTextArea();
		scrollPane.setViewportView(txtFoundAreaDescription);
		pnlFoundProduct.setLayout(gl_pnlFoundProduct);
		
		JButton btnBack1 = new JButton("Tilbage");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(164)
					.addComponent(pnlFoundProduct, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack1)
					.addContainerGap(564, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(pnlFoundProduct, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(btnBack1)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Opret item", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.DARK_GRAY);
		
		JPanel pnlSearch1 = new JPanel();
		pnlSearch1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlSearch1.setBackground(Color.DARK_GRAY);
		pnlSearch1.setBounds(164, 11, 331, 49);
		panel_6.add(pnlSearch1);
		GridBagLayout gbl_pnlSearch1 = new GridBagLayout();
		gbl_pnlSearch1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSearch1.rowHeights = new int[]{0, 0};
		gbl_pnlSearch1.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSearch1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSearch1.setLayout(gbl_pnlSearch1);
		
		JLabel lblSearchBarcode1 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode1.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode1 = new GridBagConstraints();
		gbc_lblSearchBarcode1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode1.gridx = 0;
		gbc_lblSearchBarcode1.gridy = 0;
		pnlSearch1.add(lblSearchBarcode1, gbc_lblSearchBarcode1);
		
		txtSearchBarcode1 = new JTextField();
		txtSearchBarcode1.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode1 = new GridBagConstraints();
		gbc_txtSearchBarcode1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode1.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode1.gridx = 1;
		gbc_txtSearchBarcode1.gridy = 0;
		pnlSearch1.add(txtSearchBarcode1, gbc_txtSearchBarcode1);
		
		JButton btnSearch1 = new JButton("Find");
		GridBagConstraints gbc_btnSearch1 = new GridBagConstraints();
		gbc_btnSearch1.gridx = 2;
		gbc_btnSearch1.gridy = 0;
		pnlSearch1.add(btnSearch1, gbc_btnSearch1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opret item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblCtrItemName = new JLabel("Navn:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button = new JButton("Opret");
		
		JButton button_1 = new JButton("Cancel");
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(lblCtrItemName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1)))
					.addGap(8))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCtrItemName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button))
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		
		JPanel pnlCtrProduct1 = new JPanel();
		pnlCtrProduct1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode1 = new JLabel("Stregkode:");
		
		JLabel label_1 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle1 = new JLabel("Titel:");
		
		JLabel lblShowPrice1 = new JLabel("Pris:");
		
		JLabel lblShowStock1 = new JLabel("Stock:");
		
		JLabel lblShowAmount1 = new JLabel("Antal:");
		
		txtShowPrice1 = new JTextField();
		txtShowPrice1.setColumns(10);
		
		txtShowBarcode1 = new JTextField();
		txtShowBarcode1.setColumns(10);
		
		txtShowTitle1 = new JTextField();
		txtShowTitle1.setText("");
		txtShowTitle1.setColumns(10);
		
		JScrollPane scrShowDescription1 = new JScrollPane();
		
		txtShowAmount1 = new JTextField();
		txtShowAmount1.setColumns(10);
		
		txtShowStock1 = new JTextField();
		txtShowStock1.setColumns(10);
		GroupLayout gl_pnlCtrProduct1 = new GroupLayout(pnlCtrProduct1);
		gl_pnlCtrProduct1.setHorizontalGroup(
			gl_pnlCtrProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrProduct1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblShowBarcode1)
						.addComponent(label_1)
						.addComponent(lblShowTitle1)
						.addComponent(lblShowPrice1)
						.addGroup(gl_pnlCtrProduct1.createSequentialGroup()
							.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowStock1)
								.addComponent(lblShowAmount1))
							.addGap(2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtShowPrice1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowBarcode1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowTitle1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(scrShowDescription1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowAmount1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowStock1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_pnlCtrProduct1.setVerticalGroup(
			gl_pnlCtrProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrProduct1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode1)
						.addComponent(txtShowBarcode1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle1)
						.addComponent(txtShowTitle1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(scrShowDescription1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtShowPrice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPrice1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount1)
						.addComponent(txtShowAmount1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCtrProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock1)
						.addComponent(txtShowStock1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		JTextArea txtAreaDescription1 = new JTextArea();
		scrShowDescription1.setViewportView(txtAreaDescription1);
		pnlCtrProduct1.setLayout(gl_pnlCtrProduct1);
		
		JButton btnBack2 = new JButton("Tilbage");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(pnlCtrProduct1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack2)
					.addContainerGap(564, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlCtrProduct1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addComponent(btnBack2)
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Slet item", null, panel_2, null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.DARK_GRAY);
		
		JPanel pnlSearch3 = new JPanel();
		pnlSearch3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlSearch3.setBackground(Color.DARK_GRAY);
		pnlSearch3.setBounds(164, 11, 331, 49);
		panel_8.add(pnlSearch3);
		GridBagLayout gbl_pnlSearch3 = new GridBagLayout();
		gbl_pnlSearch3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSearch3.rowHeights = new int[]{0, 0};
		gbl_pnlSearch3.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSearch3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSearch3.setLayout(gbl_pnlSearch3);
		
		JLabel lblSearchBarcode3 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode3.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode3 = new GridBagConstraints();
		gbc_lblSearchBarcode3.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode3.gridx = 0;
		gbc_lblSearchBarcode3.gridy = 0;
		pnlSearch3.add(lblSearchBarcode3, gbc_lblSearchBarcode3);
		
		txtSearchBarcode3 = new JTextField();
		txtSearchBarcode3.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode3 = new GridBagConstraints();
		gbc_txtSearchBarcode3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode3.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode3.gridx = 1;
		gbc_txtSearchBarcode3.gridy = 0;
		pnlSearch3.add(txtSearchBarcode3, gbc_txtSearchBarcode3);
		
		JButton btnFind3 = new JButton("Find");
		GridBagConstraints gbc_btnFind3 = new GridBagConstraints();
		gbc_btnFind3.gridx = 2;
		gbc_btnFind3.gridy = 0;
		pnlSearch3.add(btnFind3, gbc_btnFind3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opret item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblSerialNumber = new JLabel("Serienummer:");
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setColumns(10);
		
		JButton button_3 = new JButton("Opret");
		
		JLabel lblDeleteText = new JLabel("Indtast serienummeret p\u00E5 det item du");
		
		JLabel lblDeleteText1 = new JLabel("\u00F8nsker at slette:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addComponent(lblSerialNumber)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSerialNumber, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3))
						.addComponent(lblDeleteText)
						.addComponent(lblDeleteText1))
					.addContainerGap())
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSerialNumber)
						.addComponent(txtSerialNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addComponent(lblDeleteText)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDeleteText1)
					.addGap(11)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3))
					.addContainerGap())
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel pnlShowProduct2 = new JPanel();
		pnlShowProduct2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode2 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription2 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle2 = new JLabel("Titel:");
		
		JLabel lblShowPrice2 = new JLabel("Pris:");
		
		JLabel lblShowStock2 = new JLabel("Stock:");
		
		JLabel lblShowAmount2 = new JLabel("Antal:");
		
		txtShowPrice2 = new JTextField();
		txtShowPrice2.setColumns(10);
		
		txtShowBarcode2 = new JTextField();
		txtShowBarcode2.setColumns(10);
		
		txtShowTitle2 = new JTextField();
		txtShowTitle2.setText("");
		txtShowTitle2.setColumns(10);
		
		JScrollPane scrShowDescription2 = new JScrollPane();
		
		txtShowAmount2 = new JTextField();
		txtShowAmount2.setColumns(10);
		
		txtShowStock2 = new JTextField();
		txtShowStock2.setColumns(10);
		GroupLayout gl_pnlShowProduct2 = new GroupLayout(pnlShowProduct2);
		gl_pnlShowProduct2.setHorizontalGroup(
			gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
				.addGroup(gl_pnlShowProduct2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblShowBarcode2)
						.addComponent(lblShowDescription2)
						.addComponent(lblShowTitle2)
						.addComponent(lblShowPrice2)
						.addGroup(gl_pnlShowProduct2.createSequentialGroup()
							.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowStock2)
								.addComponent(lblShowAmount2))
							.addGap(2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
						.addComponent(txtShowPrice2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowBarcode2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowTitle2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(scrShowDescription2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowAmount2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowStock2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_pnlShowProduct2.setVerticalGroup(
			gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 273, Short.MAX_VALUE)
				.addGroup(gl_pnlShowProduct2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode2)
						.addComponent(txtShowBarcode2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle2)
						.addComponent(txtShowTitle2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription2)
						.addComponent(scrShowDescription2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtShowPrice2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPrice2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount2)
						.addComponent(txtShowAmount2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock2)
						.addComponent(txtShowStock2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		JTextArea txtAreaDescription2 = new JTextArea();
		scrShowDescription2.setViewportView(txtAreaDescription2);
		pnlShowProduct2.setLayout(gl_pnlShowProduct2);
		
		JButton btnBack3 = new JButton("Tilbage");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(pnlShowProduct2, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack3)
					.addContainerGap(564, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlShowProduct2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addComponent(btnBack3)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Opdater produkt", null, panel_9, null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.DARK_GRAY);
		
		JPanel pnlSearch2 = new JPanel();
		pnlSearch2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlSearch2.setBackground(Color.DARK_GRAY);
		pnlSearch2.setBounds(164, 11, 331, 49);
		panel_11.add(pnlSearch2);
		GridBagLayout gbl_pnlSearch2 = new GridBagLayout();
		gbl_pnlSearch2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSearch2.rowHeights = new int[]{0, 0};
		gbl_pnlSearch2.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSearch2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSearch2.setLayout(gbl_pnlSearch2);
		
		JLabel lblSearchBarcode2 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode2 = new GridBagConstraints();
		gbc_lblSearchBarcode2.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode2.gridx = 0;
		gbc_lblSearchBarcode2.gridy = 0;
		pnlSearch2.add(lblSearchBarcode2, gbc_lblSearchBarcode2);
		
		txtSearchBarcode2 = new JTextField();
		txtSearchBarcode2.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode2 = new GridBagConstraints();
		gbc_txtSearchBarcode2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode2.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode2.gridx = 1;
		gbc_txtSearchBarcode2.gridy = 0;
		pnlSearch2.add(txtSearchBarcode2, gbc_txtSearchBarcode2);
		
		JButton button_2 = new JButton("Find");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 0;
		pnlSearch2.add(button_2, gbc_button_2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode3 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription3 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle3 = new JLabel("Titel:");
		
		JLabel lblShowPrice3 = new JLabel("Pris:");
		
		JLabel lblShowStock3 = new JLabel("Stock:");
		
		JLabel lblShowAmount3 = new JLabel("Antal:");
		
		JScrollPane scrShowDescription3 = new JScrollPane();
		
		txtShowBarcode3 = new JTextField();
		txtShowBarcode3.setColumns(10);
		
		txtShowTitle3 = new JTextField();
		txtShowTitle3.setText("");
		txtShowTitle3.setColumns(10);
		
		txtShowAmount3 = new JTextField();
		txtShowAmount3.setColumns(10);
		
		txtShowStock3 = new JTextField();
		txtShowStock3.setColumns(10);
		
		txtShowPrice3 = new JTextField();
		txtShowPrice3.setColumns(10);
		
		JButton btnEdit = new JButton("\u00C6ndre");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowBarcode3)
								.addComponent(lblShowDescription3)
								.addComponent(lblShowTitle3)
								.addComponent(lblShowPrice3)
								.addGroup(gl_panel_12.createSequentialGroup()
									.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblShowStock3)
										.addComponent(lblShowAmount3))
									.addGap(2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_12.createSequentialGroup()
									.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
										.addComponent(scrShowDescription3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowBarcode3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowTitle3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowAmount3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowStock3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(gl_panel_12.createSequentialGroup()
									.addComponent(txtShowPrice3, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
									.addGap(10))))
						.addGroup(Alignment.TRAILING, gl_panel_12.createSequentialGroup()
							.addComponent(btnEdit)
							.addContainerGap())))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode3)
						.addComponent(txtShowBarcode3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle3)
						.addComponent(txtShowTitle3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription3)
						.addComponent(scrShowDescription3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowPrice3)
						.addComponent(txtShowPrice3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount3)
						.addComponent(txtShowAmount3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock3)
						.addComponent(txtShowStock3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnEdit)
					.addContainerGap())
		);
		
		JTextArea txtAreaDescription3 = new JTextArea();
		txtAreaDescription3.setText("");
		scrShowDescription3.setViewportView(txtAreaDescription3);
		panel_12.setLayout(gl_panel_12);
		
		JButton btnBack4 = new JButton("Tilbage");
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack4)
					.addGap(87)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
							.addComponent(btnBack4)
							.addContainerGap())
						.addGroup(gl_panel_9.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_13 = new JPanel();
		tabbedPane.addTab("Slet produkt", null, panel_13, null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.DARK_GRAY);
		
		JPanel pnlSearch4 = new JPanel();
		pnlSearch4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find produkt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		pnlSearch4.setBackground(Color.DARK_GRAY);
		pnlSearch4.setBounds(164, 11, 331, 49);
		panel_14.add(pnlSearch4);
		GridBagLayout gbl_pnlSearch4 = new GridBagLayout();
		gbl_pnlSearch4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlSearch4.rowHeights = new int[]{0, 0};
		gbl_pnlSearch4.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlSearch4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlSearch4.setLayout(gbl_pnlSearch4);
		
		JLabel lblSearchBarcode4 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode4.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode4 = new GridBagConstraints();
		gbc_lblSearchBarcode4.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode4.gridx = 0;
		gbc_lblSearchBarcode4.gridy = 0;
		pnlSearch4.add(lblSearchBarcode4, gbc_lblSearchBarcode4);
		
		txtSearchBarcode4 = new JTextField();
		txtSearchBarcode4.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode4 = new GridBagConstraints();
		gbc_txtSearchBarcode4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode4.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode4.gridx = 1;
		gbc_txtSearchBarcode4.gridy = 0;
		pnlSearch4.add(txtSearchBarcode4, gbc_txtSearchBarcode4);
		
		JButton button_4 = new JButton("Find");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.gridx = 2;
		gbc_button_4.gridy = 0;
		pnlSearch4.add(button_4, gbc_button_4);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode4 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription4 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle4 = new JLabel("Titel:");
		
		JLabel lblShowPrice4 = new JLabel("Pris:");
		
		JLabel lblShowStock4 = new JLabel("Stock:");
		
		JLabel lblShowAmount4 = new JLabel("Antal:");
		
		JScrollPane srcShowDescription4 = new JScrollPane();
		
		txtShowBarcode4 = new JTextField();
		txtShowBarcode4.setColumns(10);
		
		txtShowTitle4 = new JTextField();
		txtShowTitle4.setText("");
		txtShowTitle4.setColumns(10);
		
		txtShowAmount4 = new JTextField();
		txtShowAmount4.setColumns(10);
		
		txtShowStock4 = new JTextField();
		txtShowStock4.setColumns(10);
		
		txtShowPrice4 = new JTextField();
		txtShowPrice4.setColumns(10);
		
		JButton btnDelete = new JButton("Slet");
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_15.createSequentialGroup()
							.addGroup(gl_panel_15.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowBarcode4)
								.addComponent(lblShowDescription4)
								.addComponent(lblShowTitle4)
								.addComponent(lblShowPrice4)
								.addGroup(gl_panel_15.createSequentialGroup()
									.addGroup(gl_panel_15.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblShowStock4)
										.addComponent(lblShowAmount4))
									.addGap(2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_15.createSequentialGroup()
									.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
										.addComponent(srcShowDescription4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowBarcode4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowTitle4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowAmount4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowStock4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(gl_panel_15.createSequentialGroup()
									.addComponent(txtShowPrice4, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
									.addGap(10))))
						.addGroup(Alignment.TRAILING, gl_panel_15.createSequentialGroup()
							.addComponent(btnDelete)
							.addContainerGap())))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode4)
						.addComponent(txtShowBarcode4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle4)
						.addComponent(txtShowTitle4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription4)
						.addComponent(srcShowDescription4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowPrice4)
						.addComponent(txtShowPrice4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount4)
						.addComponent(txtShowAmount4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock4)
						.addComponent(txtShowStock4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(btnDelete)
					.addContainerGap())
		);
		
		JTextArea txtAreaDescription4 = new JTextArea();
		txtAreaDescription4.setText("");
		srcShowDescription4.setViewportView(txtAreaDescription4);
		panel_15.setLayout(gl_panel_15);
		
		JButton btnBack5 = new JButton("Tilbage");
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack5)
					.addGap(87)
					.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack5, Alignment.TRAILING)
						.addComponent(panel_15, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_13.setLayout(gl_panel_13);
		contentPane.setLayout(gl_contentPane);
	}
}