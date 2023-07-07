package br.com.elisbjr.builder;

public class CheeseBurguerBuilder extends BurguerBuilder {

    @Override
    void buildBun() {
        burger.setBun("White bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Ameriacan cheese");
    }

    @Override
    void buildSauce() {
        burger.setSauce("Secret sauce");
    }
}
