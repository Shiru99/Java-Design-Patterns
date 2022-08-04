package Structural.flyweight.practice;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import Structural.flyweight.practice.model.Catalog;
import Structural.flyweight.practice.model.Item;
import Structural.flyweight.practice.model.Order;

public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	String report() {
		return "\nTotal Item objects created: "+ catalog.totalItemsMade();
	}
}