package Creational.prototype.practice;

import java.util.HashMap;
import java.util.Map;

import Creational.prototype.practice.model.Book;
import Creational.prototype.practice.model.Item;
import Creational.prototype.practice.model.Movie;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem (String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Default");
		movie.setPrice(0.0);
		movie.setRuntime("Default");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(0);
		book.setPrice(0.0);
		book.setTitle("Default");
		items.put("Book", book);
	}
}
