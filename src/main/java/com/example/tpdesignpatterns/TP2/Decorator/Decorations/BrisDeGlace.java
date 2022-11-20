package com.example.tpdesignpatterns.TP2.Decorator.Decorations;

import com.example.tpdesignpatterns.TP2.Decorator.Facture;

public class BrisDeGlace extends FactureDecorator {
    public BrisDeGlace(Facture facture) {
        super(facture);
    }

    @Override
    public int getPrice() {
        return facture.getPrice() + 150;
    }
}
