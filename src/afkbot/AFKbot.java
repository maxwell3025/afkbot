package afkbot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class AFKbot {
	private static boolean typed = true;
	private static int[] message = { KeyEvent.VK_S, KeyEvent.VK_E, KeyEvent.VK_T, KeyEvent.VK_B, KeyEvent.VK_L,
			KeyEvent.VK_O, KeyEvent.VK_C, KeyEvent.VK_K, KeyEvent.VK_SPACE };
	private static int[] message2 = { KeyEvent.VK_SPACE, KeyEvent.VK_S, KeyEvent.VK_T, KeyEvent.VK_O, KeyEvent.VK_N,
			KeyEvent.VK_E };

	public static void main(String[] args) {
		Color c = new Color(0, 0, 0);
		try {

			Robot robot = new Robot();
			robot.delay(5000);
			for (int i = 0; i < 256; i++) {
				double angle = i*2.0*Math.PI/64;
				set((int)(Math.sin(angle)*8),(int)(Math.cos(angle)*8)+128, (-i/16)-90, robot);
				robot.delay(200);
			}
			System.exit(0);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void set(int x, int y, int z, Robot robot) {
		char[] xstr = String.valueOf(x).toCharArray();
		char[] ystr = String.valueOf(y).toCharArray();
		char[] zstr = String.valueOf(z).toCharArray();
		click(KeyEvent.VK_SLASH, robot);
		robot.delay(100);
		for (int ch = 0; ch < message.length; ch++) {
			click(message[ch], robot);
		}
		for (int ch = 0; ch < xstr.length; ch++) {
			click((int) xstr[ch], robot);
		}
		click(KeyEvent.VK_SPACE, robot);
		for (int ch = 0; ch < ystr.length; ch++) {
			click((int) ystr[ch], robot);

		}
		click(KeyEvent.VK_SPACE, robot);
		for (int ch = 0; ch < zstr.length; ch++) {
			click((int) zstr[ch], robot);

		}
		for (int ch = 0; ch < message2.length; ch++) {
			click(message2[ch], robot);
		}
		click(KeyEvent.VK_ENTER, robot);
	}

	public static void click(int key, Robot r) {
		r.keyPress(key);
		r.keyRelease(key);
	}
}
