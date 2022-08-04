package Behavioral.command.practice.model;

//receiver
public class Light {

	private boolean isOn = false;
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}
		else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println("Light switched on.");
	}
	//\xF0\x9F\x92\xA1
	
	public void off() {
		System.out.println("Light switched off.");
	}
}
