package Behavioral.chain_of_responsibility.practice;

import Behavioral.chain_of_responsibility.practice.model.Handler;
import Behavioral.chain_of_responsibility.practice.model.Request;

public class ChiefArchitect extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("Chief Architect can approve the amount for new products");
	}
}
