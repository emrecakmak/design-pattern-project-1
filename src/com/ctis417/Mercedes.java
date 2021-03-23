package com.ctis417;

public class Mercedes extends Car{

    @Override
    public void model() {

    }

    public Mercedes(String modelName) {
        System.out.println("Welcome to your "+modelName);
        driveBehaviour=new DriveWithMotor();
        powerBehaviour=new Diesel();

    }


}
