package br.com.elisbjr.abstractFactory;

public abstract class Car {
    private Integer horsePower;
    private String fuelSource;
    private String color;

    public Car(Integer horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize " + horsePower);
    }

    public void clean() {
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic. Everithing looks good!");
    }
    public void fuelCar() {
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }

}
