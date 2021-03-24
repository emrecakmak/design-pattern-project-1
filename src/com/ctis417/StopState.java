package com.ctis417;

public class StopState implements CarState {

    Car stateOfCar;
    CarSingleton singleton = CarSingleton.getInstance();
    
    public StopState(Car stateOfCar) {
    
        this.stateOfCar=stateOfCar;

    }
    @Override
    public void startButton() {
        //Singleton added when the user presses start button to start the engine.
        System.out.println("You pressed start button!");
        singleton.startEngine();
        stateOfCar.setState(stateOfCar.getWaitingState()) ;
        System.out.println("\nYour engine just started working.");
        System.out.println("Current State: Waiting State");


    }
    @Override
    public void gasPedal() {
        System.out.println("You can't use pedals in Stop State.");
    }

    @Override
    public void breakPedal() {
        System.out.println("You can't use pedals in Stop State.");
    }

    @Override
    public void stopButton() {
        System.out.println("The car is already in Stop State!");

    }
}
