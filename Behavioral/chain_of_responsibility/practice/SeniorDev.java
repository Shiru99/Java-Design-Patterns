package Behavioral.chain_of_responsibility.practice;

import Behavioral.chain_of_responsibility.practice.model.Handler;
import Behavioral.chain_of_responsibility.practice.model.Request;
import Behavioral.chain_of_responsibility.practice.model.RequestType;

public class SeniorDev extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.NEW_BUG) {
			System.out.println("Senior Dev can approve the amount for new bugs");
		}
		else {
			System.out.print("Senior Dev -> ");
			successor.handleRequest(request);
		}
	}
}
