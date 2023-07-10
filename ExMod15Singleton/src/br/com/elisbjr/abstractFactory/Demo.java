package br.com.elisbjr.abstractFactory;

public class Demo {

    public static void main(String[] args) {
        Costumer client = new Costumer("A", false);
        Factory factory = getFactory(client);
        Car car = factory.create(client.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Costumer client) {
        if(client.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new FactoryWithoutContract();
        }
    }

}
