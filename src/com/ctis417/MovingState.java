package com.ctis417;

public class MovingState implements CarState {

    Car stateOfCar;

    public MovingState(Car stateOfCar) {
        this.stateOfCar=stateOfCar;
    }

    @Override
    public void startButton() {
        System.out.println("The car is already moving, You can't use start button.");
    }

    @Override
    public void gasPedal() {
        System.out.println("The speed of car is increased.");
    }

    @Override
    public void breakPedal() {
        System.out.println("You pushed break pedal... Car is going to enter 'Waiting State' in seconds.");
        stateOfCar.setState(stateOfCar.getWaitingState());
        System.out.println("Current State: WaitingState");
    }

    @Override
    public void stopButton() {
        System.out.println("!!! TOO RISKY !!!\nUsing stop button while moving is deactivated.");
    }
}
