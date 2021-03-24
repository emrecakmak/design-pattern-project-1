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

        //Security Systems for observers.
        CarSecuritySystem carSecuritySystem = new CarSecuritySystem(); 
        CarSecuritySystem carSecuritySystem2 = new CarSecuritySystem(); 
        CarSecuritySystem carSecuritySystem3 = new CarSecuritySystem(); 
        CarSecuritySystem carSecuritySystem4 = new CarSecuritySystem(); 

        //Assigned observers for its own security systems.
        DisplayCurrentStatus observer1 = new DisplayCurrentStatus(carSecuritySystem);
        DisplayCurrentStatus observer2 = new DisplayCurrentStatus(carSecuritySystem2);
        TeslaCar observer3 = new TeslaCar(carSecuritySystem3);
        Mercedes observer4 = new Mercedes(carSecuritySystem4);

        carSecuritySystem.setMeasurements("Motion OFF - Safe", 25, "Camera ON - Recording"); //(motion, pressure, camera)
        //The change on first observer is notified.
        carSecuritySystem.setMeasurements("Motion ON - Threat Alert", 500, "Camera ON");

        //Other observer's notification
        carSecuritySystem2.setMeasurements("Motion OFF - No Threat", 225, "Camera ON - Recording");

        
        


        
        
        
    }
}
