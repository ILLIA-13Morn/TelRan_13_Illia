package de.telran.data;

public class PizzaWithAnchovies extends Pizza {

    private final static double ANCHOVIES_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + ANCHOVIES_PRICE;
    }
}
