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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDescription;
	private JTextField txtPrice1;
	private JTextField txtName1;
	private JTextField txtAreaDescription1;
	private JTextField txtAmount1;
	private JTextField txtStock1;
	private JTextField txtBarcode;
	private JTextField txtStock2;
	private JTextField txtAmount2;
	private JTextField txtDescription2;
	private JTextField txtName2;
	private JTextField txtPrice2;

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
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
		);
		
		JPanel pnlCreateProduct = new JPanel();
		tabbedPane.addTab("Opret produkt", null, pnlCreateProduct, null);
		
		JPanel pnlProduct = new JPanel();
		pnlProduct.setBorder(new TitledBorder(null, "Opret produkt", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel pnlProduct1 = new JPanel();
		pnlProduct1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Product oprettet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblName1 = new JLabel("Name:");
		
		JLabel lblDescription1 = new JLabel("Beskrivelse:");
		
		JLabel lblPrice1 = new JLabel("Price:");
		
		txtPrice1 = new JTextField();
		txtPrice1.setColumns(10);
		
		txtName1 = new JTextField();
		txtName1.setColumns(10);
		
		JScrollPane scrDescription1 = new JScrollPane();
		
		txtAmount1 = new JTextField();
		txtAmount1.setColumns(10);
		
		JLabel lblAmount1 = new JLabel("Amount:");
		
		txtStock1 = new JTextField();
		txtStock1.setColumns(10);
		
		JLabel lblStock1 = new JLabel("Stock:");
		GroupLayout gl_pnlProduct1 = new GroupLayout(pnlProduct1);
		gl_pnlProduct1.setHorizontalGroup(
			gl_pnlProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlProduct1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlProduct1.createSequentialGroup()
							.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblName1)
									.addComponent(lblDescription1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblPrice1))
								.addComponent(lblAmount1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPrice1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(txtName1, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(scrDescription1, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(txtAmount1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlProduct1.createSequentialGroup()
							.addComponent(lblStock1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtStock1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_pnlProduct1.setVerticalGroup(
			gl_pnlProduct1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlProduct1.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtName1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription1)
						.addComponent(scrDescription1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrice1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrice1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAmount1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAmount1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStock1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStock1))
					.addGap(237))
		);
		
		txtAreaDescription1 = new JTextField();
		txtAreaDescription1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrDescription1.setViewportView(txtAreaDescription1);
		txtAreaDescription1.setColumns(10);
		pnlProduct1.setLayout(gl_pnlProduct1);
		
		JButton btnBack = new JButton("Tilbage");
		GroupLayout gl_pnlCreateProduct = new GroupLayout(pnlCreateProduct);
		gl_pnlCreateProduct.setHorizontalGroup(
			gl_pnlCreateProduct.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCreateProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack)
						.addGroup(gl_pnlCreateProduct.createSequentialGroup()
							.addComponent(pnlProduct, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(pnlProduct1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlCreateProduct.setVerticalGroup(
			gl_pnlCreateProduct.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCreateProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCreateProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(pnlProduct, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlProduct1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
					.addGap(66)
					.addComponent(btnBack)
					.addContainerGap())
		);
		
		JLabel lblDescription = new JLabel("Beskrivelse:");
		
		JScrollPane scrDescription = new JScrollPane();
		
		JLabel lblName = new JLabel("Name:");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		
		JButton btnCancel = new JButton("Annuller");
		
		JButton btnCreate = new JButton("Opret");
		GroupLayout gl_pnlProduct = new GroupLayout(pnlProduct);
		gl_pnlProduct.setHorizontalGroup(
			gl_pnlProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlProduct.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlProduct.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlProduct.createSequentialGroup()
							.addGroup(gl_pnlProduct.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblName)
								.addComponent(lblDescription)
								.addComponent(lblPrice))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlProduct.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDescription, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
								.addComponent(scrDescription, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_pnlProduct.createSequentialGroup()
							.addComponent(btnCreate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel)))
					.addContainerGap())
		);
		gl_pnlProduct.setVerticalGroup(
			gl_pnlProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlProduct.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_pnlProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription)
						.addComponent(scrDescription, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrice))
					.addGap(28)
					.addGroup(gl_pnlProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnCreate))
					.addContainerGap())
		);
		
		JTextArea txtAreaDescription = new JTextArea();
		txtAreaDescription.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrDescription.setViewportView(txtAreaDescription);
		pnlProduct.setLayout(gl_pnlProduct);
		pnlCreateProduct.setLayout(gl_pnlCreateProduct);
		
		JPanel pnlFindProduct = new JPanel();
		tabbedPane.addTab("Find produkt", null, pnlFindProduct, null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Find product", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(174, 11, 331, 49);
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblBarcode = new JLabel("Indtast barcode:");
		lblBarcode.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblBarcode = new GridBagConstraints();
		gbc_lblBarcode.insets = new Insets(0, 0, 0, 5);
		gbc_lblBarcode.gridx = 0;
		gbc_lblBarcode.gridy = 0;
		panel_1.add(lblBarcode, gbc_lblBarcode);
		
		txtBarcode = new JTextField();
		txtBarcode.setColumns(10);
		GridBagConstraints gbc_txtBarcode = new GridBagConstraints();
		gbc_txtBarcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBarcode.insets = new Insets(0, 0, 0, 5);
		gbc_txtBarcode.gridx = 1;
		gbc_txtBarcode.gridy = 0;
		panel_1.add(txtBarcode, gbc_txtBarcode);
		
		JButton btnFind = new JButton("Find");
		GridBagConstraints gbc_btnFind = new GridBagConstraints();
		gbc_btnFind.gridx = 2;
		gbc_btnFind.gridy = 0;
		panel_1.add(btnFind, gbc_btnFind);
		
		txtStock2 = new JTextField();
		txtStock2.setColumns(10);
		
		txtAmount2 = new JTextField();
		txtAmount2.setColumns(10);
		
		JLabel lblAmount2 = new JLabel("Amount:");
		
		JLabel lblStock2 = new JLabel("Stock:");
		
		JLabel lblPrice2 = new JLabel("Price:");
		
		txtDescription2 = new JTextField();
		txtDescription2.setColumns(10);
		txtDescription2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblDescription2 = new JLabel("Beskrivelse:");
		
		JLabel lblName2 = new JLabel("Name:");
		
		txtName2 = new JTextField();
		txtName2.setColumns(10);
		
		txtPrice2 = new JTextField();
		txtPrice2.setColumns(10);
		GroupLayout gl_pnlFindProduct = new GroupLayout(pnlFindProduct);
		gl_pnlFindProduct.setHorizontalGroup(
			gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_pnlFindProduct.createSequentialGroup()
					.addGap(196)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(24)
							.addComponent(lblName2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtName2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addComponent(lblDescription2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(txtDescription2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(28)
							.addComponent(lblPrice2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPrice2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(15)
							.addComponent(lblAmount2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtAmount2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(21)
							.addComponent(lblStock2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtStock2, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(203, Short.MAX_VALUE))
		);
		gl_pnlFindProduct.setVerticalGroup(
			gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFindProduct.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(3)
							.addComponent(lblName2))
						.addComponent(txtName2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription2)
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(1)
							.addComponent(txtDescription2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice2)
						.addComponent(txtPrice2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFindProduct.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAmount2))
						.addComponent(txtAmount2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_pnlFindProduct.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStock2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStock2))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		pnlFindProduct.setLayout(gl_pnlFindProduct);
		contentPane.setLayout(gl_contentPane);
	}
}
