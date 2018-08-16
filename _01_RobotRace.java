package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
int y = 550;
		// 2. create an array of 5 robots.
		Robot[] r = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot(200 * i, y);
			r[i].setSpeed(100);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
Random number = new Random();
int num = number.nextInt(50);
boolean raceOver = false;
while(raceOver == false) {
for (int q = 0; q < r.length; q++) {
r[q].move(number.nextInt(50));
if (r[q].getY()<0) {
	raceOver = true;
	JOptionPane.showMessageDialog(null, "Robot #" + (q+1) + " won the race");
}
}
}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
