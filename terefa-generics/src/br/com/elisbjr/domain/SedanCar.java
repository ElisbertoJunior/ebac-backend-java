package br.com.elisbjr.domain;

public class SedanCar extends Car{

    public SedanCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
