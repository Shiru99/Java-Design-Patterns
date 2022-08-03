package Creational.prototype.practice;

import Creational.prototype.practice.model.Movie;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();

		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		movie.setRuntime("2 hours");
		movie.setPrice(10.0);
		System.out.println(movie);

		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		System.out.println(anotherMovie);
	}

}
