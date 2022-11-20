package com.example.tpdesignpatterns.TP2.Composite;

public class Trajet extends Mission{

    protected int cost;

    public Trajet(){

    }

    public void addCout(int cout){
        this.cost = cout;
    }

    @Override
    int cout() {
        return this.cost;
    }

    @Override
    String detailMission() {
        return null;
    }


}
