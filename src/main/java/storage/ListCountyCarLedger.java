package storage;

import model.Car;
import model.County;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Car> car = cars
                .stream()
                .sorted(Comparator.comparing(Car::getCounty))
                .collect(Collectors.toList());
        return cars;
    }
}
