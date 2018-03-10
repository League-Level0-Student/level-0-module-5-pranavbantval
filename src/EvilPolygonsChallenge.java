import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		int rownum = 0; 
		//1. Create a robot
Robot rob = new Robot();
		//2. Set the speed to 100
rob.setSpeed(100);
rob.penDown();
rob.setX(100);
rob.setY(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Green", "Red", "Random"}, 0);
		System.out.println(colorChoice);
		//3. Set the pen color of the robot according to the value of the colorChoice variable
	if(colorChoice==2) {
		rob.setPenColor(255,0,0);
		}
	else if(colorChoice==1) {
		rob.setPenColor(0,255,0);
	}
	else if(colorChoice==0) {
		rob.setPenColor(0,0,255);
	}
	else if(colorChoice==3) {
		rob.setRandomPenColor();
	}
		//4. Ask the use how many polygons they want to be drawn.
	String num = 	JOptionPane.showInputDialog("How many polygons do you want drawn?");
	int x = Integer.parseInt(num);
	if(x>63) {
		JOptionPane.showConfirmDialog(null, "Warning! All polygons will not be visible.");
	}
	
		//5. Use the robot to draw the number of polygons the user requested.
	for (int j = 0; j < x; j++) {
		if(j%7==rownum&&j>0) {	
			rob.setX(100);
		 int a = rob.getY();
		rob.setY(a+100);
		}
	
	for(int i = 0; i<3; i++) {
	rob.move(30);
		rob.turn(120);
	}
		//6. Make it so your shapes do not overlap
rob.penUp();
rob.setAngle(90);
rob.move(100);
rob.setAngle(0);
rob.penDown();
}
		//7. Challenge: add more colors to the Option Dialog.
	}
}

