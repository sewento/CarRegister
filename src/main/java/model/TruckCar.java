package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TruckCar implements Car {

    String name;
    Double engine;
    Double acceleration;
    Double weight;
    County county;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getEngine() {
        return null;
    }

    @Override
    public Double getAcceleration() {
        return null;
    }

    @Override
    public Double getWeight() {
        return null;
    }

    @Override
    public County getCounty() {
        return null;
    }
}
