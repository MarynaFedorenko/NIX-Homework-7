package nix.data.impl;

import nix.data.abstr.AbstractPlanet;
import nix.data.Planet;

public class Earth extends AbstractPlanet implements Planet {
    private final int serialNumber = 3;
    private final double distanceToTheSun = 150*1000;;//м
    private final double diameter = 12756.28*1000;//м
    private final double weight = 6.0*Math.pow(10, 24);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Земля = " + result + "м/c^2");
        return result;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }
    public double getWeight(){
        return weight;
    }
    public double getDiameter(){return diameter;}
    public int getSerialNumber() {return serialNumber;}
}
