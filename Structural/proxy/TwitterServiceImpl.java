package Structural.proxy;

public class TwitterServiceImpl implements TwitterService {

	@Override
	public String getTimeline(String screenName) {
		return "My neato timeline";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		System.out.println("Posting to timeline: " + message);
	}

}
