package Behavioral.chain_of_responsibility.practice;

import Behavioral.chain_of_responsibility.practice.model.Request;
import Behavioral.chain_of_responsibility.practice.model.RequestType;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		SeniorDev seniorDev = new SeniorDev();
		TechLead techLead = new TechLead();
		ChiefArchitect chiefArchitect = new ChiefArchitect();
		
		seniorDev.setSuccessor(techLead);
		techLead.setSuccessor(chiefArchitect);
		
		Request request = new Request(RequestType.NEW_BUG, 10_000);
		seniorDev.handleRequest(request);
		
		request = new Request(RequestType.NEW_FEATURE, 8_00_000);
		seniorDev.handleRequest(request);
		
		request = new Request(RequestType.NEW_PRODUCT, 100_00_000);
		seniorDev.handleRequest(request);
	}
}
