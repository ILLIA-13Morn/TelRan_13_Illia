package de.telran.data;

public class PizzaWithParmesan extends Pizza {
    public final static double PARMESAN_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + PARMESAN_PRICE;
    }
}
