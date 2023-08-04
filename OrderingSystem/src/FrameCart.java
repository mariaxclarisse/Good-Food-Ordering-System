import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCart extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public JLabel lblPizza1Qty;
	public JLabel lblPizza2Qty;
	public JLabel lblPizza3Qty;
	
	public JLabel lblBurger1Qty;
	public JLabel lblBurger2Qty;
	public JLabel lblBurger3Qty;
	
	public JLabel lblPasta1Qty;
	public JLabel lblPasta2Qty;
	public JLabel lblPasta3Qty;

	public JLabel lblDrink1Qty;
	public JLabel lblDrink2Qty;
	public JLabel lblDrink3Qty;
	
	public JLabel hawTotal;
	public JLabel pepTotal;
	public JLabel chzTotal;
	
	public JLabel bcnTotal;
	public JLabel beefTotal;
	public JLabel ultTotal;
	
	public JLabel carboTotal;
	public JLabel spagTotal;
	public JLabel macTotal;
	
	public JLabel coffeeTotal;
	public JLabel teaTotal;
	public JLabel lemonTotal;
	
	public JLabel lblTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCart frame = new FrameCart();
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
	public FrameCart() {			
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
		
		JLabel lblCart = new JLabel("CART");
		lblCart.setHorizontalAlignment(SwingConstants.LEFT);
		lblCart.setForeground(new Color(255, 135, 50));
		lblCart.setFont(new Font("Barlow Condensed ExtraBold", Font.BOLD, 63));
		lblCart.setBounds(369, 6, 160, 79);
		contentPane.add(lblCart);
		
		JLabel lblProduct = new JLabel("PRODUCT");
		lblProduct.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduct.setForeground(new Color(43, 2, 0));
		lblProduct.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblProduct.setBounds(221, 94, 75, 28);
		contentPane.add(lblProduct);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setForeground(new Color(43, 2, 0));
		lblPrice.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblPrice.setBounds(436, 94, 75, 28);
		contentPane.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setForeground(new Color(43, 2, 0));
		lblQuantity.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblQuantity.setBounds(597, 94, 75, 28);
		contentPane.add(lblQuantity);
		
		JLabel lblAmount = new JLabel("TOTAL");
		lblAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblAmount.setForeground(new Color(43, 2, 0));
		lblAmount.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblAmount.setBounds(749, 94, 75, 28);
		contentPane.add(lblAmount);
		
		JLabel lblPizza1 = new JLabel("Hawaiian Pizza (9\")");
		lblPizza1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPizza1.setForeground(new Color(43, 2, 0));
		lblPizza1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPizza1.setBounds(221, 133, 166, 28);
		contentPane.add(lblPizza1);
		
		JLabel lblPhp = new JLabel("PHP 200");
		lblPhp.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp.setForeground(new Color(43, 2, 0));
		lblPhp.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp.setBounds(436, 133, 75, 28);
		contentPane.add(lblPhp);
		
		lblPizza1Qty = new JLabel("-");
		lblPizza1Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPizza1Qty.setForeground(new Color(43, 2, 0));
		lblPizza1Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPizza1Qty.setBounds(597, 133, 75, 28);
		contentPane.add(lblPizza1Qty);
		
		hawTotal = new JLabel("-");
		hawTotal.setHorizontalAlignment(SwingConstants.LEFT);
		hawTotal.setForeground(new Color(43, 2, 0));
		hawTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		hawTotal.setBounds(784, 133, 75, 28);
		contentPane.add(hawTotal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(133, 487, 745, 2);
		contentPane.add(separator);
		
		JLabel lblAmountToBe = new JLabel("AMOUNT TO BE PAID:");
		lblAmountToBe.setHorizontalAlignment(SwingConstants.LEFT);
		lblAmountToBe.setForeground(new Color(43, 2, 0));
		lblAmountToBe.setFont(new Font("Barlow Condensed Medium", Font.PLAIN, 20));
		lblAmountToBe.setBounds(221, 500, 151, 28);
		contentPane.add(lblAmountToBe);
		
		lblTotal = new JLabel("-");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setForeground(new Color(43, 2, 0));
		lblTotal.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lblTotal.setBounds(784, 500, 75, 28);
		contentPane.add(lblTotal);
		
		JButton btnCheckout = new JButton("CHECK OUT");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameCheckOut pay = new FrameCheckOut();
				pay.lblTotal.setText(lblTotal.getText());

				pay.setVisible(true);
				dispose();
			}
		});
		btnCheckout.setForeground(Color.WHITE);
		btnCheckout.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btnCheckout.setBorderPainted(false);
		btnCheckout.setBorder(null);
		btnCheckout.setBackground(new Color(255, 135, 50));
		btnCheckout.setBounds(749, 11, 129, 38);
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
		btnLogOut.setBounds(885, 11, 129, 38);
		contentPane.add(btnLogOut);
		
		JLabel Pizza = new JLabel("Pizza");
		Pizza.setHorizontalAlignment(SwingConstants.LEFT);
		Pizza.setForeground(new Color(43, 2, 0));
		Pizza.setFont(new Font("Barlow Condensed Medium", Font.ITALIC, 17));
		Pizza.setBounds(99, 133, 75, 28);
		contentPane.add(Pizza);
		
		JLabel lblPepperoniPizza = new JLabel("Pepperoni Pizza (9\")");
		lblPepperoniPizza.setHorizontalAlignment(SwingConstants.LEFT);
		lblPepperoniPizza.setForeground(new Color(43, 2, 0));
		lblPepperoniPizza.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPepperoniPizza.setBounds(221, 157, 166, 28);
		contentPane.add(lblPepperoniPizza);
		
		JLabel lblPhp_2 = new JLabel("PHP 200");
		lblPhp_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2.setForeground(new Color(43, 2, 0));
		lblPhp_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_2.setBounds(436, 157, 75, 28);
		contentPane.add(lblPhp_2);
		
		lblPizza2Qty = new JLabel("-");
		lblPizza2Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPizza2Qty.setForeground(new Color(43, 2, 0));
		lblPizza2Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPizza2Qty.setBounds(597, 157, 75, 28);
		contentPane.add(lblPizza2Qty);
		
		pepTotal = new JLabel("-");
		pepTotal.setHorizontalAlignment(SwingConstants.LEFT);
		pepTotal.setForeground(new Color(43, 2, 0));
		pepTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		pepTotal.setBounds(784, 157, 75, 28);
		contentPane.add(pepTotal);
		
		JLabel lblCheezyPizza = new JLabel("Cheezy Pizza (9\")");
		lblCheezyPizza.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheezyPizza.setForeground(new Color(43, 2, 0));
		lblCheezyPizza.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblCheezyPizza.setBounds(221, 180, 166, 28);
		contentPane.add(lblCheezyPizza);
		
		JLabel lblPhp_3 = new JLabel("PHP 200");
		lblPhp_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_3.setForeground(new Color(43, 2, 0));
		lblPhp_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_3.setBounds(436, 180, 75, 28);
		contentPane.add(lblPhp_3);
		
		lblPizza3Qty = new JLabel("-");
		lblPizza3Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPizza3Qty.setForeground(new Color(43, 2, 0));
		lblPizza3Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPizza3Qty.setBounds(597, 180, 75, 28);
		contentPane.add(lblPizza3Qty);
		
		chzTotal = new JLabel("-");
		chzTotal.setHorizontalAlignment(SwingConstants.LEFT);
		chzTotal.setForeground(new Color(43, 2, 0));
		chzTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		chzTotal.setBounds(784, 180, 75, 28);
		contentPane.add(chzTotal);
		
		JLabel lblBurger = new JLabel("Burger");
		lblBurger.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurger.setForeground(new Color(43, 2, 0));
		lblBurger.setFont(new Font("Barlow Condensed Medium", Font.ITALIC, 17));
		lblBurger.setBounds(99, 219, 75, 28);
		contentPane.add(lblBurger);
		
		JLabel lblCheesyBacon = new JLabel("Cheesy Bacon");
		lblCheesyBacon.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheesyBacon.setForeground(new Color(43, 2, 0));
		lblCheesyBacon.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblCheesyBacon.setBounds(221, 219, 166, 28);
		contentPane.add(lblCheesyBacon);
		
		JLabel lblMonsterBeef = new JLabel("Monster Beef");
		lblMonsterBeef.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonsterBeef.setForeground(new Color(43, 2, 0));
		lblMonsterBeef.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblMonsterBeef.setBounds(221, 243, 166, 28);
		contentPane.add(lblMonsterBeef);
		
		JLabel lblUltimate = new JLabel("Ultimate");
		lblUltimate.setHorizontalAlignment(SwingConstants.LEFT);
		lblUltimate.setForeground(new Color(43, 2, 0));
		lblUltimate.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblUltimate.setBounds(221, 266, 166, 28);
		contentPane.add(lblUltimate);
		
		JLabel lblPhp_7 = new JLabel("PHP 150");
		lblPhp_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_7.setForeground(new Color(43, 2, 0));
		lblPhp_7.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_7.setBounds(436, 219, 75, 28);
		contentPane.add(lblPhp_7);
		
		JLabel lblPhp_2_1 = new JLabel("PHP 150");
		lblPhp_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_1.setForeground(new Color(43, 2, 0));
		lblPhp_2_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_2_1.setBounds(436, 243, 75, 28);
		contentPane.add(lblPhp_2_1);
		
		JLabel lblPhp_3_1 = new JLabel("PHP 150");
		lblPhp_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_3_1.setForeground(new Color(43, 2, 0));
		lblPhp_3_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_3_1.setBounds(436, 266, 75, 28);
		contentPane.add(lblPhp_3_1);
		
		lblBurger1Qty = new JLabel("-");
		lblBurger1Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurger1Qty.setForeground(new Color(43, 2, 0));
		lblBurger1Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblBurger1Qty.setBounds(597, 219, 75, 28);
		contentPane.add(lblBurger1Qty);
		
		lblBurger2Qty = new JLabel("-");
		lblBurger2Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurger2Qty.setForeground(new Color(43, 2, 0));
		lblBurger2Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblBurger2Qty.setBounds(597, 243, 75, 28);
		contentPane.add(lblBurger2Qty);
		
		lblBurger3Qty = new JLabel("-");
		lblBurger3Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurger3Qty.setForeground(new Color(43, 2, 0));
		lblBurger3Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblBurger3Qty.setBounds(597, 266, 75, 28);
		contentPane.add(lblBurger3Qty);
		
		bcnTotal = new JLabel("-");
		bcnTotal.setHorizontalAlignment(SwingConstants.LEFT);
		bcnTotal.setForeground(new Color(43, 2, 0));
		bcnTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		bcnTotal.setBounds(784, 219, 75, 28);
		contentPane.add(bcnTotal);
		
		beefTotal = new JLabel("-");
		beefTotal.setHorizontalAlignment(SwingConstants.LEFT);
		beefTotal.setForeground(new Color(43, 2, 0));
		beefTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		beefTotal.setBounds(784, 243, 75, 28);
		contentPane.add(beefTotal);
		
		ultTotal = new JLabel("-");
		ultTotal.setHorizontalAlignment(SwingConstants.LEFT);
		ultTotal.setForeground(new Color(43, 2, 0));
		ultTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		ultTotal.setBounds(784, 266, 75, 28);
		contentPane.add(ultTotal);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasta.setForeground(new Color(43, 2, 0));
		lblPasta.setFont(new Font("Barlow Condensed Medium", Font.ITALIC, 17));
		lblPasta.setBounds(99, 304, 75, 28);
		contentPane.add(lblPasta);
		
		JLabel lblCarbonara = new JLabel("Carbonara");
		lblCarbonara.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarbonara.setForeground(new Color(43, 2, 0));
		lblCarbonara.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblCarbonara.setBounds(221, 304, 166, 28);
		contentPane.add(lblCarbonara);
		
		JLabel lblSpaghetti = new JLabel("Spaghetti");
		lblSpaghetti.setHorizontalAlignment(SwingConstants.LEFT);
		lblSpaghetti.setForeground(new Color(43, 2, 0));
		lblSpaghetti.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblSpaghetti.setBounds(221, 328, 166, 28);
		contentPane.add(lblSpaghetti);
		
		JLabel lblMacaroni = new JLabel("Macaroni");
		lblMacaroni.setHorizontalAlignment(SwingConstants.LEFT);
		lblMacaroni.setForeground(new Color(43, 2, 0));
		lblMacaroni.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblMacaroni.setBounds(221, 351, 166, 28);
		contentPane.add(lblMacaroni);
		
		JLabel lblPhp_5 = new JLabel("PHP 100");
		lblPhp_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_5.setForeground(new Color(43, 2, 0));
		lblPhp_5.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_5.setBounds(436, 304, 75, 28);
		contentPane.add(lblPhp_5);
		
		JLabel lblPhp_2_2 = new JLabel("PHP 100");
		lblPhp_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_2.setForeground(new Color(43, 2, 0));
		lblPhp_2_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_2_2.setBounds(436, 328, 75, 28);
		contentPane.add(lblPhp_2_2);
		
		JLabel lblPhp_3_2 = new JLabel("PHP 100");
		lblPhp_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_3_2.setForeground(new Color(43, 2, 0));
		lblPhp_3_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_3_2.setBounds(436, 351, 75, 28);
		contentPane.add(lblPhp_3_2);
		
		lblPasta1Qty = new JLabel("-");
		lblPasta1Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasta1Qty.setForeground(new Color(43, 2, 0));
		lblPasta1Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPasta1Qty.setBounds(597, 304, 75, 28);
		contentPane.add(lblPasta1Qty);
		
		lblPasta2Qty = new JLabel("-");
		lblPasta2Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasta2Qty.setForeground(new Color(43, 2, 0));
		lblPasta2Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPasta2Qty.setBounds(597, 328, 75, 28);
		contentPane.add(lblPasta2Qty);
		
		lblPasta3Qty = new JLabel("-");
		lblPasta3Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblPasta3Qty.setForeground(new Color(43, 2, 0));
		lblPasta3Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPasta3Qty.setBounds(597, 351, 75, 28);
		contentPane.add(lblPasta3Qty);
		
		carboTotal = new JLabel("-");
		carboTotal.setHorizontalAlignment(SwingConstants.LEFT);
		carboTotal.setForeground(new Color(43, 2, 0));
		carboTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		carboTotal.setBounds(784, 304, 75, 28);
		contentPane.add(carboTotal);
		
		spagTotal = new JLabel("-");
		spagTotal.setHorizontalAlignment(SwingConstants.LEFT);
		spagTotal.setForeground(new Color(43, 2, 0));
		spagTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		spagTotal.setBounds(784, 328, 75, 28);
		contentPane.add(spagTotal);
		
		macTotal = new JLabel("-");
		macTotal.setHorizontalAlignment(SwingConstants.LEFT);
		macTotal.setForeground(new Color(43, 2, 0));
		macTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		macTotal.setBounds(784, 351, 75, 28);
		contentPane.add(macTotal);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrink.setForeground(new Color(43, 2, 0));
		lblDrink.setFont(new Font("Barlow Condensed Medium", Font.ITALIC, 17));
		lblDrink.setBounds(99, 387, 75, 28);
		contentPane.add(lblDrink);
		
		JLabel lblIcedCoffee = new JLabel("Iced Coffee");
		lblIcedCoffee.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcedCoffee.setForeground(new Color(43, 2, 0));
		lblIcedCoffee.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblIcedCoffee.setBounds(221, 387, 166, 28);
		contentPane.add(lblIcedCoffee);
		
		JLabel lblIcedTea = new JLabel("Iced Tea");
		lblIcedTea.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcedTea.setForeground(new Color(43, 2, 0));
		lblIcedTea.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblIcedTea.setBounds(221, 411, 166, 28);
		contentPane.add(lblIcedTea);
		
		JLabel lblLemonade = new JLabel("Lemonade");
		lblLemonade.setHorizontalAlignment(SwingConstants.LEFT);
		lblLemonade.setForeground(new Color(43, 2, 0));
		lblLemonade.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblLemonade.setBounds(221, 434, 166, 28);
		contentPane.add(lblLemonade);
		
		JLabel lblPhp_4 = new JLabel("PHP 80");
		lblPhp_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_4.setForeground(new Color(43, 2, 0));
		lblPhp_4.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_4.setBounds(436, 387, 75, 28);
		contentPane.add(lblPhp_4);
		
		JLabel lblPhp_2_3 = new JLabel("PHP 80");
		lblPhp_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_2_3.setForeground(new Color(43, 2, 0));
		lblPhp_2_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_2_3.setBounds(436, 411, 75, 28);
		contentPane.add(lblPhp_2_3);
		
		JLabel lblPhp_3_3 = new JLabel("PHP 80");
		lblPhp_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_3_3.setForeground(new Color(43, 2, 0));
		lblPhp_3_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_3_3.setBounds(436, 434, 75, 28);
		contentPane.add(lblPhp_3_3);
		
		lblDrink1Qty = new JLabel("-");
		lblDrink1Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrink1Qty.setForeground(new Color(43, 2, 0));
		lblDrink1Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblDrink1Qty.setBounds(597, 387, 75, 28);
		contentPane.add(lblDrink1Qty);
		
		lblDrink2Qty = new JLabel("-");
		lblDrink2Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrink2Qty.setForeground(new Color(43, 2, 0));
		lblDrink2Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblDrink2Qty.setBounds(597, 411, 75, 28);
		contentPane.add(lblDrink2Qty);
		
		lblDrink3Qty = new JLabel("-");
		lblDrink3Qty.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrink3Qty.setForeground(new Color(43, 2, 0));
		lblDrink3Qty.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblDrink3Qty.setBounds(597, 434, 75, 28);
		contentPane.add(lblDrink3Qty);
		
		coffeeTotal = new JLabel("-");
		coffeeTotal.setHorizontalAlignment(SwingConstants.LEFT);
		coffeeTotal.setForeground(new Color(43, 2, 0));
		coffeeTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		coffeeTotal.setBounds(784, 387, 75, 28);
		contentPane.add(coffeeTotal);
		
		teaTotal = new JLabel("-");
		teaTotal.setHorizontalAlignment(SwingConstants.LEFT);
		teaTotal.setForeground(new Color(43, 2, 0));
		teaTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		teaTotal.setBounds(784, 411, 75, 28);
		contentPane.add(teaTotal);
		
		lemonTotal = new JLabel("-");
		lemonTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lemonTotal.setForeground(new Color(43, 2, 0));
		lemonTotal.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lemonTotal.setBounds(784, 434, 75, 28);
		contentPane.add(lemonTotal);
		
		JLabel lblPhp_1 = new JLabel("PHP");
		lblPhp_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1.setForeground(new Color(43, 2, 0));
		lblPhp_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_1.setBounds(749, 133, 75, 28);
		contentPane.add(lblPhp_1);
		
		JLabel lblPhp_6 = new JLabel("PHP");
		lblPhp_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_6.setForeground(new Color(43, 2, 0));
		lblPhp_6.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_6.setBounds(749, 157, 75, 28);
		contentPane.add(lblPhp_6);
		
		JLabel lblPhp_8 = new JLabel("PHP");
		lblPhp_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_8.setForeground(new Color(43, 2, 0));
		lblPhp_8.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_8.setBounds(749, 180, 75, 28);
		contentPane.add(lblPhp_8);
		
		JLabel lblPhp_8_1 = new JLabel("PHP");
		lblPhp_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_8_1.setForeground(new Color(43, 2, 0));
		lblPhp_8_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_8_1.setBounds(749, 266, 75, 28);
		contentPane.add(lblPhp_8_1);
		
		JLabel lblPhp_1_2 = new JLabel("PHP");
		lblPhp_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_2.setForeground(new Color(43, 2, 0));
		lblPhp_1_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_1_2.setBounds(749, 219, 75, 28);
		contentPane.add(lblPhp_1_2);
		
		JLabel lblPhp_6_1 = new JLabel("PHP");
		lblPhp_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_6_1.setForeground(new Color(43, 2, 0));
		lblPhp_6_1.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_6_1.setBounds(749, 243, 75, 28);
		contentPane.add(lblPhp_6_1);
		
		JLabel lblPhp_8_2 = new JLabel("PHP");
		lblPhp_8_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_8_2.setForeground(new Color(43, 2, 0));
		lblPhp_8_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_8_2.setBounds(749, 352, 75, 28);
		contentPane.add(lblPhp_8_2);
		
		JLabel lblPhp_1_3 = new JLabel("PHP");
		lblPhp_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_3.setForeground(new Color(43, 2, 0));
		lblPhp_1_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_1_3.setBounds(749, 305, 75, 28);
		contentPane.add(lblPhp_1_3);
		
		JLabel lblPhp_6_2 = new JLabel("PHP");
		lblPhp_6_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_6_2.setForeground(new Color(43, 2, 0));
		lblPhp_6_2.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_6_2.setBounds(749, 329, 75, 28);
		contentPane.add(lblPhp_6_2);
		
		JLabel lblPhp_8_3 = new JLabel("PHP");
		lblPhp_8_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_8_3.setForeground(new Color(43, 2, 0));
		lblPhp_8_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_8_3.setBounds(749, 437, 75, 28);
		contentPane.add(lblPhp_8_3);
		
		JLabel lblPhp_1_4 = new JLabel("PHP");
		lblPhp_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_4.setForeground(new Color(43, 2, 0));
		lblPhp_1_4.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_1_4.setBounds(749, 390, 75, 28);
		contentPane.add(lblPhp_1_4);
		
		JLabel lblPhp_6_3 = new JLabel("PHP");
		lblPhp_6_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_6_3.setForeground(new Color(43, 2, 0));
		lblPhp_6_3.setFont(new Font("Barlow Condensed", Font.PLAIN, 16));
		lblPhp_6_3.setBounds(749, 414, 75, 28);
		contentPane.add(lblPhp_6_3);
		
		JLabel lblPhp_1_1_1 = new JLabel("PHP");
		lblPhp_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhp_1_1_1.setForeground(new Color(43, 2, 0));
		lblPhp_1_1_1.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lblPhp_1_1_1.setBounds(749, 500, 75, 28);
		contentPane.add(lblPhp_1_1_1);
		
		
	}
}
