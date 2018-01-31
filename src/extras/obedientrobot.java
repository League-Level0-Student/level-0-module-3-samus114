package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {

		String sup = JOptionPane.showInputDialog("what shape do you want");
		String sos = JOptionPane.showInputDialog("what color do you want your shape to be?");
		if (sos.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		}else if (sos.equalsIgnoreCase("green")) {
			rob.setPenColor(0,255,0);
		}else if (sos.equalsIgnoreCase("blue")) {
			rob.setPenColor(0,0,255);
		}
		if (sup.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (sup.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if (sup.equalsIgnoreCase("circle")) {
			drawCircle();
		}else {
			JOptionPane.showMessageDialog(null, "please say square circle or triangle");
		}
	}

	public static void drawSquare() {
		rob.penDown();
		rob.setSpeed(1000);
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		rob.penDown();
		rob.setSpeed(1000);
		rob.turn(45);
		for (int i = 0; i < 2; i++) {
			rob.move(100);
			rob.turn(120);
		}
		rob.move(100);
	}

	public static void drawCircle() {
		rob.penDown();
		rob.setSpeed(100);
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}