package Creational.factory.practice;

import Creational.factory.practice.model.Website;
import Creational.factory.practice.model.WebsiteType;

public class FactoryDemo {
	public static void main(String[] args) {

		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site);
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site);
	}
}
