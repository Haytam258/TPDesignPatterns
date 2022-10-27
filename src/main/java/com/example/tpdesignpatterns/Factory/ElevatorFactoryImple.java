package com.example.tpdesignpatterns.Factory;

import com.example.tpdesignpatterns.Elevator;
import com.example.tpdesignpatterns.State.RestState;

public class ElevatorFactoryImple implements ElevatorFactory{

    private static ElevatorFactoryImple instance = null;


    public static ElevatorFactory getInstance() {
        if(instance == null){
            instance = new ElevatorFactoryImple();
        }
        return instance;
    }

    @Override
    public Elevator buildElevator(String id, int currentFloor) {
        return new Elevator(currentFloor, new RestState(), id);
    }
}
