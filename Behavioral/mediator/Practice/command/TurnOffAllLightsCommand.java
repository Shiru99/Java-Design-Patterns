package Behavioral.mediator.Practice.command;

import Behavioral.mediator.Practice.Mediator;

//concrete command
public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		System.out.println("Turning off all lights...");
		med.turnOffAllLights();
	}
}