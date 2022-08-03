package Creational.factory.practice.model;

import Creational.factory.practice.model.Pages.AboutPage;
import Creational.factory.practice.model.Pages.CommentPage;
import Creational.factory.practice.model.Pages.ContactPage;
import Creational.factory.practice.model.Pages.Page;
import Creational.factory.practice.model.Pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Page page : pages) {
			sb.append(page.toString());
		}
		return "Blog Website : [pages=" + sb.toString() + "]";
	}

}
