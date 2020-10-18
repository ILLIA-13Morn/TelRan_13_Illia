package de.telran.decorator;

public class GorgonzolaDecorator extends AbstractDecorator{
    private final static double GORGANZOLA_PRICE = 2.25;

    public GorgonzolaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + GORGANZOLA_PRICE;
        System.out.println("With Gorganzola " + price);
        return price;
    }
}
