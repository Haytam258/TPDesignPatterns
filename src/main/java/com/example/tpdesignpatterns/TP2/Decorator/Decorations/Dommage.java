package com.example.tpdesignpatterns.TP2.Decorator.Decorations;

import com.example.tpdesignpatterns.TP2.Decorator.Facture;

public class Dommage extends FactureDecorator {
    public Dommage(Facture facture) {
        super(facture);
    }

    @Override
    public int getPrice() {
        return facture.getPrice() + 500;
    }
}
