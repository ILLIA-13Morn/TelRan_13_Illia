package de.telran.decorator;

public class PizzaImpl implements Pizza{
    private final static double BASIC_MARINARA_PRICE = 6.95;

    @Override
    public double getPrice() {
        System.out.println("Price for basic pizza with tomato sauce, garlic oregano  (no mozzarella: " + BASIC_MARINARA_PRICE);
        return BASIC_MARINARA_PRICE;
    }
}
