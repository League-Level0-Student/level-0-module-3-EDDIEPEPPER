
package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happyOrNot = JOptionPane.showInputDialog("are you happy");
		if (happyOrNot.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		} else if (happyOrNot.equalsIgnoreCase("no")) {
			String doSomething = JOptionPane.showInputDialog("Do you want to be happy?");

			if (doSomething.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Do something");
			}

			else if (doSomething.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
		}
	}
}
