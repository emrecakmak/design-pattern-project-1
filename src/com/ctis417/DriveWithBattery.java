package com.ctis417;

public class DriveWithBattery implements DriveBehaviour {

    @Override
    public void drive() {
        System.out.println("Motor is on! Battery mode is emabled! Now battery power using to reach our destination");
    }
}
