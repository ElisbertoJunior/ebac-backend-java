package br.com.elisbjr;

import br.com.elisbjr.dao.CarList;
import br.com.elisbjr.domain.Car;
import br.com.elisbjr.domain.SportsCar;

public class App {

    public static void main(String[] args) {
        CarList<Car> carList = new CarList<>();
        carList.addCar(new Car("Toyota", "Corolla"));
        carList.addCar(new SportsCar("Porsche", "911", true));
        carList.addCar(new Car("Honda", "Civic"));

        carList.printCarsInfo();
    }

}
