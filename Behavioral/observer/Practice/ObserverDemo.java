package Behavioral.observer.Practice;

import Behavioral.observer.Practice.model.PhoneClient;
import Behavioral.observer.Practice.model.Subject;
import Behavioral.observer.Practice.model.TabletClient;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here is a new message!");
		tabletClient.addMessage("Another new message!");
	}
	
}
