package com.ctis417;

public class TeslaCar extends Car{

    public TeslaCar() {
        driveBehaviour=new DriveWithBattery();
        powerBehaviour=new LithiumIonBattery();
    }

    @Override
    public void model() {

    }

}


