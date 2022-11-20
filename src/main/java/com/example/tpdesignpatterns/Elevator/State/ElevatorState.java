package com.example.tpdesignpatterns.Elevator.State;

import com.example.tpdesignpatterns.Elevator.Elevator;

public interface ElevatorState {
    public int distance(Elevator elevator, int currentFloor, int numberOfFloors);
}
