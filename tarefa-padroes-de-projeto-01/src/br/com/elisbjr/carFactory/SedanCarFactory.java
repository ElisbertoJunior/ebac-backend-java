package br.com.elisbjr.carFactory;

public class SedanCarFactory extends Factory {
    @Override
    Car create(String model, String color) {
        return new Car("Sedan", model, color);
    }
}
