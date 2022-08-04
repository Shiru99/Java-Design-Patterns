package Structural.proxy;

public class TwitterDemo {
	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

		System.out.println(service.getTimeline("userName"));

		service.postToTimeline("userName", "Some message that shouldn't go through.");
	}
}
