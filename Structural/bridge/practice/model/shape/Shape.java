package Structural.bridge.practice.model.shape;

import Structural.bridge.practice.model.color.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor(Color color);
}
