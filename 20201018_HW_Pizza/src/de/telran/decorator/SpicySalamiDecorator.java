package de.telran.decorator;

public class SpicySalamiDecorator extends AbstractDecorator {
    private final static double SPICY_SALAMI_PRICE = 2.25;

    public SpicySalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + SPICY_SALAMI_PRICE;
        System.out.println("With SpicySalami " + price);
        return price;
    }
}
