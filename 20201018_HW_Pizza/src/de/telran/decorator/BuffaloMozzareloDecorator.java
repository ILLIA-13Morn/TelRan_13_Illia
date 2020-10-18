package de.telran.decorator;

public class BuffaloMozzareloDecorator extends AbstractDecorator {
    private final static double BUFFALO_MOZZARELLO_PRICE = 2.25;

    public BuffaloMozzareloDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + BUFFALO_MOZZARELLO_PRICE;
        System.out.println("With BuffaloMozzarelo " + price);
        return price;
    }
}
