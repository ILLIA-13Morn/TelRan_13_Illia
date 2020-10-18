package de.telran.data;

public class PizzaWithSalameNapoli extends Pizza {

    public final static double SALAME_NAPOLI_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + SALAME_NAPOLI_PRICE;
    }
}
