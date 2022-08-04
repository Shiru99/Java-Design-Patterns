package Behavioral.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEverydayDemo {
	public static void main(String[] args) {
		// List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();

		names.add("Bryan");
		names.add("Aaron");
		names.add("Jason");

		// ForEach uses Iterator
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();

		Iterator<String> namesItr = names.iterator();

		while (namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}

		System.out.println("Names size: " + names.size());
	}
}
