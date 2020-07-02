package nix.data.impl;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class Saturn extends AbstractPlanet implements Planet {
    private final int serialNumber = 6;
    private final double distanceToTheSun = 1427*1000;//м
    private final double diameter = 120536*1000;//м
    private final double weight = 5.7*Math.pow(10, 26);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Сатурн = " + result + "м/c^2");
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
