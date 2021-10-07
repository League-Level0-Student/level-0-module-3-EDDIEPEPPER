
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot mrBeast = new Robot();

		while (true) {
		String color = JOptionPane.showInputDialog("What color do you want to have Mrbeast draw with?");
		if(color.equalsIgnoreCase("green")) { 
			mrBeast.setPenColor(Color.green);
		}
		else if (color.equalsIgnoreCase("blue")) {
		mrBeast.setPenColor(Color.blue);
		}
		else if (color.equalsIgnoreCase("red")){
			mrBeast.setPenColor(Color.red);
		}
		else if (color.equalsIgnoreCase("pink")){
			mrBeast.setPenColor(Color.pink);
		}
		else if (color.equalsIgnoreCase("yellow")){
			mrBeast.setPenColor(Color.yellow);
		}
		else if (color.equalsIgnoreCase("orange")){
			mrBeast.setPenColor(Color.orange);
		}
		else if (color.equalsIgnoreCase("stop")) {
			System.exit(0);
		}
		else {
			mrBeast.setRandomPenColor();
		}
			
	
		 mrBeast.setPenWidth(10);
		mrBeast.penDown();
		 mrBeast.setSpeed(10);
		  mrBeast.move(100);
		  mrBeast.turn(90);
		  mrBeast.move(100);
		  mrBeast.turn(90);
		  mrBeast.move(100);
		  mrBeast.turn(90);
		  mrBeast.move(100);
		  mrBeast.turn(90);
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
