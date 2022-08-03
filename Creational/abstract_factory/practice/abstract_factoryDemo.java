package Creational.abstract_factory.practice;

import Creational.abstract_factory.practice.factory.CardFactory;
import Creational.abstract_factory.practice.model.CardType;
import Creational.abstract_factory.practice.model.CreditCard;

public class abstract_factoryDemo {
	public static void main(String[] args) {
		
		CardFactory abstract_factory = CardFactory.getCardFactory(775);
		CreditCard card = abstract_factory.getCreditCard(CardType.PLATINUM);
		System.out.println(card);
		
		abstract_factory = CardFactory.getCardFactory(600);
		CreditCard card2 = abstract_factory.getCreditCard(CardType.GOLD);
		System.out.println(card2);
	}
}
