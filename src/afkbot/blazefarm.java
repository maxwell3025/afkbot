package afkbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import com.sun.glass.events.KeyEvent;

public class blazefarm {

	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i < 9000; i++) {
			r.delay(1);
			r.mousePress(InputEvent.BUTTON3_MASK);
			r.delay(1);
			r.mouseRelease(InputEvent.BUTTON3_MASK);
		}

	}

}
