package br.com.elisbjr.dao;

import br.com.elisbjr.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarList<T extends Car> {
    private List<T> cars;

    public CarList() {
        cars = new ArrayList<>();
    }

    public void addCar(T car) {
        cars.add(car);
    }

    public List<T> getCars() {
        return cars;
    }

    public void printCarsInfo() {
        for(T car : cars) {
            System.out.println(car.toString());
        }
    }
}
