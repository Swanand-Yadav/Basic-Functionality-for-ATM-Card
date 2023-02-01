package Debit_card_wallet.Debit_card_web_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Account_info {

	JFrame frmAccountInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account_info window = new Account_info();
					window.frmAccountInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Account_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccountInformation = new JFrame();
		frmAccountInformation.setTitle("Account Information");
		//frmAccountInformation.setBounds(100, 100, 1017, 515);
		frmAccountInformation.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmAccountInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAccountInformation.getContentPane().setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAccountInformation.dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHome.setBounds(806, 403, 169, 43);
		frmAccountInformation.getContentPane().add(btnHome);
		
		JLabel lblAccountInformation = new JLabel("Account Information");
		lblAccountInformation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAccountInformation.setBounds(409, 32, 158, 35);
		frmAccountInformation.getContentPane().add(lblAccountInformation);
		
		JLabel lblNewLabel = new JLabel("Account Holder Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(91, 149, 146, 28);
		frmAccountInformation.getContentPane().add(lblNewLabel);
		
		JLabel lblSwanandYadav = new JLabel("Swanand Yadav");
		lblSwanandYadav.setForeground(new Color(0, 0, 255));
		lblSwanandYadav.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwanandYadav.setBounds(299, 149, 146, 28);
		frmAccountInformation.getContentPane().add(lblSwanandYadav);
		
		JLabel lblAccountNumber = new JLabel("Account Number:");
		lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAccountNumber.setBounds(91, 212, 146, 28);
		frmAccountInformation.getContentPane().add(lblAccountNumber);
		
		JLabel lblSwanandYadav_1 = new JLabel("8664938724597");
		lblSwanandYadav_1.setForeground(Color.BLUE);
		lblSwanandYadav_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwanandYadav_1.setBounds(299, 212, 146, 28);
		frmAccountInformation.getContentPane().add(lblSwanandYadav_1);
		
		JLabel lblIfscNumber = new JLabel("IFSC Number:");
		lblIfscNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIfscNumber.setBounds(91, 272, 146, 28);
		frmAccountInformation.getContentPane().add(lblIfscNumber);
		
		JLabel lblSwanandYadav_1_1 = new JLabel("ICICI245685");
		lblSwanandYadav_1_1.setForeground(Color.BLUE);
		lblSwanandYadav_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwanandYadav_1_1.setBounds(299, 272, 146, 28);
		frmAccountInformation.getContentPane().add(lblSwanandYadav_1_1);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddress.setBounds(91, 330, 146, 28);
		frmAccountInformation.getContentPane().add(lblAddress);
		
		JLabel lblSwanandYadav_1_1_1 = new JLabel("Pune, Maharashtra.");
		lblSwanandYadav_1_1_1.setForeground(Color.BLUE);
		lblSwanandYadav_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwanandYadav_1_1_1.setBounds(299, 330, 146, 28);
		frmAccountInformation.getContentPane().add(lblSwanandYadav_1_1_1);
		
		JLabel lblBranchCode = new JLabel("Branch Code:");
		lblBranchCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBranchCode.setBounds(91, 397, 146, 28);
		frmAccountInformation.getContentPane().add(lblBranchCode);
		
		JLabel lblSwanandYadav_1_1_2 = new JLabel("ICICI-568547AQ");
		lblSwanandYadav_1_1_2.setForeground(Color.BLUE);
		lblSwanandYadav_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSwanandYadav_1_1_2.setBounds(299, 397, 146, 28);
		frmAccountInformation.getContentPane().add(lblSwanandYadav_1_1_2);
	}
}
