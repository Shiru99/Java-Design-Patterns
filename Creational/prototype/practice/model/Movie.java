package Creational.prototype.practice.model;

public class Movie extends Item {

	private String runtime;

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "Movie [runtime=" + runtime + ", title=" + title + ", price=" + price + ", url=" + url + "]";
	}
	
}
