package com.ctis417;

public class CarSimulatorMain {

    public static void main(String[] args) {

        Car tCar = new TeslaCar();

        tCar.pressStartButton();//Stop to Waiting
        tCar.brakePedal();//Waiting -> error
        tCar.gasPedal();//waiting ->moving
        tCar.stopButton();//Moving
        tCar.brakePedal();//waiting
        tCar.stopButton();
    }
}
