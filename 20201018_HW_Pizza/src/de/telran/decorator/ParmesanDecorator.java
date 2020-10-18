package de.telran.decorator;

public class ParmesanDecorator extends AbstractDecorator{
    private final static double PARMESAN_PRICE = 2.25;

    public ParmesanDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + PARMESAN_PRICE;
        System.out.println("With Parmesan " + price);
        return price;
    }
}
