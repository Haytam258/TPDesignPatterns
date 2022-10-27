package com.example.tpdesignpatterns;

import com.example.tpdesignpatterns.State.ElevatorState;

public class Elevator {
    private int floor;
    private ElevatorState elevatorState;
    private String id;

    private int distance;

    public Elevator(int floor, ElevatorState elevatorState, String id){
        this.id = id;
        this.elevatorState = elevatorState;
        this.floor = floor;
    }

    public int getDistance(){
        return this.distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public int getFloor(){
        return this.floor;
    }

    public ElevatorState getState(){
        return this.elevatorState;
    }

    public void setState(ElevatorState state){
        this.elevatorState = state;
    }

    public String getId(){
        return this.id;
    }



}
