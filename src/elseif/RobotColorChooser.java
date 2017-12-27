
//    Copyright (c) The League of Amazing Programmers 2013-2017    Level 0
package elseif;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot d = new Robot();
		// 3. ask the user what color they would like the robot to draw
		for (int j = 0; j < 3; j++) {

			String clr = JOptionPane.showInputDialog("What color?");
			// 4. use an if/else statement to set the pen color that the user requested
			if (clr.equalsIgnoreCase("blue")) {
				d.setPenColor(0, 0, 225);
			} else if (clr.equalsIgnoreCase("red")) {
				d.setPenColor(225, 0, 0);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else {
				d.setRandomPenColor();
			}
			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			d.setPenWidth(10);
			// 1. make the robot draw a shape (this will take more than one line of code)
			d.setSpeed(100);
			d.penDown();
			for (int i = 0; i < 4; i++) {
				d.move(100);
				d.turn(90);
			}
		}
	}
}