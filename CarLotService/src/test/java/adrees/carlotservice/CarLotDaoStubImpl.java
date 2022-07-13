/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrees.carlotservice;

import adrees.carlotservice.dao.CarLotDao;
import adrees.carlotservice.dto.Car;
import adrees.carlotservice.dto.CarKey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angeladrees
 */
public class CarLotDaoStubImpl implements CarLotDao {

    public Car testCar;
    public CarKey testKey;
    
    public CarLotDaoStubImpl() {
        testKey = new CarKey("VIN1", false);
        testCar = new Car("VIN1");
        testCar.setColor("RED");
        testCar.setKey(testKey);
        testCar.setMake("Toyota");
        testCar.setModel("Camry");
        testCar.setPrice(new BigDecimal("5000"));
        testCar.setOdometerMiles(1000);

        
    }
    
    public CarLotDaoStubImpl(Car testCar){
        this.testCar = testCar;
    }
    
    @Override
    public Car addCar(String VIN, Car car) {
        if(VIN.equals(testCar.getVIN())){
            return testCar;
        } else {
            return null;
        }
    }

    @Override
    public Car getCar(String VIN) {
        if(VIN.equals(testCar.getVIN())){
            return testCar;
        } else {
            return null;
        }
    }

    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(testCar);
        return carList;
    }

    @Override
    public void editCar(String VIN, Car car) {
        
    }

    @Override
    public Car removeCar(String VIN) {
        if(VIN.equals(testCar.getVIN())){
            return testCar;
        } else {
            return null;
        }
    }
    
}
