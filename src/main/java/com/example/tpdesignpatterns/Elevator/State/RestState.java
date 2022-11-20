package com.example.tpdesignpatterns.Elevator.State;

import com.example.tpdesignpatterns.Elevator.Elevator;

public class RestState implements ElevatorState{


    @Override
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors) {
        return Math.abs(currentFloor - elevator.getFloor());
    }
}
