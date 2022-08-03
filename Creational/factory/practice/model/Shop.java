package Creational.factory.practice.model;

import Creational.factory.practice.model.Pages.CartPage;
import Creational.factory.practice.model.Pages.ItemPage;
import Creational.factory.practice.model.Pages.Page;
import Creational.factory.practice.model.Pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Page page : pages) {
			sb.append(page.toString());
		}
		return "Shop Website : [pages=" + sb.toString() + "]";
	}

}
