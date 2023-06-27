
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car civic = new Car();
        civic.setCar("Civic", "Prata", "Honda", true);
        civic.printCar();
        civic.driveCar();
    }
}