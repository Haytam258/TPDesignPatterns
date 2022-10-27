package com.example.tpdesignpatterns;

import java.util.HashMap;

public class DispatcherImple implements Dispatcher {

    private DispatcherImple(){

    }
    private static DispatcherImple instance = null;

    public static Dispatcher getInstance(){
        if(instance == null){
            instance = new DispatcherImple();
        }
        return instance;
    }

    public String request(Integer floor, HashMap<String, Elevator> elevatorMap, int numberOfFloors){
        int minimum = floor;
        Elevator target = null;
        for(Elevator elevator: elevatorMap.values()){
            if(elevator.getState().distance(elevator, floor, numberOfFloors ) < minimum){
                minimum = elevator.getState().distance(elevator, floor, numberOfFloors);
                target = elevator;
            }
        }
        return target == null ? null: target.getId();
    }
}
