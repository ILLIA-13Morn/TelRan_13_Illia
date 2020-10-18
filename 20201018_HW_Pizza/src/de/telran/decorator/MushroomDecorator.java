package de.telran.decorator;

public class MushroomDecorator extends AbstractDecorator {
    private final static double MUSHROOM_PRICE = 2.25;

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + MUSHROOM_PRICE;
        System.out.println("With Mushroom " + price );
        return price;
    }
}
