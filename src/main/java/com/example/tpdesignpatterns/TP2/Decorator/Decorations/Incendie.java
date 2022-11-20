package com.example.tpdesignpatterns.TP2.Decorator.Decorations;

import com.example.tpdesignpatterns.TP2.Decorator.Facture;

public class Incendie extends FactureDecorator {
    public Incendie(Facture facture) {
        super(facture);
    }

    @Override
    public int getPrice() {
        return facture.getPrice() + 1000;
    }
}
