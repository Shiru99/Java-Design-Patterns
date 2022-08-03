package Creational.abstract_factory.practice.model.Visa;

import Creational.abstract_factory.practice.model.CreditCard;

public class VisaBlackCreditCard extends CreditCard {
    @Override
    public String toString() {
        return "VisaBlackCreditCard [cscNumber=" + cscNumber + ", cardNumberLength=" + cardNumberLength + "]";
    }
}
