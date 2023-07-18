package br.com.elisbjr.domain;

public abstract class Car {
     private String brand;
    private String model;

    public Car(String brand , String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract String getCarType();

    @Override
    public String toString() {
         return "Marca: " + brand + ", Modelo: " + model + ", Tipo: " + getCarType() + " ";
    }
}
