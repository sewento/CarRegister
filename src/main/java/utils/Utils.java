package utils;

import model.Car;
import model.County;
import model.TruckCar;
import storage.CountyCarLedger;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {

    private CountyCarLedger countyCarLedger;

    public Utils(CountyCarLedger countyCarLedger){
        this.countyCarLedger = countyCarLedger;
    }

    public List<Car> sortByCountyThenWeight(){
        return countyCarLedger.findAllCars()
                .stream()
                .sorted(Comparator.comparing(Car::getCounty).thenComparing(Car::getWeight))
                .collect(Collectors.toList());
    }

    public List<Car> findAllCars(County county){
        return countyCarLedger.findAllCars()
                .stream()
                .filter(car -> car.getCounty() == county)
                .sorted(Comparator.comparing(Car::getEngine))
                .collect(Collectors.toList());
    }

    public List<Car> findAllTrucks(County county){
        return countyCarLedger.findAllCars()
                .stream()
                .filter(car -> car instanceof TruckCar)
                .filter(car -> car.getCounty() == county)
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList());
    }

    public List<Car> findAllNormalCars(County county){
        return countyCarLedger.findAllCars()
                .stream()
                .filter(car -> car instanceof TruckCar)
                .filter(car -> car.getCounty() == county)
                .sorted(Comparator.comparing(Car::getAcceleration))
                .collect(Collectors.toList());
    }

    public Map<Double, Map<Double, List<Car>>> getCarsGroupedByEngineAndAcceleration(){
        return countyCarLedger.findAllCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getEngine, Collectors.groupingBy(Car::getAcceleration)));
    }
    

}
