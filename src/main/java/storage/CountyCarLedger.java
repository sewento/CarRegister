package storage;

import model.Car;

import java.util.List;

public interface CountyCarLedger {
    void addCar(Car car);
    void removeCar(Car car);
    List<Car> findAllCars();
}
