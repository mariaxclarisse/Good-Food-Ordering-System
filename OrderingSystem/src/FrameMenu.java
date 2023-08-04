import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class FrameMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public int pizza1Qty;
	public int pizza2Qty;
	public int pizza3Qty;
	
	public int burger1Qty;
	public int burger2Qty;
	public int burger3Qty;
	
	public int pasta1Qty;
	public int pasta2Qty;
	public int pasta3Qty;
	
	public int drink1Qty;
	public int drink2Qty;
	public int drink3Qty;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenu frame = new FrameMenu();
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
	public FrameMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 576);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 235, 220));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResto = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/resto.jpg")).getImage();
		lblResto.setIcon(new ImageIcon(img));
		lblResto.setBounds(0, 516, 610, 114);
		contentPane.add(lblResto);
		
		JLabel lblResto_1 = new JLabel("New label");
		Image img1 = new ImageIcon(this.getClass().getResource("/resto.jpg")).getImage();
		lblResto_1.setIcon(new ImageIcon(img1));
		lblResto_1.setBounds(608, 516, 610, 114);
		contentPane.add(lblResto_1);
		
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
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenu.setForeground(new Color(255, 135, 50));
		lblMenu.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblMenu.setBounds(369, -5, 160, 79);
		contentPane.add(lblMenu);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 235, 220));
		panel.setBorder(new LineBorder(new Color(215, 199, 181), 2));
		panel.setBounds(10, 90, 496, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPizza = new JLabel("P\r\nI\r\nZ\r\nZ\r\nA");
		lblPizza.setBounds(436, 0, 87, 28);
		panel.add(lblPizza);
		lblPizza.setHorizontalAlignment(SwingConstants.LEFT);
		lblPizza.setForeground(new Color(83, 32, 24));
		lblPizza.setFont(new Font("Barlow Condensed Black", Font.BOLD, 23));
		
		JLabel lblHawaiin = new JLabel("HAWAIIAN (9'')");
		lblHawaiin.setHorizontalAlignment(SwingConstants.LEFT);
		lblHawaiin.setForeground(new Color(43, 2, 0));
		lblHawaiin.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblHawaiin.setBounds(10, 24, 75, 28);
		panel.add(lblHawaiin);
		
		JLabel lblPhp = new JLabel("PHP 200.00");
		lblPhp.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp.setForeground(new Color(43, 2, 0));
		lblPhp.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp.setBounds(10, 40, 59, 28);
		panel.add(lblPhp);
		
		JLabel lblPepperoni = new JLabel("PEPPERONI (9'')");
		lblPepperoni.setHorizontalAlignment(SwingConstants.LEFT);
		lblPepperoni.setForeground(new Color(43, 2, 0));
		lblPepperoni.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblPepperoni.setBounds(175, 24, 75, 28);
		panel.add(lblPepperoni);
		
		JLabel lblPhp_1 = new JLabel("PHP 200.00");
		lblPhp_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1.setForeground(new Color(43, 2, 0));
		lblPhp_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1.setBounds(175, 40, 59, 28);
		panel.add(lblPhp_1);
		
		JLabel lblCheezy = new JLabel("CHEEZY (9'')");
		lblCheezy.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheezy.setForeground(new Color(43, 2, 0));
		lblCheezy.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblCheezy.setBounds(336, 24, 75, 28);
		panel.add(lblCheezy);
		
		JLabel lblPhp_2 = new JLabel("PHP 200.00");
		lblPhp_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2.setForeground(new Color(43, 2, 0));
		lblPhp_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2.setBounds(336, 40, 59, 28);
		panel.add(lblPhp_2);
		
		JLabel lblHawaiianPic = new JLabel("");
		Image haw = new ImageIcon(this.getClass().getResource("/S_HWC.jpg")).getImage();
		lblHawaiianPic.setIcon(new ImageIcon(haw));
		lblHawaiianPic.setBounds(10, 66, 87, 85);
		panel.add(lblHawaiianPic);
		
		JLabel lblPepperoniPic = new JLabel("");
		Image pep = new ImageIcon(this.getClass().getResource("/S_PF.jpg")).getImage();
		lblPepperoniPic.setIcon(new ImageIcon(pep));
		lblPepperoniPic.setBounds(175, 66, 87, 85);
		panel.add(lblPepperoniPic);
		
		JLabel lblCheezyPic = new JLabel("");
		Image chz = new ImageIcon(this.getClass().getResource("/S_CM.jpg")).getImage();
		lblCheezyPic.setIcon(new ImageIcon(chz));
		lblCheezyPic.setBounds(336, 66, 87, 85);
		panel.add(lblCheezyPic);
		
		JLabel lblPhp_2_4 = new JLabel("Enter Quantity:");
		lblPhp_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4.setForeground(new Color(43, 2, 0));
		lblPhp_2_4.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4.setBounds(336, 148, 75, 28);
		panel.add(lblPhp_2_4);
		
		JLabel lblPhp_2_4_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_1.setBounds(175, 148, 75, 28);
		panel.add(lblPhp_2_4_1);
		
		JLabel lblPhp_2_4_2 = new JLabel("Enter Quantity:");
		lblPhp_2_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_2.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_2.setBounds(10, 148, 75, 28);
		panel.add(lblPhp_2_4_2);
		
		JSpinner hawQty = new JSpinner();
		hawQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pizza1Qty = (int)(hawQty.getValue());
			}
		});
		hawQty.setBounds(10, 172, 87, 21);
		panel.add(hawQty);
		hawQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		hawQty.setBackground(new Color(215, 199, 181));
		hawQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		hawQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		
		JSpinner pepQty = new JSpinner();
		pepQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		pepQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pizza2Qty = (int)(pepQty.getValue());
			}
		});
		pepQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		pepQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		pepQty.setBackground(new Color(215, 199, 181));
		pepQty.setBounds(175, 172, 87, 21);
		panel.add(pepQty);
		
		JSpinner chzQty = new JSpinner();
		chzQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		chzQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pizza3Qty = (int)(chzQty.getValue());
			}
		});
		chzQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		chzQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		chzQty.setBackground(new Color(215, 199, 181));
		chzQty.setBounds(336, 172, 87, 21);
		panel.add(chzQty);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 235, 220));
		panel_1.setBorder(new LineBorder(new Color(215, 199, 181), 2));
		panel_1.setBounds(10, 300, 496, 205);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPasta = new JLabel("PASTA");
		lblPasta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasta.setForeground(new Color(83, 32, 24));
		lblPasta.setFont(new Font("Barlow Condensed Black", Font.BOLD, 23));
		lblPasta.setBounds(428, 0, 92, 28);
		panel_1.add(lblPasta);
		
		JLabel lblCarbonara = new JLabel("CARBONARA");
		lblCarbonara.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarbonara.setForeground(new Color(43, 2, 0));
		lblCarbonara.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblCarbonara.setBounds(10, 25, 75, 28);
		panel_1.add(lblCarbonara);
		
		JLabel lblPhp_4 = new JLabel("PHP 100.00");
		lblPhp_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_4.setForeground(new Color(43, 2, 0));
		lblPhp_4.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_4.setBounds(10, 41, 59, 28);
		panel_1.add(lblPhp_4);
		
		JLabel lblSpaghetti = new JLabel("SPAGHETTI");
		lblSpaghetti.setHorizontalAlignment(SwingConstants.LEFT);
		lblSpaghetti.setForeground(new Color(43, 2, 0));
		lblSpaghetti.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblSpaghetti.setBounds(174, 25, 75, 28);
		panel_1.add(lblSpaghetti);
		
		JLabel lblPhp_1_2 = new JLabel("PHP 100.00");
		lblPhp_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_2.setForeground(new Color(43, 2, 0));
		lblPhp_1_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1_2.setBounds(174, 41, 59, 28);
		panel_1.add(lblPhp_1_2);
		
		JLabel lblMacaroni = new JLabel("MACARONI");
		lblMacaroni.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacaroni.setForeground(new Color(43, 2, 0));
		lblMacaroni.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblMacaroni.setBounds(335, 25, 75, 28);
		panel_1.add(lblMacaroni);
		
		JLabel lblPhp_2_2 = new JLabel("PHP 100.00");
		lblPhp_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_2.setForeground(new Color(43, 2, 0));
		lblPhp_2_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_2.setBounds(335, 41, 59, 28);
		panel_1.add(lblPhp_2_2);
		
		JLabel lblCarbonaraPic = new JLabel("");
		Image cb = new ImageIcon(this.getClass().getResource("/S_CHICARB.jpg")).getImage();
		lblCarbonaraPic.setIcon(new ImageIcon(cb));
		lblCarbonaraPic.setBounds(10, 66, 87, 85);
		panel_1.add(lblCarbonaraPic);
		
		JLabel lblSpagPic = new JLabel("");
		Image spag = new ImageIcon(this.getClass().getResource("/S_ITALIAN.jpg")).getImage();
		lblSpagPic.setIcon(new ImageIcon(spag));
		lblSpagPic.setBounds(175, 66, 87, 85);
		panel_1.add(lblSpagPic);
		
		JLabel lblMacaroniPic = new JLabel("");
		Image mac = new ImageIcon(this.getClass().getResource("/S_BAKEDMAC.jpg")).getImage();
		lblMacaroniPic.setIcon(new ImageIcon(mac));
		lblMacaroniPic.setBounds(336, 66, 87, 85);
		panel_1.add(lblMacaroniPic);
		
		JLabel lblPhp_2_4_2_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_2_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_2_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_2_1.setBounds(10, 148, 75, 28);
		panel_1.add(lblPhp_2_4_2_1);
		
		JLabel lblPhp_2_4_1_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_1_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_1_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_1_1.setBounds(175, 148, 75, 28);
		panel_1.add(lblPhp_2_4_1_1);
		
		JLabel lblPhp_2_4_3 = new JLabel("Enter Quantity:");
		lblPhp_2_4_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_3.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_3.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_3.setBounds(336, 148, 75, 28);
		panel_1.add(lblPhp_2_4_3);
		
		JSpinner carboQty = new JSpinner();
		carboQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		carboQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pasta1Qty = (int)(carboQty.getValue());
			}
		});
		carboQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		carboQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		carboQty.setBackground(new Color(215, 199, 181));
		carboQty.setBounds(10, 173, 87, 21);
		panel_1.add(carboQty);
		
		JSpinner spagQty = new JSpinner();
		spagQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spagQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pasta2Qty = (int)(spagQty.getValue());
			}
		});
		spagQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		spagQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		spagQty.setBackground(new Color(215, 199, 181));
		spagQty.setBounds(175, 173, 87, 21);
		panel_1.add(spagQty);
		
		JSpinner macQty = new JSpinner();
		macQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		macQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pasta3Qty = (int)(macQty.getValue());
			}
		});
		macQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		macQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		macQty.setBackground(new Color(215, 199, 181));
		macQty.setBounds(336, 173, 87, 21);
		panel_1.add(macQty);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 235, 220));
		panel_2.setBorder(new LineBorder(new Color(215, 199, 181), 2));
		panel_2.setBounds(516, 90, 496, 205);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBurger = new JLabel("BURGER");
		lblBurger.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurger.setForeground(new Color(83, 32, 24));
		lblBurger.setFont(new Font("Barlow Condensed Black", Font.BOLD, 23));
		lblBurger.setBounds(420, 0, 87, 28);
		panel_2.add(lblBurger);
		
		JLabel lblCheesyBacon = new JLabel("CHEESY BACON");
		lblCheesyBacon.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheesyBacon.setForeground(new Color(43, 2, 0));
		lblCheesyBacon.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblCheesyBacon.setBounds(10, 24, 75, 28);
		panel_2.add(lblCheesyBacon);
		
		JLabel lblPhp_3 = new JLabel("PHP 150.00");
		lblPhp_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_3.setForeground(new Color(43, 2, 0));
		lblPhp_3.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_3.setBounds(10, 40, 59, 28);
		panel_2.add(lblPhp_3);
		
		JLabel lblBeef = new JLabel("MONSTER BEEF");
		lblBeef.setHorizontalAlignment(SwingConstants.LEFT);
		lblBeef.setForeground(new Color(43, 2, 0));
		lblBeef.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblBeef.setBounds(174, 24, 75, 28);
		panel_2.add(lblBeef);
		
		JLabel lblPhp_1_1 = new JLabel("PHP 150.00");
		lblPhp_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_1.setForeground(new Color(43, 2, 0));
		lblPhp_1_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1_1.setBounds(174, 40, 59, 28);
		panel_2.add(lblPhp_1_1);
		
		JLabel lblUltimate = new JLabel("ULTIMATE");
		lblUltimate.setHorizontalAlignment(SwingConstants.LEFT);
		lblUltimate.setForeground(new Color(43, 2, 0));
		lblUltimate.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblUltimate.setBounds(335, 24, 75, 28);
		panel_2.add(lblUltimate);
		
		JLabel lblPhp_2_1 = new JLabel("PHP 150.00");
		lblPhp_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_1.setBounds(335, 40, 59, 28);
		panel_2.add(lblPhp_2_1);
		
		JLabel lblCheeseBaconPic = new JLabel("");
		Image chzz = new ImageIcon(this.getClass().getResource("/B_Chz.jpg")).getImage();
		lblCheeseBaconPic.setIcon(new ImageIcon(chzz));
		lblCheeseBaconPic.setBounds(10, 66, 87, 85);
		panel_2.add(lblCheeseBaconPic);
		
		JLabel lblBeefPic = new JLabel("");
		Image bf = new ImageIcon(this.getClass().getResource("/B_Beef.jpg")).getImage();
		lblBeefPic.setIcon(new ImageIcon(bf));
		lblBeefPic.setBounds(175, 66, 87, 85);
		panel_2.add(lblBeefPic);
		
		JLabel lblUltimateBeef = new JLabel("");
		Image ult = new ImageIcon(this.getClass().getResource("/B_Ult.jpg")).getImage();
		lblUltimateBeef.setIcon(new ImageIcon(ult));
		lblUltimateBeef.setBounds(336, 66, 87, 85);
		panel_2.add(lblUltimateBeef);
		
		JLabel lblPhp_2_4_2_2 = new JLabel("Enter Quantity:");
		lblPhp_2_4_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_2_2.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_2_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_2_2.setBounds(10, 148, 75, 28);
		panel_2.add(lblPhp_2_4_2_2);
		
		JLabel lblPhp_2_4_1_2 = new JLabel("Enter Quantity:");
		lblPhp_2_4_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_1_2.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_1_2.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_1_2.setBounds(175, 148, 75, 28);
		panel_2.add(lblPhp_2_4_1_2);
		
		JLabel lblPhp_2_4_4 = new JLabel("Enter Quantity:");
		lblPhp_2_4_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_4.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_4.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_4.setBounds(336, 148, 75, 28);
		panel_2.add(lblPhp_2_4_4);
		
		JSpinner bcnQty = new JSpinner();
		bcnQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		bcnQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				burger1Qty = (int)(bcnQty.getValue());
			}
		});
		bcnQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		bcnQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		bcnQty.setBackground(new Color(215, 199, 181));
		bcnQty.setBounds(10, 172, 87, 21);
		panel_2.add(bcnQty);
		
		JSpinner beefQty = new JSpinner();
		beefQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		beefQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				burger2Qty = (int)(beefQty.getValue());
			}
		});
		beefQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		beefQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		beefQty.setBackground(new Color(215, 199, 181));
		beefQty.setBounds(175, 172, 87, 21);
		panel_2.add(beefQty);
		
		JSpinner ultQty = new JSpinner();
		ultQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		ultQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				burger3Qty = (int)(ultQty.getValue());
			}
		});
		ultQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		ultQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		ultQty.setBackground(new Color(215, 199, 181));
		ultQty.setBounds(336, 172, 87, 21);
		panel_2.add(ultQty);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(245, 235, 220));
		panel_1_1.setBorder(new LineBorder(new Color(215, 199, 181), 2));
		panel_1_1.setBounds(516, 300, 496, 205);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrinks.setForeground(new Color(83, 32, 24));
		lblDrinks.setFont(new Font("Barlow Condensed Black", Font.BOLD, 23));
		lblDrinks.setBounds(424, 0, 100, 28);
		panel_1_1.add(lblDrinks);
		
		JLabel lblIcedCoffee = new JLabel("ICED COFFEE");
		lblIcedCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcedCoffee.setForeground(new Color(43, 2, 0));
		lblIcedCoffee.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblIcedCoffee.setBounds(10, 25, 75, 28);
		panel_1_1.add(lblIcedCoffee);
		
		JLabel lblPhp_5 = new JLabel("PHP 80.00");
		lblPhp_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_5.setForeground(new Color(43, 2, 0));
		lblPhp_5.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_5.setBounds(10, 41, 59, 28);
		panel_1_1.add(lblPhp_5);
		
		JLabel lblIcedTea = new JLabel("ICED TEA");
		lblIcedTea.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcedTea.setForeground(new Color(43, 2, 0));
		lblIcedTea.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblIcedTea.setBounds(174, 25, 75, 28);
		panel_1_1.add(lblIcedTea);
		
		JLabel lblPhp_1_3 = new JLabel("PHP 80.00");
		lblPhp_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_3.setForeground(new Color(43, 2, 0));
		lblPhp_1_3.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1_3.setBounds(174, 41, 59, 28);
		panel_1_1.add(lblPhp_1_3);
		
		JLabel lblLemonade = new JLabel("LEMONADE");
		lblLemonade.setHorizontalAlignment(SwingConstants.LEFT);
		lblLemonade.setForeground(new Color(43, 2, 0));
		lblLemonade.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 13));
		lblLemonade.setBounds(335, 25, 75, 28);
		panel_1_1.add(lblLemonade);
		
		JLabel lblPhp_2_3 = new JLabel("PHP 80.00");
		lblPhp_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_3.setForeground(new Color(43, 2, 0));
		lblPhp_2_3.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_3.setBounds(335, 41, 59, 28);
		panel_1_1.add(lblPhp_2_3);
		
		JLabel lblCoffeePic = new JLabel("");
		Image cof = new ImageIcon(this.getClass().getResource("/D_Coffee.jpg")).getImage();
		lblCoffeePic.setIcon(new ImageIcon(cof));
		lblCoffeePic.setBounds(10, 66, 87, 85);
		panel_1_1.add(lblCoffeePic);
		
		JLabel lblIcedTeaPic = new JLabel("");
		Image tea = new ImageIcon(this.getClass().getResource("/D_Tea.jpg")).getImage();
		lblIcedTeaPic.setIcon(new ImageIcon(tea));
		lblIcedTeaPic.setBounds(175, 66, 87, 85);
		panel_1_1.add(lblIcedTeaPic);
		
		JLabel lblLemonadePic = new JLabel("");
		Image lem = new ImageIcon(this.getClass().getResource("/D_Lemon.jpg")).getImage();
		lblLemonadePic.setIcon(new ImageIcon(lem));
		lblLemonadePic.setBounds(336, 66, 87, 85);
		panel_1_1.add(lblLemonadePic);
		
		JLabel lblPhp_2_4_2_2_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_2_2_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_2_2_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_2_2_1.setBounds(9, 148, 75, 28);
		panel_1_1.add(lblPhp_2_4_2_2_1);
		
		JLabel lblPhp_2_4_1_2_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_1_2_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_1_2_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_1_2_1.setBounds(174, 148, 75, 28);
		panel_1_1.add(lblPhp_2_4_1_2_1);
		
		JLabel lblPhp_2_4_4_1 = new JLabel("Enter Quantity:");
		lblPhp_2_4_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_4_4_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_4_4_1.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_2_4_4_1.setBounds(335, 148, 75, 28);
		panel_1_1.add(lblPhp_2_4_4_1);
		
		JSpinner coffeeQty = new JSpinner();
		coffeeQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		coffeeQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				drink1Qty = (int)(coffeeQty.getValue());
			}
		});
		coffeeQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		coffeeQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		coffeeQty.setBackground(new Color(215, 199, 181));
		coffeeQty.setBounds(10, 173, 87, 21);
		panel_1_1.add(coffeeQty);
		
		JSpinner teaQty = new JSpinner();
		teaQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		teaQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				drink2Qty = (int)(teaQty.getValue());
			}
		});
		teaQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		teaQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		teaQty.setBackground(new Color(215, 199, 181));
		teaQty.setBounds(175, 173, 87, 21);
		panel_1_1.add(teaQty);
		
		JSpinner lemonQty = new JSpinner();
		lemonQty.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		lemonQty.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				drink3Qty = (int)(lemonQty.getValue());
			}
		});
		lemonQty.setFont(new Font("Barlow Condensed", Font.BOLD, 14));
		lemonQty.setBorder(new EmptyBorder(0, 0, 0, 0));
		lemonQty.setBackground(new Color(215, 199, 181));
		lemonQty.setBounds(336, 173, 87, 21);
		panel_1_1.add(lemonQty);
		
		JButton btnAddtoCart = new JButton("ADD ITEMS TO CART");
		btnAddtoCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are your orders final?", 
						"Menu", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						
					MenuChild menu = new MenuChild();
					FrameCart cart = new FrameCart();
					
					// through encapsulation, set and get the price of each product
					menu.setPizzaPrice(200.00);
					menu.setBurgerPrice(150.00);
					menu.setPastaPrice(100.00);
					menu.setDrinkPrice(80.00);
					
					double pizzaPrice = menu.getPizzaPrice();
					double burgerPrice = menu.getBurgerPrice();
					double pastaPrice = menu.getPastaPrice();
					double drinkPrice = menu.getDrinkPrice();
					
					//to compute total amount per item e.g. total amount of two coffees
					menu.pizza1 = pizzaPrice * pizza1Qty;
					menu.pizza2 = pizzaPrice * pizza2Qty;
					menu.pizza3 = pizzaPrice * pizza3Qty;
					
					menu.burger1 = burgerPrice * burger1Qty;
					menu.burger2 = burgerPrice * burger2Qty;
					menu.burger3 = burgerPrice * burger3Qty;

					menu.pasta1 = pastaPrice * pasta1Qty;
					menu.pasta2 = pastaPrice * pasta2Qty;
					menu.pasta3 = pastaPrice * pasta3Qty;
					
					menu.drink1 = drinkPrice * drink1Qty;
					menu.drink2 = drinkPrice * drink2Qty;
					menu.drink3 = drinkPrice * drink3Qty;
					
					double pizza = menu.pizza1 + menu.pizza2 + menu.pizza3;
					double burger = menu.burger1 + menu.burger2 + menu.burger3;
					double pasta = menu.pasta1 + menu.pasta2 + menu.pasta3;
					double drink = menu.drink1 + menu.drink2 + menu.drink3;
					
					//used encapsulation to get total amount to pay
					menu.setTotal(pizza, burger, pasta, drink);
					double total = menu.getTotal();
					
					//to show total amount to pay on cart page
					cart.lblTotal.setText(String.format("%.2f", total));
					
					//to show total amount per item on cart page
					cart.hawTotal.setText(String.format("%.2f", menu.pizza1));
					cart.pepTotal.setText(String.format("%.2f", menu.pizza2));
					cart.chzTotal.setText(String.format("%.2f", menu.pizza3));
					
					cart.bcnTotal.setText(String.format("%.2f", menu.burger1));
					cart.beefTotal.setText(String.format("%.2f", menu.burger2));
					cart.ultTotal.setText(String.format("%.2f", menu.burger3));
					
					cart.carboTotal.setText(String.format("%.2f", menu.pasta1));
					cart.spagTotal.setText(String.format("%.2f", menu.pasta2));
					cart.macTotal.setText(String.format("%.2f", menu.pasta3));
					
					cart.coffeeTotal.setText(String.format("%.2f", menu.drink1));
					cart.teaTotal.setText(String.format("%.2f", menu.drink2));
					cart.lemonTotal.setText(String.format("%.2f", menu.drink3));
					
					//to show quantity of items on cart page
					cart.lblPizza1Qty.setText(String.valueOf(pizza1Qty));
					cart.lblPizza2Qty.setText(String.valueOf(pizza2Qty));
					cart.lblPizza3Qty.setText(String.valueOf(pizza3Qty));
					
					cart.lblBurger1Qty.setText(String.valueOf(burger1Qty));
					cart.lblBurger2Qty.setText(String.valueOf(burger2Qty));
					cart.lblBurger3Qty.setText(String.valueOf(burger3Qty));
					
					cart.lblPasta1Qty.setText(String.valueOf(pasta1Qty));
					cart.lblPasta2Qty.setText(String.valueOf(pasta2Qty));
					cart.lblPasta3Qty.setText(String.valueOf(pasta3Qty));
					
					cart.lblDrink1Qty.setText(String.valueOf(drink1Qty));
					cart.lblDrink2Qty.setText(String.valueOf(drink2Qty));
					cart.lblDrink3Qty.setText(String.valueOf(drink3Qty));

					cart.setVisible(true);
					dispose();
				} 
			}
		});
		btnAddtoCart.setForeground(Color.WHITE);
		btnAddtoCart.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnAddtoCart.setBorderPainted(false);
		btnAddtoCart.setBorder(null);
		btnAddtoCart.setBackground(new Color(255, 135, 50));
		btnAddtoCart.setBounds(716, 11, 160, 38);
		contentPane.add(btnAddtoCart);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new MenuChild();
				menu.LogOut();
			}
		});
		btnLogOut.setForeground(new Color(255, 135, 50));
		btnLogOut.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnLogOut.setBorder(new LineBorder(null, 2));
		btnLogOut.setBackground(new Color(245, 235, 220));
		btnLogOut.setBounds(883, 11, 129, 38);
		contentPane.add(btnLogOut);
		
		JLabel lblPhp_1_4 = new JLabel("Choose your product/s and enter the quantity before adding the items to the cart.");
		lblPhp_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_4.setForeground(new Color(43, 2, 0));
		lblPhp_1_4.setFont(new Font("Barlow Condensed", Font.ITALIC, 13));
		lblPhp_1_4.setBounds(89, 59, 422, 28);
		contentPane.add(lblPhp_1_4);
	}
}
