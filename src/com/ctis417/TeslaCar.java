package com.ctis417;

public class TeslaCar extends Car implements Observer{
    private String motion;
    private float pressure;
    private String camera;
    private SubjectCar carSecuritySystem;

    public TeslaCar() {
        driveBehaviour=new DriveWithBattery();
        powerBehaviour=new LithiumIonBattery();
    }

    public TeslaCar(SubjectCar carSecuritySystem){
        //The constructor is passed the carSecuritySystem object(the SubjectCar) and we use it to register the display as an observer.
        this.carSecuritySystem=carSecuritySystem;
        carSecuritySystem.registerObserver(this);
    }

    @Override
    public void model() {

    }

    public void display(){
        System.out.println("\nCurrent status of your car:\n" +"Motion:"+ motion + "\nPressure: "+ pressure + "\nCamera: "+ camera);
    };

    @Override
    public void update(String motion, float pressure, String camera) {
        this.motion=motion;
        this.pressure=pressure;
        this.camera=camera;
        
    }

}


