package com.ctis417;

public class StopState implements CarState {

    Car stateOfCar;

    public StopState(Car stateOfCar) {

        this.stateOfCar=stateOfCar;

    }
    @Override
    public void startButton() {
        System.out.println("You pressed start button!");
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
