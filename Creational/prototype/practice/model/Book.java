package Creational.prototype.practice.model;

public class Book extends Item {

	private int numberOfPages;

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [numberOfPages=" + numberOfPages + ", title=" + title + ", price=" + price + ", url=" + url + "]";
	}
}
