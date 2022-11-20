package com.example.tpdesignpatterns.Elevator;

import com.example.tpdesignpatterns.Elevator.Factory.ElevatorFactory;
import com.example.tpdesignpatterns.Elevator.Factory.ElevatorFactoryImple;
import com.example.tpdesignpatterns.Elevator.State.DownState;
import com.example.tpdesignpatterns.Elevator.State.StopState;
import com.example.tpdesignpatterns.Elevator.State.UpState;

import java.util.HashMap;

public class Building {
    private int numberOfFloors;
    HashMap<String, Elevator> elevatorMap = new HashMap<>();
    private ElevatorFactory elevatorFactory = ElevatorFactoryImple.getInstance();

    private Dispatcher dispatcher = DispatcherImple.getInstance();


    public Building(int numberOfFloors, String... elevators){
        this.numberOfFloors = numberOfFloors;
        for(String elevator : elevators){
            String id = elevator.split(":")[0];
            int currentFloor = Integer.parseInt(elevator.split(":")[1]);
            elevatorMap.put(id, elevatorFactory.buildElevator(id, currentFloor));
        }
    }

    public String requestElevator(Integer floor){
        return dispatcher.request(floor, elevatorMap, numberOfFloors);
    }

    public String requestElevator(){
        return requestElevator(numberOfFloors);
    }

    public void move(String id, String state){
        if(state.equals("DOWN")){
            elevatorMap.get(id).setState(new DownState());
        }
        if(state.equals("UP")){
            elevatorMap.get(id).setState(new UpState());
        }
    }

    public void stopAt(String id, int floor){
        elevatorMap.get(id).setState(new StopState());

    }
}
