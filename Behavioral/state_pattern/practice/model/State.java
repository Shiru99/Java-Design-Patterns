package Behavioral.state_pattern.practice.model;

public abstract class State {
	
	public void handleRequest() {
		System.out.println("Shouldn't be able to get here.");
	}
}
