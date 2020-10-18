package de.telran.data;

public class PizzaWithGorgonzola extends Pizza {

    public final static double GORGONZOLA_PRICE = 2.25;

    @Override
    public double getPrice() {
        return super.getPrice() + GORGONZOLA_PRICE;
    }
}
