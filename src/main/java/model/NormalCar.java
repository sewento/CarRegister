package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class NormalCar implements Car {

    String name;
    Double engine;
    Double acceleration;
    Double weight;
    County county;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getEngine() {
        return engine;
    }

    @Override
    public Double getAcceleration() {
        return acceleration;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    @Override
    public County getCounty() {
        return county;
    }

    @Override
    public int compareTo(Object o) {
        NormalCar car = (NormalCar) o;
        return Comparator.comparing(o1 -> car.getName())
                .thenComparing(o1 -> car.getAcceleration())
                .thenComparing(o1 -> car.getEngine())
                .thenComparing(o1 -> car.getWeight())
                .thenComparing(o1 -> car.getCounty())
                .compare(this, car);
    }



}
