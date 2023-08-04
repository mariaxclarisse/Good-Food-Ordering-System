import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class FrameCheckOut extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public JLabel lblTotal;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCheckOut frame = new FrameCheckOut();
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
	public FrameCheckOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 576);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 235, 220));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(logo));
		lblLogo.setBounds(-11, 11, 90, 79);
		contentPane.add(lblLogo);
		
		JLabel lblGoodFoodMen = new JLabel("GOOD FOOD");
		lblGoodFoodMen.setHorizontalAlignment(SwingConstants.LEFT);
		lblGoodFoodMen.setForeground(new Color(214, 35, 0));
		lblGoodFoodMen.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblGoodFoodMen.setBounds(89, 0, 290, 90);
		contentPane.add(lblGoodFoodMen);
		
		JLabel lblCheckOutOrder = new JLabel("CHECK OUT");
		lblCheckOutOrder.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheckOutOrder.setForeground(new Color(255, 135, 50));
		lblCheckOutOrder.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblCheckOutOrder.setBounds(369, 6, 389, 79);
		contentPane.add(lblCheckOutOrder);
		
		lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setForeground(new Color(43, 2, 0));
		lblTotal.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lblTotal.setBounds(343, 113, 75, 28);
		contentPane.add(lblTotal);
		
		JLabel lblPhp_1_1_1 = new JLabel("PHP");
		lblPhp_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_1_1.setForeground(new Color(43, 2, 0));
		lblPhp_1_1_1.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lblPhp_1_1_1.setBounds(308, 113, 25, 28);
		contentPane.add(lblPhp_1_1_1);
		
		JLabel lblTotalAmountTo = new JLabel("TOTAL AMOUNT TO BE PAID:");
		lblTotalAmountTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalAmountTo.setForeground(new Color(43, 2, 0));
		lblTotalAmountTo.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblTotalAmountTo.setBounds(59, 113, 207, 28);
		contentPane.add(lblTotalAmountTo);
		
		JLabel lblChooseModeOf = new JLabel("CHOOSE MODE OF PAYMENT:");
		lblChooseModeOf.setHorizontalAlignment(SwingConstants.LEFT);
		lblChooseModeOf.setForeground(new Color(43, 2, 0));
		lblChooseModeOf.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblChooseModeOf.setBounds(59, 167, 207, 28);
		contentPane.add(lblChooseModeOf);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cash on Delivery");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Barlow Condensed", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBackground(new Color(245, 235, 220));
		rdbtnNewRadioButton.setBounds(308, 171, 247, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnLinkedBankAccount = new JRadioButton("Linked Bank Account");
		buttonGroup.add(rdbtnLinkedBankAccount);
		rdbtnLinkedBankAccount.setFont(new Font("Barlow Condensed", Font.PLAIN, 17));
		rdbtnLinkedBankAccount.setBackground(new Color(245, 235, 220));
		rdbtnLinkedBankAccount.setBounds(308, 211, 247, 23);
		contentPane.add(rdbtnLinkedBankAccount);
		
		JRadioButton rdbtnCreditDebit = new JRadioButton("Credit / Debit Card");
		buttonGroup.add(rdbtnCreditDebit);
		rdbtnCreditDebit.setFont(new Font("Barlow Condensed", Font.PLAIN, 17));
		rdbtnCreditDebit.setBackground(new Color(245, 235, 220));
		rdbtnCreditDebit.setBounds(308, 252, 247, 23);
		contentPane.add(rdbtnCreditDebit);
		
		JRadioButton rdbtnPaymentCenter = new JRadioButton("Payment Center / e-Wallet");
		buttonGroup.add(rdbtnPaymentCenter);
		rdbtnPaymentCenter.setFont(new Font("Barlow Condensed", Font.PLAIN, 17));
		rdbtnPaymentCenter.setBackground(new Color(245, 235, 220));
		rdbtnPaymentCenter.setBounds(308, 294, 247, 23);
		contentPane.add(rdbtnPaymentCenter);
		
		JRadioButton rdbtnOverthecounter = new JRadioButton("Over-the-counter");
		buttonGroup.add(rdbtnOverthecounter);
		rdbtnOverthecounter.setFont(new Font("Barlow Condensed", Font.PLAIN, 17));
		rdbtnOverthecounter.setBackground(new Color(245, 235, 220));
		rdbtnOverthecounter.setBounds(308, 335, 247, 23);
		contentPane.add(rdbtnOverthecounter);
		
		JButton btnCheckout = new JButton("PROCEED");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (JOptionPane.showConfirmDialog(null, "Do you want to proceed?", 
						"Menu", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						FrameQRpanel qr = new FrameQRpanel();
						qr.setVisible(true);
						dispose();
				}
			}
		});
		btnCheckout.setForeground(Color.WHITE);
		btnCheckout.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBackground(new Color(255, 135, 50));
		btnCheckout.setBounds(749, 527, 129, 38);
		contentPane.add(btnCheckout);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuChild exit = new MenuChild();
				exit.LogOut();
				dispose();
			}
		});
		btnLogOut.setForeground(new Color(255, 135, 50));
		btnLogOut.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnLogOut.setBorder(new LineBorder(null, 2));
		btnLogOut.setBackground(new Color(245, 235, 220));
		btnLogOut.setBounds(885, 527, 129, 38);
		contentPane.add(btnLogOut);
	}
}
