package br.com.elisbjr.carFactory;

import java.util.Scanner;

public class Order {
    private String typeCar;
    private String carModel;
    private String carColor;


    public Order(String typeCar, String carModel, String carColor) {
        this.typeCar = typeCar;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    @Override
    public String toString() {
        return "Order{" +
                "typeCar='" + typeCar + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
