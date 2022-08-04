package Structural.decorator.practice.decorators;

import Structural.decorator.practice.model.Sandwich;

public abstract class SandwichDecorator implements Sandwich {

	protected Sandwich customSandwich;

	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	abstract public String make() ;
	
}
