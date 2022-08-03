package Creational.abstract_factory.practice.factory;

import Creational.abstract_factory.practice.model.CardType;
import Creational.abstract_factory.practice.model.CreditCard;
import Creational.abstract_factory.practice.model.amex.AmexGoldCreditCard;
import Creational.abstract_factory.practice.model.amex.AmexPlatinumCreditCard;

public class AmexFactory extends CardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
			case PLATINUM:
				return new AmexPlatinumCreditCard();	
		}
		return null;
	}
}
