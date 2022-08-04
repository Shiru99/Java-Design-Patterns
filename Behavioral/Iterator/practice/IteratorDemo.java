package Behavioral.Iterator.practice;

import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {

		BikeRepository bikes = new BikeRepository();
		
		bikes.addBike("Cervelo");
		bikes.addBike("Scott");
		bikes.addBike("Fuji");
		
		Iterator<String> bikeReverseIterator = bikes.iterator();
		
		while(bikeReverseIterator.hasNext()) {
			System.out.println(bikeReverseIterator.next());
		}
		System.out.println();

		for (String bike : bikes) {
			System.out.println(bike);
		}
	}
}
