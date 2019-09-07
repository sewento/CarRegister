package storage;

import model.Car;
import model.NormalCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountyCarLedgerTest {

    @Test
    void addCarToMap_givenOneCar_shouldHaveOneObjectInMap (){
        Car car = new NormalCar();
        CountyCarLedger ledger = new MapCountyCarLedger();
        addCheckTest(ledger, car);
    }
    @Test
    void addCarToList_givenOneCar_shouldHaveOneObjectInList (){
        Car car = new NormalCar();
        CountyCarLedger ledger = new ListCountyCarLedger();
        addCheckTest(ledger, car);

    }

    private void addCheckTest(CountyCarLedger countyCarLedger, Car car){
        countyCarLedger.addCar(car);
        assertEquals(1, countyCarLedger.findAllCars().size());
    }
}


//    void    addCar(Car car);
//    void removeCar(Car car);
//    List<Car> findAllCars();