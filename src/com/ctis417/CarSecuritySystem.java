package com.ctis417;

import java.util.ArrayList;

public class CarSecuritySystem implements SubjectCar{
    private ArrayList<Observer> observers;
    private String motion;
    private float pressure;
    private String camera;

    public CarSecuritySystem(){
        //We have added array list to hold observers and created it in the constructor.
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        //When an observer registers, we just add it to end of the list
        observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        //If an observer wants to un-register, we just take it off the list
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        //Here we tell all the observers about the state, because they all implement update() so we know how to notify them.
       for(int i=0; i<observers.size(); i++){
           Observer observer = (Observer)observers.get(i);
           observer.update(motion, pressure, camera);
           System.out.println("Observers are notified!");
       }
        
    }
    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(String motion, float pressure, String camera){
        this.motion = motion;
        this.pressure = pressure;
        this.camera = camera;
        measurementChanged();
    }

    public String getMotion(){
        return motion;
    }
    public float getPressure(){
        return pressure;
    }
    public String getCamera(){
        return camera;
    }
    
}
