package com.sv.learning.core_patterns.decorator;

public class PizzaShop {

    public static void main(String[] args) {

        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}
