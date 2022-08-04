package Behavioral.Iterator.practice;

import java.util.Iterator;


public class BikeRepository implements Iterable<String> {
	
	private String [] bikes;
	private int index;
	
	public BikeRepository() {
		bikes = new String[10];
		index = 0;
	}
	
	public void addBike(String bike) {
		if(index == bikes.length) {
			String [] largerBikes = new String[bikes.length + 5];
			System.arraycopy( bikes, 0, largerBikes, 0, bikes.length );
			bikes = largerBikes;
			largerBikes = null;
		}
		
		bikes[index] = bike;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {

			private int currentIndex = index-1;
			
			@Override
			public boolean hasNext() {
				return currentIndex >= 0 && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex--];
			}

			@Override
			public void remove() {
				bikes[currentIndex] = null;
			}
			
		};
		
		return it;
	}
}