package com.example.tpdesignpatterns.TP2.Decorator.Decorations;

import com.example.tpdesignpatterns.TP2.Decorator.Facture;

public class Vol extends FactureDecorator {

    public Vol(Facture facture) {
        super(facture);
    }

    @Override
    public int getPrice() {
        return facture.getPrice() + 200;
    }
}
