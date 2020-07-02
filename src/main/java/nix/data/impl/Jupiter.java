package nix.data.impl;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class Jupiter extends AbstractPlanet implements Planet {
    private final int serialNumber = 5;
    private final double distanceToTheSun = 778*1000;//м
    private final double diameter = 142984*1000;//м
    private final double weight = 1.9*Math.pow(10, 27);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Юпитер = " + result + "м/c^2");
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
