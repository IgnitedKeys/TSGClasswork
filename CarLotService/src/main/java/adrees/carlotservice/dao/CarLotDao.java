/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.carlotservice.dao;

import adrees.carlotservice.dto.Car;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public interface CarLotDao {
    public Car addCar(String VIN, Car car);
    
    public Car getCar(String VIN);
    public List<Car> getCars();
    
    public void editCar(String VIN, Car car);
    
    public Car removeCar(String VIN);
}
