package storage;

import model.Car;
import model.County;

import java.util.*;

public class MapCountyCarLedger implements CountyCarLedger {

    private Map<County, Set<Car>> countyCarMap;

    public MapCountyCarLedger(){
        countyCarMap = new HashMap<>();
    }

    @Override
    public void addCar(Car car) {
        County county = car.getCounty();
        if (countyCarMap.containsKey(county)){
            countyCarMap.get(county).add(car);
        }else{
            countyCarMap.put(county, new TreeSet<>());
            countyCarMap.get(county).add(car);
        }
    }

    @Override
    public void removeCar(Car car) {
        County county = car.getCounty();

        if (countyCarMap.containsKey(county)){
            countyCarMap.get(county).remove(car);
        }

    }

    @Override
    public List<Car> findAllCars() {
        List<Car> carList = new ArrayList<>();
        for (County county : countyCarMap.keySet()){
            carList.addAll(countyCarMap.get(county));
        }
        return carList;
    }
}
