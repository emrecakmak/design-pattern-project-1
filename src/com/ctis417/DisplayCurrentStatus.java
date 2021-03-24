package com.ctis417;

public class DisplayCurrentStatus implements Observer{
    private String motion;
    private float pressure;
    private String camera;
    private SubjectCar carSecuritySystem;

    public DisplayCurrentStatus(SubjectCar carSecuritySystem){
        //The constructor is passed the carSecuritySystem object(the SubjectCar) and we use it to register the display as an observer.
        this.carSecuritySystem=carSecuritySystem;
        carSecuritySystem.registerObserver(this);
    }

    public void display(){
        System.out.println("\nCurrent status of your car:\n" +"Motion:"+ motion + "\nPressure: "+ pressure + "\nCamera: "+ camera);
    };

    @Override
    public void update(String motion, float pressure, String camera) {
        this.motion=motion;
        this.pressure=pressure;
        this.camera=camera;
        display();
    }
}
