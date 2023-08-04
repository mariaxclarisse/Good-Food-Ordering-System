import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuChild extends Menu{
	
	// inheritance is implemented
	// all public methods and variables in parent class are inherited here.
	
	public void LogOut() {
		
		// polymorphism is used in Frames with Log out Button.
		// the logout method in parent class (menu class) is overridden
		
		frame = new JFrame();
		if (JOptionPane.showConfirmDialog(frame, "Do you want to log out? Changes will not be saved.", 
				"Menu", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			FrameHome home = new FrameHome();
			home.setVisible(true);
			
			frame.dispose();
			
		}
	}
}
