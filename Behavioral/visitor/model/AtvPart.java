package Behavioral.visitor.model;

import Behavioral.visitor.AtvPartVisitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
