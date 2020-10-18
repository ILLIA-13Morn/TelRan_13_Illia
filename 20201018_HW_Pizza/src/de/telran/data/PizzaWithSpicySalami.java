package de.telran.data;

public class PizzaWithSpicySalami extends Pizza {

    public final static double SPICY_SALAMI_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + SPICY_SALAMI_PRICE;
    }
}
