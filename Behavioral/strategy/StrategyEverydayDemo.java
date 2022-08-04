package Behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrategyEverydayDemo {
	public static void main(String args[]) {
		Person bryan = new Person("Bryan", 39);
		Person mark = new Person("Mark", 41);
		Person chris = new Person("Chris", 38);

		List<Person> people = new ArrayList<Person>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);

		System.out.println("Not sorted");
		printPeople(people);

		Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
		System.out.println("\nSorted by age");
		printPeople(people);

		Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		System.out.println("\nSorted by name");
		printPeople(people);
	}

	private static void printPeople(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
}

class Person {

	private int age;
	private String name;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}
