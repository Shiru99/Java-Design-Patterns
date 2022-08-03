package Creational.factory.practice.model;

import java.util.ArrayList;
import java.util.List;

import Creational.factory.practice.model.Pages.Page;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
	
}
