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
public class CarLotServiceImpl implements CarLotService {

    CarLotDao dao;

    public CarLotServiceImpl(CarLotDao dao) {
        this.dao = dao;
    }

    //ALL THESE SHOULD BE PASS_THROUGHS
    //Given a VIN, it should be able to get a single Car.
    @Override
    public Car getACar(String VIN) {
        return dao.getCar(VIN);
    }

    //It should be able to get all the Cars and return them in a List.
    @Override
    public List<Car> getAllCars() {
        return dao.getCars();
    }

    //Given a color, it should be able to return all the available Cars of that color in a List.
    @Override
    public List<Car> getCarsByColor(String color) {
        List<Car> cars = dao.getCars();
        List<Car> colorCars = new ArrayList();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    //Given a max Price, it should be able to return a List of all available Cars at or under that price.
    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        List<Car> cars = dao.getCars();
        List<Car> budgetCars = new ArrayList();

        for (Car car : cars) {
            if (car.getPrice().compareTo(maxPrice) < 0) {
                budgetCars.add(car);
            }
        }
        return budgetCars;
    }

    //Given a make and model, it should be able to return a List of all the available Cars.
    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        List<Car> cars = dao.getCars();
        List<Car> makeModelCars = new ArrayList();

        for (Car car : cars) {
            if (car.getMake() == make && car.getModel() == model) {
                makeModelCars.add(car);
            }
        }
        return makeModelCars;
    }

    //Given a VIN and a discount amount (i.e. 15%), this method should discount the car's price 
    //(updating the official price records of that car), and then return the new final price.
    //If there is no car that matches, it should throw a NoSuchCarException
    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        Car discountCar;
        try{
           discountCar = dao.getCar(VIN);
        } catch(Exception e) {
            throw new NoSuchCarException("Car does not exist", e);
        }
        
        BigDecimal discountOff = discountCar.getPrice().multiply(percentDiscount.divide(new BigDecimal("100")));
        BigDecimal newPrice = discountCar.getPrice().subtract(discountOff);
        discountCar.setPrice(newPrice);
        
        dao.editCar(VIN, discountCar);
        return discountCar.getPrice();
        
    }

    //Given a VIN and a cash Amount, it should 'buy' - checking if the price matches, 
    //removing the car from the lot, and returning the associated CarKey.
    //If there is no car that matches, it should throw a NoSuchCarException
    //If they gave too much money, it should throw an OverpaidPriceException
    //If they gave too little money, it should throw an UnderpaidPriceException
    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        Car sellingCar;
        try {
            sellingCar = dao.getCar(VIN);
        } catch (Exception e) {
            throw new NoSuchCarException("Car does not exist", e);
        }

        try {
            if (sellingCar.getPrice().compareTo(cashPaid) == 0) {

            }
        } catch (Exception e) {
            if (sellingCar.getPrice().compareTo(cashPaid) == -1) {
                throw new UnderpaidPriceException("not enough money", e);
            }
            if (sellingCar.getPrice().compareTo(cashPaid) == 1) {
                throw new OverpaidPriceException("Too much money", e);
            }
        }

        Car removeCar = dao.removeCar(VIN);
        return removeCar.getKey();
    }

}
