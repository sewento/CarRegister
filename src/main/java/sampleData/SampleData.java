package sampleData;

import model.Car;
import model.County;
import model.NormalCar;
import model.TruckCar;
import storage.CountyCarLedger;
import storage.ListCountyCarLedger;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static List<Car> generateSampleData() {
        CountyCarLedger sampleDataList = new ListCountyCarLedger();
        sampleDataList.addCar(new TruckCar("Volvo", 4.0, 120.0, 13000.00, County.MALOPOLSKIE));
        sampleDataList.addCar(new TruckCar("Mercedes", 4.0, 150.0, 13000.00, County.SLASKIE));
        sampleDataList.addCar(new TruckCar("Mercedes", 4.0, 130.0, 10000.00, County.MAZOWIECKIE));
        sampleDataList.addCar(new TruckCar("CAT", 4.0, 110.0, 12222.00, County.MALOPOLSKIE));
        sampleDataList.addCar(new TruckCar("Volvo", 4.0, 100.0, 13000.00, County.MAZOWIECKIE));
        sampleDataList.addCar(new TruckCar("Volvo", 4.0, 120.0, 15000.00, County.SLASKIE));

        sampleDataList.addCar(new NormalCar("Ford Escort ", 1.6, 120.0, .1285, County.MALOPOLSKIE));
        sampleDataList.addCar(new NormalCar("Audi A5", 2.2, 215.0, 2500.0, County.MAZOWIECKIE));
        sampleDataList.addCar(new NormalCar("VW Golf", 1.4, 160.0, 3333.0, County.SLASKIE));
        sampleDataList.addCar(new NormalCar("Audi A7 ", 2.8, 230.0, 2781.0, County.MAZOWIECKIE));
        sampleDataList.addCar(new NormalCar("Ferrari ", 4.6, 300.0, 2500.0, County.MALOPOLSKIE));
        sampleDataList.addCar(new NormalCar("Ferrari ", 3.5, 250.0, 2500.0, County.MAZOWIECKIE));
        sampleDataList.addCar(new NormalCar("Fiat126p ", 0.8, 80.0, 800.0, County.SLASKIE));
        return sampleDataList.findAllCars();
    }
}
