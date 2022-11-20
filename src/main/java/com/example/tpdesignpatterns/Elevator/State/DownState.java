package com.example.tpdesignpatterns.Elevator.State;

import com.example.tpdesignpatterns.Elevator.Elevator;

public class DownState implements ElevatorState{

    @Override
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors) {
        return currentFloor > elevator.getFloor() ? elevator.getFloor() + currentFloor : Math.abs(currentFloor - elevator.getFloor()) ;
    }
}
