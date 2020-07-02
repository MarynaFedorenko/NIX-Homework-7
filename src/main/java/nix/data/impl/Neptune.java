package nix.data.impl;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class Neptune extends AbstractPlanet implements Planet {
    private final int serialNumber = 8;
    private final double distanceToTheSun = 4498*1000;//м
    private final double diameter = 49532*1000;//м
    private final double weight = 1.02*Math.pow(10, 26);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Нептун = " + result + "м/c^2");
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
