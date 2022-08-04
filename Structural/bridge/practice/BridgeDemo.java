package Structural.bridge.practice;

import Structural.bridge.practice.model.color.Blue;
import Structural.bridge.practice.model.color.Color;
import Structural.bridge.practice.model.color.Green;
import Structural.bridge.practice.model.color.Red;
import Structural.bridge.practice.model.shape.Circle;
import Structural.bridge.practice.model.shape.Shape;

public class BridgeDemo {
	public static void main(String[] args) {
		Color blue = new Blue();
		Color red = new Red();
		Color green = new Green();

		Shape greenCircle = new Circle(green);
		Shape redCircle = new Circle(red);

		System.out.println(greenCircle);
		System.out.println(redCircle);
		
		redCircle.applyColor(blue);
		System.out.println(redCircle);
	}

}
