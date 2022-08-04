package Behavioral.observer.Practice.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Client> Clients = new ArrayList<>();
	
	protected abstract void setState(String state);
	protected abstract String getState();
	
	public void attach(Client Client) {
		Clients.add(Client);
	}

	public void detach(Client Client) {
		Clients.remove(Client);
	}
	
	public void notifyObservers() {
		for (Client Client : Clients) {
			Client.update();
		}
	}
}
