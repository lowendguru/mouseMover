package mouseMover;

import java.awt.AWTException;
import java.awt.Robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Robot robot = new Robot();

			int coordx = 100;

			while (true) {
				robot.mouseMove(coordx, 100);

				if (coordx == 200)
					coordx -= 100;
				else
					coordx += 100;

				Thread.sleep(5000);
				
			}

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}