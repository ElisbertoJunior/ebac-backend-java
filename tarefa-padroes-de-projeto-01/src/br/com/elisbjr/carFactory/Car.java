package br.com.elisbjr.carFactory;

public class Car {
    private String type;
    private String model;
    private String color;


    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void startProduction() {
        System.out.println("Inicando precesso de fabricacao do carro tipo " + type + " e modelo " + model);
        paintCar();
        finalizingManufacturing();
    }

    public void paintCar() {
        System.out.println("Pintando carro na cor " + color + "...");
    }

    public void finalizingManufacturing() {
        System.out.println("Finalizando fabricacao do " + model + "...");
        System.out.println("carro do tipo " + type + ", modelo " + model + " na cor " + color + ", fabricado com sucesso!");
    }

}
