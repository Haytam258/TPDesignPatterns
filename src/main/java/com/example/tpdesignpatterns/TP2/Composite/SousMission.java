package com.example.tpdesignpatterns.TP2.Composite;

import java.util.ArrayList;
import java.util.List;

public class SousMission extends Mission {
    private List<Mission> sousMissions = new ArrayList<>();


    public void addMission(Mission mission){
        sousMissions.add(mission);
    }

    @Override
    int cout() {
        int cout = 0;
        for(Mission mission: sousMissions){
            cout += mission.cout();
        }
        return cout;
    }

    @Override
    String detailMission() {
        return null;
    }
}
