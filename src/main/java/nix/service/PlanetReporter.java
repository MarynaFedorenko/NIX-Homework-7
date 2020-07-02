package nix.service;

import nix.data.Planet;
import nix.data.abstr.AbstractPlanet;

public class PlanetReporter{

    public double getAccelerationOfGravity(Planet planet) {
        return planet.getAccelerationOfGravity();
    }
}
