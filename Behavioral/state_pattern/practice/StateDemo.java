package Behavioral.state_pattern.practice;

import Behavioral.state_pattern.practice.model.Fan;

public class StateDemo {
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		System.out.println(fan);
		
		fan.pullChain();
		System.out.println(fan);
		
		fan.pullChain();
		System.out.println(fan);
		
		fan.pullChain();
		System.out.println(fan);
		
		fan.pullChain();
		System.out.println(fan);
	}
}
