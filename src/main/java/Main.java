import model.Car;
import model.County;
import model.NormalCar;
import storage.MapCountyCarLedger;
import utils.Utils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new NormalCar("name", 2d, 2d, 2d, County.SLASKIE);
        MapCountyCarLedger mapCountyCarLedger = new MapCountyCarLedger();

        mapCountyCarLedger.addCar(car);

        mapCountyCarLedger.findAllCars().forEach(System.out::println);

        Utils utils = new Utils(mapCountyCarLedger);
        List<Car> sorted = utils.sortByCountyThenWeight();


    }
}
