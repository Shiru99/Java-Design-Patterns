package Behavioral.visitor;

import Behavioral.visitor.model.Fender;
import Behavioral.visitor.model.Oil;
import Behavioral.visitor.model.PartsOrder;
import Behavioral.visitor.model.Wheel;

public class VisitorDemo {
	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		order.accept(new AtvPartsShippingVisitor());
	}
}
