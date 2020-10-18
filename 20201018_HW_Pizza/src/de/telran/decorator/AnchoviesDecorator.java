package de.telran.decorator;

public class AnchoviesDecorator extends AbstractDecorator {
    private final static double ANCHOVIES_PRICE = 2.25;

    public AnchoviesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + ANCHOVIES_PRICE;
        System.out.println("Price with anchovies " + price);
        return price;
    }
}
