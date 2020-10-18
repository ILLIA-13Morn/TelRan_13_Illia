package de.telran.data;

public class PizzaWithMushroom extends Pizza {
    public final static double MUSHROOM_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + MUSHROOM_PRICE;
    }
}
