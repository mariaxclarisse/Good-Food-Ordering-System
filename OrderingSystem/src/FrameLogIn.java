import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameLogIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogIn frame = new FrameLogIn();
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
	public FrameLogIn() {
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
		lblLogo.setBounds(10, 39, 483, 447);
		contentPane.add(lblLogo);
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(new Color(255, 135, 50));
		panel.setBounds(530, 0, 494, 576);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setBounds(112, 73, 275, 79);
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setForeground(new Color(214, 35, 0));
		lblLogIn.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 80));
		panel.add(lblLogIn);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setForeground(new Color(43, 2, 0));
		lblUsername.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblUsername.setBounds(48, 163, 100, 38);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(43, 2, 0));
		lblPassword.setFont(new Font("Barlow Condensed", Font.ITALIC, 15));
		lblPassword.setBounds(48, 239, 100, 38);
		panel.add(lblPassword);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtPass.setForeground(new Color(214, 35, 0));
		txtPass.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtPass.setBackground(new Color(245, 235, 220));
		txtPass.setBounds(48, 270, 400, 33);
		panel.add(txtPass);
		
		JTextPane txtUser = new JTextPane();
		txtUser.setBorder(new EmptyBorder(0, 12, 0, 0));
		txtUser.setForeground(new Color(214, 35, 0));
		txtUser.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		txtUser.setBackground(new Color(245, 235, 220));
		txtUser.setBounds(48, 195, 400, 33);
		panel.add(txtUser);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//FrameMenu menu = new FrameMenu();
				//menu.setVisible(true);
				
				//dispose();
				
				String uname[] = {"admin", "user"};
				String pass[] = {"admin", "user"};
				
				String username = txtUser.getText();
				String password = txtPass.getText();
				
				//Log in success for admin
				if(username.equals(uname[0]) && password.equals(pass[0]))
				{
					JOptionPane.showMessageDialog(null, "Log in success", "Log in", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					FrameDash2 dash = new FrameDash2();
					dash.setVisible(true);
				}
				
				//Log in success for user
				else if (username.equals(uname[1]) && password.equals(pass[1]))
				{
					JOptionPane.showMessageDialog(null, "Log in success", "Log in", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					FrameMenu menu = new FrameMenu();
					menu.setVisible(true);
				}
				//Log in unsuccessful
				else 
				{
					JOptionPane.showMessageDialog(null, "Incorrect Username and Password" , "Log in Unsuccessful" , JOptionPane.ERROR_MESSAGE);
					
					//clearing texts
					txtUser.setText(null);
					txtPass.setText(null);
				}
			}
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnLogIn.setBorderPainted(false);
		btnLogIn.setBorder(null);
		btnLogIn.setBackground(new Color(83, 32, 24));
		btnLogIn.setBounds(154, 357, 191, 38);
		panel.add(btnLogIn);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText(null);
				txtPass.setText(null);
			}
		});
		btnClear.setForeground(new Color(83, 32, 24));
		btnClear.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnClear.setBorder(new LineBorder(new Color(83, 32, 24), 3));
		btnClear.setBackground(new Color(255, 135, 50));
		btnClear.setBounds(154, 406, 191, 38);
		panel.add(btnClear);
		
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
		btnHome.setBounds(154, 455, 191, 38);
		panel.add(btnHome);
	}
}
