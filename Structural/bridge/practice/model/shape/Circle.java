package Structural.bridge.practice.model.shape;

import Structural.bridge.practice.model.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor(Color color) {
		this.color = color;
		color.applyColor();
	}

	@Override
	public String toString() {
		return "Circle : " + color.toString();
	}

}
