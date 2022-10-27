package com.example.tpdesignpatterns.State;

import com.example.tpdesignpatterns.Elevator;

public interface ElevatorState {
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors);
}
