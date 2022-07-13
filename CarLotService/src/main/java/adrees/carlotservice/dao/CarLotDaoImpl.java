/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.carlotservice.dao;

import adrees.carlotservice.dto.Car;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author angeladrees
 */
public class CarLotDaoImpl implements CarLotDao{
    
    Map<String, Car> cars = new HashMap<>();

    @Override
    public Car addCar(String VIN, Car car) {
        Car prevCar = cars.put(VIN, car);
        return prevCar;
    }

    @Override
    public Car getCar(String VIN) {
        return cars.get(VIN);
    }

    @Override
    public List<Car> getCars() {
        return new ArrayList(cars.values());
    }

    @Override
    public void editCar(String VIN, Car car) {
        Car editedCar = cars.put(VIN, car);
    }

    @Override
    public Car removeCar(String VIN) {
        Car removedCar = cars.remove(VIN);
        return removedCar;
    }
    
}
