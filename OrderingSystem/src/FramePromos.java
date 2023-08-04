import java.awt.BorderLayout;
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
import javax.swing.border.LineBorder;

public class FramePromos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePromos frame = new FramePromos();
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
	public FramePromos() {
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
		lblGoodFoodMen.setBounds(89, -11, 290, 90);
		contentPane.add(lblGoodFoodMen);
		
		JLabel lblMenu = new JLabel("PROMOS");
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(new Color(255, 135, 50));
		lblMenu.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblMenu.setBounds(369, -5, 297, 79);
		contentPane.add(lblMenu);
		
		JLabel lblPic1 = new JLabel("");
		lblPic1.setIcon(new ImageIcon(FramePromos.class.getResource("/prm1.jpg")));
		lblPic1.setBounds(118, 120, 304, 193);
		contentPane.add(lblPic1);
		
		JLabel lblPic2 = new JLabel("");
		lblPic2.setIcon(new ImageIcon(FramePromos.class.getResource("/prm2.jpg")));
		lblPic2.setBounds(490, 119, 423, 406);
		contentPane.add(lblPic2);
		
		JLabel lblPic3 = new JLabel("");
		lblPic3.setIcon(new ImageIcon(FramePromos.class.getResource("/prm3.jpg")));
		lblPic3.setBounds(118, 324, 304, 201);
		contentPane.add(lblPic3);
		
		JLabel lblPhp_1_4 = new JLabel("COMING SOON THIS MARCH 2022");
		lblPhp_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_4.setForeground(new Color(43, 2, 0));
		lblPhp_1_4.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1_4.setBounds(89, 60, 422, 28);
		contentPane.add(lblPhp_1_4);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameHome home = new FrameHome();
				home.setVisible(true);
				
				dispose();
			}
		});
		btnHome.setForeground(new Color(255, 135, 50));
		btnHome.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnHome.setBorder(new LineBorder(null, 2));
		btnHome.setBackground(new Color(245, 235, 220));
		btnHome.setBounds(885, 11, 129, 38);
		contentPane.add(btnHome);
	}
}
