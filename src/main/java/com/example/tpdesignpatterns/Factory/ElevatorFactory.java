package com.example.tpdesignpatterns.Factory;

import com.example.tpdesignpatterns.Elevator;

public interface ElevatorFactory {
    public Elevator buildElevator(String id, int currentFloor);
}
