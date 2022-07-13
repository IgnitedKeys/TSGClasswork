/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.carlotservice.dto;

/**
 *
 * @author angeladrees
 */
public class CarKey {

    private String VIN;
    private boolean laserCut;

    public CarKey(String VIN, boolean laserCut) {
        this.VIN = VIN;
        this.laserCut = laserCut;
    }

    public String getVIN() {
        return VIN;
    }

    public boolean isLaserCut() {
        return laserCut;
    }

}
