package mouseMover;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class MouseMover implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			Robot robot = new Robot();

			while (true) {

				// get current point
				Point point = MouseInfo.getPointerInfo().getLocation();

				// wait for time
				Thread.sleep(540000); // 9 minutes 540000 ms

				// if pointer has not moved: move slightly and put back in position
				Point pointCurrent = MouseInfo.getPointerInfo().getLocation();

				if (pointCurrent.equals(point)) {
					robot.mouseMove(pointCurrent.x - 1, pointCurrent.y);
					robot.mouseMove(pointCurrent.x + 1, pointCurrent.y);
					robot.mouseMove(pointCurrent.x, pointCurrent.y);
				}

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
