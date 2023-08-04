import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class FrameHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameHome frame = new FrameHome();
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
	public FrameHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 576);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 235, 220));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Barlow Condensed Black", Font.BOLD, 49));
		lblWelcome.setForeground(new Color(83, 32, 24));
		lblWelcome.setBounds(363, 86, 290, 79);
		contentPane.add(lblWelcome);
		
		JLabel lblGoodFood = new JLabel("GOOD FOOD");
		lblGoodFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoodFood.setForeground(new Color(214, 35, 0));
		lblGoodFood.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 150));
		lblGoodFood.setBounds(161, 146, 694, 131);
		contentPane.add(lblGoodFood);
		
		JButton btnExit = new JButton("X");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnExit.setBorderPainted(false);
		btnExit.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(83, 32, 24));
		btnExit.setBorder(null);
		btnExit.setBounds(972, 11, 42, 38);
		contentPane.add(btnExit);
		
		JLabel lblPizzaBurger = new JLabel("pizza   |   burger   |    pasta   |   drinks");
		lblPizzaBurger.setHorizontalAlignment(SwingConstants.CENTER);
		lblPizzaBurger.setForeground(new Color(43, 2, 0));
		lblPizzaBurger.setFont(new Font("Barlow Condensed", Font.ITALIC, 26));
		lblPizzaBurger.setBounds(171, 261, 694, 79);
		contentPane.add(lblPizzaBurger);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameLogIn login = new FrameLogIn();
				login.setVisible(true);
				
				dispose();
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnLogIn.setBorderPainted(false);
		btnLogIn.setBorder(null);
		btnLogIn.setBackground(new Color(255, 135, 50));
		btnLogIn.setBounds(313, 374, 191, 38);
		contentPane.add(btnLogIn);
		
		JButton btnCreateUser = new JButton("SIGN UP");
		btnCreateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FraneCreateUser create = new FraneCreateUser();
				create.setVisible(true);
				
				dispose();
				
			}
		});
		btnCreateUser.setForeground(new Color(255, 135, 50));
		btnCreateUser.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnCreateUser.setBorder(new LineBorder(null, 2));
		btnCreateUser.setBackground(new Color(245, 235, 220));
		btnCreateUser.setBounds(526, 374, 191, 38);
		contentPane.add(btnCreateUser);
		
		JLabel lblLogo = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/smallLogo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(logo));
		lblLogo.setBounds(10, 0, 100, 131);
		contentPane.add(lblLogo);
		
		JLabel lblResto = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/resto.jpg")).getImage();
		lblResto.setIcon(new ImageIcon(img));
		lblResto.setBounds(0, 492, 610, 114);
		contentPane.add(lblResto);
		
		JLabel lblResto_1 = new JLabel("New label");
		Image img1 = new ImageIcon(this.getClass().getResource("/resto.jpg")).getImage();
		lblResto_1.setIcon(new ImageIcon(img1));
		lblResto_1.setBounds(608, 492, 610, 114);
		contentPane.add(lblResto_1);
		
		JButton btnSeePromos = new JButton("SEE PROMOS");
		btnSeePromos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePromos promos = new FramePromos();
				promos.setVisible(true);
				
				dispose();
			}
		});
		btnSeePromos.setForeground(new Color(255, 135, 50));
		btnSeePromos.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnSeePromos.setBorder(new LineBorder(null, 2));
		btnSeePromos.setBackground(new Color(245, 235, 220));
		btnSeePromos.setBounds(118, 22, 131, 27);
		contentPane.add(btnSeePromos);
	}
}
