package br.com.elisbjr.abstractFactory;

public class FactoryWithoutContract extends Factory {
    @Override
    Car retriveCar(String requestGrade) {
        if("A".equals(requestGrade)) {
            return new UnoCar(500, "metade", "branco");
        }
        return null;
    }
}
