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
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author angeladrees
 */
public class CarLotServiceImplTest {

    private CarLotService service;

    public CarLotServiceImplTest() {
        CarLotDao dao = new CarLotDaoStubImpl();
        service = new CarLotServiceImpl(dao);
    }

    @BeforeEach
    public void setUp() {
    }

    //tests getting car with VIN
    @Test
    public void testGetCar() {
        CarKey testKey = new CarKey("VIN1", false);
        Car testCar = new Car("VIN1");
        testCar.setColor("RED");
        testCar.setKey(testKey);
        testCar.setMake("Toyota");
        testCar.setModel("Camry");
        testCar.setPrice(new BigDecimal("5000"));
        testCar.setOdometerMiles(1000);

        Car returnedCar = service.getACar("VIN1");

        assertNotNull(returnedCar, "Car should be VIN1");

        Car shouldBeNull = service.getACar("VIN4");
        assertNull(shouldBeNull, "VIN4 should not exist");
    }

    //tests returning all cars
    @Test
    public void testGetAllCars() {
        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);

        assertEquals(1, service.getAllCars().size(), "Only 1 car should be in list");
        //assertTrue(service.getAllCars().contains(car), "The only car should be the testCar");
    }

    //tests returning all color
    @Test
    public void testGetColorCars() {
        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);

        List<Car> coloredCar = service.getCarsByColor("RED");

        assertEquals(1, coloredCar.size(), "Only 1 car should be red in the list");

    }

    //return list of cars under a price
    @Test
    public void testGetMaxPrice() {
        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);

        List<Car> budgetCars = service.getCarsInBudget(new BigDecimal("6000"));
        assertEquals(1, budgetCars.size(), "Only 1 car should be under 6000");

    }

    //return list of cars of make and model
    @Test
    public void testGetMakeModel() {
        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);

        List<Car> makeModelCar = service.getCarByMakeAndModel("Toyota", "Camry");

        assertEquals(1, makeModelCar.size(), "Only 1 car should be a Toyota Camry in the list");

    }

    //test return car with VIN with discount price
    @Test
    public void testGetDiscountCar() throws NoSuchCarException {

        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);
        
        BigDecimal newPrice = service.discountCar(car.getVIN(), new BigDecimal("15"));
        assertEquals(newPrice, new BigDecimal("4250.00") ,"15% off 5000 should be 4250");
        
        Car retrievedCar = service.getACar(car.getVIN());
        assertEquals(newPrice, retrievedCar.getPrice(), "Car should be updated to new price");
    }

    //test returns carkey of sold car with VIN
    @Test
    public void testSellCar() throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        CarKey testKey = new CarKey("VIN1", false);
        Car car = new Car("VIN1");
        car.setColor("RED");
        car.setKey(testKey);
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setPrice(new BigDecimal("5000"));
        car.setOdometerMiles(1000);

        CarKey sellingKey = service.sellCar(car.getVIN(), car.getPrice());
        assertEquals(testKey.getVIN(), sellingKey.getVIN(), "Should be same car VIN");


        List<Car> cars = service.getAllCars();
        assertEquals(1, cars.size(), "Car should be removed from list after being sold");

    }
}
