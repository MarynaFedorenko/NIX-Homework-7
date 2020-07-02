package nix;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBulder {
    DecimalFormat d = new DecimalFormat("#.##");

    @Test
    public void checkMercuryAccelerationOfGravity(){
        assertEquals("3,7", d.format(Main.getInfo(1)));
    }

    @Test
    public void checkVenusAccelerationOfGravity(){
        assertEquals("8,93", d.format(Main.getInfo(2)));
    }

    @Test
    public void checkEarthAccelerationOfGravity(){
        assertEquals("9,84", d.format(Main.getInfo(3)));
    }

    @Test
    public void checkMarsAccelerationOfGravity(){
        assertEquals("3,7", d.format(Main.getInfo(4)));
    }

    @Test
    public void checkJupiterAccelerationOfGravity(){
        assertEquals("24,81", d.format(Main.getInfo(5)));
    }

    @Test
    public void checkSaturnAccelerationOfGravity(){
        assertEquals("10,47", d.format(Main.getInfo(6)));
    }

    @Test
    public void checkUranusAccelerationOfGravity(){
        assertEquals("8,89", d.format(Main.getInfo(7)));
    }

    @Test
    public void checkNeptuneAccelerationOfGravity(){
        assertEquals("11,1", d.format(Main.getInfo(8)));
    }

}
