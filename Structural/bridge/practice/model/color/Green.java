package Structural.bridge.practice.model.color;

public class Green implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying green color");
	}

	@Override
	public String toString() {
		return "Green Color";
	}

}
