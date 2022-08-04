package Behavioral.observer.Practice;

import java.util.ArrayDeque;
import java.util.Deque;

import Behavioral.observer.Practice.model.Subject;

public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<>();
	
	@Override
	protected
	void setState(String message) {
		messageHistory.add(message);
		this.notifyObservers();
	}

	@Override
	protected
	String getState() {
		return messageHistory.getLast();
	}
}
