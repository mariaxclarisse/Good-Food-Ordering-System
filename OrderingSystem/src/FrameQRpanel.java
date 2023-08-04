import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameQRpanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQRpanel frame = new FrameQRpanel();
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
	public FrameQRpanel() {
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
		
		JLabel lblCheckOutOrder = new JLabel("QR CODE");
		lblCheckOutOrder.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheckOutOrder.setForeground(new Color(255, 135, 50));
		lblCheckOutOrder.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblCheckOutOrder.setBounds(369, 6, 389, 79);
		contentPane.add(lblCheckOutOrder);
		
		JLabel lblTransactionCompleted = new JLabel("ORDER IS NOW BEING PROCESSED");
		lblTransactionCompleted.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionCompleted.setForeground(new Color(43, 2, 0));
		lblTransactionCompleted.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 46));
		lblTransactionCompleted.setBounds(208, 125, 607, 67);
		contentPane.add(lblTransactionCompleted);
		
		JLabel lblProduct_2 = new JLabel("Please scan this QR Code for you Payment Details.");
		lblProduct_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct_2.setForeground(new Color(43, 2, 0));
		lblProduct_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 18));
		lblProduct_2.setBounds(195, 453, 634, 28);
		contentPane.add(lblProduct_2);
		
		JLabel lblProduct_2_1 = new JLabel("Thank you for trusting GOOD FOOD!");
		lblProduct_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct_2_1.setForeground(new Color(43, 2, 0));
		lblProduct_2_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 18));
		lblProduct_2_1.setBounds(195, 190, 634, 28);
		contentPane.add(lblProduct_2_1);
		
		JLabel lblQR = new JLabel("");
		Image QR = new ImageIcon(this.getClass().getResource("/QR.png")).getImage();
		lblQR.setIcon(new ImageIcon(QR));
		lblQR.setHorizontalAlignment(SwingConstants.CENTER);
		lblQR.setForeground(new Color(43, 2, 0));
		lblQR.setFont(new Font("Barlow Condensed", Font.PLAIN, 18));
		lblQR.setBounds(195, 229, 634, 220);
		contentPane.add(lblQR);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameHome home = new FrameHome();
				home.setVisible(true);
				dispose();
			}
		});
		btnDone.setForeground(Color.WHITE);
		btnDone.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnDone.setBorderPainted(false);
		btnDone.setBorder(null);
		btnDone.setBackground(new Color(255, 135, 50));
		btnDone.setBounds(885, 11, 129, 38);
		contentPane.add(btnDone);
	}

}
