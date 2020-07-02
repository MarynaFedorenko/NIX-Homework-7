package nix.data.impl;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class Mercury extends AbstractPlanet implements Planet {
    private final int serialNumber = 1;
    private final double distanceToTheSun = 58*1000;//м
    private final double diameter = 4878*1000;//м
    private final double weight = 3.3*Math.pow(10, 23);//кг

    @Override
    public double getAccelerationOfGravity() {
        double result = super.gravity*(weight/Math.pow(diameter/2, 2));
        System.out.println("Ускорение свободного падения на планете Меркурий = " + result + "м/c^2");
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
