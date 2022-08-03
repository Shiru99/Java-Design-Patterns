package Creational.factory.practice;

import Creational.factory.practice.model.Blog;
import Creational.factory.practice.model.Shop;
import Creational.factory.practice.model.Website;
import Creational.factory.practice.model.WebsiteType;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
		
			case SHOP : {
				return new Shop();
			}
			
			default : {
				return null;
			}
 		}
	}
	
}
