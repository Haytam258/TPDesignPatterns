package com.example.tpdesignpatterns.TP2.Composite;

public class ConcreteBuilder implements TrajetBuilder{

    protected Trajet trajet;

    public ConcreteBuilder(){
        this.trajet = new Trajet();
    }


    @Override
    public TrajetBuilder addCout(int cout) {
        trajet.addCout(cout);
        return this;
    }

    @Override
    public Trajet build() {
        return trajet;
    }
}
