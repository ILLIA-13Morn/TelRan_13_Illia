package de.telran.controller;

import de.telran.decorator.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaImpl();
        Pizza pizzaWithAnchovies = new AnchoviesDecorator(pizza);
        Pizza pizzaWithAnchoviesAndBuffaloMozzarelo = new AnchoviesDecorator(new BuffaloMozzareloDecorator(new PizzaImpl()));
        Pizza pizzaWithGorgonzolaAndSalamiNapoli = new GorgonzolaDecorator(new SalameNapoliDecorator(new PizzaImpl()));
        Pizza pizzaWithParmesanAndSpicySalameAndBuffaloMozzarelo = new ParmesanDecorator(new SpicySalamiDecorator(new BuffaloMozzareloDecorator(new PizzaImpl())));
        Pizza pizzaWithGorgonzolaAndParmesanAndBuffaloMozzarellaAndSalamiNapoli = new GorgonzolaDecorator(new ParmesanDecorator(new BuffaloMozzareloDecorator(new SalameNapoliDecorator(new PizzaImpl()))));


        pizza.getPrice();
        System.out.println();
        pizzaWithAnchovies.getPrice();
        System.out.println();
        pizzaWithAnchoviesAndBuffaloMozzarelo.getPrice();
        System.out.println();
        pizzaWithGorgonzolaAndSalamiNapoli.getPrice();
        System.out.println();
        pizzaWithParmesanAndSpicySalameAndBuffaloMozzarelo.getPrice();
        System.out.println();
        pizzaWithGorgonzolaAndParmesanAndBuffaloMozzarellaAndSalamiNapoli.getPrice();

    }

}
