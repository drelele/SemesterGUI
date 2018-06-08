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

public class MainMenuGUI extends JFrame {

	private JPanel contentPane;

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
		contentPane.setLayout(null);
		
		JLabel lblVestbjergByggecenterStyringssystem = new JLabel("Vestbjerg Byggecenter Styringssystem");
		lblVestbjergByggecenterStyringssystem.setBounds(5, 5, 674, 25);
		lblVestbjergByggecenterStyringssystem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblVestbjergByggecenterStyringssystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 41, 669, 9);
		contentPane.add(separator);
		
		JPanel headPanel = new JPanel();
		headPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dine muligheder", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		headPanel.setBounds(33, 80, 587, 211);
		contentPane.add(headPanel);
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
	}
}
