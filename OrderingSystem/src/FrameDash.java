import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameDash extends JFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDash window = new FrameDash();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameDash() {

		setUndecorated(true);
		setLocationRelativeTo(null);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CardLayout myLayout = new CardLayout();
		frame.getContentPane().setLayout(myLayout);
		
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		
		JPanel adminMain = new JPanel();
		adminMain.setBackground(new Color(245, 235, 220));
		frame.getContentPane().add(adminMain, "admin");
		adminMain.setLayout(null);
		
		JLabel lblLogo_1 = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo_1.setIcon(new ImageIcon(logo));
		lblLogo_1.setBounds(0, 11, 90, 79);
		adminMain.add(lblLogo_1);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
		lblNewLabel_1.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1.setForeground(new Color(214, 35, 0));
		lblNewLabel_1.setBounds(103, 24, 157, 66);
		adminMain.add(lblNewLabel_1);
		
		JButton btnTrans = new JButton("TRANSACTION HISTORY");
		btnTrans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myLayout.show(frame.getContentPane(),"trans");
			}
		});
		btnTrans.setForeground(Color.WHITE);
		btnTrans.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnTrans.setBorderPainted(false);
		btnTrans.setBorder(null);
		btnTrans.setBackground(new Color(255, 135, 50));
		btnTrans.setBounds(300, 146, 423, 59);
		adminMain.add(btnTrans);
		
		JButton btnProd = new JButton("PRODUCT INVENTORY");
		btnProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frame.getContentPane(),"intventory");
				
			}
		});
		btnProd.setForeground(Color.WHITE);
		btnProd.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnProd.setBorderPainted(false);
		btnProd.setBorder(null);
		btnProd.setBackground(new Color(255, 135, 50));
		btnProd.setBounds(300, 224, 423, 59);
		adminMain.add(btnProd);
		
		JButton btnUsers = new JButton("MANAGE USERS");
		btnUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frame.getContentPane(),"user");
			}
		});
		btnUsers.setForeground(Color.WHITE);
		btnUsers.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnUsers.setBorderPainted(false);
		btnUsers.setBorder(null);
		btnUsers.setBackground(new Color(255, 135, 50));
		btnUsers.setBounds(300, 296, 423, 59);
		adminMain.add(btnUsers);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MenuChild exit = new MenuChild();
				//exit.LogOut();
				FrameHome home = new FrameHome();
				home.setVisible(true);
				
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnExit.setBorderPainted(false);
		btnExit.setBorder(null);
		btnExit.setBackground(new Color(83, 32, 24));
		btnExit.setBounds(300, 441, 423, 59);
		adminMain.add(btnExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("DASHBOARD");
		lblNewLabel_1_1.setForeground(new Color(255, 135, 50));
		lblNewLabel_1_1.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_1.setBounds(274, 24, 301, 66);
		adminMain.add(lblNewLabel_1_1);
		
		JPanel Trans = new JPanel();
		Trans.setBackground(new Color(245, 235, 220));
		frame.getContentPane().add(Trans, "trans");
		Trans.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANSACTIONS");
		lblNewLabel.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 39));
		lblNewLabel.setBounds(102, 101, 289, 60);
		Trans.add(lblNewLabel);
		
		JButton btnBackTH = new JButton("EXIT");
		btnBackTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frame.getContentPane(),"admin");
				
			}
		});
		btnBackTH.setForeground(Color.WHITE);
		btnBackTH.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnBackTH.setBorderPainted(false);
		btnBackTH.setBorder(null);
		btnBackTH.setBackground(new Color(255, 135, 50));
		btnBackTH.setBounds(846, 505, 168, 60);
		Trans.add(btnBackTH);
		
		JLabel lblLabel = new JLabel("DATE");
		lblLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel.setForeground(new Color(43, 2, 0));
		lblLabel.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblLabel.setBounds(103, 180, 75, 28);
		Trans.add(lblLabel);
		
		JLabel lblTrans = new JLabel("MODE OF TRANSACTION");
		lblTrans.setHorizontalAlignment(SwingConstants.LEFT);
		lblTrans.setForeground(new Color(43, 2, 0));
		lblTrans.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblTrans.setBounds(264, 180, 234, 28);
		Trans.add(lblTrans);
		
		JLabel lblAmmount = new JLabel("AMOUNT");
		lblAmmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblAmmount.setForeground(new Color(43, 2, 0));
		lblAmmount.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblAmmount.setBounds(535, 180, 110, 28);
		Trans.add(lblAmmount);
		
		JLabel lblLabel_1 = new JLabel("12/23/20");
		lblLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_1.setForeground(new Color(43, 2, 0));
		lblLabel_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblLabel_1.setBounds(103, 240, 75, 28);
		Trans.add(lblLabel_1);
		
		JLabel lblLabel_2 = new JLabel("12/23/20");
		lblLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_2.setForeground(new Color(43, 2, 0));
		lblLabel_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblLabel_2.setBounds(103, 300, 75, 28);
		Trans.add(lblLabel_2);
		
		JLabel lblLabel_3 = new JLabel("12/23/20");
		lblLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_3.setForeground(new Color(43, 2, 0));
		lblLabel_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblLabel_3.setBounds(103, 362, 75, 28);
		Trans.add(lblLabel_3);
		
		JLabel lblPaymaya = new JLabel("PayMaya");
		lblPaymaya.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaymaya.setForeground(new Color(43, 2, 0));
		lblPaymaya.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblPaymaya.setBounds(264, 240, 155, 28);
		Trans.add(lblPaymaya);
		
		JLabel lblGcash = new JLabel("Gcash");
		lblGcash.setHorizontalAlignment(SwingConstants.LEFT);
		lblGcash.setForeground(new Color(43, 2, 0));
		lblGcash.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblGcash.setBounds(264, 300, 155, 28);
		Trans.add(lblGcash);
		
		JLabel lblBdoDebit = new JLabel("BDO Debit");
		lblBdoDebit.setHorizontalAlignment(SwingConstants.LEFT);
		lblBdoDebit.setForeground(new Color(43, 2, 0));
		lblBdoDebit.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblBdoDebit.setBounds(264, 362, 155, 28);
		Trans.add(lblBdoDebit);
		
		JLabel lblPhp = new JLabel("Php 1,435");
		lblPhp.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp.setForeground(new Color(43, 2, 0));
		lblPhp.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblPhp.setBounds(535, 240, 110, 28);
		Trans.add(lblPhp);
		
		JLabel lblPhp_1 = new JLabel("Php 579");
		lblPhp_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1.setForeground(new Color(43, 2, 0));
		lblPhp_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblPhp_1.setBounds(535, 300, 110, 28);
		Trans.add(lblPhp_1);
		
		JLabel lblPhp_2 = new JLabel("Php 1,234");
		lblPhp_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2.setForeground(new Color(43, 2, 0));
		lblPhp_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblPhp_2.setBounds(535, 362, 110, 28);
		Trans.add(lblPhp_2);
		
		JLabel lblLogo_1_1 = new JLabel("");
		Image logoo = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo_1_1.setIcon(new ImageIcon(logoo));
		lblLogo_1.setBounds(0, 11, 90, 79);
		adminMain.add(lblLogo_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ADMIN");
		lblNewLabel_1_2.setForeground(new Color(214, 35, 0));
		lblNewLabel_1_2.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_2.setBounds(103, 24, 157, 66);
		Trans.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DASHBOARD");
		lblNewLabel_1_1_1.setForeground(new Color(255, 135, 50));
		lblNewLabel_1_1_1.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_1_1.setBounds(274, 24, 301, 66);
		Trans.add(lblNewLabel_1_1_1);
		
		JLabel lblLogo_1_2_1 = new JLabel("");
		Image logo1 = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo_1_2_1.setIcon(new ImageIcon(logo1));
		lblLogo_1_2_1.setBounds(0, 11, 90, 79);
		Trans.add(lblLogo_1_2_1);
		
		JPanel Inventory = new JPanel();
		Inventory.setBackground(new Color(245, 235, 220));
		frame.getContentPane().add(Inventory, "intventory");
		Inventory.setLayout(null);
		
		JButton btnBackIn = new JButton("EXIT");
		btnBackIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frame.getContentPane(),"admin");
			}
		});
		btnBackIn.setBounds(846, 503, 168, 62);
		btnBackIn.setForeground(Color.WHITE);
		btnBackIn.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnBackIn.setBorderPainted(false);
		btnBackIn.setBorder(null);
		btnBackIn.setBackground(new Color(255, 135, 50));
		Inventory.add(btnBackIn);
		
		JLabel lblNewLabel_2 = new JLabel("INVENTORY");
		lblNewLabel_2.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 40));
		lblNewLabel_2.setBounds(102, 101, 289, 60);
		Inventory.add(lblNewLabel_2);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setForeground(new Color(43, 2, 0));
		lblDate.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblDate.setBounds(103, 180, 75, 28);
		Inventory.add(lblDate);
		
		JLabel lblItem = new JLabel("ITEM");
		lblItem.setHorizontalAlignment(SwingConstants.LEFT);
		lblItem.setForeground(new Color(43, 2, 0));
		lblItem.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblItem.setBounds(252, 180, 75, 28);
		Inventory.add(lblItem);
		
		JLabel lblProduct_2_1_4 = new JLabel("QUANTITY");
		lblProduct_2_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_4.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_4.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblProduct_2_1_4.setBounds(467, 180, 141, 28);
		Inventory.add(lblProduct_2_1_4);
		
		JLabel lblProduct_2_1 = new JLabel("UNIT");
		lblProduct_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblProduct_2_1.setBounds(663, 180, 75, 28);
		Inventory.add(lblProduct_2_1);
		
		JLabel lblProduct_2_1_1 = new JLabel("12/12/20");
		lblProduct_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_1.setBounds(102, 239, 75, 28);
		Inventory.add(lblProduct_2_1_1);
		
		JLabel lblProduct_2_1_5 = new JLabel("Flour");
		lblProduct_2_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_5.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_5.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_5.setBounds(252, 239, 75, 28);
		Inventory.add(lblProduct_2_1_5);
		
		JLabel lblProduct_2_1_6 = new JLabel("77");
		lblProduct_2_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_6.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_6.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_6.setBounds(467, 239, 141, 28);
		Inventory.add(lblProduct_2_1_6);
		
		JLabel lblProduct_2_1_7 = new JLabel("KG");
		lblProduct_2_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_7.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_7.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_7.setBounds(663, 239, 75, 28);
		Inventory.add(lblProduct_2_1_7);
		
		JLabel lblProduct_2_1_2 = new JLabel("12/12/20");
		lblProduct_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_2.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_2.setBounds(102, 289, 75, 28);
		Inventory.add(lblProduct_2_1_2);
		
		JLabel lblProduct_2_1_5_1 = new JLabel("Ground Beef");
		lblProduct_2_1_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_5_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_5_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_5_1.setBounds(252, 289, 112, 28);
		Inventory.add(lblProduct_2_1_5_1);
		
		JLabel lblProduct_2_1_6_1 = new JLabel("100");
		lblProduct_2_1_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_6_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_6_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_6_1.setBounds(467, 289, 141, 28);
		Inventory.add(lblProduct_2_1_6_1);
		
		JLabel lblProduct_2_1_7_1 = new JLabel("KG");
		lblProduct_2_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_7_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_7_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_7_1.setBounds(663, 289, 75, 28);
		Inventory.add(lblProduct_2_1_7_1);
		
		JLabel lblProduct_2_1_3 = new JLabel("12/20/20");
		lblProduct_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_3.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_3.setBounds(102, 341, 75, 28);
		Inventory.add(lblProduct_2_1_3);
		
		JLabel lblProduct_2_1_5_2 = new JLabel("Olive Oil");
		lblProduct_2_1_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_5_2.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_5_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_5_2.setBounds(252, 341, 75, 28);
		Inventory.add(lblProduct_2_1_5_2);
		
		JLabel lblProduct_2_1_6_2 = new JLabel("10");
		lblProduct_2_1_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_6_2.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_6_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_6_2.setBounds(467, 341, 141, 28);
		Inventory.add(lblProduct_2_1_6_2);
		
		JLabel lblProduct_2_1_7_2 = new JLabel("Bottles");
		lblProduct_2_1_7_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_7_2.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_7_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_7_2.setBounds(663, 341, 75, 28);
		Inventory.add(lblProduct_2_1_7_2);
		
		JLabel lblLogo_1_2 = new JLabel("");
		Image logo2 = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo_1_2.setIcon(new ImageIcon(logo2));
		lblLogo_1_2.setBounds(0, 11, 90, 79);
		Inventory.add(lblLogo_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ADMIN");
		lblNewLabel_1_3.setForeground(new Color(214, 35, 0));
		lblNewLabel_1_3.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_3.setBounds(103, 24, 157, 66);
		Inventory.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("DASHBOARD");
		lblNewLabel_1_1_2.setForeground(new Color(255, 135, 50));
		lblNewLabel_1_1_2.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_1_2.setBounds(274, 24, 301, 66);
		Inventory.add(lblNewLabel_1_1_2);
		
		JPanel User = new JPanel();
		frame.getContentPane().add(User, "user");
		User.setBackground(new Color(245, 235, 220));
		User.setLayout(null);
		
		JButton btnBackUser_2_1 = new JButton("EXIT");
		btnBackUser_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frame.getContentPane(),"admin");
			}
		});
		btnBackUser_2_1.setForeground(Color.WHITE);
		btnBackUser_2_1.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnBackUser_2_1.setBorderPainted(false);
		btnBackUser_2_1.setBorder(null);
		btnBackUser_2_1.setBackground(new Color(255, 135, 50));
		btnBackUser_2_1.setBounds(835, 502, 179, 63);
		User.add(btnBackUser_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("USERS");
		lblNewLabel_3.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 40));
		lblNewLabel_3.setBounds(102, 101, 289, 60);
		User.add(lblNewLabel_3);
		
		JLabel lblLabel_4 = new JLabel("USERNAME");
		lblLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblLabel_4.setForeground(new Color(43, 2, 0));
		lblLabel_4.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblLabel_4.setBounds(102, 180, 144, 28);
		User.add(lblLabel_4);
		
		JLabel lblProduct_2 = new JLabel("PASSWORD");
		lblProduct_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2.setForeground(new Color(43, 2, 0));
		lblProduct_2.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblProduct_2.setBounds(354, 180, 144, 28);
		User.add(lblProduct_2);
		
		JLabel lblProduct_2_1_8 = new JLabel("USERTYPE");
		lblProduct_2_1_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_8.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_8.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 28));
		lblProduct_2_1_8.setBounds(552, 180, 110, 28);
		User.add(lblProduct_2_1_8);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdmin.setForeground(new Color(43, 2, 0));
		lblAdmin.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblAdmin.setBounds(102, 239, 120, 28);
		User.add(lblAdmin);
		
		JLabel lblProduct_2_2 = new JLabel("Admin12");
		lblProduct_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_2.setForeground(new Color(43, 2, 0));
		lblProduct_2_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_2.setBounds(354, 239, 75, 28);
		User.add(lblProduct_2_2);
		
		JLabel lblProduct_2_1_9 = new JLabel("Admin");
		lblProduct_2_1_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct_2_1_9.setForeground(new Color(43, 2, 0));
		lblProduct_2_1_9.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		lblProduct_2_1_9.setBounds(552, 239, 110, 28);
		User.add(lblProduct_2_1_9);
		
		JLabel lblLogo_1_3 = new JLabel("");
		Image logo3 = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo_1_3.setIcon(new ImageIcon(logo3));
		lblLogo_1_3.setBounds(0, 11, 90, 79);
		User.add(lblLogo_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ADMIN");
		lblNewLabel_1_4.setForeground(new Color(214, 35, 0));
		lblNewLabel_1_4.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_4.setBounds(103, 24, 157, 66);
		User.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("DASHBOARD");
		lblNewLabel_1_1_3.setForeground(new Color(255, 135, 50));
		lblNewLabel_1_1_3.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblNewLabel_1_1_3.setBounds(274, 24, 301, 66);
		User.add(lblNewLabel_1_1_3);
	}

}
