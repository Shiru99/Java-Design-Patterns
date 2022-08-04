package Behavioral.chain_of_responsibility.practice;

import Behavioral.chain_of_responsibility.practice.model.Handler;
import Behavioral.chain_of_responsibility.practice.model.Request;
import Behavioral.chain_of_responsibility.practice.model.RequestType;

public class TechLead extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.NEW_FEATURE) {
			if(request.getAmount() < 10_00_000) {
				System.out.println("Tech Lead can approve the amount for new features");
			} else{
				System.out.println("Tech Lead can't approve the amount for new features");
			}
			
		}else {
			System.out.print("Tech Lead -> ");
			successor.handleRequest(request);
		}
	}
}
