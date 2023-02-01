package Debit_card_wallet.Debit_card_web_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Home_page {

	JFrame frmHome;
	
	static float balance=0.0f;
	LocalDateTime dateTime = LocalDateTime.now();
	String currentTimeStamp = DateTimeFormatter.ofPattern("yyyy/MM/dd; HH:mm:ss").format(dateTime);
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	Random random = new Random();
	
	JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page window = new Home_page();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public String chars() {
        String mixChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder chars = new StringBuilder();
        Random rnd = new Random();
        while (chars.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * mixChars.length());
            chars.append(mixChars.charAt(index));
        }
        String id = chars.toString();
        return id;// It will return random string
    }
	private void initialize() {
		
		frmHome = new JFrame();
		frmHome.setTitle("Home");
		//frmHome.setBounds(100, 100, 1532, 769);
		frmHome.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Bank Debit Card functionality for ATM");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(646, 26, 365, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmHome.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Bank Balance");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(62, 320, 169, 43);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(Float.toString(balance));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmHome.getContentPane().add(btnNewButton);
		
		JButton btnAddMoney = new JButton("Add Money");
		btnAddMoney.setForeground(new Color(255, 0, 0));
		btnAddMoney.setBounds(62, 119, 169, 43);
		btnAddMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(Float.valueOf(textField_3.getText())>0)
					{
						balance=balance+Float.valueOf(textField_3.getText());
						textArea.append(" Dear ICICI User, your A/c X0861 Credited by Rs. "+textField_3.getText()+"/- ₹ On "+currentTimeStamp+" new Balance is "+balance+"/- ₹ with TransactionID= "+chars()+"\n\n");
						JOptionPane.showMessageDialog(null, "Balance added Succesfully..!");
						textField_3.setText("");
					}else {
						JOptionPane.showMessageDialog(null, "You entered Incorrect amount...?");
					}
				}catch(NumberFormatException nfe){
					JOptionPane.showMessageDialog(null, "Please add funds before proceds");
				}	
			}
		});
		
		btnAddMoney.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmHome.getContentPane().add(btnAddMoney);
		
		JButton btnWithdrawMoney = new JButton("Withdraw Money");
		btnWithdrawMoney.setForeground(new Color(255, 0, 0));
		btnWithdrawMoney.setBounds(62, 219, 169, 43);
		btnWithdrawMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Float.valueOf(textField_2.getText())<=balance && Float.valueOf(textField_2.getText())>0)
					{
						balance=balance-Float.valueOf(textField_2.getText());
						textArea.append(" Dear ICICI User, your A/c X0861 Debited by Rs. "+textField_2.getText()+"/- ₹ On "+currentTimeStamp+" Remaining Balance is "+balance+"/- ₹ with TransactionID= "+chars()+"\n\n");
						textField_2.setText("");
					}else { 
						JOptionPane.showMessageDialog(null, "Unsufficient funds or Incorrect amount...?");
					}
				}catch(NumberFormatException nfe){
					JOptionPane.showMessageDialog(null, "Please Add some funds to Withdrawal...?");
				}	
			}
		});
		btnWithdrawMoney.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmHome.getContentPane().add(btnWithdrawMoney);
		
		JButton btnAccountInfo = new JButton("Account Info");
		btnAccountInfo.setForeground(new Color(255, 0, 0));
		btnAccountInfo.setBounds(62, 421, 169, 43);
		btnAccountInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Account_info window = new Account_info();
				window.frmAccountInformation.setVisible(true);
			}
		});
		btnAccountInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmHome.getContentPane().add(btnAccountInfo);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(1239, 657, 169, 43);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHome.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmHome.getContentPane().add(btnLogout);
		
		textField_1 = new JTextField();
		textField_1.setBounds(305, 320, 132, 43);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		frmHome.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 219, 132, 43);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		frmHome.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(305, 119, 132, 43);
		textField_3.setColumns(10);
		frmHome.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel(" User Transaction History");
		lblNewLabel_1.setForeground(new Color(22, 152, 90));
		lblNewLabel_1.setBounds(1006, 92, 182, 35);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmHome.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(584, 137, 924, 461);
		frmHome.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	}
}
