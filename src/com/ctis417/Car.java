package com.ctis417;

public abstract class Car {

    PowerBehaviour powerBehaviour;
    DriveBehaviour driveBehaviour;

    CarState stopState;
    CarState waitingState;
    CarState movingState;

    CarState state;

    public Car(){
        stopState = new StopState(this);
        waitingState = new WaitingState(this);
        movingState = new MovingState(this);
        state=stopState;

    }

    public abstract void model();

    public void performDriving(){
        driveBehaviour.drive(); //delegation of drive() method to the its interface reference.
    }

    public void performPowerConsumption(){
        powerBehaviour.powerConsumption(); //delegation of powerConsumption() method to the its interface reference.
    }

    public void pressStartButton(){
        state.startButton();
    }
    public void gasPedal(){
        state.gasPedal();
    }
    public void brakePedal(){
        state.breakPedal();
    }
    public void stopButton(){
        state.stopButton();
    }

    void setState(CarState state){
        this.state=state;
    }

    public CarState getStopState() {
        return stopState;
    }

    public CarState getWaitingState() {
        return waitingState;
    }

    public CarState getMovingState() {
        return movingState;
    }
}