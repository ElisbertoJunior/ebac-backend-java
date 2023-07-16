package br.com.elisbjr.domain;

public class Car {
    private String brand;
    private String moddel;

    public Car(String brand , String model) {
        this.brand = brand;
        this.moddel = model;
    }

    @Override
    public String toString() {
        return "Carro - " +
                "Marca: " + brand + ", " +
                "Modelo: " + moddel + ", ";
    }
}
