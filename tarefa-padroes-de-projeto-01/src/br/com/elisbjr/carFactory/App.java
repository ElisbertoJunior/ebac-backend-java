package br.com.elisbjr.carFactory;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Digite o tipo do carro desejado (Sedan ou SUV):");
        Scanner inputTypeCar = new Scanner(System.in);
        String typeCar = inputTypeCar.next();

        System.out.println("Digite o medelo do carro desejado: ");
        Scanner inputCarModel = new Scanner(System.in);
        String carModel = inputCarModel.next();

        System.out.println("Digite a cor desejada: ");
        Scanner inputCarColor = new Scanner(System.in);
        String carColor = inputCarColor.next();

        Order order = new Order(typeCar, carModel, carColor);

        manufactureCar(order);

    }

    private static void manufactureCar(Order order) {
        Factory factory = getTypeCar(order);
        Car car = factory.create(order.getCarModel(), order.getCarColor());
        car.startProduction();
    }

    private static Factory getTypeCar(Order order) {
        if(order.getTypeCar().equalsIgnoreCase("Sedan")) {
            return new SedanCarFactory();
        } else if (order.getTypeCar().equalsIgnoreCase("SUV")) {
            return new SUVCarFactory();
        } else {
            System.out.println("Nao trabalhamos com esse tipo de carro por digite um tipo valido! (SUV ou Sedan)");
            System.exit(0);
        }
        return null;
    }


}
