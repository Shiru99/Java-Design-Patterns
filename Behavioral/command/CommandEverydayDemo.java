package Behavioral.command;

public class CommandEverydayDemo {

	public static void main(String[] args) {
		Task task1 = new Task(10, 12); 
		Task task2 = new Task(11, 13);
	
		// encapsulates request
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);

		// invoker
		thread1.start(); 
		thread2.start();
	}
}

class Task implements Runnable {
	
	int num1;
	int num2;
	
	Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// receiver
	@Override
	public void run() { //execute method
		System.out.println(num1 * num2); 
	}
}
