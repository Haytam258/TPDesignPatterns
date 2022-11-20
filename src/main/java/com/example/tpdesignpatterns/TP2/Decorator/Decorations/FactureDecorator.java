package com.example.tpdesignpatterns.TP2.Decorator.Decorations;

import com.example.tpdesignpatterns.TP2.Decorator.Facture;

public abstract class FactureDecorator implements Facture {

    Facture facture;

    public FactureDecorator(Facture facture){
        this.facture = facture;
    }

    @Override
    public abstract int getPrice();
}
