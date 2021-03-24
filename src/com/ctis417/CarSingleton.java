package com.ctis417;

public class CarSingleton {
    private static CarSingleton carSingletonInstance;
    private CarSingleton() {}
    
    //Starting car engine invoked in StopStake.java file. When the user presses start button while the car is stopped, it starts the engine.
    public static CarSingleton getInstance() {
        if (carSingletonInstance == null) {
            carSingletonInstance = new CarSingleton();
        }
        return carSingletonInstance;
    }
    public void startEngine() {
        System.out.println("Engine has started.");
    }
}
