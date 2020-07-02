package nix.data.impl;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class Mars extends AbstractPlanet implements Planet {
    private final int serialNumber = 4;
    private final double distanceToTheSun = 228*1000;//м
    private final double diameter = 6794*1000;//м
    private final double weight = 6.4*Math.pow(10, 23);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Марс = " + result + "м/c^2");
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
