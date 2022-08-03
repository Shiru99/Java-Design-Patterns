package Creational.abstract_factory.practice.factory;

import Creational.abstract_factory.practice.model.CardType;
import Creational.abstract_factory.practice.model.CreditCard;
import Creational.abstract_factory.practice.model.Visa.VisaBlackCreditCard;
import Creational.abstract_factory.practice.model.Visa.VisaGoldCreditCard;

public class VisaFactory extends CardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}
}
