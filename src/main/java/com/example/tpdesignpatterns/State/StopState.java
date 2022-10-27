package com.example.tpdesignpatterns.State;

import com.example.tpdesignpatterns.Elevator;

public class StopState implements ElevatorState{
    @Override
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors) {
        return Integer.MAX_VALUE;
    }
}
