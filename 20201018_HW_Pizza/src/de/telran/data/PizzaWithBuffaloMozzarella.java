package de.telran.data;

public class PizzaWithBuffaloMozzarella extends Pizza {
    private final static double MOZZARELLA_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + MOZZARELLA_PRICE;
    }
}
