package storage;

import model.Car;


import java.util.ArrayList;
import java.util.List;

public class ListCountyCarLedger implements CountyCarLedger {

    private List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> findAllCars() {

        return cars;
    }
}
