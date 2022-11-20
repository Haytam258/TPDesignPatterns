package com.example.tpdesignpatterns.Elevator;

import java.util.HashMap;

public interface Dispatcher {
    public String request(Integer floor, HashMap<String, Elevator> elevatorMap, int numberOfFloors);
}
