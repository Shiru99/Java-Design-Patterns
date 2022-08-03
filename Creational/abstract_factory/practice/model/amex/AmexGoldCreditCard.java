package Creational.abstract_factory.practice.model.amex;

import Creational.abstract_factory.practice.model.CreditCard;

public class AmexGoldCreditCard extends CreditCard {
    @Override
    public String toString() {
        return "AmexGoldCreditCard [cscNumber=" + cscNumber + ", cardNumberLength=" + cardNumberLength + "]";
    }
}
