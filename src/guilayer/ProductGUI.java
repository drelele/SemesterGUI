package guilayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

import controllerlayer.ProductController;
import modellayer.Product;
import modellayer.Item;

import javax.swing.JList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;

public class ProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCtrPrice;
	private JTextField txtShowBarcode;
	private JTextField txtShowTitle;
	private JTextField txtShowPrice;
	private JTextField txtShowAmount;
	private JTextField txtShowStock;
	private JTextField txtSearchBarcode;
	private JTextField txtShowPrice1;
	private JTextField txtShowBarcode1;
	private JTextField txtShowTitle1;
	private JTextField txtShowAmount1;
	private JTextField txtShowStock1;
	private JTextField txtSearchBarcode1;
	private JTextField txtItem;
	private JTextField txtShowPrice2;
	private JTextField txtShowBarcode2;
	private JTextField txtShowTitle2;
	private JTextField txtShowAmount2;
	private JTextField txtShowStock2;
	private JTextField txtSearchBarcode2;
	private JTextField txtSerialCode;
	private JTextField txtShowPrice3;
	private JTextField txtShowBarcode3;
	private JTextField txtShowTitle3;
	private JTextField txtShowAmount3;
	private JTextField txtShowStock3;
	private JTextField txtSearchBarcode3;
	private JTextField txtShowBarcode4;
	private JTextField txtShowTitle4;
	private JTextField txtShowAmount4;
	private JTextField txtShowStock4;
	private JTextField txtShowPrice4;
	private JTextField txtSearchBarcode4;
	private JTextField txtShowBarcode5;
	private JTextField txtShowTitle5;
	private JTextField txtShowAmount5;
	private JTextField txtShowStock5;
	private JTextField txtShowPrice5;
	private JTextArea txtDescription;
	private JTextArea txtAreaDescription;
	private JTextField txtCtrName;
	private JTextArea txtAreaDescription1;
	private JTextArea txtAreaDescription2;
	private DefaultListModel defaultListModel;
	private JList lstItem;
	private JTextArea txtAreaDescription3;
	private JButton btnItemCreate;
	private JButton btnDeleteItem;
	private JTextArea txtAreaDescription4;
	private JTextArea txtAreaDescription5;
	private JButton btnDeleteProdukt;
	private JLabel lblCtrPrice;
	private JButton btnCtrCreate;
	private JPanel pnlFoundProduct;
	
	private ProductController productController;
	private Product product;
	private String name;
	private String description;
	private double price;
	private Item item;
	private ArrayList<Item> items;
	private JPanel pnlCreateProduct;
	private JPanel pnlFoundProduct1;
	private JPanel pnlCtrItem;
	private JPanel pnlShowProduct2;
	private JPanel pnlDeleteItem;
	private JPanel pnlFoundProduct2;
	private JPanel pnlCtrProduct;
	private JPanel pnlFoundProduct3;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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
		productController = new ProductController();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
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
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Opret produkt", null, panel, null);
		
		pnlCreateProduct = new JPanel();
		pnlCreateProduct.setBorder(new TitledBorder(null, "Opret produkt", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		pnlCtrProduct = new JPanel();
		pnlCtrProduct.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode = new JLabel("Stregkode:");
		
		JLabel lblShowTitle = new JLabel("Titel:");
		
		JLabel lblShowDescription = new JLabel("Beskrivelse:");
		
		JLabel lblShowPrice = new JLabel("Pris:");
		
		JLabel lblShowAmount = new JLabel("Antal:");
		
		JLabel lblShowStock = new JLabel("Stock:");
		
		txtShowBarcode = new JTextField();
		txtShowBarcode.setName("barcode");
		txtShowBarcode.setEditable(false);
		txtShowBarcode.setToolTipText("");
		txtShowBarcode.setColumns(10);
		
		txtShowTitle = new JTextField();
		txtShowTitle.setName("title");
		txtShowTitle.setEditable(false);
		txtShowTitle.setText("");
		txtShowTitle.setColumns(10);
		
		JScrollPane scrShowDescription = new JScrollPane();
		
		txtShowPrice = new JTextField();
		txtShowPrice.setName("price");
		txtShowPrice.setEditable(false);
		txtShowPrice.setColumns(10);
		
		txtShowAmount = new JTextField();
		txtShowAmount.setName("amount");
		txtShowAmount.setEditable(false);
		txtShowAmount.setColumns(10);
		
		txtShowStock = new JTextField();
		txtShowStock.setName("stock");
		txtShowStock.setEditable(false);
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
		
		txtAreaDescription = new JTextArea();
		txtAreaDescription.setBackground(UIManager.getColor("Button.background"));
		txtAreaDescription.setName("description");
		txtAreaDescription.setEditable(false);
		scrShowDescription.setViewportView(txtAreaDescription);
		pnlCtrProduct.setLayout(gl_pnlCtrProduct);
		
		JButton btnBack = new JButton("Tilbage");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(pnlCreateProduct, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
							.addComponent(pnlCtrProduct, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnBack))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlCtrProduct, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlCreateProduct, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblCtrName = new JLabel("Navn:");
		
		JLabel lblCtrDescription = new JLabel("Beskrivelse:");
		
		lblCtrPrice = new JLabel("Pris:");
		
		txtCtrName = new JTextField();
		txtCtrName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(!txtCtrName.getText().trim().isEmpty()) {
					inputValidation(true);
				}else {
					inputValidation(false);
				}
			}
		});

		txtCtrName.setColumns(10);
		
		JScrollPane scrCtrDescription = new JScrollPane();
		
		txtCtrPrice = new JTextField();
		txtCtrPrice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!txtCtrPrice.getText().trim().isEmpty()) {
					inputValidation(true);
				}else {
					inputValidation(false);
				}
			}
		});

		txtCtrPrice.setColumns(10);
		
		JButton btnCtrCancel = new JButton("Cancel");
		btnCtrCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFields(pnlCreateProduct);
			}
		});
		
		btnCtrCreate = new JButton("Opret");
		btnCtrCreate.setEnabled(false);
		btnCtrCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				name = txtCtrName.getText();
				description = txtDescription.getText();
				price = Double.parseDouble(txtCtrPrice.getText());
		
				createProduct(name, description, price);
			}
		});
		GroupLayout gl_pnlCreateProduct = new GroupLayout(pnlCreateProduct);
		gl_pnlCreateProduct.setHorizontalGroup(
			gl_pnlCreateProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCreateProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlCreateProduct.createSequentialGroup()
							.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCtrName)
								.addComponent(lblCtrDescription)
								.addComponent(lblCtrPrice))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtCtrName)
								.addComponent(scrCtrDescription, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
								.addComponent(txtCtrPrice)))
						.addGroup(gl_pnlCreateProduct.createSequentialGroup()
							.addComponent(btnCtrCreate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCtrCancel)))
					.addGap(8))
		);
		gl_pnlCreateProduct.setVerticalGroup(
			gl_pnlCreateProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCreateProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCtrName)
						.addComponent(txtCtrName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCtrDescription)
						.addComponent(scrCtrDescription, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCtrPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCtrPrice))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCtrCancel)
						.addComponent(btnCtrCreate))
					.addContainerGap())
		);
		
		txtDescription = new JTextArea();
		txtDescription.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!txtDescription.getText().trim().isEmpty()) {
					inputValidation(true);
				}else {
					inputValidation(false);
				}
			}
		});

		scrCtrDescription.setViewportView(txtDescription);
		pnlCreateProduct.setLayout(gl_pnlCreateProduct);
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
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String barcode = txtSearchBarcode.getText();
				getProduct(barcode,pnlFoundProduct);
			}
		});
		GridBagConstraints gbc_btnFind = new GridBagConstraints();
		gbc_btnFind.gridx = 2;
		gbc_btnFind.gridy = 0;
		pnlSearch.add(btnFind, gbc_btnFind);
		
		pnlFoundProduct = new JPanel();
		pnlFoundProduct.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblFoundBarcode = new JLabel("Stregkode:");
		
		JLabel lblFoundDescription = new JLabel("Beskrivelse:");
		
		JLabel lblFoundTitle = new JLabel("Titel:");
		
		JLabel lblFoundPrice = new JLabel("Pris:");
		
		JLabel lblFoundStock = new JLabel("Stock:");
		
		JLabel lblFoundAmount = new JLabel("Antal:");
		
		txtShowPrice1 = new JTextField();
		txtShowPrice1.setEditable(false);
		txtShowPrice1.setName("price");
		txtShowPrice1.setColumns(10);
		
		txtShowBarcode1 = new JTextField();
		txtShowBarcode1.setEditable(false);
		txtShowBarcode1.setName("barcode");
		txtShowBarcode1.setColumns(10);
		
		txtShowTitle1 = new JTextField();
		txtShowTitle1.setEditable(false);
		txtShowTitle1.setName("title");
		txtShowTitle1.setText("");
		txtShowTitle1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setName("");
		
		txtShowAmount1 = new JTextField();
		txtShowAmount1.setEditable(false);
		txtShowAmount1.setName("amount");
		txtShowAmount1.setColumns(10);
		
		txtShowStock1 = new JTextField();
		txtShowStock1.setEditable(false);
		txtShowStock1.setName("stock");
		txtShowStock1.setColumns(10);
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
								.addComponent(txtShowBarcode1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtShowTitle1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtShowAmount1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(txtShowStock1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
							.addGap(8))
						.addGroup(gl_pnlFoundProduct.createSequentialGroup()
							.addComponent(txtShowPrice1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
							.addGap(10))))
		);
		gl_pnlFoundProduct.setVerticalGroup(
			gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundBarcode)
						.addComponent(txtShowBarcode1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundTitle)
						.addComponent(txtShowTitle1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFoundDescription)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFoundPrice)
						.addComponent(txtShowPrice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundAmount)
						.addComponent(txtShowAmount1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoundStock)
						.addComponent(txtShowStock1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		txtAreaDescription1 = new JTextArea();
		txtAreaDescription1.setBackground(UIManager.getColor("Button.background"));
		txtAreaDescription1.setEditable(false);
		txtAreaDescription1.setName("description");
		scrollPane.setViewportView(txtAreaDescription1);
		pnlFoundProduct.setLayout(gl_pnlFoundProduct);
		
		JButton btnBack1 = new JButton("Tilbage");
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
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
		
		JButton btnFind1 = new JButton("Find");
		btnFind1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String barcode = txtSearchBarcode1.getText();
				getProduct(barcode,pnlFoundProduct1);
				btnEnable(product,btnItemCreate);
			}
		});
		GridBagConstraints gbc_btnFind1 = new GridBagConstraints();
		gbc_btnFind1.gridx = 2;
		gbc_btnFind1.gridy = 0;
		pnlSearch1.add(btnFind1, gbc_btnFind1);
		
		pnlCtrItem = new JPanel();
		pnlCtrItem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opret item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblCtrItemName = new JLabel("Indtast antal item(s):");
		
		txtItem = new JTextField();
		txtItem.setColumns(10);
		
		btnItemCreate = new JButton("Opret");
		btnItemCreate.setEnabled(false);
		btnItemCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(txtItem.getText());
				addItem(amount);
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields(pnlCtrItem);
			}
		});
		GroupLayout gl_pnlCtrItem = new GroupLayout(pnlCtrItem);
		gl_pnlCtrItem.setHorizontalGroup(
			gl_pnlCtrItem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrItem.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_pnlCtrItem.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlCtrItem.createSequentialGroup()
							.addComponent(lblCtrItemName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtItem, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
						.addGroup(gl_pnlCtrItem.createSequentialGroup()
							.addComponent(btnItemCreate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel)))
					.addGap(8))
		);
		gl_pnlCtrItem.setVerticalGroup(
			gl_pnlCtrItem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCtrItem.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCtrItem.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCtrItemName)
						.addComponent(txtItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_pnlCtrItem.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnItemCreate))
					.addContainerGap())
		);
		pnlCtrItem.setLayout(gl_pnlCtrItem);
		
		pnlFoundProduct1 = new JPanel();
		pnlFoundProduct1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode1 = new JLabel("Stregkode:");
		
		JLabel label_1 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle1 = new JLabel("Titel:");
		
		JLabel lblShowPrice1 = new JLabel("Pris:");
		
		JLabel lblShowStock1 = new JLabel("Stock:");
		
		JLabel lblShowAmount1 = new JLabel("Antal:");
		
		txtShowPrice2 = new JTextField();
		txtShowPrice2.setEditable(false);
		txtShowPrice2.setName("price");
		txtShowPrice2.setColumns(10);
		
		txtShowBarcode2 = new JTextField();
		txtShowBarcode2.setEditable(false);
		txtShowBarcode2.setName("barcode");
		txtShowBarcode2.setColumns(10);
		
		txtShowTitle2 = new JTextField();
		txtShowTitle2.setEditable(false);
		txtShowTitle2.setName("title");
		txtShowTitle2.setText("");
		txtShowTitle2.setColumns(10);
		
		JScrollPane scrShowDescription1 = new JScrollPane();
		
		txtShowAmount2 = new JTextField();
		txtShowAmount2.setEditable(false);
		txtShowAmount2.setName("amount");
		txtShowAmount2.setColumns(10);
		
		txtShowStock2 = new JTextField();
		txtShowStock2.setEditable(false);
		txtShowStock2.setName("stock");
		txtShowStock2.setColumns(10);
		GroupLayout gl_pnlFoundProduct1 = new GroupLayout(pnlFoundProduct1);
		gl_pnlFoundProduct1.setHorizontalGroup(
			gl_pnlFoundProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblShowBarcode1)
						.addComponent(label_1)
						.addComponent(lblShowTitle1)
						.addComponent(lblShowPrice1)
						.addGroup(gl_pnlFoundProduct1.createSequentialGroup()
							.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowStock1)
								.addComponent(lblShowAmount1))
							.addGap(2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtShowPrice2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowBarcode2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowTitle2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(scrShowDescription1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowAmount2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowStock2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_pnlFoundProduct1.setVerticalGroup(
			gl_pnlFoundProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode1)
						.addComponent(txtShowBarcode2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle1)
						.addComponent(txtShowTitle2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(scrShowDescription1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtShowPrice2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPrice1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount1)
						.addComponent(txtShowAmount2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock1)
						.addComponent(txtShowStock2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		txtAreaDescription2 = new JTextArea();
		txtAreaDescription2.setBackground(UIManager.getColor("Button.background"));
		txtAreaDescription2.setEditable(false);
		txtAreaDescription2.setName("description");
		scrShowDescription1.setViewportView(txtAreaDescription2);
		pnlFoundProduct1.setLayout(gl_pnlFoundProduct1);
		
		JButton btnBack2 = new JButton("Tilbage");
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(10)
					.addComponent(pnlCtrItem, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(pnlFoundProduct1, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
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
						.addComponent(pnlCtrItem, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlFoundProduct1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
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
		
		JLabel lblSearchBarcode2 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode2 = new GridBagConstraints();
		gbc_lblSearchBarcode2.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode2.gridx = 0;
		gbc_lblSearchBarcode2.gridy = 0;
		pnlSearch3.add(lblSearchBarcode2, gbc_lblSearchBarcode2);
		
		txtSearchBarcode2 = new JTextField();
		txtSearchBarcode2.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode2 = new GridBagConstraints();
		gbc_txtSearchBarcode2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode2.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode2.gridx = 1;
		gbc_txtSearchBarcode2.gridy = 0;
		pnlSearch3.add(txtSearchBarcode2, gbc_txtSearchBarcode2);
		
		JButton btnFind2 = new JButton("Find");
		btnFind2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String barcode = txtSearchBarcode2.getText();
				getProduct(barcode,pnlShowProduct2);
				btnEnable(product,btnDeleteItem);
			}
		});
		GridBagConstraints gbc_btnFind2 = new GridBagConstraints();
		gbc_btnFind2.gridx = 2;
		gbc_btnFind2.gridy = 0;
		pnlSearch3.add(btnFind2, gbc_btnFind2);
		
		pnlDeleteItem = new JPanel();
		pnlDeleteItem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Slet item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		btnDeleteItem = new JButton("Slet");
		btnDeleteItem.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if(btnDeleteItem.isEnabled() && product != null) {
					showItems();
				}else {
					clearFields(pnlDeleteItem);
				}
			}
		});

		btnDeleteItem.setName("btnDelete");
		btnDeleteItem.setEnabled(false);
		btnDeleteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String serialNumber = txtSerialCode.getText();
				deleteItem(serialNumber);
			}
		});
		
		JLabel lblDeleteText = new JLabel("Indtast serienummeret p\u00E5 det item du");
		
		JLabel lblDeleteText1 = new JLabel("\u00F8nsker at slette:");
		
		txtSerialCode = new JTextField();
		txtSerialCode.setColumns(10);
		
		JScrollPane scrItem = new JScrollPane();
		GroupLayout gl_pnlDeleteItem = new GroupLayout(pnlDeleteItem);
		gl_pnlDeleteItem.setHorizontalGroup(
			gl_pnlDeleteItem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDeleteItem.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDeleteItem.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDeleteItem.createSequentialGroup()
							.addComponent(txtSerialCode, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeleteItem))
						.addComponent(lblDeleteText)
						.addComponent(lblDeleteText1)
						.addComponent(scrItem, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		gl_pnlDeleteItem.setVerticalGroup(
			gl_pnlDeleteItem.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlDeleteItem.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrItem, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(lblDeleteText)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDeleteText1)
					.addGap(11)
					.addGroup(gl_pnlDeleteItem.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSerialCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteItem))
					.addContainerGap())
		);
		
		lstItem = new JList();
		scrItem.setViewportView(lstItem);
		pnlDeleteItem.setLayout(gl_pnlDeleteItem);
		
		pnlShowProduct2 = new JPanel();
		pnlShowProduct2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode2 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription2 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle2 = new JLabel("Titel:");
		
		JLabel lblShowPrice2 = new JLabel("Pris:");
		
		JLabel lblShowStock2 = new JLabel("Stock:");
		
		JLabel lblShowAmount2 = new JLabel("Antal:");
		
		txtShowPrice3 = new JTextField();
		txtShowPrice3.setEditable(false);
		txtShowPrice3.setName("price");
		txtShowPrice3.setColumns(10);
		
		txtShowBarcode3 = new JTextField();
		txtShowBarcode3.setEditable(false);
		txtShowBarcode3.setName("barcode");
		txtShowBarcode3.setColumns(10);
		
		txtShowTitle3 = new JTextField();
		txtShowTitle3.setEditable(false);
		txtShowTitle3.setName("title");
		txtShowTitle3.setText("");
		txtShowTitle3.setColumns(10);
		
		JScrollPane scrShowDescription2 = new JScrollPane();
		
		txtShowAmount3 = new JTextField();
		txtShowAmount3.setEditable(false);
		txtShowAmount3.setName("amount");
		txtShowAmount3.setColumns(10);
		
		txtShowStock3 = new JTextField();
		txtShowStock3.setEditable(false);
		txtShowStock3.setName("stock");
		txtShowStock3.setColumns(10);
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
						.addComponent(txtShowPrice3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowBarcode3, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowTitle3, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(scrShowDescription2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowAmount3, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(txtShowStock3, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_pnlShowProduct2.setVerticalGroup(
			gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 273, Short.MAX_VALUE)
				.addGroup(gl_pnlShowProduct2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode2)
						.addComponent(txtShowBarcode3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle2)
						.addComponent(txtShowTitle3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription2)
						.addComponent(scrShowDescription2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtShowPrice3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblShowPrice2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount2)
						.addComponent(txtShowAmount3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlShowProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock2)
						.addComponent(txtShowStock3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		txtAreaDescription3 = new JTextArea();
		txtAreaDescription3.setBackground(UIManager.getColor("Button.background"));
		txtAreaDescription3.setEditable(false);
		txtAreaDescription3.setName("description");
		scrShowDescription2.setViewportView(txtAreaDescription3);
		pnlShowProduct2.setLayout(gl_pnlShowProduct2);
		
		JButton btnBack3 = new JButton("Tilbage");
		btnBack3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(pnlDeleteItem, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
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
						.addComponent(pnlDeleteItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
		
		JLabel lblSearchBarcode3 = new JLabel("Indtast stregkoden:");
		lblSearchBarcode3.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblSearchBarcode3 = new GridBagConstraints();
		gbc_lblSearchBarcode3.insets = new Insets(0, 0, 0, 5);
		gbc_lblSearchBarcode3.gridx = 0;
		gbc_lblSearchBarcode3.gridy = 0;
		pnlSearch2.add(lblSearchBarcode3, gbc_lblSearchBarcode3);
		
		txtSearchBarcode3 = new JTextField();
		txtSearchBarcode3.setColumns(10);
		GridBagConstraints gbc_txtSearchBarcode3 = new GridBagConstraints();
		gbc_txtSearchBarcode3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchBarcode3.insets = new Insets(0, 0, 0, 5);
		gbc_txtSearchBarcode3.gridx = 1;
		gbc_txtSearchBarcode3.gridy = 0;
		pnlSearch2.add(txtSearchBarcode3, gbc_txtSearchBarcode3);
		
		JButton btnFind3 = new JButton("Find");
		btnFind3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String barcode = txtSearchBarcode3.getText();
				getProduct(barcode,pnlFoundProduct2);
			}
		});
		GridBagConstraints gbc_btnFind3 = new GridBagConstraints();
		gbc_btnFind3.gridx = 2;
		gbc_btnFind3.gridy = 0;
		pnlSearch2.add(btnFind3, gbc_btnFind3);
		
		pnlFoundProduct2 = new JPanel();
		pnlFoundProduct2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode3 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription3 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle3 = new JLabel("Titel:");
		
		JLabel lblShowPrice3 = new JLabel("Pris:");
		
		JLabel lblShowStock3 = new JLabel("Stock:");
		
		JLabel lblShowAmount3 = new JLabel("Antal:");
		
		JScrollPane scrShowDescription3 = new JScrollPane();
		
		txtShowBarcode4 = new JTextField();
		txtShowBarcode4.setName("barcode");
		txtShowBarcode4.setEditable(false);
		txtShowBarcode4.setColumns(10);
		
		txtShowTitle4 = new JTextField();
		txtShowTitle4.setName("title");
		txtShowTitle4.setText("");
		txtShowTitle4.setColumns(10);
		
		txtShowAmount4 = new JTextField();
		txtShowAmount4.setName("amount");
		txtShowAmount4.setEditable(false);
		txtShowAmount4.setColumns(10);
		
		txtShowStock4 = new JTextField();
		txtShowStock4.setName("stock");
		txtShowStock4.setEditable(false);
		txtShowStock4.setColumns(10);
		
		txtShowPrice4 = new JTextField();
		txtShowPrice4.setName("price");
		txtShowPrice4.setColumns(10);
		
		JButton btnEdit = new JButton("\u00C6ndre");
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				updateProduct();
			}
		});
		GroupLayout gl_pnlFoundProduct2 = new GroupLayout(pnlFoundProduct2);
		gl_pnlFoundProduct2.setHorizontalGroup(
			gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
							.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowBarcode3)
								.addComponent(lblShowDescription3)
								.addComponent(lblShowTitle3)
								.addComponent(lblShowPrice3)
								.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
									.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblShowStock3)
										.addComponent(lblShowAmount3))
									.addGap(2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
									.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
										.addComponent(scrShowDescription3, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowBarcode4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowTitle4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowAmount4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowStock4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
									.addComponent(txtShowPrice4, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
									.addGap(10))))
						.addGroup(Alignment.TRAILING, gl_pnlFoundProduct2.createSequentialGroup()
							.addComponent(btnEdit)
							.addContainerGap())))
		);
		gl_pnlFoundProduct2.setVerticalGroup(
			gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode3)
						.addComponent(txtShowBarcode4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle3)
						.addComponent(txtShowTitle4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription3)
						.addComponent(scrShowDescription3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowPrice3)
						.addComponent(txtShowPrice4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount3)
						.addComponent(txtShowAmount4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock3)
						.addComponent(txtShowStock4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnEdit)
					.addContainerGap())
		);
		
		txtAreaDescription4 = new JTextArea();
		txtAreaDescription4.setName("description");
		txtAreaDescription4.setText("");
		scrShowDescription3.setViewportView(txtAreaDescription4);
		pnlFoundProduct2.setLayout(gl_pnlFoundProduct2);
		
		JButton btnBack4 = new JButton("Tilbage");
		btnBack4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack4)
					.addGap(87)
					.addComponent(pnlFoundProduct2, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(pnlFoundProduct2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
		
		JButton btnFind4 = new JButton("Find");
		btnFind4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String barcode = txtSearchBarcode4.getText();
				getProduct(barcode, pnlFoundProduct3);
				btnEnable(product, btnDeleteProdukt);
			}
		});
		GridBagConstraints gbc_btnFind4 = new GridBagConstraints();
		gbc_btnFind4.gridx = 2;
		gbc_btnFind4.gridy = 0;
		pnlSearch4.add(btnFind4, gbc_btnFind4);
		
		pnlFoundProduct3 = new JPanel();
		pnlFoundProduct3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Produkt fundet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblShowBarcode4 = new JLabel("Stregkode:");
		
		JLabel lblShowDescription4 = new JLabel("Beskrivelse:");
		
		JLabel lblShowTitle4 = new JLabel("Titel:");
		
		JLabel lblShowPrice4 = new JLabel("Pris:");
		
		JLabel lblShowStock4 = new JLabel("Stock:");
		
		JLabel lblShowAmount4 = new JLabel("Antal:");
		
		JScrollPane srcShowDescription4 = new JScrollPane();
		
		txtShowBarcode5 = new JTextField();
		txtShowBarcode5.setEditable(false);
		txtShowBarcode5.setName("barcode");
		txtShowBarcode5.setColumns(10);
		
		txtShowTitle5 = new JTextField();
		txtShowTitle5.setEditable(false);
		txtShowTitle5.setName("title");
		txtShowTitle5.setText("");
		txtShowTitle5.setColumns(10);
		
		txtShowAmount5 = new JTextField();
		txtShowAmount5.setEditable(false);
		txtShowAmount5.setName("amount");
		txtShowAmount5.setColumns(10);
		
		txtShowStock5 = new JTextField();
		txtShowStock5.setEditable(false);
		txtShowStock5.setName("stock");
		txtShowStock5.setColumns(10);
		
		txtShowPrice5 = new JTextField();
		txtShowPrice5.setEditable(false);
		txtShowPrice5.setName("price");
		txtShowPrice5.setColumns(10);
		
		btnDeleteProdukt = new JButton("Slet");
		btnDeleteProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String barcode = txtSearchBarcode4.getText();
				deleteProduct(barcode);			
			}
		});
		btnDeleteProdukt.setEnabled(false);
		GroupLayout gl_pnlFoundProduct3 = new GroupLayout(pnlFoundProduct3);
		gl_pnlFoundProduct3.setHorizontalGroup(
			gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
							.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblShowBarcode4)
								.addComponent(lblShowDescription4)
								.addComponent(lblShowTitle4)
								.addComponent(lblShowPrice4)
								.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
									.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblShowStock4)
										.addComponent(lblShowAmount4))
									.addGap(2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
									.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
										.addComponent(srcShowDescription4, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowBarcode5, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowTitle5, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowAmount5, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
										.addComponent(txtShowStock5, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
									.addGap(8))
								.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
									.addComponent(txtShowPrice5, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
									.addGap(10))))
						.addGroup(Alignment.TRAILING, gl_pnlFoundProduct3.createSequentialGroup()
							.addComponent(btnDeleteProdukt)
							.addContainerGap())))
		);
		gl_pnlFoundProduct3.setVerticalGroup(
			gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFoundProduct3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowBarcode4)
						.addComponent(txtShowBarcode5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowTitle4)
						.addComponent(txtShowTitle5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowDescription4)
						.addComponent(srcShowDescription4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblShowPrice4)
						.addComponent(txtShowPrice5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowAmount4)
						.addComponent(txtShowAmount5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFoundProduct3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblShowStock4)
						.addComponent(txtShowStock5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(btnDeleteProdukt)
					.addContainerGap())
		);
		
		txtAreaDescription5 = new JTextArea();
		txtAreaDescription5.setBackground(UIManager.getColor("Button.background"));
		txtAreaDescription5.setEditable(false);
		txtAreaDescription5.setName("description");
		txtAreaDescription5.setText("");
		srcShowDescription4.setViewportView(txtAreaDescription5);
		pnlFoundProduct3.setLayout(gl_pnlFoundProduct3);
		
		JButton btnBack5 = new JButton("Tilbage");
		btnBack5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuGUI mainMenuGUI = new MainMenuGUI();
				mainMenuGUI.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack5)
					.addGap(87)
					.addComponent(pnlFoundProduct3, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack5, Alignment.TRAILING)
						.addComponent(pnlFoundProduct3, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_13.setLayout(gl_panel_13);
		contentPane.setLayout(gl_contentPane);
	}
	
	// CREATE PRODUCT
	private void createProduct(String name, String description, double price) 
	{
		product = productController.createProduct(name, description, price);
		if(product != null) {
			setProduct(product,pnlCtrProduct);
			clearFields(pnlCreateProduct);
			confirmMessage("Produkt oprettet.");
		}
	}
		
	// FIND PRODUCT
	private void getProduct(String barcode, JPanel jPanel) 
	{
		product = productController.getProduct(barcode);
		if(product != null) {
			setProduct(product,jPanel);
		}else {
			clearFields(jPanel);
		}
	}

	
	// CREATE ITEM
	public void addItem(int amount) 
	{
		productController.addItem(this.product, amount);
		setProduct(product, pnlFoundProduct1);
		confirmMessage("Tilføjet " + amount + " item(s) til produktet.");
		clearFields(pnlCtrItem);
	}
	
	//DELETE ITEM
	private void deleteItem(String serialNumber) 
	{
		productController.deleteItem(product,serialNumber);
		setProduct(product,pnlShowProduct2);
		txtSerialCode.setText(null);
		showItems();
		confirmMessage("Du har slettet item med serienummeret: " + serialNumber);
	}
	
	// SHOW ITEMS
	private void showItems() 
	{
		defaultListModel = new DefaultListModel();
		items = this.product.getAllItems();
		for(Item item: items) {
			defaultListModel.addElement(item.getSerialCode());
		}
		lstItem.setModel(defaultListModel);
	}
	
	//UPDATE PRODUCT
	private void updateProduct() 
	{
		String title = txtShowTitle4.getText();
		String description = txtAreaDescription4.getText();
		double price = Double.parseDouble(txtShowPrice4.getText());
		
		product = productController.updateProduct(product, title, description, price);
		if(product != null) {
			setProduct(product, pnlFoundProduct2);
			confirmMessage("Produkt ændret.");
		}
	}
	
	//DELETE PRODUCT
	private void deleteProduct(String barcode) 
	{
		productController.deleteProduct(product);
		confirmMessage("Produktet er slettet.");
		clearFields(pnlFoundProduct3);
	}

	// FIND PRODUCT
	private void setProduct(Product product, JPanel jPanel) 
	{
		for(Component component : jPanel.getComponents()) {
			
		    if(component instanceof JTextField)
		    {
		        JTextField textField = (JTextField) component;
		        switch (textField.getName()){
		        case "barcode":
		        	textField.setText(product.getBarcode());
		        	break;
		        case "title":
		        	textField.setText(product.getTitle());
		        	break;
		        case "price":
		        	textField.setText(String.valueOf(product.getPrice()));
		        	break;
		        case "amount":
		        	textField.setText(String.valueOf(product.getAmount()));
		        	break;
		        case "stock":
		        	textField.setText(String.valueOf(product.getStock()));
		        	break;
	        	default:
	        		break;
		        }		       
		    }else if(component instanceof JScrollPane) {
		    	
		    	JScrollPane scrollPane = (JScrollPane) component;
		    	Component[] components = scrollPane.getViewport().getComponents();
		    	for(Component comp : components) {
		    		if(comp instanceof JTextArea) {
		    			JTextArea textArea = (JTextArea) comp;
		    			textArea.setText(product.getDescription());
		    		}
		    	}
		    }
		}
	}
	
	private void clearFields(JPanel jPanel) 
	{
		product = null;
		for(Component component : jPanel.getComponents()) {
		    if(component instanceof JTextField){
		        JTextField textField = (JTextField) component;
		        textField.setText(null);
		    }else if(component instanceof JScrollPane) {
		    	JScrollPane scrollPane = (JScrollPane) component;
		    	Component[] components = scrollPane.getViewport().getComponents();
		    	for(Component comp : components) {
		    		if(comp instanceof JTextArea) {
		    			JTextArea textArea = (JTextArea) comp;
		    			textArea.setText(null);
		    		}else if(comp instanceof JList) {
		    	    	DefaultListModel emptyListModel = new DefaultListModel();
		    	    	lstItem.setModel(emptyListModel);
		    	    }
		    	}
		    }
		}
	}
	
	// BUTTON ENABLE 
	private void btnEnable(Product product, JButton jButton) 
	{
		if(product != null) {
			jButton.setEnabled(true);
		}else {
			jButton.setEnabled(false);
		}
	}

	// VALIDATION
	private void inputValidation(boolean btnEnable) {
		if(!txtCtrName.getText().trim().isEmpty() && !txtDescription.getText().trim().isEmpty() && !txtCtrPrice.getText().trim().isEmpty()){
			btnCtrCreate.setEnabled(true);
		}else {
			btnCtrCreate.setEnabled(false);
		}
	}
	
	// CONFIRM MESSAGE
	private void confirmMessage(String message) 
	{
		JOptionPane.showMessageDialog(null, message);
	}
}
