package Creational.abstract_factory.practice.model.Visa;

import Creational.abstract_factory.practice.model.CreditCard;

public class VisaGoldCreditCard extends CreditCard {
    @Override
    public String toString() {
        return "VisaGoldCreditCard [cscNumber=" + cscNumber + ", cardNumberLength=" + cardNumberLength + "]";
    }
}
