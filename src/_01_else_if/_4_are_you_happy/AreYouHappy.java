
package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happyOrNot = JOptionPane.showInputDialog("are you happy");
	if (happyOrNot.equalsIgnoreCase("yes")) { 
		String keep = JOptionPane.showMessageDialog(null, "Keep doing what you are doing" );
	}
	else if(happyOrNot.equalsIgnoreCase("no")) {
	String doSomething = JOptionPane.showInputDialog("Do you want to be happy?");	
	}
	else if(doSomething.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog("Do somthing");
		
	}
	else if(doSomething.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, keep);
	}
}
}
