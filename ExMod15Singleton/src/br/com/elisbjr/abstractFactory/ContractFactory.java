package br.com.elisbjr.abstractFactory;

public class ContractFactory extends Factory {
    @Override
    Car retriveCar(String requestGrade) {
       if("A".equals(requestGrade)) {
           return new CorolaCar(150, "cheio", "prata");
       } else {
           return null;
       }

    }
}
