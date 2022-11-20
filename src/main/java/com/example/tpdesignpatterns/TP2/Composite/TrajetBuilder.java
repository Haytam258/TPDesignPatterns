package com.example.tpdesignpatterns.TP2.Composite;

public interface TrajetBuilder {
    TrajetBuilder addCout(int cout);
    Trajet build();
}
