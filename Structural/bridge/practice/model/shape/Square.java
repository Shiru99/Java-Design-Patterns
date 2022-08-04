package Structural.bridge.practice.model.shape;

import Structural.bridge.practice.model.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor(Color color) {
		this.color = color;
		color.applyColor();
	}

	@Override
	public String toString() {
		return "Square : " + color.toString();
	}

}
