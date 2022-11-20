package com.example.tpdesignpatterns.Elevator.State;

import com.example.tpdesignpatterns.Elevator.Elevator;

public class UpState implements ElevatorState{

    @Override
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors) {
        return currentFloor > elevator.getFloor() ? currentFloor - elevator.getFloor() : 2*numberOfFloors - elevator.getFloor() - currentFloor;
    }
}
