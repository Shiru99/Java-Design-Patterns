package Behavioral.command.practice.model;

import Behavioral.command.practice.commands.Command;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
