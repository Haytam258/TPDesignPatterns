package com.example.tpdesignpatterns.TP2.Composite;

import java.util.List;

public abstract class Mission {
    List<Mission> missions;
    abstract int cout();
    abstract String detailMission();
}
