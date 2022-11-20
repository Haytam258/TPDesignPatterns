package com.example.tpdesignpatterns.Elevator.Factory;

import com.example.tpdesignpatterns.Elevator.Elevator;

public interface ElevatorFactory {
    public Elevator buildElevator(String id, int currentFloor);
}
