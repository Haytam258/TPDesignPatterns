package com.example.tpdesignpatterns.TP2.Composite;

public class TestComposite {
    public static void main(String[] args) {
        TrajetBuilder builder = new ConcreteBuilder();
        Trajet trajet1 = builder.addCout(200).build();
        builder = new ConcreteBuilder();
        Trajet trajet2 = builder.addCout(300).build();

        System.out.println(trajet1.cost);
        System.out.println(trajet2.cost);
    }
}
