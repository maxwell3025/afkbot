package afkbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class cobblegen {

		public static void main(String[] args) throws AWTException {
			Robot r = new Robot();
			r.delay(5000);
			r.mousePress(InputEvent.BUTTON3_MASK);
		}	// TODO Auto-generated constructor stub
	

}
