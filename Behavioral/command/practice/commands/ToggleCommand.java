package Behavioral.command.practice.commands;

import Behavioral.command.practice.model.Light;

//concrete command
public class ToggleCommand implements Command {

	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.toggle();
	}
}