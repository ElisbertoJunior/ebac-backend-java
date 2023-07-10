package br.com.elisbjr.carFactory;

public class SUVCarFactory extends Factory {
    @Override
    Car create(String model, String color) {
        return new Car("SUV", model, color);
    }
}
