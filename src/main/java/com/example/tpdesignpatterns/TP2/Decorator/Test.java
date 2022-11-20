package com.example.tpdesignpatterns.TP2.Decorator;

import com.example.tpdesignpatterns.TP2.Decorator.Decorations.Incendie;
import com.example.tpdesignpatterns.TP2.Decorator.Decorations.Vol;

public class Test {
    public static void main(String[] args) {
        Facture factureBase = new FactureBase();
        System.out.println(factureBase.getPrice());
        Facture factureBaseVol = new Vol(factureBase);
        System.out.println(factureBaseVol.getPrice());
        Facture factureBaseVolIncendie = new Incendie(factureBaseVol);
        System.out.println(factureBaseVolIncendie.getPrice());
    }
}
