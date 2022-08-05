package Behavioral.visitor.model;

import Behavioral.visitor.AtvPartVisitor;

public class Fender implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
