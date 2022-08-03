package Creational.abstract_factory.practice.model.amex;

import Creational.abstract_factory.practice.model.CreditCard;

public class AmexPlatinumCreditCard extends CreditCard {
    @Override
    public String toString() {
        return "AmexPlatinumCreditCard [cscNumber=" + cscNumber + ", cardNumberLength=" + cardNumberLength + "]";
    }
}
