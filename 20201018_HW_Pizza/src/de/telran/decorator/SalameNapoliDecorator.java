package de.telran.decorator;

public class SalameNapoliDecorator extends AbstractDecorator {
    private final static double SALAMI_NAPOLI_PRICE = 2.25;

    public SalameNapoliDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        double price = super.getPrice() + SALAMI_NAPOLI_PRICE;
        System.out.println("With SalamiNapoli " + price);
        return price;
    }
}
