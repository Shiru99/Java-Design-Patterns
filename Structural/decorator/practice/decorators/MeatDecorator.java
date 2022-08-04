package Structural.decorator.practice.decorators;

import Structural.decorator.practice.model.Sandwich;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();
	}

	private String addMeat() {
		return " + turkey";
	}
}
