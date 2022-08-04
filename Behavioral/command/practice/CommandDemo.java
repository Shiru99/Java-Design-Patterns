package Behavioral.command.practice;

import Behavioral.command.practice.commands.Command;
import Behavioral.command.practice.commands.ToggleCommand;
import Behavioral.command.practice.model.Light;
import Behavioral.command.practice.model.Switch;

//client
public class CommandDemo {
	public static void main(String args[]) {
		Light bedroomLight = new Light();
		Switch lightSwitch = new Switch(); 
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
	}
}
