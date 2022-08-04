package Structural.decorator.practice;

import Structural.decorator.practice.decorators.DressingDecorator;
import Structural.decorator.practice.decorators.MeatDecorator;
import Structural.decorator.practice.model.Sandwich;
import Structural.decorator.practice.model.SimpleSandwich;

public class DecoratorSandwichDemo {
	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}
