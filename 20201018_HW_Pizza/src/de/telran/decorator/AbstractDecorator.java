package de.telran.decorator;

public abstract class AbstractDecorator implements Pizza {

    private Pizza pizza;

    public AbstractDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
