package storage;

import model.Car;


import model.County;

import model.NormalCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountyCarLedgerTest {

    @Test
    void addCarToMap_givenOneCar_shouldHaveOneObjectInMap (){
       

        Car car = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.MALOPOLSKIE);

        CountyCarLedger ledger = new MapCountyCarLedger();
        addCheckTest(ledger, car);
    }
    @Test
    void addCarToList_givenOneCar_shouldHaveOneObjectInList (){


        Car car = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.MALOPOLSKIE);

        CountyCarLedger ledger = new ListCountyCarLedger();
        addCheckTest(ledger, car);

    }

    private void addCheckTest(CountyCarLedger countyCarLedger, Car car){
        countyCarLedger.addCar(car);
        assertEquals(1, countyCarLedger.findAllCars().size());
    }


    @Test
    void removeCarMap_givenTwoCars_shouldRemoveOne(){
        CountyCarLedger ledger = new MapCountyCarLedger();
        removeCheckTest(ledger);
    }
    @Test
    void removeCarList_givenTwoCars_shouldRemoveOne(){
        CountyCarLedger ledger = new ListCountyCarLedger();
        removeCheckTest(ledger);

    }

    private void removeCheckTest(CountyCarLedger countyCarLedger){
        Car car1 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.MALOPOLSKIE);
        Car car2 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.SLASKIE);
        countyCarLedger.addCar(car1);
        countyCarLedger.addCar(car2);
        countyCarLedger.removeCar(car1);
        assertEquals(1,countyCarLedger.findAllCars().size());
        assertTrue(countyCarLedger.findAllCars().contains(car2));
    }

//    @Test
//    void findAllCarsList_givenDifferentCounty_shouldSortInCorrectOrder(){
//        Car car1 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.MALOPOLSKIE);
//        Car car2 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.SLASKIE);
//        Car car3 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.MALOPOLSKIE);
//        Car car4 = new NormalCar("Ford", 1.6, 100.0, 2000.0, County.SLASKIE);
//        CountyCarLedger ledger = new ListCountyCarLedger();
//        ledger.addCar(car1);
//        ledger.addCar(car2);
//        ledger.addCar(car3);
//        ledger.addCar(car4);
//        assertEquals(County.MALOPOLSKIE, ledger.findAllCars().get(1).getCounty());
//
//    }
}


//    void    addCar(Car car);
//    void removeCar(Car car);
//    List<Car> findAllCars();