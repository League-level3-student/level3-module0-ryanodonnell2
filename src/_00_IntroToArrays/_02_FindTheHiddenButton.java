package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JTextField textBox;
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	int randomButton;
	//1. create an array of JButtons. Don't initialize it yet.
	
	//2 create an integer variable called hiddenButton
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//3.  Ask the user to enter a positive number and convert it to an int
		String message = JOptionPane.showInputDialog("Pick A Number Between 1 and 1000");
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		int x;
		x = Integer.parseInt(message);
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		for(int i = 0; i<x; i++) {
			JButton a = new JButton();
			a.addActionListener(this);
			panel.add(a);
			buttons.add(a);
		}
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the hidden button");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random r = new Random();
		randomButton = r.nextInt(x-1);
		//14. Set the text of the JButton located at hiddenButton to read "ME"
		buttons.get(randomButton).setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons.get(randomButton).setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
			if(buttonClicked == buttons.get(randomButton)) {
				JOptionPane.showMessageDialog(null, "You Win!");
			}
		//18. else tell them to try again
			else {
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
	}
}
