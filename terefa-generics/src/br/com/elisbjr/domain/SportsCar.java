package br.com.elisbjr.domain;

import br.com.elisbjr.domain.Car;

public class SportsCar extends Car {
    private Boolean isConvertible;
    public SportsCar(String brand, String model, Boolean isConvertible) {
        super(brand, model);
        this.isConvertible = isConvertible;
    }

    @Override
    public String toString() {
        return super.toString() + (isConvertible ? "(Coneversivel)" : "");

    }
}
