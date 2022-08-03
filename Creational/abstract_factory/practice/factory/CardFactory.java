package Creational.abstract_factory.practice.factory;

import Creational.abstract_factory.practice.model.CardType;
import Creational.abstract_factory.practice.model.CreditCard;

public abstract class CardFactory {

	public static CardFactory getCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
}
