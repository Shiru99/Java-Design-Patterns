package Structural.bridge.practice.model.color;

public class Blue implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

	@Override
	public String toString() {
		return "Blue Color";
	}

}
