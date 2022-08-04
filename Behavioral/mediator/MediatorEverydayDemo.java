package Behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {

	public static void main(String args[]) {
		System.out.println("About to schedule task.");
		new MediatorEverydayDemo(3);
		System.out.println("Task scheduled.");
	}
	
	private Timer timer;

	public MediatorEverydayDemo(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
	}

	class RemindTask extends TimerTask {
		public void run() {
			System.out.println("1 sec remaining");
		}
	}
	
	class RemindTaskWithoutBeep extends TimerTask {
		public void run() {
			System.out.println("Time's up!");
			timer.cancel();
		}
	}


}
