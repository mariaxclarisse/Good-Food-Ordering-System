import javax.swing.JFrame;
import javax.swing.JOptionPane;

public abstract class Menu {
	
	//private variables for encapsulation in FrameMenu
	private double pizzaCost;
	private double burgerCost;
	private double pastaCost;
	private double drinkCost;
	private double allCost;
	
	private double pizzaPrice;
	private double burgerPrice;
	private double pastaPrice;
	private double drinkPrice;
	
	public double pizza1, pizza2, pizza3;
	public double burger1, burger2, burger3;
	public double pasta1, pasta2, pasta3;
	public double drink1, drink2, drink3;
	
	
	// setter and getter methods
	public void setPizzaPrice(double p) {
		pizzaPrice = p;
	}
	
	public double getPizzaPrice() {
		return pizzaPrice;
	}
	
	public void setBurgerPrice(double b) {
		burgerPrice = b;
	}
	
	public double getBurgerPrice() {
		return burgerPrice;
	}
	
	public void setPastaPrice(double p) {
		pastaPrice = p;
	}
	
	public double getPastaPrice() {
		return pastaPrice;
	}
	
	public void setDrinkPrice(double d) {
		drinkPrice = d;
	}
	
	public double getDrinkPrice() {
		return drinkPrice;
	}
	
	public void setTotal(double a, double b, double c, double d) {
		pizzaCost = pizza1 + pizza2 + pizza3;
		burgerCost = burger1 + burger2 + burger3;
		pastaCost = pasta1 + pasta2 + pasta3;
		drinkCost = drink1 + drink2 + drink3;
		
		a = pizzaCost;
		b = burgerCost;
		c = pastaCost;
		d = drinkCost;
		
		allCost = a + b + c + d;
	}
	
	public double getTotal() {
		return allCost;
	}
	
	public JFrame frame;
	
	
	public void LogOut() {
		System.out.println("LOG OUT...");
	}	
	
}
