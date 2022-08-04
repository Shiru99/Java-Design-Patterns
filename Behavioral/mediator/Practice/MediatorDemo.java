package Behavioral.mediator.Practice;

import Behavioral.mediator.Practice.command.Command;
import Behavioral.mediator.Practice.command.TurnOffAllLightsCommand;
import Behavioral.mediator.Practice.model.Light;

public class MediatorDemo {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
	}

}
