import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Scanner;

public class FraneCreateUser extends JFrame {

	private JPanel contentPane;
	Scanner sc = new Scanner(System.in);  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FraneCreateUser frame = new FraneCreateUser();
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
	public FraneCreateUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 576);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 235, 220));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(logo));
		lblLogo.setBounds(0, 39, 483, 447);
		contentPane.add(lblLogo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 135, 50));
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		panel.setBounds(520, 0, 504, 576);
		contentPane.add(panel);
		
		JLabel lblLogIn = new JLabel("CREATE USER");
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setForeground(new Color(214, 35, 0));
		lblLogIn.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 67));
		lblLogIn.setBounds(49, 31, 400, 79);
		panel.add(lblLogIn);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setForeground(new Color(43, 2, 0));
		lblUsername.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblUsername.setBounds(49, 187, 100, 38);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(43, 2, 0));
		lblPassword.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblPassword.setBounds(49, 263, 100, 38);
		panel.add(lblPassword);
		
		JTextPane txtUser = new JTextPane();
		txtUser.setForeground(new Color(214, 35, 0));
		txtUser.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtUser.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtUser.setBackground(new Color(245, 235, 220));
		txtUser.setBounds(49, 219, 400, 33);
		panel.add(txtUser);			
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameHome home = new FrameHome();
				home.setVisible(true);
				
				dispose();
			}
		});
		btnHome.setForeground(new Color(83, 32, 24));
		btnHome.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnHome.setBorder(new LineBorder(new Color(83, 32, 24), 3));
		btnHome.setBackground(new Color(255, 135, 50));
		btnHome.setBounds(258, 494, 191, 38);
		panel.add(btnHome);
		
		JTextPane txtPass = new JTextPane();
		txtPass.setForeground(new Color(214, 35, 0));
		txtPass.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtPass.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtPass.setBackground(new Color(245, 235, 220));
		txtPass.setBounds(49, 294, 400, 33);
		panel.add(txtPass);
		
		JTextPane txtName = new JTextPane();
		txtName.setForeground(new Color(214, 35, 0));
		txtName.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtName.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtName.setBackground(new Color(245, 235, 220));
		txtName.setBounds(49, 141, 400, 33);
		panel.add(txtName);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(43, 2, 0));
		lblName.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblName.setBounds(49, 109, 100, 38);
		panel.add(lblName);
		
		JLabel lblCellphoneNumber = new JLabel("CELLPHONE NUMBER");
		lblCellphoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblCellphoneNumber.setForeground(new Color(43, 2, 0));
		lblCellphoneNumber.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblCellphoneNumber.setBounds(49, 338, 126, 38);
		panel.add(lblCellphoneNumber);
		
		JTextPane txtNum = new JTextPane();
		txtNum.setForeground(new Color(214, 35, 0));
		txtNum.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtNum.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtNum.setBackground(new Color(245, 235, 220));
		txtNum.setBounds(49, 369, 400, 33);
		panel.add(txtNum);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtUser.setText(null);
				txtPass.setText(null);
				txtNum.setText(null);
			}
		});
		btnClear.setForeground(new Color(83, 32, 24));
		btnClear.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnClear.setBorder(new LineBorder(new Color(83, 32, 24), 3));
		btnClear.setBackground(new Color(255, 135, 50));
		btnClear.setBounds(49, 494, 191, 38);
		panel.add(btnClear);
		
		JButton btnSave = new JButton("SAVE USER");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtName.getText() == null || txtUser.getText() == null ||  txtPass.getText() == null ||  txtNum.getText() == null)
				{					
					JOptionPane.showMessageDialog(null, "Please complete the textfields" , "Log in unsuccessful", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					String[] namearray = new String[10];							
					namearray[0] = txtName.getText();				
					JOptionPane.showMessageDialog(null, "Welcome " + txtName.getText(), "Log in", JOptionPane.INFORMATION_MESSAGE);	
				}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnSave.setBorderPainted(false);
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(83, 32, 24));
		btnSave.setBounds(156, 445, 191, 38);
		panel.add(btnSave);
	}

}