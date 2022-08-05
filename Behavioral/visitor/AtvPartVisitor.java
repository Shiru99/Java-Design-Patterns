package Behavioral.visitor;

import Behavioral.visitor.model.Fender;
import Behavioral.visitor.model.Oil;
import Behavioral.visitor.model.PartsOrder;
import Behavioral.visitor.model.Wheel;

public interface AtvPartVisitor {
	void visit(Wheel wheel);
	void visit(Fender fender);
	void visit(Oil oil);
	void visit(PartsOrder partsOrder);
}
