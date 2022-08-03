package Creational.prototype.practice.model;

public abstract class Item implements Cloneable {
	protected String title;
	protected double price;
	protected String url;
	
	@Override
    public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
