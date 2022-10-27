package com.example.tpdesignpatterns.State;

import com.example.tpdesignpatterns.Elevator;

public class RestState implements ElevatorState{


    @Override
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors) {
        return Math.abs(currentFloor - elevator.getFloor());
    }
}
