package com.ctis417;

public class WaitingState implements CarState {

    Car stateOfCar;

    public WaitingState(Car stateOfCar) {
        this.stateOfCar=stateOfCar;
    }
    
    @Override
    public void startButton() {
        System.out.println("You have already started your car.");
    }

    @Override
    public void gasPedal() {
        stateOfCar.setState(stateOfCar.getMovingState()) ;
        System.out.println("Current State: Moving State");

    }

    @Override
    public void breakPedal() {
        System.out.println("The car is already stopped. Use gas pedal to move");
    }

    @Override
    public void stopButton() {
        System.out.println("The engine has stopped, see you soon.");
        stateOfCar.setState(stateOfCar.getStopState()) ;
        System.out.println("Current State: Stop State");


    }
}
