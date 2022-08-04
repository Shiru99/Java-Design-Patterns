package Structural.bridge.practice.model.color;

public class Red implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}

	@Override
	public String toString() {
		return "Red Color";
	}
}
